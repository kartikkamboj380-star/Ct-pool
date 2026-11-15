package B1;

import D1.k;
import D1.l;
import O0.o;
import O0.p;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.util.Map;
import s1.C2037b;
import s1.C2038c;
import s1.C2039d;
import x1.C2212c;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H1.f f668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f671f;

    class a implements c {
        a() {
        }

        @Override // B1.c
        public D1.d a(D1.g gVar, int i7, l lVar, C2212c c2212c) {
            ColorSpace colorSpaceJ;
            C2038c c2038cN = gVar.n();
            if (((Boolean) b.this.f669d.get()).booleanValue()) {
                colorSpaceJ = c2212c.f22804k;
                if (colorSpaceJ == null) {
                    colorSpaceJ = gVar.j();
                }
            } else {
                colorSpaceJ = c2212c.f22804k;
            }
            ColorSpace colorSpace = colorSpaceJ;
            if (c2038cN == C2037b.f22237b) {
                return b.this.e(gVar, i7, lVar, c2212c, colorSpace);
            }
            if (c2038cN == C2037b.f22239d) {
                return b.this.d(gVar, i7, lVar, c2212c);
            }
            if (c2038cN == C2037b.f22246k) {
                return b.this.c(gVar, i7, lVar, c2212c);
            }
            if (c2038cN != C2038c.f22251d) {
                return b.this.f(gVar, c2212c);
            }
            throw new B1.a("unknown image format", gVar);
        }
    }

    public b(c cVar, c cVar2, H1.f fVar) {
        this(cVar, cVar2, fVar, null);
    }

    @Override // B1.c
    public D1.d a(D1.g gVar, int i7, l lVar, C2212c c2212c) {
        InputStream inputStreamO;
        c cVar;
        c cVar2 = c2212c.f22803j;
        if (cVar2 != null) {
            return cVar2.a(gVar, i7, lVar, c2212c);
        }
        C2038c c2038cN = gVar.n();
        if ((c2038cN == null || c2038cN == C2038c.f22251d) && (inputStreamO = gVar.o()) != null) {
            c2038cN = C2039d.c(inputStreamO);
            gVar.b1(c2038cN);
        }
        Map map = this.f671f;
        return (map == null || (cVar = (c) map.get(c2038cN)) == null) ? this.f670e.a(gVar, i7, lVar, c2212c) : cVar.a(gVar, i7, lVar, c2212c);
    }

    public D1.d c(D1.g gVar, int i7, l lVar, C2212c c2212c) {
        c cVar;
        return (c2212c.f22800g || (cVar = this.f667b) == null) ? f(gVar, c2212c) : cVar.a(gVar, i7, lVar, c2212c);
    }

    public D1.d d(D1.g gVar, int i7, l lVar, C2212c c2212c) {
        c cVar;
        if (gVar.getWidth() == -1 || gVar.getHeight() == -1) {
            throw new B1.a("image width or height is incorrect", gVar);
        }
        return (c2212c.f22800g || (cVar = this.f666a) == null) ? f(gVar, c2212c) : cVar.a(gVar, i7, lVar, c2212c);
    }

    public D1.e e(D1.g gVar, int i7, l lVar, C2212c c2212c, ColorSpace colorSpace) {
        S0.a aVarA = this.f668c.a(gVar, c2212c.f22801h, null, i7, colorSpace);
        try {
            M1.b.a(null, aVarA);
            O0.l.g(aVarA);
            D1.e eVarQ0 = D1.e.Q0(aVarA, lVar, gVar.T(), gVar.g1());
            eVarQ0.w("is_rounded", false);
            return eVarQ0;
        } finally {
            S0.a.g(aVarA);
        }
    }

    public D1.e f(D1.g gVar, C2212c c2212c) {
        S0.a aVarB = this.f668c.b(gVar, c2212c.f22801h, null, c2212c.f22804k);
        try {
            M1.b.a(null, aVarB);
            O0.l.g(aVarB);
            D1.e eVarQ0 = D1.e.Q0(aVarB, k.f996d, gVar.T(), gVar.g1());
            eVarQ0.w("is_rounded", false);
            return eVarQ0;
        } finally {
            S0.a.g(aVarB);
        }
    }

    public b(c cVar, c cVar2, H1.f fVar, Map map) {
        this.f670e = new a();
        this.f666a = cVar;
        this.f667b = cVar2;
        this.f668c = fVar;
        this.f671f = map;
        this.f669d = p.f2461b;
    }
}
