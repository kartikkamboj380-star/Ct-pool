package s;

import java.util.ArrayList;
import q.C1982d;
import r.d;
import r.e;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2032b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f22140a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f22141b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r.f f22142c;

    /* JADX INFO: renamed from: s.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f22143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f22144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22152j;
    }

    /* JADX INFO: renamed from: s.b$b, reason: collision with other inner class name */
    public interface InterfaceC0309b {
        void a();

        void b(r.e eVar, a aVar);
    }

    public C2032b(r.f fVar) {
        this.f22142c = fVar;
    }

    private boolean a(InterfaceC0309b interfaceC0309b, r.e eVar, boolean z6) {
        this.f22141b.f22143a = eVar.w();
        this.f22141b.f22144b = eVar.K();
        this.f22141b.f22145c = eVar.N();
        this.f22141b.f22146d = eVar.t();
        a aVar = this.f22141b;
        aVar.f22151i = false;
        aVar.f22152j = z6;
        e.b bVar = aVar.f22143a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f22144b == bVar2;
        boolean z9 = z7 && eVar.f21954Q > 0.0f;
        boolean z10 = z8 && eVar.f21954Q > 0.0f;
        if (z9 && eVar.f21990n[0] == 4) {
            aVar.f22143a = e.b.FIXED;
        }
        if (z10 && eVar.f21990n[1] == 4) {
            aVar.f22144b = e.b.FIXED;
        }
        interfaceC0309b.b(eVar, aVar);
        eVar.A0(this.f22141b.f22147e);
        eVar.e0(this.f22141b.f22148f);
        eVar.d0(this.f22141b.f22150h);
        eVar.Y(this.f22141b.f22149g);
        a aVar2 = this.f22141b;
        aVar2.f22152j = false;
        return aVar2.f22151i;
    }

    private void b(r.f fVar) {
        int size = fVar.f22051w0.size();
        InterfaceC0309b interfaceC0309bQ0 = fVar.Q0();
        for (int i7 = 0; i7 < size; i7++) {
            r.e eVar = (r.e) fVar.f22051w0.get(i7);
            if (!(eVar instanceof r.g) && (!eVar.f21972e.f22203e.f22173j || !eVar.f21974f.f22203e.f22173j)) {
                e.b bVarQ = eVar.q(0);
                e.b bVarQ2 = eVar.q(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar || eVar.f21986l == 1 || bVarQ2 != bVar || eVar.f21988m == 1) {
                    a(interfaceC0309bQ0, eVar, false);
                }
            }
        }
        interfaceC0309bQ0.a();
    }

    private void c(r.f fVar, String str, int i7, int i8) {
        int iC = fVar.C();
        int iB = fVar.B();
        fVar.q0(0);
        fVar.p0(0);
        fVar.A0(i7);
        fVar.e0(i8);
        fVar.q0(iC);
        fVar.p0(iB);
        this.f22142c.G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    public long d(r.f fVar, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z6;
        boolean zO0;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ?? r24;
        InterfaceC0309b interfaceC0309b;
        ?? r15;
        int i21;
        InterfaceC0309b interfaceC0309bQ0 = fVar.Q0();
        int size = fVar.f22051w0.size();
        int iN = fVar.N();
        int iT = fVar.t();
        boolean zB = r.j.b(i7, 128);
        int i22 = 1;
        boolean z7 = zB || r.j.b(i7, 64);
        if (z7) {
            for (int i23 = 0; i23 < size; i23++) {
                r.e eVar = (r.e) fVar.f22051w0.get(i23);
                e.b bVarW = eVar.w();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z8 = (bVarW == bVar) && (eVar.K() == bVar) && eVar.r() > 0.0f;
                if ((eVar.T() && z8) || ((eVar.V() && z8) || eVar.T() || eVar.V())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7) {
            boolean z9 = C1982d.f21681r;
        }
        char c7 = 2;
        if (z7 && ((i10 == 1073741824 && i12 == 1073741824) || zB)) {
            int iMin = Math.min(fVar.A(), i11);
            int iMin2 = Math.min(fVar.z(), i13);
            if (i10 == 1073741824 && fVar.N() != iMin) {
                fVar.A0(iMin);
                fVar.S0();
            }
            if (i12 == 1073741824 && fVar.t() != iMin2) {
                fVar.e0(iMin2);
                fVar.S0();
            }
            if (i10 == 1073741824 && i12 == 1073741824) {
                zO0 = fVar.N0(zB);
                i16 = 2;
                z6 = false;
            } else {
                zO0 = fVar.O0(zB);
                z6 = false;
                if (i10 == 1073741824) {
                    zO0 &= fVar.P0(zB, 0);
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                if (i12 == 1073741824) {
                    zO0 &= fVar.P0(zB, 1);
                    i16++;
                }
            }
            if (zO0) {
                fVar.E0(i10 == 1073741824 ? true : z6, i12 == 1073741824 ? true : z6);
            }
        } else {
            z6 = false;
            zO0 = false;
            i16 = 0;
        }
        if (zO0 && i16 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iR0 = fVar.R0();
        int size2 = this.f22140a.size();
        if (size > 0) {
            c(fVar, "First pass", iN, iT);
        }
        if (size2 > 0) {
            e.b bVarW2 = fVar.w();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z10 = bVarW2 == bVar2 ? true : z6;
            boolean z11 = fVar.K() == bVar2 ? true : z6;
            int iMax = Math.max(fVar.N(), this.f22142c.C());
            int iMax2 = Math.max(fVar.t(), this.f22142c.B());
            for (?? r14 = z6; r14 < size2; r14++) {
            }
            boolean z12 = z6;
            ?? r152 = z12;
            ?? r142 = z12;
            while (r142 < c7) {
                ?? r12 = z6;
                ?? r143 = r142;
                ?? r153 = r152;
                while (r12 < size2) {
                    r.e eVar2 = (r.e) this.f22140a.get(r12);
                    if ((eVar2 instanceof r.h) || (eVar2 instanceof r.g)) {
                        i19 = size2;
                    } else {
                        i19 = size2;
                        if (eVar2.M() != 8 && (!eVar2.f21972e.f22203e.f22173j || !eVar2.f21974f.f22203e.f22173j)) {
                            int iN2 = eVar2.N();
                            int iT2 = eVar2.t();
                            i20 = iR0;
                            int iL = eVar2.l();
                            r24 = r143;
                            int i24 = (r153 == true ? 1 : 0) | (a(interfaceC0309bQ0, eVar2, true) ? 1 : 0);
                            int iN3 = eVar2.N();
                            interfaceC0309b = interfaceC0309bQ0;
                            int iT3 = eVar2.t();
                            if (iN3 != iN2) {
                                eVar2.A0(iN3);
                                if (z10 && eVar2.G() > iMax) {
                                    iMax = Math.max(iMax, eVar2.G() + eVar2.k(d.b.RIGHT).b());
                                }
                                i24 = 1;
                            }
                            if (iT3 != iT2) {
                                eVar2.e0(iT3);
                                if (z11 && eVar2.n() > iMax2) {
                                    iMax2 = Math.max(iMax2, eVar2.n() + eVar2.k(d.b.BOTTOM).b());
                                }
                                i24 = 1;
                            }
                            if (!eVar2.Q() || iL == eVar2.l()) {
                                r15 = i24;
                                r24 = r24;
                            } else {
                                i21 = 1;
                                r15 = 1;
                                int i25 = r12 + i21;
                                size2 = i19;
                                r143 = r24;
                                interfaceC0309bQ0 = interfaceC0309b;
                                i22 = i21;
                                iR0 = i20;
                                r12 = i25;
                                r153 = r15;
                            }
                        }
                        i21 = 1;
                        int i252 = r12 + i21;
                        size2 = i19;
                        r143 = r24;
                        interfaceC0309bQ0 = interfaceC0309b;
                        i22 = i21;
                        iR0 = i20;
                        r12 = i252;
                        r153 = r15;
                    }
                    i20 = iR0;
                    interfaceC0309b = interfaceC0309bQ0;
                    r24 = r143;
                    r15 = r153;
                    i21 = 1;
                    int i2522 = r12 + i21;
                    size2 = i19;
                    r143 = r24;
                    interfaceC0309bQ0 = interfaceC0309b;
                    i22 = i21;
                    iR0 = i20;
                    r12 = i2522;
                    r153 = r15;
                }
                int i26 = iR0;
                int i27 = size2;
                InterfaceC0309b interfaceC0309b2 = interfaceC0309bQ0;
                int i28 = i22;
                ?? r242 = r143;
                if (r153 != 0) {
                    c(fVar, "intermediate pass", iN, iT);
                    r153 = 0;
                }
                size2 = i27;
                interfaceC0309bQ0 = interfaceC0309b2;
                i22 = i28;
                c7 = 2;
                z6 = false;
                iR0 = i26;
                r142 = (r242 == true ? 1 : 0) + 1;
                r152 = r153;
            }
            int i29 = iR0;
            int i30 = i22;
            if (r152 != 0) {
                c(fVar, "2nd pass", iN, iT);
                if (fVar.N() < iMax) {
                    fVar.A0(iMax);
                    i17 = i30;
                } else {
                    i17 = 0;
                }
                if (fVar.t() < iMax2) {
                    fVar.e0(iMax2);
                    i18 = i30;
                } else {
                    i18 = i17;
                }
                if (i18 != 0) {
                    c(fVar, "3rd pass", iN, iT);
                }
            }
            iR0 = i29;
        }
        fVar.b1(iR0);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(r.f fVar) {
        this.f22140a.clear();
        int size = fVar.f22051w0.size();
        for (int i7 = 0; i7 < size; i7++) {
            r.e eVar = (r.e) fVar.f22051w0.get(i7);
            e.b bVarW = eVar.w();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarW != bVar) {
                e.b bVarW2 = eVar.w();
                e.b bVar2 = e.b.MATCH_PARENT;
                if (bVarW2 == bVar2 || eVar.K() == bVar || eVar.K() == bVar2) {
                    this.f22140a.add(eVar);
                }
            }
        }
        fVar.S0();
    }
}
