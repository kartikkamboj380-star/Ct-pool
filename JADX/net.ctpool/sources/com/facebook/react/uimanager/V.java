package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class V implements U {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final com.facebook.yoga.c f12455x = X.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0872e0 f12459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12460e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f12462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private V f12463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private V f12464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12465j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private V f12467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f12468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12472q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float[] f12474s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.facebook.yoga.r f12476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f12477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f12478w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12461f = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12466k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean[] f12475t = new boolean[9];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0868c0 f12473r = new C0868c0(0.0f);

    public V() {
        float[] fArr = new float[9];
        this.f12474s = fArr;
        if (u()) {
            this.f12476u = null;
            return;
        }
        com.facebook.yoga.r rVarA = (com.facebook.yoga.r) L0.a().b();
        rVarA = rVarA == null ? com.facebook.yoga.s.a(f12455x) : rVarA;
        this.f12476u = rVarA;
        rVarA.B(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private int n0() {
        B bH = H();
        if (bH == B.f12246o) {
            return this.f12466k;
        }
        if (bH == B.f12245n) {
            return this.f12466k + 1;
        }
        return 1;
    }

    private void u1(int i7) {
        if (H() != B.f12244m) {
            for (V parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f12466k += i7;
                if (parent.H() == B.f12244m) {
                    return;
                }
            }
        }
    }

    private void v1() {
        com.facebook.yoga.r rVar;
        com.facebook.yoga.j jVarH;
        float fB;
        for (int i7 = 0; i7 <= 8; i7++) {
            if (i7 == 0 || i7 == 2 || i7 == 4 || i7 == 5 ? com.facebook.yoga.g.a(this.f12474s[i7]) && com.facebook.yoga.g.a(this.f12474s[6]) && com.facebook.yoga.g.a(this.f12474s[8]) : !(i7 == 1 || i7 == 3 ? !(com.facebook.yoga.g.a(this.f12474s[i7]) && com.facebook.yoga.g.a(this.f12474s[7]) && com.facebook.yoga.g.a(this.f12474s[8])) : !com.facebook.yoga.g.a(this.f12474s[i7]))) {
                rVar = this.f12476u;
                jVarH = com.facebook.yoga.j.h(i7);
                fB = this.f12473r.b(i7);
            } else if (this.f12475t[i7]) {
                this.f12476u.g0(com.facebook.yoga.j.h(i7), this.f12474s[i7]);
            } else {
                rVar = this.f12476u;
                jVarH = com.facebook.yoga.j.h(i7);
                fB = this.f12474s[i7];
            }
            rVar.f0(jVarH, fB);
        }
    }

    @Override // com.facebook.react.uimanager.U
    public void A(C0872e0 c0872e0) {
        this.f12459d = c0872e0;
    }

    public void A0(p0 p0Var) {
    }

    @Override // com.facebook.react.uimanager.U
    public void B(float f7) {
        this.f12476u.k0(f7);
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public V f(int i7) {
        ArrayList arrayList = this.f12462g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i7 + " out of bounds: node has no children");
        }
        V v6 = (V) arrayList.remove(i7);
        v6.f12463h = null;
        if (this.f12476u != null && !w0()) {
            this.f12476u.s(i7);
        }
        y0();
        int iN0 = v6.n0();
        this.f12466k -= iN0;
        u1(-iN0);
        return v6;
    }

    @Override // com.facebook.react.uimanager.U
    public int C() {
        return this.f12471p;
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final V T(int i7) {
        O1.a.c(this.f12468m);
        V v6 = (V) this.f12468m.remove(i7);
        v6.f12467l = null;
        return v6;
    }

    @Override // com.facebook.react.uimanager.U
    public final YogaValue D() {
        return this.f12476u.l();
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f12476u.u(aVar);
    }

    @Override // com.facebook.react.uimanager.U
    public int E() {
        return this.f12470o;
    }

    public void E0(com.facebook.yoga.a aVar) {
        this.f12476u.v(aVar);
    }

    @Override // com.facebook.react.uimanager.U
    public void F(Object obj) {
    }

    public void F0(com.facebook.yoga.a aVar) {
        this.f12476u.x(aVar);
    }

    @Override // com.facebook.react.uimanager.U
    public final C0872e0 G() {
        return (C0872e0) O1.a.c(this.f12459d);
    }

    public void G0(com.facebook.yoga.b bVar) {
        this.f12476u.z(bVar);
    }

    @Override // com.facebook.react.uimanager.U
    public B H() {
        return (u() || c0()) ? B.f12246o : p0() ? B.f12245n : B.f12244m;
    }

    public void H0(int i7, float f7) {
        this.f12476u.A(com.facebook.yoga.j.h(i7), f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final int I() {
        O1.a.a(this.f12458c != 0);
        return this.f12458c;
    }

    public void I0(float f7) {
        this.f12476u.L(com.facebook.yoga.m.COLUMN, f7);
    }

    public void J0(float f7) {
        this.f12476u.M(com.facebook.yoga.m.COLUMN, f7);
    }

    @Override // com.facebook.react.uimanager.U
    public boolean K(float f7, float f8) {
        if (!o0()) {
            return false;
        }
        float fU = U();
        float fQ = Q();
        float f9 = f7 + fU;
        int iRound = Math.round(f9);
        float f10 = f8 + fQ;
        int iRound2 = Math.round(f10);
        return (Math.round(fU) == this.f12469n && Math.round(fQ) == this.f12470o && Math.round(f9 + d0()) - iRound == this.f12471p && Math.round(f10 + l()) - iRound2 == this.f12472q) ? false : true;
    }

    public void K0(int i7, float f7) {
        this.f12473r.c(i7, f7);
        v1();
    }

    @Override // com.facebook.react.uimanager.U
    public final boolean L() {
        return this.f12460e;
    }

    public void L0(com.facebook.yoga.i iVar) {
        this.f12476u.D(iVar);
    }

    public void M0(float f7) {
        this.f12476u.F(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final String N() {
        return (String) O1.a.c(this.f12457b);
    }

    public void N0() {
        this.f12476u.G();
    }

    public void O0(float f7) {
        this.f12476u.H(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void P(int i7) {
        this.f12456a = i7;
    }

    public void P0(com.facebook.yoga.l lVar) {
        this.f12476u.I(lVar);
    }

    @Override // com.facebook.react.uimanager.U
    public final float Q() {
        return this.f12476u.k();
    }

    public void Q0(com.facebook.yoga.x xVar) {
        this.f12476u.o0(xVar);
    }

    @Override // com.facebook.react.uimanager.U
    public void R(float f7, float f8) {
        this.f12476u.b(f7, f8);
    }

    public void R0(float f7) {
        this.f12476u.L(com.facebook.yoga.m.ALL, f7);
    }

    @Override // com.facebook.react.uimanager.U
    public int S() {
        return this.f12469n;
    }

    public void S0(float f7) {
        this.f12476u.L(com.facebook.yoga.m.ALL, f7);
    }

    public void T0(com.facebook.yoga.n nVar) {
        this.f12476u.Q(nVar);
    }

    @Override // com.facebook.react.uimanager.U
    public final float U() {
        return this.f12476u.j();
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final void O(V v6) {
        this.f12464i = v6;
    }

    public void V0(int i7, float f7) {
        this.f12476u.R(com.facebook.yoga.j.h(i7), f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void W(D d7) {
    }

    public void W0(int i7) {
        this.f12476u.S(com.facebook.yoga.j.h(i7));
    }

    public void X0(int i7, float f7) {
        this.f12476u.T(com.facebook.yoga.j.h(i7), f7);
    }

    public void Y0(com.facebook.yoga.o oVar) {
        this.f12476u.Y(oVar);
    }

    public void Z0(com.facebook.yoga.u uVar) {
        this.f12476u.e0(uVar);
    }

    @Override // com.facebook.react.uimanager.U
    public final void a0(boolean z6) {
        O1.a.b(getParent() == null, "Must remove from no opt parent first");
        O1.a.b(this.f12467l == null, "Must remove from native parent first");
        O1.a.b(w() == 0, "Must remove all native children first");
        this.f12465j = z6;
    }

    public void a1(int i7, float f7) {
        this.f12474s[i7] = f7;
        this.f12475t[i7] = false;
        v1();
    }

    @Override // com.facebook.react.uimanager.U
    public final int b() {
        ArrayList arrayList = this.f12462g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.U
    public final void b0(W w6) {
        C0.f(this, w6);
        z0();
    }

    public void b1(int i7, float f7) {
        this.f12474s[i7] = f7;
        this.f12475t[i7] = !com.facebook.yoga.g.a(f7);
        v1();
    }

    @Override // com.facebook.react.uimanager.U
    public void c() {
        com.facebook.yoga.r rVar = this.f12476u;
        if (rVar != null) {
            rVar.t();
            L0.a().a(this.f12476u);
        }
    }

    @Override // com.facebook.react.uimanager.U
    public final boolean c0() {
        return this.f12465j;
    }

    public void c1(int i7, float f7) {
        this.f12476u.h0(com.facebook.yoga.j.h(i7), f7);
    }

    @Override // com.facebook.react.uimanager.U
    public int d() {
        return this.f12472q;
    }

    @Override // com.facebook.react.uimanager.U
    public final float d0() {
        return this.f12476u.i();
    }

    public void d1(int i7, float f7) {
        this.f12476u.i0(com.facebook.yoga.j.h(i7), f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final void e() {
        this.f12461f = false;
        if (o0()) {
            x0();
        }
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void J(V v6, int i7) {
        if (this.f12462g == null) {
            this.f12462g = new ArrayList(4);
        }
        this.f12462g.add(i7, v6);
        v6.f12463h = this;
        if (this.f12476u != null && !w0()) {
            com.facebook.yoga.r rVar = v6.f12476u;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + v6.toString() + "' to a '" + toString() + "')");
            }
            this.f12476u.a(rVar, i7);
        }
        y0();
        int iN0 = v6.n0();
        this.f12466k += iN0;
        u1(iN0);
    }

    public void e1(com.facebook.yoga.v vVar) {
        this.f12476u.j0(vVar);
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final void y(V v6, int i7) {
        O1.a.a(H() == B.f12244m);
        O1.a.a(v6.H() != B.f12246o);
        if (this.f12468m == null) {
            this.f12468m = new ArrayList(4);
        }
        this.f12468m.add(i7, v6);
        v6.f12467l = this;
    }

    public void f1(float f7) {
        this.f12476u.L(com.facebook.yoga.m.ROW, f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void g(float f7) {
        this.f12476u.N(f7);
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final V a(int i7) {
        ArrayList arrayList = this.f12462g;
        if (arrayList != null) {
            return (V) arrayList.get(i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i7 + " out of bounds: node has no children");
    }

    public void g1(float f7) {
        this.f12476u.M(com.facebook.yoga.m.ROW, f7);
    }

    @Override // com.facebook.react.uimanager.U
    public Integer getHeightMeasureSpec() {
        return this.f12478w;
    }

    @Override // com.facebook.react.uimanager.U
    public Integer getWidthMeasureSpec() {
        return this.f12477v;
    }

    @Override // com.facebook.react.uimanager.U
    public void h(int i7, int i8) {
        this.f12477v = Integer.valueOf(i7);
        this.f12478w = Integer.valueOf(i8);
    }

    public final com.facebook.yoga.h h0() {
        return this.f12476u.e();
    }

    public void h1(float f7) {
        this.f12476u.y(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void i() {
        if (!u()) {
            this.f12476u.c();
        } else if (getParent() != null) {
            getParent().i();
        }
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final V X() {
        V v6 = this.f12464i;
        return v6 != null ? v6 : Z();
    }

    public void i1() {
        this.f12476u.O();
    }

    @Override // com.facebook.react.uimanager.U
    public final void j(String str) {
        this.f12457b = str;
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final int v(V v6) {
        int iN0 = 0;
        for (int i7 = 0; i7 < b(); i7++) {
            V vA = a(i7);
            if (v6 == vA) {
                return iN0;
            }
            iN0 += vA.n0();
        }
        throw new RuntimeException("Child " + v6.r() + " was not a child of " + this.f12456a);
    }

    public void j1(float f7) {
        this.f12476u.P(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void k(com.facebook.yoga.h hVar) {
        this.f12476u.C(hVar);
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final V Z() {
        return this.f12467l;
    }

    public void k1(float f7) {
        this.f12476u.U(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final float l() {
        return this.f12476u.g();
    }

    public final float l0(int i7) {
        return this.f12476u.h(com.facebook.yoga.j.h(i7));
    }

    public void l1(float f7) {
        this.f12476u.V(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final boolean m() {
        return this.f12461f || o0() || t0();
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final V getParent() {
        return this.f12463h;
    }

    public void m1(float f7) {
        this.f12476u.W(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final YogaValue n() {
        return this.f12476u.d();
    }

    public void n1(float f7) {
        this.f12476u.X(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public Iterable o() {
        if (v0()) {
            return null;
        }
        return this.f12462g;
    }

    public final boolean o0() {
        com.facebook.yoga.r rVar = this.f12476u;
        return rVar != null && rVar.m();
    }

    public void o1(float f7) {
        this.f12476u.Z(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void p(float f7, float f8, p0 p0Var, D d7) {
        if (this.f12461f) {
            A0(p0Var);
        }
        if (o0()) {
            float fU = U();
            float fQ = Q();
            float f9 = f7 + fU;
            int iRound = Math.round(f9);
            float f10 = f8 + fQ;
            int iRound2 = Math.round(f10);
            int iRound3 = Math.round(f9 + d0());
            int iRound4 = Math.round(f10 + l());
            int iRound5 = Math.round(fU);
            int iRound6 = Math.round(fQ);
            int i7 = iRound3 - iRound;
            int i8 = iRound4 - iRound2;
            boolean z6 = (iRound5 == this.f12469n && iRound6 == this.f12470o && i7 == this.f12471p && i8 == this.f12472q) ? false : true;
            this.f12469n = iRound5;
            this.f12470o = iRound6;
            this.f12471p = i7;
            this.f12472q = i8;
            if (z6) {
                if (d7 != null) {
                    d7.l(this);
                } else {
                    p0Var.P(getParent().r(), r(), S(), E(), C(), d());
                }
            }
        }
    }

    public boolean p0() {
        return false;
    }

    public void p1(float f7) {
        this.f12476u.b0(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public void q() {
        if (b() == 0) {
            return;
        }
        int iN0 = 0;
        for (int iB = b() - 1; iB >= 0; iB--) {
            if (this.f12476u != null && !w0()) {
                this.f12476u.s(iB);
            }
            V vA = a(iB);
            vA.f12463h = null;
            iN0 += vA.n0();
            vA.c();
        }
        ((ArrayList) O1.a.c(this.f12462g)).clear();
        y0();
        this.f12466k -= iN0;
        u1(-iN0);
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final int M(V v6) {
        ArrayList arrayList = this.f12462g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(v6);
    }

    public void q1(float f7) {
        this.f12476u.c0(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final int r() {
        return this.f12456a;
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final int x(V v6) {
        O1.a.c(this.f12468m);
        return this.f12468m.indexOf(v6);
    }

    public void r1(float f7) {
        this.f12476u.d0(f7);
    }

    @Override // com.facebook.react.uimanager.U
    public final void s() {
        ArrayList arrayList = this.f12468m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((V) this.f12468m.get(size)).f12467l = null;
            }
            this.f12468m.clear();
        }
    }

    @Override // com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public boolean Y(V v6) {
        for (V parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == v6) {
                return true;
            }
        }
        return false;
    }

    public void s1() {
        this.f12476u.l0();
    }

    public void setFlex(float f7) {
        this.f12476u.E(f7);
    }

    public void setFlexGrow(float f7) {
        this.f12476u.J(f7);
    }

    public void setFlexShrink(float f7) {
        this.f12476u.K(f7);
    }

    public void setShouldNotifyOnLayout(boolean z6) {
        this.f12460e = z6;
    }

    @Override // com.facebook.react.uimanager.U
    public void t() {
        R(Float.NaN, Float.NaN);
    }

    public final boolean t0() {
        com.facebook.yoga.r rVar = this.f12476u;
        return rVar != null && rVar.p();
    }

    public void t1(float f7) {
        this.f12476u.m0(f7);
    }

    public String toString() {
        return "[" + this.f12457b + " " + r() + "]";
    }

    @Override // com.facebook.react.uimanager.U
    public boolean u() {
        return false;
    }

    public boolean u0() {
        return this.f12476u.q();
    }

    public boolean v0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.U
    public final int w() {
        ArrayList arrayList = this.f12468m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public boolean w0() {
        return u0();
    }

    public final void x0() {
        com.facebook.yoga.r rVar = this.f12476u;
        if (rVar != null) {
            rVar.r();
        }
    }

    public void y0() {
        if (this.f12461f) {
            return;
        }
        this.f12461f = true;
        V parent = getParent();
        if (parent != null) {
            parent.y0();
        }
    }

    @Override // com.facebook.react.uimanager.U
    public final void z(int i7) {
        this.f12458c = i7;
    }

    public void z0() {
    }
}
