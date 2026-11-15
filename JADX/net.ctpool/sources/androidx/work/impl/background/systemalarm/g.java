package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC0665e;
import androidx.work.impl.r;
import androidx.work.impl.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l0.i;
import q0.m;
import r0.C2009D;
import r0.x;
import s0.InterfaceC2034b;
import s0.InterfaceExecutorC2033a;

/* JADX INFO: loaded from: classes.dex */
public class g implements InterfaceC0665e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f9380w = i.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Context f9381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final InterfaceC2034b f9382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2009D f9383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f9384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final E f9385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f9386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final List f9387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Intent f9388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f9389u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w f9390v;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (g.this.f9387s) {
                g gVar = g.this;
                gVar.f9388t = (Intent) gVar.f9387s.get(0);
            }
            Intent intent = g.this.f9388t;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f9388t.getIntExtra("KEY_START_ID", 0);
                i iVarE = i.e();
                String str = g.f9380w;
                iVarE.a(str, "Processing command " + g.this.f9388t + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = x.b(g.this.f9381m, action + " (" + intExtra + ")");
                try {
                    i.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f9386r.o(gVar2.f9388t, intExtra, gVar2);
                    i.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = g.this.f9382n.a();
                    dVar = new d(g.this);
                } catch (Throwable th) {
                    try {
                        i iVarE2 = i.e();
                        String str2 = g.f9380w;
                        iVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        i.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = g.this.f9382n.a();
                        dVar = new d(g.this);
                    } catch (Throwable th2) {
                        i.e().a(g.f9380w, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f9382n.a().execute(new d(g.this));
                        throw th2;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final g f9392m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Intent f9393n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f9394o;

        b(g gVar, Intent intent, int i7) {
            this.f9392m = gVar;
            this.f9393n = intent;
            this.f9394o = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9392m.b(this.f9393n, this.f9394o);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final g f9395m;

        d(g gVar) {
            this.f9395m = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9395m.d();
        }
    }

    g(Context context) {
        this(context, null, null);
    }

    private void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        c();
        synchronized (this.f9387s) {
            try {
                Iterator it = this.f9387s.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        c();
        PowerManager.WakeLock wakeLockB = x.b(this.f9381m, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f9385q.w().c(new a());
        } finally {
            wakeLockB.release();
        }
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a */
    public void l(m mVar, boolean z6) {
        this.f9382n.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f9381m, mVar, z6), 0));
    }

    public boolean b(Intent intent, int i7) {
        i iVarE = i.e();
        String str = f9380w;
        iVarE.a(str, "Adding command " + intent + " (" + i7 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f9387s) {
            try {
                boolean z6 = !this.f9387s.isEmpty();
                this.f9387s.add(intent);
                if (!z6) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void d() {
        i iVarE = i.e();
        String str = f9380w;
        iVarE.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f9387s) {
            try {
                if (this.f9388t != null) {
                    i.e().a(str, "Removing command " + this.f9388t);
                    if (!((Intent) this.f9387s.remove(0)).equals(this.f9388t)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f9388t = null;
                }
                InterfaceExecutorC2033a interfaceExecutorC2033aB = this.f9382n.b();
                if (!this.f9386r.n() && this.f9387s.isEmpty() && !interfaceExecutorC2033aB.U()) {
                    i.e().a(str, "No more commands & intents.");
                    c cVar = this.f9389u;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f9387s.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    r e() {
        return this.f9384p;
    }

    InterfaceC2034b f() {
        return this.f9382n;
    }

    E g() {
        return this.f9385q;
    }

    C2009D h() {
        return this.f9383o;
    }

    void j() {
        i.e().a(f9380w, "Destroying SystemAlarmDispatcher");
        this.f9384p.n(this);
        this.f9389u = null;
    }

    void l(c cVar) {
        if (this.f9389u != null) {
            i.e().c(f9380w, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f9389u = cVar;
        }
    }

    g(Context context, r rVar, E e7) {
        Context applicationContext = context.getApplicationContext();
        this.f9381m = applicationContext;
        this.f9390v = new w();
        this.f9386r = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f9390v);
        e7 = e7 == null ? E.q(context) : e7;
        this.f9385q = e7;
        this.f9383o = new C2009D(e7.o().k());
        rVar = rVar == null ? e7.s() : rVar;
        this.f9384p = rVar;
        this.f9382n = e7.w();
        rVar.g(this);
        this.f9387s = new ArrayList();
        this.f9388t = null;
    }
}
