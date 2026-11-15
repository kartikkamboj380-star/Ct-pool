package r0;

import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l0.l;
import q0.C1985a;
import q0.InterfaceC1986b;
import q0.u;

/* JADX INFO: renamed from: r0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2012c implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f22089o = l0.i.i("EnqueueRunnable");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.work.impl.x f22090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.work.impl.o f22091n;

    public RunnableC2012c(androidx.work.impl.x xVar) {
        this(xVar, new androidx.work.impl.o());
    }

    private static boolean b(androidx.work.impl.x xVar) {
        boolean zC = c(xVar.g(), xVar.f(), (String[]) androidx.work.impl.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(E e7, List list, String[] strArr, String str, l0.d dVar) {
        boolean z6;
        boolean z7;
        boolean z8;
        InterfaceC1986b interfaceC1986b;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseV = e7.v();
        boolean z9 = true;
        boolean z10 = strArr2 != null && strArr2.length > 0;
        if (z10) {
            z6 = true;
            z7 = false;
            z8 = false;
            for (String str2 : strArr2) {
                q0.u uVarQ = workDatabaseV.j().q(str2);
                if (uVarQ == null) {
                    l0.i.e().c(f22089o, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                l0.s sVar = uVarQ.f21796b;
                z6 &= sVar == l0.s.SUCCEEDED;
                if (sVar == l0.s.FAILED) {
                    z8 = true;
                } else if (sVar == l0.s.CANCELLED) {
                    z7 = true;
                }
            }
        } else {
            z6 = true;
            z7 = false;
            z8 = false;
        }
        boolean z11 = !TextUtils.isEmpty(str);
        if (!z11 || z10) {
            z9 = false;
        } else {
            List<u.b> listF = workDatabaseV.j().f(str);
            if (!listF.isEmpty()) {
                if (dVar == l0.d.APPEND || dVar == l0.d.APPEND_OR_REPLACE) {
                    InterfaceC1986b interfaceC1986bE = workDatabaseV.e();
                    List arrayList = new ArrayList();
                    for (u.b bVar : listF) {
                        if (interfaceC1986bE.d(bVar.f21815a)) {
                            interfaceC1986b = interfaceC1986bE;
                        } else {
                            l0.s sVar2 = bVar.f21816b;
                            interfaceC1986b = interfaceC1986bE;
                            boolean z12 = (sVar2 == l0.s.SUCCEEDED) & z6;
                            if (sVar2 == l0.s.FAILED) {
                                z8 = true;
                            } else if (sVar2 == l0.s.CANCELLED) {
                                z7 = true;
                            }
                            arrayList.add(bVar.f21815a);
                            z6 = z12;
                        }
                        interfaceC1986bE = interfaceC1986b;
                    }
                    if (dVar == l0.d.APPEND_OR_REPLACE && (z7 || z8)) {
                        q0.v vVarJ = workDatabaseV.j();
                        Iterator it = vVarJ.f(str).iterator();
                        while (it.hasNext()) {
                            vVarJ.a(((u.b) it.next()).f21815a);
                        }
                        arrayList = Collections.emptyList();
                        z7 = false;
                        z8 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z10 = strArr2.length > 0;
                } else {
                    if (dVar == l0.d.KEEP) {
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            l0.s sVar3 = ((u.b) it2.next()).f21816b;
                            if (sVar3 == l0.s.ENQUEUED || sVar3 == l0.s.RUNNING) {
                                return false;
                            }
                        }
                    }
                    AbstractRunnableC2011b.c(str, e7, false).run();
                    q0.v vVarJ2 = workDatabaseV.j();
                    Iterator it3 = listF.iterator();
                    while (it3.hasNext()) {
                        vVarJ2.a(((u.b) it3.next()).f21815a);
                    }
                }
            }
            z9 = false;
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            l0.u uVar = (l0.u) it4.next();
            q0.u uVarD = uVar.d();
            if (!z10 || z6) {
                uVarD.f21808n = jCurrentTimeMillis;
            } else {
                uVarD.f21796b = z8 ? l0.s.FAILED : z7 ? l0.s.CANCELLED : l0.s.BLOCKED;
            }
            Iterator it5 = it4;
            if (uVarD.f21796b == l0.s.ENQUEUED) {
                z9 = true;
            }
            workDatabaseV.j().b(AbstractC2013d.b(e7.t(), uVarD));
            if (z10) {
                int length = strArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    workDatabaseV.e().a(new C1985a(uVar.b(), strArr2[i7]));
                    i7++;
                    length = length;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            workDatabaseV.k().c(uVar.b(), uVar.c());
            if (z11) {
                workDatabaseV.h().a(new q0.n(str, uVar.b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z9;
    }

    private static boolean e(androidx.work.impl.x xVar) {
        List<androidx.work.impl.x> listE = xVar.e();
        boolean zE = false;
        if (listE != null) {
            for (androidx.work.impl.x xVar2 : listE) {
                if (xVar2.j()) {
                    l0.i.e().k(f22089o, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                } else {
                    zE |= e(xVar2);
                }
            }
        }
        return b(xVar) | zE;
    }

    public boolean a() {
        WorkDatabase workDatabaseV = this.f22090m.g().v();
        workDatabaseV.beginTransaction();
        try {
            boolean zE = e(this.f22090m);
            workDatabaseV.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseV.endTransaction();
        }
    }

    public l0.l d() {
        return this.f22091n;
    }

    public void f() {
        E eG = this.f22090m.g();
        androidx.work.impl.u.b(eG.o(), eG.v(), eG.t());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f22090m.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f22090m + ")");
            }
            if (a()) {
                p.a(this.f22090m.g().n(), RescheduleReceiver.class, true);
                f();
            }
            this.f22091n.a(l0.l.f21052a);
        } catch (Throwable th) {
            this.f22091n.a(new l.b.a(th));
        }
    }

    public RunnableC2012c(androidx.work.impl.x xVar, androidx.work.impl.o oVar) {
        this.f22090m = xVar;
        this.f22091n = oVar;
    }
}
