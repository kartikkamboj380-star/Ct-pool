package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l0.EnumC1845c;
import l0.i;
import m0.C1867b;
import r0.AbstractRunnableC2011b;
import s0.C2035c;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public class E extends l0.t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f9267k = l0.i.i("WorkManagerImpl");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static E f9268l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static E f9269m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f9270n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.a f9272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f9273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC2034b f9274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f9275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f9276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r0.q f9277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f9279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0.n f9280j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public E(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b) {
        this(context, aVar, interfaceC2034b, context.getResources().getBoolean(l0.p.f21059a));
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f9270n) {
            try {
                E e7 = f9268l;
                if (e7 != null && f9269m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (e7 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f9269m == null) {
                        f9269m = new E(applicationContext, aVar, new C2035c(aVar.m()));
                    }
                    f9268l = f9269m;
                }
            } finally {
            }
        }
    }

    public static E p() {
        synchronized (f9270n) {
            try {
                E e7 = f9268l;
                if (e7 != null) {
                    return e7;
                }
                return f9269m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static E q(Context context) {
        E eP;
        synchronized (f9270n) {
            try {
                eP = p();
                if (eP == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eP;
    }

    private void x(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9271a = applicationContext;
        this.f9272b = aVar;
        this.f9274d = interfaceC2034b;
        this.f9273c = workDatabase;
        this.f9275e = list;
        this.f9276f = rVar;
        this.f9277g = new r0.q(workDatabase);
        this.f9278h = false;
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f9274d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f9270n) {
            try {
                this.f9279i = pendingResult;
                if (this.f9278h) {
                    pendingResult.finish();
                    this.f9279i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(v vVar) {
        C(vVar, null);
    }

    public void C(v vVar, WorkerParameters.a aVar) {
        this.f9274d.c(new r0.u(this, vVar, aVar));
    }

    public void D(q0.m mVar) {
        this.f9274d.c(new r0.v(this, new v(mVar), true));
    }

    public void E(v vVar) {
        this.f9274d.c(new r0.v(this, vVar, false));
    }

    @Override // l0.t
    public l0.l a(String str) {
        AbstractRunnableC2011b abstractRunnableC2011bD = AbstractRunnableC2011b.d(str, this);
        this.f9274d.c(abstractRunnableC2011bD);
        return abstractRunnableC2011bD.e();
    }

    @Override // l0.t
    public l0.l b(String str) {
        AbstractRunnableC2011b abstractRunnableC2011bC = AbstractRunnableC2011b.c(str, this, true);
        this.f9274d.c(abstractRunnableC2011bC);
        return abstractRunnableC2011bC.e();
    }

    @Override // l0.t
    public l0.l c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    @Override // l0.t
    public l0.l e(String str, EnumC1845c enumC1845c, l0.n nVar) {
        return enumC1845c == EnumC1845c.UPDATE ? I.c(this, str, nVar) : m(str, enumC1845c, nVar).a();
    }

    @Override // l0.t
    public l0.l f(String str, l0.d dVar, List list) {
        return new x(this, str, dVar, list).a();
    }

    @Override // l0.t
    public l0.l j() {
        r0.s sVar = new r0.s(this);
        this.f9274d.c(sVar);
        return sVar.a();
    }

    public l0.l k(UUID uuid) {
        AbstractRunnableC2011b abstractRunnableC2011bB = AbstractRunnableC2011b.b(uuid, this);
        this.f9274d.c(abstractRunnableC2011bB);
        return abstractRunnableC2011bB.e();
    }

    public List l(Context context, androidx.work.a aVar, p0.n nVar) {
        return Arrays.asList(u.a(context, this), new C1867b(context, aVar, nVar, this));
    }

    public x m(String str, EnumC1845c enumC1845c, l0.n nVar) {
        return new x(this, str, enumC1845c == EnumC1845c.KEEP ? l0.d.KEEP : l0.d.REPLACE, Collections.singletonList(nVar));
    }

    public Context n() {
        return this.f9271a;
    }

    public androidx.work.a o() {
        return this.f9272b;
    }

    public r0.q r() {
        return this.f9277g;
    }

    public r s() {
        return this.f9276f;
    }

    public List t() {
        return this.f9275e;
    }

    public p0.n u() {
        return this.f9280j;
    }

    public WorkDatabase v() {
        return this.f9273c;
    }

    public InterfaceC2034b w() {
        return this.f9274d;
    }

    public void y() {
        synchronized (f9270n) {
            try {
                this.f9278h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f9279i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f9279i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        androidx.work.impl.background.systemjob.g.a(n());
        v().j().x();
        u.b(o(), v(), t());
    }

    public E(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        l0.i.h(new i.a(aVar.j()));
        p0.n nVar = new p0.n(applicationContext, interfaceC2034b);
        this.f9280j = nVar;
        List listL = l(applicationContext, aVar, nVar);
        x(context, aVar, interfaceC2034b, workDatabase, listL, new r(context, aVar, interfaceC2034b, workDatabase, listL));
    }

    public E(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b, boolean z6) {
        this(context, aVar, interfaceC2034b, WorkDatabase.d(context.getApplicationContext(), interfaceC2034b.b(), z6));
    }
}
