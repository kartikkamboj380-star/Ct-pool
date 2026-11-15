package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import q0.InterfaceC1986b;
import r0.C2007B;
import r0.C2008C;
import r0.RunnableC2006A;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public class K implements Runnable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final String f9301E = l0.i.i("WorkerWrapper");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f9302A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile boolean f9305D;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Context f9306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f9308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WorkerParameters.a f9309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    q0.u f9310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    androidx.work.c f9311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    InterfaceC2034b f9312s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.work.a f9314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.work.impl.foreground.a f9315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private WorkDatabase f9316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private q0.v f9317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC1986b f9318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f9319z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    c.a f9313t = c.a.a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f9303B = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f9304C = androidx.work.impl.utils.futures.c.t();

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ X3.d f9320m;

        a(X3.d dVar) {
            this.f9320m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f9304C.isCancelled()) {
                return;
            }
            try {
                this.f9320m.get();
                l0.i.e().a(K.f9301E, "Starting work for " + K.this.f9310q.f21797c);
                K k7 = K.this;
                k7.f9304C.r(k7.f9311r.m());
            } catch (Throwable th) {
                K.this.f9304C.q(th);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f9322m;

        b(String str) {
            this.f9322m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) K.this.f9304C.get();
                    if (aVar == null) {
                        l0.i.e().c(K.f9301E, K.this.f9310q.f21797c + " returned a null result. Treating it as a failure.");
                    } else {
                        l0.i.e().a(K.f9301E, K.this.f9310q.f21797c + " returned a " + aVar + ".");
                        K.this.f9313t = aVar;
                    }
                } catch (InterruptedException e7) {
                    e = e7;
                    l0.i.e().d(K.f9301E, this.f9322m + " failed because it threw an exception/error", e);
                } catch (CancellationException e8) {
                    l0.i.e().g(K.f9301E, this.f9322m + " was cancelled", e8);
                } catch (ExecutionException e9) {
                    e = e9;
                    l0.i.e().d(K.f9301E, this.f9322m + " failed because it threw an exception/error", e);
                }
                K.this.j();
            } catch (Throwable th) {
                K.this.j();
                throw th;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f9324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.work.c f9325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f9326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        InterfaceC2034b f9327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.a f9328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        WorkDatabase f9329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        q0.u f9330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f9331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f9332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        WorkerParameters.a f9333j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, q0.u uVar, List list) {
            this.f9324a = context.getApplicationContext();
            this.f9327d = interfaceC2034b;
            this.f9326c = aVar2;
            this.f9328e = aVar;
            this.f9329f = workDatabase;
            this.f9330g = uVar;
            this.f9332i = list;
        }

        public K b() {
            return new K(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f9333j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f9331h = list;
            return this;
        }
    }

    K(c cVar) {
        this.f9306m = cVar.f9324a;
        this.f9312s = cVar.f9327d;
        this.f9315v = cVar.f9326c;
        q0.u uVar = cVar.f9330g;
        this.f9310q = uVar;
        this.f9307n = uVar.f21795a;
        this.f9308o = cVar.f9331h;
        this.f9309p = cVar.f9333j;
        this.f9311r = cVar.f9325b;
        this.f9314u = cVar.f9328e;
        WorkDatabase workDatabase = cVar.f9329f;
        this.f9316w = workDatabase;
        this.f9317x = workDatabase.j();
        this.f9318y = this.f9316w.e();
        this.f9319z = cVar.f9332i;
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f9307n);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0180c) {
            l0.i.e().f(f9301E, "Worker result SUCCESS for " + this.f9302A);
            if (!this.f9310q.j()) {
                q();
                return;
            }
        } else {
            if (aVar instanceof c.a.b) {
                l0.i.e().f(f9301E, "Worker result RETRY for " + this.f9302A);
                k();
                return;
            }
            l0.i.e().f(f9301E, "Worker result FAILURE for " + this.f9302A);
            if (!this.f9310q.j()) {
                p();
                return;
            }
        }
        l();
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f9317x.p(str2) != l0.s.CANCELLED) {
                this.f9317x.l(l0.s.FAILED, str2);
            }
            linkedList.addAll(this.f9318y.b(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(X3.d dVar) {
        if (this.f9304C.isCancelled()) {
            dVar.cancel(true);
        }
    }

    private void k() {
        this.f9316w.beginTransaction();
        try {
            this.f9317x.l(l0.s.ENQUEUED, this.f9307n);
            this.f9317x.s(this.f9307n, System.currentTimeMillis());
            this.f9317x.e(this.f9307n, -1L);
            this.f9316w.setTransactionSuccessful();
        } finally {
            this.f9316w.endTransaction();
            m(true);
        }
    }

    private void l() {
        this.f9316w.beginTransaction();
        try {
            this.f9317x.s(this.f9307n, System.currentTimeMillis());
            this.f9317x.l(l0.s.ENQUEUED, this.f9307n);
            this.f9317x.r(this.f9307n);
            this.f9317x.d(this.f9307n);
            this.f9317x.e(this.f9307n, -1L);
            this.f9316w.setTransactionSuccessful();
        } finally {
            this.f9316w.endTransaction();
            m(false);
        }
    }

    private void m(boolean z6) {
        this.f9316w.beginTransaction();
        try {
            if (!this.f9316w.j().n()) {
                r0.p.a(this.f9306m, RescheduleReceiver.class, false);
            }
            if (z6) {
                this.f9317x.l(l0.s.ENQUEUED, this.f9307n);
                this.f9317x.e(this.f9307n, -1L);
            }
            if (this.f9310q != null && this.f9311r != null && this.f9315v.d(this.f9307n)) {
                this.f9315v.c(this.f9307n);
            }
            this.f9316w.setTransactionSuccessful();
            this.f9316w.endTransaction();
            this.f9303B.p(Boolean.valueOf(z6));
        } catch (Throwable th) {
            this.f9316w.endTransaction();
            throw th;
        }
    }

    private void n() {
        boolean z6;
        l0.s sVarP = this.f9317x.p(this.f9307n);
        if (sVarP == l0.s.RUNNING) {
            l0.i.e().a(f9301E, "Status for " + this.f9307n + " is RUNNING; not doing any work and rescheduling for later execution");
            z6 = true;
        } else {
            l0.i.e().a(f9301E, "Status for " + this.f9307n + " is " + sVarP + " ; not doing any work");
            z6 = false;
        }
        m(z6);
    }

    private void o() {
        androidx.work.b bVarB;
        if (r()) {
            return;
        }
        this.f9316w.beginTransaction();
        try {
            q0.u uVar = this.f9310q;
            if (uVar.f21796b != l0.s.ENQUEUED) {
                n();
                this.f9316w.setTransactionSuccessful();
                l0.i.e().a(f9301E, this.f9310q.f21797c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((uVar.j() || this.f9310q.i()) && System.currentTimeMillis() < this.f9310q.c()) {
                l0.i.e().a(f9301E, String.format("Delaying execution for %s because it is being executed before schedule.", this.f9310q.f21797c));
                m(true);
                this.f9316w.setTransactionSuccessful();
                return;
            }
            this.f9316w.setTransactionSuccessful();
            this.f9316w.endTransaction();
            if (this.f9310q.j()) {
                bVarB = this.f9310q.f21799e;
            } else {
                l0.g gVarB = this.f9314u.f().b(this.f9310q.f21798d);
                if (gVarB == null) {
                    l0.i.e().c(f9301E, "Could not create Input Merger " + this.f9310q.f21798d);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f9310q.f21799e);
                arrayList.addAll(this.f9317x.u(this.f9307n));
                bVarB = gVarB.b(arrayList);
            }
            androidx.work.b bVar = bVarB;
            UUID uuidFromString = UUID.fromString(this.f9307n);
            List list = this.f9319z;
            WorkerParameters.a aVar = this.f9309p;
            q0.u uVar2 = this.f9310q;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, bVar, list, aVar, uVar2.f21805k, uVar2.f(), this.f9314u.d(), this.f9312s, this.f9314u.n(), new C2008C(this.f9316w, this.f9312s), new C2007B(this.f9316w, this.f9315v, this.f9312s));
            if (this.f9311r == null) {
                this.f9311r = this.f9314u.n().b(this.f9306m, this.f9310q.f21797c, workerParameters);
            }
            androidx.work.c cVar = this.f9311r;
            if (cVar == null) {
                l0.i.e().c(f9301E, "Could not create Worker " + this.f9310q.f21797c);
                p();
                return;
            }
            if (cVar.j()) {
                l0.i.e().c(f9301E, "Received an already-used Worker " + this.f9310q.f21797c + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.f9311r.l();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            RunnableC2006A runnableC2006A = new RunnableC2006A(this.f9306m, this.f9310q, this.f9311r, workerParameters.b(), this.f9312s);
            this.f9312s.a().execute(runnableC2006A);
            final X3.d dVarB = runnableC2006A.b();
            this.f9304C.e(new Runnable() { // from class: androidx.work.impl.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9299m.i(dVarB);
                }
            }, new r0.w());
            dVarB.e(new a(dVarB), this.f9312s.a());
            this.f9304C.e(new b(this.f9302A), this.f9312s.b());
        } finally {
            this.f9316w.endTransaction();
        }
    }

    private void q() {
        this.f9316w.beginTransaction();
        try {
            this.f9317x.l(l0.s.SUCCEEDED, this.f9307n);
            this.f9317x.k(this.f9307n, ((c.a.C0180c) this.f9313t).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f9318y.b(this.f9307n)) {
                if (this.f9317x.p(str) == l0.s.BLOCKED && this.f9318y.c(str)) {
                    l0.i.e().f(f9301E, "Setting status to enqueued for " + str);
                    this.f9317x.l(l0.s.ENQUEUED, str);
                    this.f9317x.s(str, jCurrentTimeMillis);
                }
            }
            this.f9316w.setTransactionSuccessful();
            this.f9316w.endTransaction();
            m(false);
        } catch (Throwable th) {
            this.f9316w.endTransaction();
            m(false);
            throw th;
        }
    }

    private boolean r() {
        if (!this.f9305D) {
            return false;
        }
        l0.i.e().a(f9301E, "Work interrupted for " + this.f9302A);
        if (this.f9317x.p(this.f9307n) == null) {
            m(false);
        } else {
            m(!r0.h());
        }
        return true;
    }

    private boolean s() {
        boolean z6;
        this.f9316w.beginTransaction();
        try {
            if (this.f9317x.p(this.f9307n) == l0.s.ENQUEUED) {
                this.f9317x.l(l0.s.RUNNING, this.f9307n);
                this.f9317x.v(this.f9307n);
                z6 = true;
            } else {
                z6 = false;
            }
            this.f9316w.setTransactionSuccessful();
            this.f9316w.endTransaction();
            return z6;
        } catch (Throwable th) {
            this.f9316w.endTransaction();
            throw th;
        }
    }

    public X3.d c() {
        return this.f9303B;
    }

    public q0.m d() {
        return q0.x.a(this.f9310q);
    }

    public q0.u e() {
        return this.f9310q;
    }

    public void g() {
        this.f9305D = true;
        r();
        this.f9304C.cancel(true);
        if (this.f9311r != null && this.f9304C.isCancelled()) {
            this.f9311r.n();
            return;
        }
        l0.i.e().a(f9301E, "WorkSpec " + this.f9310q + " is already done. Not interrupting.");
    }

    void j() {
        if (!r()) {
            this.f9316w.beginTransaction();
            try {
                l0.s sVarP = this.f9317x.p(this.f9307n);
                this.f9316w.i().a(this.f9307n);
                if (sVarP == null) {
                    m(false);
                } else if (sVarP == l0.s.RUNNING) {
                    f(this.f9313t);
                } else if (!sVarP.h()) {
                    k();
                }
                this.f9316w.setTransactionSuccessful();
                this.f9316w.endTransaction();
            } catch (Throwable th) {
                this.f9316w.endTransaction();
                throw th;
            }
        }
        List list = this.f9308o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).d(this.f9307n);
            }
            u.b(this.f9314u, this.f9316w, this.f9308o);
        }
    }

    void p() {
        this.f9316w.beginTransaction();
        try {
            h(this.f9307n);
            this.f9317x.k(this.f9307n, ((c.a.C0179a) this.f9313t).e());
            this.f9316w.setTransactionSuccessful();
        } finally {
            this.f9316w.endTransaction();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9302A = b(this.f9319z);
        o();
    }
}
