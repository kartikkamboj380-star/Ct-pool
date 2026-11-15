package q;

import java.util.ArrayList;
import q.C1982d;
import q.i;

/* JADX INFO: renamed from: q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1980b implements C1982d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f21674e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f21670a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f21671b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21672c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f21673d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f21675f = false;

    /* JADX INFO: renamed from: q.b$a */
    public interface a {
        void a(i iVar, float f7);

        int b();

        i c(int i7);

        void clear();

        float d(i iVar, boolean z6);

        boolean e(i iVar);

        void f();

        float g(int i7);

        void h(i iVar, float f7, boolean z6);

        float i(i iVar);

        float j(C1980b c1980b, boolean z6);

        void k(float f7);
    }

    public C1980b() {
    }

    private boolean v(i iVar, C1982d c1982d) {
        return iVar.f21726m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.f21674e.b();
        i iVar2 = null;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < iB; i7++) {
            float fG = this.f21674e.g(i7);
            if (fG < 0.0f) {
                i iVarC = this.f21674e.c(i7);
                if ((zArr == null || !zArr[iVarC.f21716c]) && iVarC != iVar && (((aVar = iVarC.f21723j) == i.a.SLACK || aVar == i.a.ERROR) && fG < f7)) {
                    f7 = fG;
                    iVar2 = iVarC;
                }
            }
        }
        return iVar2;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1980b.A():java.lang.String");
    }

    public void B(C1982d c1982d, i iVar, boolean z6) {
        if (iVar.f21720g) {
            this.f21671b += iVar.f21719f * this.f21674e.i(iVar);
            this.f21674e.d(iVar, z6);
            if (z6) {
                iVar.c(this);
            }
        }
    }

    public void C(C1980b c1980b, boolean z6) {
        this.f21671b += c1980b.f21671b * this.f21674e.j(c1980b, z6);
        if (z6) {
            c1980b.f21670a.c(this);
        }
    }

    public void D(C1982d c1982d) {
        if (c1982d.f21689f.length == 0) {
            return;
        }
        boolean z6 = false;
        while (!z6) {
            int iB = this.f21674e.b();
            for (int i7 = 0; i7 < iB; i7++) {
                i iVarC = this.f21674e.c(i7);
                if (iVarC.f21717d != -1 || iVarC.f21720g) {
                    this.f21673d.add(iVarC);
                }
            }
            if (this.f21673d.size() > 0) {
                for (i iVar : this.f21673d) {
                    if (iVar.f21720g) {
                        B(c1982d, iVar, true);
                    } else {
                        C(c1982d.f21689f[iVar.f21717d], true);
                    }
                }
                this.f21673d.clear();
            } else {
                z6 = true;
            }
        }
    }

    @Override // q.C1982d.a
    public i a(C1982d c1982d, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // q.C1982d.a
    public void b(C1982d.a aVar) {
        if (aVar instanceof C1980b) {
            C1980b c1980b = (C1980b) aVar;
            this.f21670a = null;
            this.f21674e.clear();
            for (int i7 = 0; i7 < c1980b.f21674e.b(); i7++) {
                this.f21674e.h(c1980b.f21674e.c(i7), c1980b.f21674e.g(i7), true);
            }
        }
    }

    @Override // q.C1982d.a
    public void c(i iVar) {
        int i7 = iVar.f21718e;
        float f7 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f7 = 1000.0f;
            } else if (i7 == 3) {
                f7 = 1000000.0f;
            } else if (i7 == 4) {
                f7 = 1.0E9f;
            } else if (i7 == 5) {
                f7 = 1.0E12f;
            }
        }
        this.f21674e.a(iVar, f7);
    }

    @Override // q.C1982d.a
    public void clear() {
        this.f21674e.clear();
        this.f21670a = null;
        this.f21671b = 0.0f;
    }

    public C1980b d(C1982d c1982d, int i7) {
        this.f21674e.a(c1982d.o(i7, "ep"), 1.0f);
        this.f21674e.a(c1982d.o(i7, "em"), -1.0f);
        return this;
    }

    C1980b e(i iVar, int i7) {
        this.f21674e.a(iVar, i7);
        return this;
    }

    boolean f(C1982d c1982d) {
        boolean z6;
        i iVarG = g(c1982d);
        if (iVarG == null) {
            z6 = true;
        } else {
            y(iVarG);
            z6 = false;
        }
        if (this.f21674e.b() == 0) {
            this.f21675f = true;
        }
        return z6;
    }

    i g(C1982d c1982d) {
        int iB = this.f21674e.b();
        i iVar = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean zV = false;
        boolean zV2 = false;
        i iVar2 = null;
        for (int i7 = 0; i7 < iB; i7++) {
            float fG = this.f21674e.g(i7);
            i iVarC = this.f21674e.c(i7);
            if (iVarC.f21723j == i.a.UNRESTRICTED) {
                if (iVar == null || f7 > fG) {
                    zV = v(iVarC, c1982d);
                    f7 = fG;
                    iVar = iVarC;
                } else if (!zV && v(iVarC, c1982d)) {
                    f7 = fG;
                    iVar = iVarC;
                    zV = true;
                }
            } else if (iVar == null && fG < 0.0f) {
                if (iVar2 == null || f8 > fG) {
                    zV2 = v(iVarC, c1982d);
                    f8 = fG;
                    iVar2 = iVarC;
                } else if (!zV2 && v(iVarC, c1982d)) {
                    f8 = fG;
                    iVar2 = iVarC;
                    zV2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // q.C1982d.a
    public i getKey() {
        return this.f21670a;
    }

    C1980b h(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8) {
        float f8;
        int i9;
        if (iVar2 == iVar3) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar4, 1.0f);
            this.f21674e.a(iVar2, -2.0f);
            return this;
        }
        if (f7 == 0.5f) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
            this.f21674e.a(iVar3, -1.0f);
            this.f21674e.a(iVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                i9 = (-i7) + i8;
                f8 = i9;
            }
            return this;
        }
        if (f7 <= 0.0f) {
            this.f21674e.a(iVar, -1.0f);
            this.f21674e.a(iVar2, 1.0f);
            f8 = i7;
        } else {
            if (f7 < 1.0f) {
                float f9 = 1.0f - f7;
                this.f21674e.a(iVar, f9 * 1.0f);
                this.f21674e.a(iVar2, f9 * (-1.0f));
                this.f21674e.a(iVar3, (-1.0f) * f7);
                this.f21674e.a(iVar4, 1.0f * f7);
                if (i7 > 0 || i8 > 0) {
                    f8 = ((-i7) * f9) + (i8 * f7);
                }
                return this;
            }
            this.f21674e.a(iVar4, -1.0f);
            this.f21674e.a(iVar3, 1.0f);
            i9 = -i8;
            f8 = i9;
        }
        this.f21671b = f8;
        return this;
    }

    C1980b i(i iVar, int i7) {
        this.f21670a = iVar;
        float f7 = i7;
        iVar.f21719f = f7;
        this.f21671b = f7;
        this.f21675f = true;
        return this;
    }

    C1980b j(i iVar, i iVar2, float f7) {
        this.f21674e.a(iVar, -1.0f);
        this.f21674e.a(iVar2, f7);
        return this;
    }

    public C1980b k(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f21674e.a(iVar, -1.0f);
        this.f21674e.a(iVar2, 1.0f);
        this.f21674e.a(iVar3, f7);
        this.f21674e.a(iVar4, -f7);
        return this;
    }

    public C1980b l(float f7, float f8, float f9, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f21671b = 0.0f;
        if (f8 == 0.0f || f7 == f9) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
            this.f21674e.a(iVar4, 1.0f);
            this.f21674e.a(iVar3, -1.0f);
        } else if (f7 == 0.0f) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
        } else if (f9 == 0.0f) {
            this.f21674e.a(iVar3, 1.0f);
            this.f21674e.a(iVar4, -1.0f);
        } else {
            float f10 = (f7 / f8) / (f9 / f8);
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
            this.f21674e.a(iVar4, f10);
            this.f21674e.a(iVar3, -f10);
        }
        return this;
    }

    public C1980b m(i iVar, int i7) {
        a aVar;
        float f7;
        if (i7 < 0) {
            this.f21671b = i7 * (-1);
            aVar = this.f21674e;
            f7 = 1.0f;
        } else {
            this.f21671b = i7;
            aVar = this.f21674e;
            f7 = -1.0f;
        }
        aVar.a(iVar, f7);
        return this;
    }

    public C1980b n(i iVar, i iVar2, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f21671b = i7;
        }
        if (z6) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
        } else {
            this.f21674e.a(iVar, -1.0f);
            this.f21674e.a(iVar2, 1.0f);
        }
        return this;
    }

    public C1980b o(i iVar, i iVar2, i iVar3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f21671b = i7;
        }
        if (z6) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
            this.f21674e.a(iVar3, -1.0f);
        } else {
            this.f21674e.a(iVar, -1.0f);
            this.f21674e.a(iVar2, 1.0f);
            this.f21674e.a(iVar3, 1.0f);
        }
        return this;
    }

    public C1980b p(i iVar, i iVar2, i iVar3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f21671b = i7;
        }
        if (z6) {
            this.f21674e.a(iVar, 1.0f);
            this.f21674e.a(iVar2, -1.0f);
            this.f21674e.a(iVar3, 1.0f);
        } else {
            this.f21674e.a(iVar, -1.0f);
            this.f21674e.a(iVar2, 1.0f);
            this.f21674e.a(iVar3, -1.0f);
        }
        return this;
    }

    public C1980b q(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f21674e.a(iVar3, 0.5f);
        this.f21674e.a(iVar4, 0.5f);
        this.f21674e.a(iVar, -0.5f);
        this.f21674e.a(iVar2, -0.5f);
        this.f21671b = -f7;
        return this;
    }

    void r() {
        float f7 = this.f21671b;
        if (f7 < 0.0f) {
            this.f21671b = f7 * (-1.0f);
            this.f21674e.f();
        }
    }

    boolean s() {
        i iVar = this.f21670a;
        return iVar != null && (iVar.f21723j == i.a.UNRESTRICTED || this.f21671b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f21674e.e(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f21670a == null && this.f21671b == 0.0f && this.f21674e.b() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    void y(i iVar) {
        i iVar2 = this.f21670a;
        if (iVar2 != null) {
            this.f21674e.a(iVar2, -1.0f);
            this.f21670a = null;
        }
        float fD = this.f21674e.d(iVar, true) * (-1.0f);
        this.f21670a = iVar;
        if (fD == 1.0f) {
            return;
        }
        this.f21671b /= fD;
        this.f21674e.k(fD);
    }

    public void z() {
        this.f21670a = null;
        this.f21674e.clear();
        this.f21671b = 0.0f;
        this.f21675f = false;
    }

    public C1980b(C1981c c1981c) {
        this.f21674e = new C1979a(this, c1981c);
    }
}
