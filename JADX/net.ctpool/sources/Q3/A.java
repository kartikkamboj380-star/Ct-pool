package Q3;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import z3.AbstractC2272l;
import z3.C2273m;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f2746o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f2748b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f2754h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f2758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f2759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final P3.q f2760n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f2750d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f2751e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f2752f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f2756j = new IBinder.DeathRecipient() { // from class: Q3.s
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            A.j(this.f2781a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f2757k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2749c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f2755i = new WeakReference(null);

    public A(Context context, p pVar, String str, Intent intent, P3.q qVar, v vVar) {
        this.f2747a = context;
        this.f2748b = pVar;
        this.f2754h = intent;
        this.f2760n = qVar;
    }

    public static /* synthetic */ void j(A a7) {
        a7.f2748b.c("reportBinderDeath", new Object[0]);
        androidx.appcompat.app.y.a(a7.f2755i.get());
        a7.f2748b.c("%s : Binder has died.", a7.f2749c);
        Iterator it = a7.f2750d.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(a7.v());
        }
        a7.f2750d.clear();
        synchronized (a7.f2752f) {
            a7.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final A a7, final C2273m c2273m) {
        a7.f2751e.add(c2273m);
        c2273m.a().c(new InterfaceC2266f() { // from class: Q3.r
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                this.f2779a.t(c2273m, abstractC2272l);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(A a7, q qVar) {
        if (a7.f2759m != null || a7.f2753g) {
            if (!a7.f2753g) {
                qVar.run();
                return;
            } else {
                a7.f2748b.c("Waiting to bind to the service.", new Object[0]);
                a7.f2750d.add(qVar);
                return;
            }
        }
        a7.f2748b.c("Initiate binding to the service.", new Object[0]);
        a7.f2750d.add(qVar);
        z zVar = new z(a7, null);
        a7.f2758l = zVar;
        a7.f2753g = true;
        if (a7.f2747a.bindService(a7.f2754h, zVar, 1)) {
            return;
        }
        a7.f2748b.c("Failed to bind to the service.", new Object[0]);
        a7.f2753g = false;
        Iterator it = a7.f2750d.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(new B());
        }
        a7.f2750d.clear();
    }

    static /* bridge */ /* synthetic */ void q(A a7) {
        a7.f2748b.c("linkToDeath", new Object[0]);
        try {
            a7.f2759m.asBinder().linkToDeath(a7.f2756j, 0);
        } catch (RemoteException e7) {
            a7.f2748b.b(e7, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(A a7) {
        a7.f2748b.c("unlinkToDeath", new Object[0]);
        a7.f2759m.asBinder().unlinkToDeath(a7.f2756j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f2749c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f2751e.iterator();
        while (it.hasNext()) {
            ((C2273m) it.next()).d(v());
        }
        this.f2751e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f2746o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f2749c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f2749c, 10);
                    handlerThread.start();
                    map.put(this.f2749c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f2749c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f2759m;
    }

    public final void s(q qVar, C2273m c2273m) {
        c().post(new t(this, qVar.b(), c2273m, qVar));
    }

    final /* synthetic */ void t(C2273m c2273m, AbstractC2272l abstractC2272l) {
        synchronized (this.f2752f) {
            this.f2751e.remove(c2273m);
        }
    }

    public final void u(C2273m c2273m) {
        synchronized (this.f2752f) {
            this.f2751e.remove(c2273m);
        }
        c().post(new u(this));
    }
}
