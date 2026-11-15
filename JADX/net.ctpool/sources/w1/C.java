package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f22602b = C.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f22603a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        P0.a.w(f22602b, "Count = %d", Integer.valueOf(this.f22603a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f22603a.values());
            this.f22603a.clear();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            D1.g gVar = (D1.g) arrayList.get(i7);
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    public synchronized boolean b(I0.d dVar) {
        O0.l.g(dVar);
        if (!this.f22603a.containsKey(dVar)) {
            return false;
        }
        D1.g gVar = (D1.g) this.f22603a.get(dVar);
        synchronized (gVar) {
            if (D1.g.j0(gVar)) {
                return true;
            }
            this.f22603a.remove(dVar);
            P0.a.E(f22602b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(gVar)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized D1.g c(I0.d dVar) {
        O0.l.g(dVar);
        D1.g gVarB = (D1.g) this.f22603a.get(dVar);
        if (gVarB != null) {
            synchronized (gVarB) {
                if (!D1.g.j0(gVarB)) {
                    this.f22603a.remove(dVar);
                    P0.a.E(f22602b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(gVarB)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                gVarB = D1.g.b(gVarB);
            }
        }
        return gVarB;
    }

    public synchronized void f(I0.d dVar, D1.g gVar) {
        O0.l.g(dVar);
        O0.l.b(Boolean.valueOf(D1.g.j0(gVar)));
        D1.g.d((D1.g) this.f22603a.put(dVar, D1.g.b(gVar)));
        e();
    }

    public boolean g(I0.d dVar) {
        D1.g gVar;
        O0.l.g(dVar);
        synchronized (this) {
            gVar = (D1.g) this.f22603a.remove(dVar);
        }
        if (gVar == null) {
            return false;
        }
        try {
            return gVar.h0();
        } finally {
            gVar.close();
        }
    }

    public synchronized boolean h(I0.d dVar, D1.g gVar) {
        O0.l.g(dVar);
        O0.l.g(gVar);
        O0.l.b(Boolean.valueOf(D1.g.j0(gVar)));
        D1.g gVar2 = (D1.g) this.f22603a.get(dVar);
        if (gVar2 == null) {
            return false;
        }
        S0.a aVarF = gVar2.f();
        S0.a aVarF2 = gVar.f();
        if (aVarF != null && aVarF2 != null) {
            try {
                if (aVarF.j() == aVarF2.j()) {
                    this.f22603a.remove(dVar);
                    S0.a.g(aVarF2);
                    S0.a.g(aVarF);
                    D1.g.d(gVar2);
                    e();
                    return true;
                }
            } finally {
                S0.a.g(aVarF2);
                S0.a.g(aVarF);
                D1.g.d(gVar2);
            }
        }
        return false;
    }
}
