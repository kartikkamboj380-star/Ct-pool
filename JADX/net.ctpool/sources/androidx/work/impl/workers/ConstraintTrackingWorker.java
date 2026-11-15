package androidx.work.impl.workers;

import X3.d;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.E;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import j5.AbstractC1809n;
import java.util.List;
import l0.i;
import n0.InterfaceC1893c;
import n0.e;
import p0.n;
import q0.u;
import q0.v;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends c implements InterfaceC1893c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final WorkerParameters f9513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f9514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f9515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f9516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f9517u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "appContext");
        k.f(workerParameters, "workerParameters");
        this.f9513q = workerParameters;
        this.f9514r = new Object();
        this.f9516t = androidx.work.impl.utils.futures.c.t();
    }

    private final void q() {
        if (this.f9516t.isCancelled()) {
            return;
        }
        String strM = g().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        i iVarE = i.e();
        k.e(iVarE, "get()");
        if (strM == null || strM.length() == 0) {
            iVarE.c(t0.c.f22283a, "No worker to delegate to.");
        } else {
            c cVarB = h().b(a(), strM, this.f9513q);
            this.f9517u = cVarB;
            if (cVarB == null) {
                iVarE.a(t0.c.f22283a, "No worker to delegate to.");
            } else {
                E eQ = E.q(a());
                k.e(eQ, "getInstance(applicationContext)");
                v vVarJ = eQ.v().j();
                String string = e().toString();
                k.e(string, "id.toString()");
                u uVarQ = vVarJ.q(string);
                if (uVarQ != null) {
                    n nVarU = eQ.u();
                    k.e(nVarU, "workManagerImpl.trackers");
                    e eVar = new e(nVarU, this);
                    eVar.b(AbstractC1809n.d(uVarQ));
                    String string2 = e().toString();
                    k.e(string2, "id.toString()");
                    if (!eVar.e(string2)) {
                        iVarE.a(t0.c.f22283a, "Constraints not met for delegate " + strM + ". Requesting retry.");
                        androidx.work.impl.utils.futures.c cVar = this.f9516t;
                        k.e(cVar, "future");
                        t0.c.e(cVar);
                        return;
                    }
                    iVarE.a(t0.c.f22283a, "Constraints met for delegate " + strM);
                    try {
                        c cVar2 = this.f9517u;
                        k.c(cVar2);
                        final d dVarM = cVar2.m();
                        k.e(dVarM, "delegate!!.startWork()");
                        dVarM.e(new Runnable() { // from class: t0.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstraintTrackingWorker.r(this.f22281m, dVarM);
                            }
                        }, c());
                        return;
                    } catch (Throwable th) {
                        iVarE.b(t0.c.f22283a, "Delegated worker " + strM + " threw exception in startWork.", th);
                        synchronized (this.f9514r) {
                            try {
                                if (!this.f9515s) {
                                    androidx.work.impl.utils.futures.c cVar3 = this.f9516t;
                                    k.e(cVar3, "future");
                                    t0.c.d(cVar3);
                                    return;
                                } else {
                                    iVarE.a(t0.c.f22283a, "Constraints were unmet, Retrying.");
                                    androidx.work.impl.utils.futures.c cVar4 = this.f9516t;
                                    k.e(cVar4, "future");
                                    t0.c.e(cVar4);
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            }
        }
        androidx.work.impl.utils.futures.c cVar5 = this.f9516t;
        k.e(cVar5, "future");
        t0.c.d(cVar5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ConstraintTrackingWorker constraintTrackingWorker, d dVar) {
        k.f(constraintTrackingWorker, "this$0");
        k.f(dVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f9514r) {
            try {
                if (constraintTrackingWorker.f9515s) {
                    androidx.work.impl.utils.futures.c cVar = constraintTrackingWorker.f9516t;
                    k.e(cVar, "future");
                    t0.c.e(cVar);
                } else {
                    constraintTrackingWorker.f9516t.r(dVar);
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ConstraintTrackingWorker constraintTrackingWorker) {
        k.f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.q();
    }

    @Override // n0.InterfaceC1893c
    public void b(List list) {
        k.f(list, "workSpecs");
        i.e().a(t0.c.f22283a, "Constraints changed for " + list);
        synchronized (this.f9514r) {
            this.f9515s = true;
            i5.u uVar = i5.u.f19985a;
        }
    }

    @Override // n0.InterfaceC1893c
    public void f(List list) {
        k.f(list, "workSpecs");
    }

    @Override // androidx.work.c
    public void k() {
        super.k();
        c cVar = this.f9517u;
        if (cVar == null || cVar.i()) {
            return;
        }
        cVar.n();
    }

    @Override // androidx.work.c
    public d m() {
        c().execute(new Runnable() { // from class: t0.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.s(this.f22280m);
            }
        });
        androidx.work.impl.utils.futures.c cVar = this.f9516t;
        k.e(cVar, "future");
        return cVar;
    }
}
