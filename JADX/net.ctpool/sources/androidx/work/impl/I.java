package androidx.work.impl;

import j5.AbstractC1809n;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l0.l;
import l0.t;
import q0.u;
import r0.AbstractC2013d;
import r0.RunnableC2012c;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    static final class a extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ l0.u f9294m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E f9295n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f9296o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o f9297p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0.u uVar, E e7, String str, o oVar) {
            super(0);
            this.f9294m = uVar;
            this.f9295n = e7;
            this.f9296o = str;
            this.f9297p = oVar;
        }

        public final void a() {
            new RunnableC2012c(new x(this.f9295n, this.f9296o, l0.d.KEEP, AbstractC1809n.d(this.f9294m)), this.f9297p).run();
        }

        @Override // v5.InterfaceC2171a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return i5.u.f19985a;
        }
    }

    static final class b extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f9298m = new b();

        b() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String i(q0.u uVar) {
            w5.k.f(uVar, "spec");
            return uVar.j() ? "Periodic" : "OneTime";
        }
    }

    public static final l0.l c(final E e7, final String str, final l0.u uVar) {
        w5.k.f(e7, "<this>");
        w5.k.f(str, "name");
        w5.k.f(uVar, "workRequest");
        final o oVar = new o();
        final a aVar = new a(uVar, e7, str, oVar);
        e7.w().b().execute(new Runnable() { // from class: androidx.work.impl.G
            @Override // java.lang.Runnable
            public final void run() {
                I.d(e7, str, oVar, aVar, uVar);
            }
        });
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E e7, String str, o oVar, InterfaceC2171a interfaceC2171a, l0.u uVar) {
        w5.k.f(e7, "$this_enqueueUniquelyNamedPeriodic");
        w5.k.f(str, "$name");
        w5.k.f(oVar, "$operation");
        w5.k.f(interfaceC2171a, "$enqueueNew");
        w5.k.f(uVar, "$workRequest");
        q0.v vVarJ = e7.v().j();
        List listF = vVarJ.f(str);
        if (listF.size() > 1) {
            e(oVar, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        u.b bVar = (u.b) AbstractC1809n.J(listF);
        if (bVar == null) {
            interfaceC2171a.invoke();
            return;
        }
        q0.u uVarQ = vVarJ.q(bVar.f21815a);
        if (uVarQ == null) {
            oVar.a(new l.b.a(new IllegalStateException("WorkSpec with " + bVar.f21815a + ", that matches a name \"" + str + "\", wasn't found")));
            return;
        }
        if (!uVarQ.j()) {
            e(oVar, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (bVar.f21816b == l0.s.CANCELLED) {
            vVarJ.a(bVar.f21815a);
            interfaceC2171a.invoke();
            return;
        }
        q0.u uVarD = uVar.d();
        q0.u uVarD2 = uVarD.d((1048574 & 1) != 0 ? uVarD.f21795a : bVar.f21815a, (1048574 & 2) != 0 ? uVarD.f21796b : null, (1048574 & 4) != 0 ? uVarD.f21797c : null, (1048574 & 8) != 0 ? uVarD.f21798d : null, (1048574 & 16) != 0 ? uVarD.f21799e : null, (1048574 & 32) != 0 ? uVarD.f21800f : null, (1048574 & 64) != 0 ? uVarD.f21801g : 0L, (1048574 & 128) != 0 ? uVarD.f21802h : 0L, (1048574 & 256) != 0 ? uVarD.f21803i : 0L, (1048574 & 512) != 0 ? uVarD.f21804j : null, (1048574 & 1024) != 0 ? uVarD.f21805k : 0, (1048574 & 2048) != 0 ? uVarD.f21806l : null, (1048574 & 4096) != 0 ? uVarD.f21807m : 0L, (1048574 & 8192) != 0 ? uVarD.f21808n : 0L, (1048574 & 16384) != 0 ? uVarD.f21809o : 0L, (1048574 & 32768) != 0 ? uVarD.f21810p : 0L, (1048574 & 65536) != 0 ? uVarD.f21811q : false, (131072 & 1048574) != 0 ? uVarD.f21812r : null, (1048574 & 262144) != 0 ? uVarD.f21813s : 0, (1048574 & 524288) != 0 ? uVarD.f21814t : 0);
        try {
            r rVarS = e7.s();
            w5.k.e(rVarS, "processor");
            WorkDatabase workDatabaseV = e7.v();
            w5.k.e(workDatabaseV, "workDatabase");
            androidx.work.a aVarO = e7.o();
            w5.k.e(aVarO, "configuration");
            List listT = e7.t();
            w5.k.e(listT, "schedulers");
            f(rVarS, workDatabaseV, aVarO, listT, uVarD2, uVar.c());
            oVar.a(l0.l.f21052a);
        } catch (Throwable th) {
            oVar.a(new l.b.a(th));
        }
    }

    private static final void e(o oVar, String str) {
        oVar.a(new l.b.a(new UnsupportedOperationException(str)));
    }

    private static final t.a f(r rVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List list, final q0.u uVar, final Set set) {
        final String str = uVar.f21795a;
        final q0.u uVarQ = workDatabase.j().q(str);
        if (uVarQ == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (uVarQ.f21796b.h()) {
            return t.a.NOT_APPLIED;
        }
        if (uVarQ.j() ^ uVar.j()) {
            b bVar = b.f9298m;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.i(uVarQ)) + " Worker to " + ((String) bVar.i(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = rVar.k(str);
        if (!zK) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).d(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.H
            @Override // java.lang.Runnable
            public final void run() {
                I.g(workDatabase, uVar, uVarQ, list, str, set, zK);
            }
        });
        if (!zK) {
            u.b(aVar, workDatabase, list);
        }
        return zK ? t.a.APPLIED_FOR_NEXT_RUN : t.a.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WorkDatabase workDatabase, q0.u uVar, q0.u uVar2, List list, String str, Set set, boolean z6) {
        w5.k.f(workDatabase, "$workDatabase");
        w5.k.f(uVar, "$newWorkSpec");
        w5.k.f(uVar2, "$oldWorkSpec");
        w5.k.f(list, "$schedulers");
        w5.k.f(str, "$workSpecId");
        w5.k.f(set, "$tags");
        q0.v vVarJ = workDatabase.j();
        q0.z zVarK = workDatabase.k();
        vVarJ.h(AbstractC2013d.b(list, uVar.d((1048574 & 1) != 0 ? uVar.f21795a : null, (1048574 & 2) != 0 ? uVar.f21796b : uVar2.f21796b, (1048574 & 4) != 0 ? uVar.f21797c : null, (1048574 & 8) != 0 ? uVar.f21798d : null, (1048574 & 16) != 0 ? uVar.f21799e : null, (1048574 & 32) != 0 ? uVar.f21800f : null, (1048574 & 64) != 0 ? uVar.f21801g : 0L, (1048574 & 128) != 0 ? uVar.f21802h : 0L, (1048574 & 256) != 0 ? uVar.f21803i : 0L, (1048574 & 512) != 0 ? uVar.f21804j : null, (1048574 & 1024) != 0 ? uVar.f21805k : uVar2.f21805k, (1048574 & 2048) != 0 ? uVar.f21806l : null, (1048574 & 4096) != 0 ? uVar.f21807m : 0L, (1048574 & 8192) != 0 ? uVar.f21808n : uVar2.f21808n, (1048574 & 16384) != 0 ? uVar.f21809o : 0L, (1048574 & 32768) != 0 ? uVar.f21810p : 0L, (1048574 & 65536) != 0 ? uVar.f21811q : false, (131072 & 1048574) != 0 ? uVar.f21812r : null, (1048574 & 262144) != 0 ? uVar.f21813s : 0, (1048574 & 524288) != 0 ? uVar.f21814t : uVar2.f() + 1)));
        zVarK.d(str);
        zVarK.c(str, set);
        if (z6) {
            return;
        }
        vVarJ.e(str, -1L);
        workDatabase.i().a(str);
    }
}
