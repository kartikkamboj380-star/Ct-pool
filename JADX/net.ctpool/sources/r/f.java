package r;

import java.util.ArrayList;
import java.util.Arrays;
import q.C1982d;
import r.e;
import s.C2032b;

/* JADX INFO: loaded from: classes.dex */
public class f extends k {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    int f22020C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    int f22021D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    int f22022E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    int f22023F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    C2032b f22038x0 = new C2032b(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public s.e f22039y0 = new s.e(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected C2032b.InterfaceC0309b f22040z0 = null;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private boolean f22018A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    protected C1982d f22019B0 = new C1982d();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    int f22024G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    int f22025H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    c[] f22026I0 = new c[4];

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    c[] f22027J0 = new c[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f22028K0 = false;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f22029L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f22030M0 = false;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f22031N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f22032O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f22033P0 = 263;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f22034Q0 = false;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f22035R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f22036S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    int f22037T0 = 0;

    private void L0(e eVar) {
        int i7 = this.f22024G0 + 1;
        c[] cVarArr = this.f22027J0;
        if (i7 >= cVarArr.length) {
            this.f22027J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f22027J0[this.f22024G0] = new c(eVar, 0, V0());
        this.f22024G0++;
    }

    private void M0(e eVar) {
        int i7 = this.f22025H0 + 1;
        c[] cVarArr = this.f22026I0;
        if (i7 >= cVarArr.length) {
            this.f22026I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f22026I0[this.f22025H0] = new c(eVar, 1, V0());
        this.f22025H0++;
    }

    private void Z0() {
        this.f22024G0 = 0;
        this.f22025H0 = 0;
    }

    @Override // r.e
    public void E0(boolean z6, boolean z7) {
        super.E0(z6, z7);
        int size = this.f22051w0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f22051w0.get(i7)).E0(z6, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6 A[PHI: r0 r5
      0x01c6: PHI (r0v26 ??) = (r0v25 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // r.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G0() {
        ?? r11;
        boolean z6;
        ?? r112;
        boolean z7;
        ?? r02;
        ?? r113;
        boolean z8;
        this.f21956S = 0;
        this.f21957T = 0;
        int iMax = Math.max(0, N());
        int iMax2 = Math.max(0, t());
        this.f22035R0 = false;
        this.f22036S0 = false;
        boolean z9 = Y0(64) || Y0(128);
        C1982d c1982d = this.f22019B0;
        c1982d.f21690g = false;
        c1982d.f21691h = false;
        if (this.f22033P0 != 0 && z9) {
            c1982d.f21691h = true;
        }
        e.b[] bVarArr = this.f21950M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f22051w0;
        e.b bVarW = w();
        e.b bVar3 = e.b.WRAP_CONTENT;
        boolean z10 = bVarW == bVar3 || K() == bVar3;
        Z0();
        int size = this.f22051w0.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f22051w0.get(i7);
            if (eVar instanceof k) {
                ((k) eVar).G0();
            }
        }
        int i8 = 0;
        boolean z11 = false;
        ?? r114 = 1;
        while (r114 != 0) {
            int i9 = i8 + 1;
            try {
                this.f22019B0.D();
                Z0();
                j(this.f22019B0);
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) this.f22051w0.get(i10)).j(this.f22019B0);
                }
                boolean zK0 = K0(this.f22019B0);
                r11 = zK0;
                if (zK0) {
                    this.f22019B0.z();
                    r11 = zK0;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                System.out.println("EXCEPTION : " + e7);
                r11 = r114;
            }
            C1982d c1982d2 = this.f22019B0;
            if (r11 != 0) {
                d1(c1982d2, j.f22050a);
            } else {
                F0(c1982d2);
                for (int i11 = 0; i11 < size; i11++) {
                    ((e) this.f22051w0.get(i11)).F0(this.f22019B0);
                }
            }
            if (z10 && i9 < 8 && j.f22050a[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    e eVar2 = (e) this.f22051w0.get(i12);
                    iMax3 = Math.max(iMax3, eVar2.f21956S + eVar2.N());
                    iMax4 = Math.max(iMax4, eVar2.f21957T + eVar2.t());
                }
                int iMax5 = Math.max(this.f21963Z, iMax3);
                int iMax6 = Math.max(this.f21965a0, iMax4);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || N() >= iMax5) {
                    z6 = false;
                    z11 = z11;
                } else {
                    A0(iMax5);
                    this.f21950M[0] = bVar4;
                    z6 = true;
                    z11 = true;
                }
                if (bVar == bVar4 && t() < iMax6) {
                    e0(iMax6);
                    this.f21950M[1] = bVar4;
                    z6 = true;
                    z11 = true;
                }
            } else {
                z6 = false;
            }
            int iMax7 = Math.max(this.f21963Z, N());
            boolean z12 = z6;
            boolean z13 = z11;
            if (iMax7 > N()) {
                A0(iMax7);
                this.f21950M[0] = e.b.FIXED;
                z12 = true;
                z13 = true;
            }
            int iMax8 = Math.max(this.f21965a0, t());
            if (iMax8 > t()) {
                e0(iMax8);
                r112 = 1;
                this.f21950M[1] = e.b.FIXED;
                r02 = 1;
                z7 = true;
            } else {
                r112 = 1;
                z7 = z13;
                r02 = z12;
            }
            if (!z7) {
                e.b bVar5 = this.f21950M[0];
                e.b bVar6 = e.b.WRAP_CONTENT;
                r02 = r02;
                r02 = r02;
                z7 = z7;
                z7 = z7;
                if (bVar5 == bVar6 && iMax > 0) {
                    r02 = r02;
                    z7 = z7;
                    if (N() > iMax) {
                        this.f22035R0 = r112;
                        this.f21950M[0] = e.b.FIXED;
                        A0(iMax);
                        ?? r03 = r112;
                        z7 = r03 == true ? 1 : 0;
                        r02 = r03;
                    }
                }
                if (this.f21950M[r112] != bVar6 || iMax2 <= 0 || t() <= iMax2) {
                    r113 = r02;
                    z8 = z7;
                } else {
                    this.f22036S0 = r112;
                    this.f21950M[r112] = e.b.FIXED;
                    e0(iMax2);
                    r113 = 1;
                    z8 = true;
                }
            }
            i8 = i9;
            r114 = r113;
            z11 = z8;
        }
        this.f22051w0 = arrayList;
        if (z11) {
            e.b[] bVarArr2 = this.f21950M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        X(this.f22019B0.v());
    }

    void J0(e eVar, int i7) {
        if (i7 == 0) {
            L0(eVar);
        } else if (i7 == 1) {
            M0(eVar);
        }
    }

    public boolean K0(C1982d c1982d) {
        f(c1982d);
        int size = this.f22051w0.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f22051w0.get(i7);
            eVar.l0(0, false);
            eVar.l0(1, false);
            if (eVar instanceof C2004a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar2 = (e) this.f22051w0.get(i8);
                if (eVar2 instanceof C2004a) {
                    ((C2004a) eVar2).J0();
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar3 = (e) this.f22051w0.get(i9);
            if (eVar3.e()) {
                eVar3.f(c1982d);
            }
        }
        for (int i10 = 0; i10 < size; i10++) {
            e eVar4 = (e) this.f22051w0.get(i10);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f21950M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.i0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(e.b.FIXED);
                }
                eVar4.f(c1982d);
                if (bVar == bVar3) {
                    eVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(bVar2);
                }
            } else {
                j.a(this, c1982d, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(c1982d);
                }
            }
        }
        if (this.f22024G0 > 0) {
            AbstractC2005b.a(this, c1982d, 0);
        }
        if (this.f22025H0 > 0) {
            AbstractC2005b.a(this, c1982d, 1);
        }
        return true;
    }

    public boolean N0(boolean z6) {
        return this.f22039y0.f(z6);
    }

    public boolean O0(boolean z6) {
        return this.f22039y0.g(z6);
    }

    public boolean P0(boolean z6, int i7) {
        return this.f22039y0.h(z6, i7);
    }

    public C2032b.InterfaceC0309b Q0() {
        return this.f22040z0;
    }

    public int R0() {
        return this.f22033P0;
    }

    public void S0() {
        this.f22039y0.j();
    }

    public void T0() {
        this.f22039y0.k();
    }

    public boolean U0() {
        return this.f22036S0;
    }

    public boolean V0() {
        return this.f22018A0;
    }

    @Override // r.k, r.e
    public void W() {
        this.f22019B0.D();
        this.f22020C0 = 0;
        this.f22022E0 = 0;
        this.f22021D0 = 0;
        this.f22023F0 = 0;
        this.f22034Q0 = false;
        super.W();
    }

    public boolean W0() {
        return this.f22035R0;
    }

    public long X0(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22020C0 = i14;
        this.f22021D0 = i15;
        return this.f22038x0.d(this, i7, i14, i15, i8, i9, i10, i11, i12, i13);
    }

    public boolean Y0(int i7) {
        return (this.f22033P0 & i7) == i7;
    }

    public void a1(C2032b.InterfaceC0309b interfaceC0309b) {
        this.f22040z0 = interfaceC0309b;
        this.f22039y0.n(interfaceC0309b);
    }

    public void b1(int i7) {
        this.f22033P0 = i7;
        C1982d.f21681r = j.b(i7, 256);
    }

    public void c1(boolean z6) {
        this.f22018A0 = z6;
    }

    public void d1(C1982d c1982d, boolean[] zArr) {
        zArr[2] = false;
        F0(c1982d);
        int size = this.f22051w0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f22051w0.get(i7)).F0(c1982d);
        }
    }

    public void e1() {
        this.f22038x0.e(this);
    }
}
