package m0;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC0665e;
import androidx.work.impl.t;
import androidx.work.impl.v;
import androidx.work.impl.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l0.i;
import l0.s;
import n0.InterfaceC1893c;
import n0.d;
import n0.e;
import p0.n;
import q0.m;
import q0.u;
import q0.x;
import r0.r;

/* JADX INFO: renamed from: m0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1867b implements t, InterfaceC1893c, InterfaceC0665e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f21211v = i.i("GreedyScheduler");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f21212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f21213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f21214o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1866a f21216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21217r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Boolean f21220u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f21215p = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w f21219t = new w();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f21218s = new Object();

    public C1867b(Context context, androidx.work.a aVar, n nVar, E e7) {
        this.f21212m = context;
        this.f21213n = e7;
        this.f21214o = new e(nVar, this);
        this.f21216q = new C1866a(this, aVar.k());
    }

    private void g() {
        this.f21220u = Boolean.valueOf(r.b(this.f21212m, this.f21213n.o()));
    }

    private void h() {
        if (this.f21217r) {
            return;
        }
        this.f21213n.s().g(this);
        this.f21217r = true;
    }

    private void i(m mVar) {
        synchronized (this.f21218s) {
            try {
                Iterator it = this.f21215p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar = (u) it.next();
                    if (x.a(uVar).equals(mVar)) {
                        i.e().a(f21211v, "Stopping tracking for " + mVar);
                        this.f21215p.remove(uVar);
                        this.f21214o.b(this.f21215p);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a */
    public void l(m mVar, boolean z6) {
        this.f21219t.b(mVar);
        i(mVar);
    }

    @Override // n0.InterfaceC1893c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = x.a((u) it.next());
            i.e().a(f21211v, "Constraints not met: Cancelling work ID " + mVarA);
            v vVarB = this.f21219t.b(mVarA);
            if (vVarB != null) {
                this.f21213n.E(vVarB);
            }
        }
    }

    @Override // androidx.work.impl.t
    public boolean c() {
        return false;
    }

    @Override // androidx.work.impl.t
    public void d(String str) {
        if (this.f21220u == null) {
            g();
        }
        if (!this.f21220u.booleanValue()) {
            i.e().f(f21211v, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        i.e().a(f21211v, "Cancelling work ID " + str);
        C1866a c1866a = this.f21216q;
        if (c1866a != null) {
            c1866a.b(str);
        }
        Iterator it = this.f21219t.c(str).iterator();
        while (it.hasNext()) {
            this.f21213n.E((v) it.next());
        }
    }

    @Override // androidx.work.impl.t
    public void e(u... uVarArr) {
        i iVarE;
        String str;
        StringBuilder sb;
        String str2;
        if (this.f21220u == null) {
            g();
        }
        if (!this.f21220u.booleanValue()) {
            i.e().f(f21211v, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f21219t.a(x.a(uVar))) {
                long jC = uVar.c();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (uVar.f21796b == s.ENQUEUED) {
                    if (jCurrentTimeMillis < jC) {
                        C1866a c1866a = this.f21216q;
                        if (c1866a != null) {
                            c1866a.a(uVar);
                        }
                    } else if (uVar.h()) {
                        if (uVar.f21804j.h()) {
                            iVarE = i.e();
                            str = f21211v;
                            sb = new StringBuilder();
                            sb.append("Ignoring ");
                            sb.append(uVar);
                            str2 = ". Requires device idle.";
                        } else if (uVar.f21804j.e()) {
                            iVarE = i.e();
                            str = f21211v;
                            sb = new StringBuilder();
                            sb.append("Ignoring ");
                            sb.append(uVar);
                            str2 = ". Requires ContentUri triggers.";
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f21795a);
                        }
                        sb.append(str2);
                        iVarE.a(str, sb.toString());
                    } else if (!this.f21219t.a(x.a(uVar))) {
                        i.e().a(f21211v, "Starting work for " + uVar.f21795a);
                        this.f21213n.B(this.f21219t.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f21218s) {
            try {
                if (!hashSet.isEmpty()) {
                    i.e().a(f21211v, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f21215p.addAll(hashSet);
                    this.f21214o.b(this.f21215p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.InterfaceC1893c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = x.a((u) it.next());
            if (!this.f21219t.a(mVarA)) {
                i.e().a(f21211v, "Constraints met: Scheduling work ID " + mVarA);
                this.f21213n.B(this.f21219t.d(mVarA));
            }
        }
    }
}
