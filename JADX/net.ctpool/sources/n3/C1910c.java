package n3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s3.AbstractC2046a;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;
import z3.InterfaceC2263c;
import z3.InterfaceC2266f;
import z3.InterfaceC2271k;

/* JADX INFO: renamed from: n3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1910c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f21372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f21373j = new Executor() { // from class: n3.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f21374k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1904E f21377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f21378d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f21380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1919l f21381g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.g f21375a = new n.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f21379e = new Messenger(new HandlerC1916i(this, Looper.getMainLooper()));

    public C1910c(Context context) {
        this.f21376b = context;
        this.f21377c = new C1904E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f21378d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC2272l e(Bundle bundle) {
        return m(bundle) ? AbstractC2275o.f(null) : AbstractC2275o.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C1910c c1910c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1918k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1919l) {
                        c1910c.f21381g = (C1919l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1910c.f21380f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f21374k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c1910c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(LogEvent.LEVEL_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1910c.f21375a) {
                        for (int i7 = 0; i7 < c1910c.f21375a.size(); i7++) {
                            try {
                                c1910c.l((String) c1910c.f21375a.j(i7), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c1910c.l(str, intent2.putExtra(LogEvent.LEVEL_ERROR, strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC2272l i(Bundle bundle) {
        final String strJ = j();
        final C2273m c2273m = new C2273m();
        synchronized (this.f21375a) {
            this.f21375a.put(strJ, c2273m);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f21377c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        k(this.f21376b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f21379e);
        if (this.f21380f != null || this.f21381g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f21380f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f21381g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f21377c.b() != 2) {
                }
            }
        } else if (this.f21377c.b() != 2) {
            this.f21376b.sendBroadcast(intent);
        } else {
            this.f21376b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f21378d.schedule(new Runnable() { // from class: n3.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c2273m.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c2273m.a().b(f21373j, new InterfaceC2266f() { // from class: n3.h
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                this.f21385a.h(strJ, scheduledFutureSchedule, abstractC2272l);
            }
        });
        return c2273m.a();
    }

    private static synchronized String j() {
        int i7;
        i7 = f21371h;
        f21371h = i7 + 1;
        return Integer.toString(i7);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f21372i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f21372i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC2046a.f22261a);
            }
            intent.putExtra("app", f21372i);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f21375a) {
            try {
                C2273m c2273m = (C2273m) this.f21375a.remove(str);
                if (c2273m != null) {
                    c2273m.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC2272l a() {
        return this.f21377c.a() >= 241100000 ? C1903D.b(this.f21376b).d(5, Bundle.EMPTY).h(f21373j, new InterfaceC2263c() { // from class: n3.f
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                Intent intent = (Intent) ((Bundle) abstractC2272l.l()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1908a(intent);
                }
                return null;
            }
        }) : AbstractC2275o.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC2272l b(C1908a c1908a) {
        if (this.f21377c.a() < 233700000) {
            return AbstractC2275o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c1908a.a0());
        Integer numN0 = c1908a.n0();
        if (numN0 != null) {
            bundle.putInt("google.product_id", numN0.intValue());
        }
        return C1903D.b(this.f21376b).c(3, bundle);
    }

    public AbstractC2272l c(final Bundle bundle) {
        return this.f21377c.a() < 12000000 ? this.f21377c.b() != 0 ? i(bundle).j(f21373j, new InterfaceC2263c() { // from class: n3.H
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return this.f21366a.f(bundle, abstractC2272l);
            }
        }) : AbstractC2275o.e(new IOException("MISSING_INSTANCEID_SERVICE")) : C1903D.b(this.f21376b).d(1, bundle).h(f21373j, new InterfaceC2263c() { // from class: n3.e
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) throws IOException {
                if (abstractC2272l.p()) {
                    return (Bundle) abstractC2272l.l();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(abstractC2272l.k())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC2272l.k());
            }
        });
    }

    public AbstractC2272l d(boolean z6) {
        if (this.f21377c.a() < 241100000) {
            return AbstractC2275o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z6);
        return C1903D.b(this.f21376b).c(4, bundle);
    }

    final /* synthetic */ AbstractC2272l f(Bundle bundle, AbstractC2272l abstractC2272l) {
        return (abstractC2272l.p() && m((Bundle) abstractC2272l.l())) ? i(bundle).q(f21373j, new InterfaceC2271k() { // from class: n3.F
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                return C1910c.e((Bundle) obj);
            }
        }) : abstractC2272l;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC2272l abstractC2272l) {
        synchronized (this.f21375a) {
            this.f21375a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
