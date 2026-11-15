package J5;

import H5.P0;
import M5.O;
import M5.x;
import i5.u;
import w5.w;

/* JADX INFO: loaded from: classes2.dex */
public class k extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f1823o;

    public k(int i7, a aVar, v5.l lVar) {
        super(i7, lVar);
        this.f1822n = i7;
        this.f1823o = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + w.b(b.class).a() + " instead").toString());
        }
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i7 + " was specified").toString());
    }

    private final Object x0(Object obj, boolean z6) {
        v5.l lVar;
        O oD;
        Object objD = super.d(obj);
        if (f.f(objD) || f.e(objD)) {
            return objD;
        }
        if (!z6 || (lVar = this.f1789c) == null || (oD = x.d(lVar, obj, null, 2, null)) == null) {
            return f.f1817a.c(u.f19985a);
        }
        throw oD;
    }

    private final Object y0(Object obj) {
        h hVar;
        Object obj2 = c.f1797d;
        h hVar2 = (h) b.f1783i.get(this);
        while (true) {
            long andIncrement = b.f1779e.getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zR = R(andIncrement);
            int i7 = c.f1795b;
            long j8 = j7 / ((long) i7);
            int i8 = (int) (j7 % ((long) i7));
            if (hVar2.f2062o != j8) {
                h hVarB = B(j8, hVar2);
                if (hVarB != null) {
                    hVar = hVarB;
                } else if (zR) {
                    return f.f1817a.a(G());
                }
            } else {
                hVar = hVar2;
            }
            int iS0 = s0(hVar, i8, obj, j7, obj2, zR);
            if (iS0 == 0) {
                hVar.b();
                return f.f1817a.c(u.f19985a);
            }
            if (iS0 == 1) {
                return f.f1817a.c(u.f19985a);
            }
            if (iS0 == 2) {
                if (zR) {
                    hVar.p();
                    return f.f1817a.a(G());
                }
                P0 p02 = obj2 instanceof P0 ? (P0) obj2 : null;
                if (p02 != null) {
                    e0(p02, hVar, i8);
                }
                x((hVar.f2062o * ((long) i7)) + ((long) i8));
                return f.f1817a.c(u.f19985a);
            }
            if (iS0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iS0 == 4) {
                if (j7 < F()) {
                    hVar.b();
                }
                return f.f1817a.a(G());
            }
            if (iS0 == 5) {
                hVar.b();
            }
            hVar2 = hVar;
        }
    }

    private final Object z0(Object obj, boolean z6) {
        return this.f1823o == a.DROP_LATEST ? x0(obj, z6) : y0(obj);
    }

    @Override // J5.b
    protected boolean S() {
        return this.f1823o == a.DROP_OLDEST;
    }

    @Override // J5.b, J5.m
    public Object d(Object obj) {
        return z0(obj, false);
    }
}
