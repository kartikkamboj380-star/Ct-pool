package y3;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t3.h;
import t3.i;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2240a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f23192r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f23193s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f23194t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile InterfaceC2244e f23195u = new C2242c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f23197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f23199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f23201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    t3.b f23204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Clock f23205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f23206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f23207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f23208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f23209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f23210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f23211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f23212q;

    public C2240a(Context context, int i7, String str) {
        String packageName = context.getPackageName();
        this.f23196a = new Object();
        this.f23198c = 0;
        this.f23201f = new HashSet();
        this.f23202g = true;
        this.f23205j = DefaultClock.getInstance();
        this.f23210o = new HashMap();
        this.f23211p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f23209n = context.getApplicationContext();
        this.f23208m = str;
        this.f23204i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f23207l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f23207l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i7, str);
        this.f23197b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.f23206k = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                i(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f23193s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f23194t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f23193s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f23193s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f23212q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(C2240a c2240a) {
        synchronized (c2240a.f23196a) {
            try {
                if (c2240a.b()) {
                    Log.e("WakeLock", String.valueOf(c2240a.f23207l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c2240a.g();
                    if (c2240a.b()) {
                        c2240a.f23198c = 1;
                        c2240a.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f23202g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f23201f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f23201f);
        this.f23201f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        y.a(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: all -> 0x000b, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000e, B:12:0x0013, B:18:0x0020, B:19:0x002d, B:21:0x0033, B:22:0x003c, B:24:0x0046, B:25:0x004f, B:28:0x005e, B:30:0x0062, B:47:0x00a3, B:46:0x0092, B:42:0x008b, B:44:0x008f, B:45:0x0091, B:38:0x0085, B:15:0x001c, B:17:0x001e, B:27:0x0059, B:35:0x0068, B:37:0x0074, B:41:0x008a), top: B:53:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(int i7) {
        synchronized (this.f23196a) {
            try {
                if (b()) {
                    if (this.f23202g) {
                        int i8 = this.f23198c - 1;
                        this.f23198c = i8;
                        if (i8 > 0) {
                            return;
                        }
                    } else {
                        this.f23198c = 0;
                    }
                    g();
                    Iterator it = this.f23210o.values().iterator();
                    while (it.hasNext()) {
                        ((C2243d) it.next()).f23214a = 0;
                    }
                    this.f23210o.clear();
                    Future future = this.f23199d;
                    if (future != null) {
                        future.cancel(false);
                        this.f23199d = null;
                        this.f23200e = 0L;
                    }
                    this.f23203h = 0;
                    if (this.f23197b.isHeld()) {
                        try {
                            try {
                                this.f23197b.release();
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                Log.e("WakeLock", String.valueOf(this.f23207l).concat(" failed to release!"), e7);
                                if (this.f23204i != null) {
                                }
                            }
                        } finally {
                            if (this.f23204i != null) {
                                this.f23204i = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f23207l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
            Log.wtf("WakeLock", e7.toString());
        }
    }

    public void a(long j7) {
        this.f23211p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f23192r), 1L);
        if (j7 > 0) {
            jMax = Math.min(j7, jMax);
        }
        synchronized (this.f23196a) {
            try {
                if (!b()) {
                    this.f23204i = t3.b.a(false, null);
                    this.f23197b.acquire();
                    this.f23205j.elapsedRealtime();
                }
                this.f23198c++;
                this.f23203h++;
                f(null);
                C2243d c2243d = (C2243d) this.f23210o.get(null);
                if (c2243d == null) {
                    c2243d = new C2243d(null);
                    this.f23210o.put(null, c2243d);
                }
                c2243d.f23214a++;
                long jElapsedRealtime = this.f23205j.elapsedRealtime();
                long j8 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j8 > this.f23200e) {
                    this.f23200e = j8;
                    Future future = this.f23199d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f23199d = this.f23212q.schedule(new Runnable() { // from class: y3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2240a.e(this.f23213m);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z6;
        synchronized (this.f23196a) {
            z6 = this.f23198c > 0;
        }
        return z6;
    }

    public void c() {
        if (this.f23211p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f23207l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f23196a) {
            try {
                f(null);
                if (this.f23210o.containsKey(null)) {
                    C2243d c2243d = (C2243d) this.f23210o.get(null);
                    if (c2243d != null) {
                        int i7 = c2243d.f23214a - 1;
                        c2243d.f23214a = i7;
                        if (i7 == 0) {
                            this.f23210o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f23207l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z6) {
        synchronized (this.f23196a) {
            this.f23202g = z6;
        }
    }
}
