package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC0665e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.i;
import n0.InterfaceC1893c;
import n0.d;
import n0.e;
import q0.m;
import q0.u;
import q0.x;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC1893c, InterfaceC0665e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f9427w = i.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f9428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private E f9429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC2034b f9430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Object f9431p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    m f9432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Map f9433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Map f9434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Set f9435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final d f9436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0182b f9437v;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f9438m;

        a(String str) {
            this.f9438m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVarH = b.this.f9429n.s().h(this.f9438m);
            if (uVarH == null || !uVarH.h()) {
                return;
            }
            synchronized (b.this.f9431p) {
                b.this.f9434s.put(x.a(uVarH), uVarH);
                b.this.f9435t.add(uVarH);
                b bVar = b.this;
                bVar.f9436u.b(bVar.f9435t);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    interface InterfaceC0182b {
        void c(int i7, int i8, Notification notification);

        void d(int i7, Notification notification);

        void e(int i7);

        void stop();
    }

    b(Context context) {
        this.f9428m = context;
        E eQ = E.q(context);
        this.f9429n = eQ;
        this.f9430o = eQ.w();
        this.f9432q = null;
        this.f9433r = new LinkedHashMap();
        this.f9435t = new HashSet();
        this.f9434s = new HashMap();
        this.f9436u = new e(this.f9429n.u(), this);
        this.f9429n.s().g(this);
    }

    public static Intent d(Context context, m mVar, l0.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent e(Context context, m mVar, l0.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        i.e().f(f9427w, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f9429n.k(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i.e().a(f9427w, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f9437v == null) {
            return;
        }
        this.f9433r.put(mVar, new l0.e(intExtra, notification, intExtra2));
        if (this.f9432q == null) {
            this.f9432q = mVar;
            this.f9437v.c(intExtra, intExtra2, notification);
            return;
        }
        this.f9437v.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f9433r.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((l0.e) ((Map.Entry) it.next()).getValue()).a();
        }
        l0.e eVar = (l0.e) this.f9433r.get(this.f9432q);
        if (eVar != null) {
            this.f9437v.c(eVar.c(), iA, eVar.b());
        }
    }

    private void j(Intent intent) {
        i.e().f(f9427w, "Started foreground service " + intent);
        this.f9430o.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a */
    public void l(m mVar, boolean z6) {
        Map.Entry entry;
        synchronized (this.f9431p) {
            try {
                u uVar = (u) this.f9434s.remove(mVar);
                if (uVar != null ? this.f9435t.remove(uVar) : false) {
                    this.f9436u.b(this.f9435t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l0.e eVar = (l0.e) this.f9433r.remove(mVar);
        if (mVar.equals(this.f9432q) && this.f9433r.size() > 0) {
            Iterator it = this.f9433r.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f9432q = (m) entry.getKey();
            if (this.f9437v != null) {
                l0.e eVar2 = (l0.e) entry.getValue();
                this.f9437v.c(eVar2.c(), eVar2.a(), eVar2.b());
                this.f9437v.e(eVar2.c());
            }
        }
        InterfaceC0182b interfaceC0182b = this.f9437v;
        if (eVar == null || interfaceC0182b == null) {
            return;
        }
        i.e().a(f9427w, "Removing Notification (id: " + eVar.c() + ", workSpecId: " + mVar + ", notificationType: " + eVar.a());
        interfaceC0182b.e(eVar.c());
    }

    @Override // n0.InterfaceC1893c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            String str = uVar.f21795a;
            i.e().a(f9427w, "Constraints unmet for WorkSpec " + str);
            this.f9429n.D(x.a(uVar));
        }
    }

    @Override // n0.InterfaceC1893c
    public void f(List list) {
    }

    void k(Intent intent) {
        i.e().f(f9427w, "Stopping foreground service");
        InterfaceC0182b interfaceC0182b = this.f9437v;
        if (interfaceC0182b != null) {
            interfaceC0182b.stop();
        }
    }

    void l() {
        this.f9437v = null;
        synchronized (this.f9431p) {
            this.f9436u.a();
        }
        this.f9429n.s().n(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                h(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    k(intent);
                    return;
                }
                return;
            }
        }
        i(intent);
    }

    void n(InterfaceC0182b interfaceC0182b) {
        if (this.f9437v != null) {
            i.e().c(f9427w, "A callback already exists.");
        } else {
            this.f9437v = interfaceC0182b;
        }
    }
}
