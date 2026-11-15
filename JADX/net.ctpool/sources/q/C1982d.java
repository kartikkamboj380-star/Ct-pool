package q;

import java.util.Arrays;
import java.util.HashMap;
import q.i;
import r.d;

/* JADX INFO: renamed from: q.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1982d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f21680q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f21681r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f21682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f21683t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f21686c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    C1980b[] f21689f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final C1981c f21696m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f21699p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21684a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f21685b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21687d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21688e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21690g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21691h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean[] f21692i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f21693j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f21694k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21695l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i[] f21697n = new i[f21680q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21698o = 0;

    /* JADX INFO: renamed from: q.d$a */
    interface a {
        i a(C1982d c1982d, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();
    }

    /* JADX INFO: renamed from: q.d$b */
    class b extends C1980b {
        public b(C1981c c1981c) {
            this.f21674e = new j(this, c1981c);
        }
    }

    public C1982d() {
        this.f21689f = null;
        this.f21689f = new C1980b[32];
        C();
        C1981c c1981c = new C1981c();
        this.f21696m = c1981c;
        this.f21686c = new h(c1981c);
        this.f21699p = f21681r ? new b(c1981c) : new C1980b(c1981c);
    }

    private final int B(a aVar, boolean z6) {
        for (int i7 = 0; i7 < this.f21693j; i7++) {
            this.f21692i[i7] = false;
        }
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            i8++;
            if (i8 >= this.f21693j * 2) {
                return i8;
            }
            if (aVar.getKey() != null) {
                this.f21692i[aVar.getKey().f21716c] = true;
            }
            i iVarA = aVar.a(this, this.f21692i);
            if (iVarA != null) {
                boolean[] zArr = this.f21692i;
                int i9 = iVarA.f21716c;
                if (zArr[i9]) {
                    return i8;
                }
                zArr[i9] = true;
            }
            if (iVarA != null) {
                float f7 = Float.MAX_VALUE;
                int i10 = -1;
                for (int i11 = 0; i11 < this.f21694k; i11++) {
                    C1980b c1980b = this.f21689f[i11];
                    if (c1980b.f21670a.f21723j != i.a.UNRESTRICTED && !c1980b.f21675f && c1980b.t(iVarA)) {
                        float fI = c1980b.f21674e.i(iVarA);
                        if (fI < 0.0f) {
                            float f8 = (-c1980b.f21671b) / fI;
                            if (f8 < f7) {
                                i10 = i11;
                                f7 = f8;
                            }
                        }
                    }
                }
                if (i10 > -1) {
                    C1980b c1980b2 = this.f21689f[i10];
                    c1980b2.f21670a.f21717d = -1;
                    c1980b2.y(iVarA);
                    i iVar = c1980b2.f21670a;
                    iVar.f21717d = i10;
                    iVar.g(c1980b2);
                }
            } else {
                z7 = true;
            }
        }
        return i8;
    }

    private void C() {
        int i7 = 0;
        if (f21681r) {
            while (true) {
                C1980b[] c1980bArr = this.f21689f;
                if (i7 >= c1980bArr.length) {
                    return;
                }
                C1980b c1980b = c1980bArr[i7];
                if (c1980b != null) {
                    this.f21696m.f21676a.a(c1980b);
                }
                this.f21689f[i7] = null;
                i7++;
            }
        } else {
            while (true) {
                C1980b[] c1980bArr2 = this.f21689f;
                if (i7 >= c1980bArr2.length) {
                    return;
                }
                C1980b c1980b2 = c1980bArr2[i7];
                if (c1980b2 != null) {
                    this.f21696m.f21677b.a(c1980b2);
                }
                this.f21689f[i7] = null;
                i7++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f21696m.f21678c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.d();
        }
        iVar.f(aVar, str);
        int i7 = this.f21698o;
        int i8 = f21680q;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            f21680q = i9;
            this.f21697n = (i[]) Arrays.copyOf(this.f21697n, i9);
        }
        i[] iVarArr = this.f21697n;
        int i10 = this.f21698o;
        this.f21698o = i10 + 1;
        iVarArr[i10] = iVar;
        return iVar;
    }

    private final void l(C1980b c1980b) {
        C1980b c1980b2;
        f fVar;
        if (f21681r) {
            c1980b2 = this.f21689f[this.f21694k];
            if (c1980b2 != null) {
                fVar = this.f21696m.f21676a;
                fVar.a(c1980b2);
            }
        } else {
            c1980b2 = this.f21689f[this.f21694k];
            if (c1980b2 != null) {
                fVar = this.f21696m.f21677b;
                fVar.a(c1980b2);
            }
        }
        C1980b[] c1980bArr = this.f21689f;
        int i7 = this.f21694k;
        c1980bArr[i7] = c1980b;
        i iVar = c1980b.f21670a;
        iVar.f21717d = i7;
        this.f21694k = i7 + 1;
        iVar.g(c1980b);
    }

    private void n() {
        for (int i7 = 0; i7 < this.f21694k; i7++) {
            C1980b c1980b = this.f21689f[i7];
            c1980b.f21670a.f21719f = c1980b.f21671b;
        }
    }

    public static C1980b s(C1982d c1982d, i iVar, i iVar2, float f7) {
        return c1982d.r().j(iVar, iVar2, f7);
    }

    private int u(a aVar) {
        for (int i7 = 0; i7 < this.f21694k; i7++) {
            C1980b c1980b = this.f21689f[i7];
            if (c1980b.f21670a.f21723j != i.a.UNRESTRICTED && c1980b.f21671b < 0.0f) {
                boolean z6 = false;
                int i8 = 0;
                while (!z6) {
                    i8++;
                    float f7 = Float.MAX_VALUE;
                    int i9 = -1;
                    int i10 = -1;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 >= this.f21694k) {
                            break;
                        }
                        C1980b c1980b2 = this.f21689f[i11];
                        if (c1980b2.f21670a.f21723j != i.a.UNRESTRICTED && !c1980b2.f21675f && c1980b2.f21671b < 0.0f) {
                            for (int i13 = 1; i13 < this.f21693j; i13++) {
                                i iVar = this.f21696m.f21679d[i13];
                                float fI = c1980b2.f21674e.i(iVar);
                                if (fI > 0.0f) {
                                    for (int i14 = 0; i14 < 9; i14++) {
                                        float f8 = iVar.f21721h[i14] / fI;
                                        if ((f8 < f7 && i14 == i12) || i14 > i12) {
                                            f7 = f8;
                                            i9 = i11;
                                            i10 = i13;
                                            i12 = i14;
                                        }
                                    }
                                }
                            }
                        }
                        i11++;
                    }
                    if (i9 != -1) {
                        C1980b c1980b3 = this.f21689f[i9];
                        c1980b3.f21670a.f21717d = -1;
                        c1980b3.y(this.f21696m.f21679d[i10]);
                        i iVar2 = c1980b3.f21670a;
                        iVar2.f21717d = i9;
                        iVar2.g(c1980b3);
                    } else {
                        z6 = true;
                    }
                    if (i8 > this.f21693j / 2) {
                        z6 = true;
                    }
                }
                return i8;
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i7 = this.f21687d * 2;
        this.f21687d = i7;
        this.f21689f = (C1980b[]) Arrays.copyOf(this.f21689f, i7);
        C1981c c1981c = this.f21696m;
        c1981c.f21679d = (i[]) Arrays.copyOf(c1981c.f21679d, this.f21687d);
        int i8 = this.f21687d;
        this.f21692i = new boolean[i8];
        this.f21688e = i8;
        this.f21695l = i8;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        C1981c c1981c;
        int i7 = 0;
        while (true) {
            c1981c = this.f21696m;
            i[] iVarArr = c1981c.f21679d;
            if (i7 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i7];
            if (iVar != null) {
                iVar.d();
            }
            i7++;
        }
        c1981c.f21678c.c(this.f21697n, this.f21698o);
        this.f21698o = 0;
        Arrays.fill(this.f21696m.f21679d, (Object) null);
        HashMap map = this.f21685b;
        if (map != null) {
            map.clear();
        }
        this.f21684a = 0;
        this.f21686c.clear();
        this.f21693j = 1;
        for (int i8 = 0; i8 < this.f21694k; i8++) {
            this.f21689f[i8].f21672c = false;
        }
        C();
        this.f21694k = 0;
        this.f21699p = f21681r ? new b(this.f21696m) : new C1980b(this.f21696m);
    }

    public void b(r.e eVar, r.e eVar2, float f7, int i7) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.k(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.k(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.k(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.k(bVar4));
        i iVarQ5 = q(eVar2.k(bVar));
        i iVarQ6 = q(eVar2.k(bVar2));
        i iVarQ7 = q(eVar2.k(bVar3));
        i iVarQ8 = q(eVar2.k(bVar4));
        C1980b c1980bR = r();
        double d7 = f7;
        double d8 = i7;
        c1980bR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d7) * d8));
        d(c1980bR);
        C1980b c1980bR2 = r();
        c1980bR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d7) * d8));
        d(c1980bR2);
    }

    public void c(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8, int i9) {
        C1980b c1980bR = r();
        c1980bR.h(iVar, iVar2, i7, f7, iVar3, iVar4, i8);
        if (i9 != 8) {
            c1980bR.d(this, i9);
        }
        d(c1980bR);
    }

    public void d(C1980b c1980b) {
        i iVarW;
        if (c1980b == null) {
            return;
        }
        boolean z6 = true;
        if (this.f21694k + 1 >= this.f21695l || this.f21693j + 1 >= this.f21688e) {
            y();
        }
        boolean z7 = false;
        if (!c1980b.f21675f) {
            c1980b.D(this);
            if (c1980b.u()) {
                return;
            }
            c1980b.r();
            if (c1980b.f(this)) {
                i iVarP = p();
                c1980b.f21670a = iVarP;
                l(c1980b);
                this.f21699p.b(c1980b);
                B(this.f21699p, true);
                if (iVarP.f21717d == -1) {
                    if (c1980b.f21670a == iVarP && (iVarW = c1980b.w(iVarP)) != null) {
                        c1980b.y(iVarW);
                    }
                    if (!c1980b.f21675f) {
                        c1980b.f21670a.g(c1980b);
                    }
                    this.f21694k--;
                }
            } else {
                z6 = false;
            }
            if (!c1980b.s()) {
                return;
            } else {
                z7 = z6;
            }
        }
        if (z7) {
            return;
        }
        l(c1980b);
    }

    public C1980b e(i iVar, i iVar2, int i7, int i8) {
        if (i8 == 8 && iVar2.f21720g && iVar.f21717d == -1) {
            iVar.e(this, iVar2.f21719f + i7);
            return null;
        }
        C1980b c1980bR = r();
        c1980bR.n(iVar, iVar2, i7);
        if (i8 != 8) {
            c1980bR.d(this, i8);
        }
        d(c1980bR);
        return c1980bR;
    }

    public void f(i iVar, int i7) {
        C1980b c1980bR;
        int i8 = iVar.f21717d;
        if (i8 == -1) {
            iVar.e(this, i7);
            return;
        }
        if (i8 != -1) {
            C1980b c1980b = this.f21689f[i8];
            if (!c1980b.f21675f) {
                if (c1980b.f21674e.b() == 0) {
                    c1980b.f21675f = true;
                } else {
                    c1980bR = r();
                    c1980bR.m(iVar, i7);
                }
            }
            c1980b.f21671b = i7;
            return;
        }
        c1980bR = r();
        c1980bR.i(iVar, i7);
        d(c1980bR);
    }

    public void g(i iVar, i iVar2, int i7, boolean z6) {
        C1980b c1980bR = r();
        i iVarT = t();
        iVarT.f21718e = 0;
        c1980bR.o(iVar, iVar2, iVarT, i7);
        d(c1980bR);
    }

    public void h(i iVar, i iVar2, int i7, int i8) {
        C1980b c1980bR = r();
        i iVarT = t();
        iVarT.f21718e = 0;
        c1980bR.o(iVar, iVar2, iVarT, i7);
        if (i8 != 8) {
            m(c1980bR, (int) (c1980bR.f21674e.i(iVarT) * (-1.0f)), i8);
        }
        d(c1980bR);
    }

    public void i(i iVar, i iVar2, int i7, boolean z6) {
        C1980b c1980bR = r();
        i iVarT = t();
        iVarT.f21718e = 0;
        c1980bR.p(iVar, iVar2, iVarT, i7);
        d(c1980bR);
    }

    public void j(i iVar, i iVar2, int i7, int i8) {
        C1980b c1980bR = r();
        i iVarT = t();
        iVarT.f21718e = 0;
        c1980bR.p(iVar, iVar2, iVarT, i7);
        if (i8 != 8) {
            m(c1980bR, (int) (c1980bR.f21674e.i(iVarT) * (-1.0f)), i8);
        }
        d(c1980bR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f7, int i7) {
        C1980b c1980bR = r();
        c1980bR.k(iVar, iVar2, iVar3, iVar4, f7);
        if (i7 != 8) {
            c1980bR.d(this, i7);
        }
        d(c1980bR);
    }

    void m(C1980b c1980b, int i7, int i8) {
        c1980b.e(o(i8, null), i7);
    }

    public i o(int i7, String str) {
        if (this.f21693j + 1 >= this.f21688e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i8 = this.f21684a + 1;
        this.f21684a = i8;
        this.f21693j++;
        iVarA.f21716c = i8;
        iVarA.f21718e = i7;
        this.f21696m.f21679d[i8] = iVarA;
        this.f21686c.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f21693j + 1 >= this.f21688e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i7 = this.f21684a + 1;
        this.f21684a = i7;
        this.f21693j++;
        iVarA.f21716c = i7;
        this.f21696m.f21679d[i7] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarE = null;
        if (obj == null) {
            return null;
        }
        if (this.f21693j + 1 >= this.f21688e) {
            y();
        }
        if (obj instanceof r.d) {
            r.d dVar = (r.d) obj;
            iVarE = dVar.e();
            if (iVarE == null) {
                dVar.l(this.f21696m);
                iVarE = dVar.e();
            }
            int i7 = iVarE.f21716c;
            if (i7 == -1 || i7 > this.f21684a || this.f21696m.f21679d[i7] == null) {
                if (i7 != -1) {
                    iVarE.d();
                }
                int i8 = this.f21684a + 1;
                this.f21684a = i8;
                this.f21693j++;
                iVarE.f21716c = i8;
                iVarE.f21723j = i.a.UNRESTRICTED;
                this.f21696m.f21679d[i8] = iVarE;
            }
        }
        return iVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[PHI: r0
      0x001f: PHI (r0v6 q.b) = (r0v4 q.b), (r0v11 q.b) binds: [B:9:0x002d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1980b r() {
        C1980b c1980b;
        if (f21681r) {
            c1980b = (C1980b) this.f21696m.f21676a.b();
            if (c1980b == null) {
                c1980b = new b(this.f21696m);
                f21683t++;
            } else {
                c1980b.z();
            }
        } else {
            c1980b = (C1980b) this.f21696m.f21677b.b();
            if (c1980b == null) {
                c1980b = new C1980b(this.f21696m);
                f21682s++;
            }
        }
        i.b();
        return c1980b;
    }

    public i t() {
        if (this.f21693j + 1 >= this.f21688e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i7 = this.f21684a + 1;
        this.f21684a = i7;
        this.f21693j++;
        iVarA.f21716c = i7;
        this.f21696m.f21679d[i7] = iVarA;
        return iVarA;
    }

    public C1981c v() {
        return this.f21696m;
    }

    public int x(Object obj) {
        i iVarE = ((r.d) obj).e();
        if (iVarE != null) {
            return (int) (iVarE.f21719f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f21690g || this.f21691h) {
            for (int i7 = 0; i7 < this.f21694k; i7++) {
                if (this.f21689f[i7].f21675f) {
                }
            }
            n();
            return;
        }
        A(this.f21686c);
    }
}
