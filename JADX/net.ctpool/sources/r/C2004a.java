package r;

import q.C1982d;
import r.e;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2004a extends i {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f21895y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f21896z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f21894A0 = 0;

    public boolean G0() {
        return this.f21896z0;
    }

    public int H0() {
        return this.f21895y0;
    }

    public int I0() {
        return this.f21894A0;
    }

    protected void J0() {
        for (int i7 = 0; i7 < this.f22049x0; i7++) {
            e eVar = this.f22048w0[i7];
            int i8 = this.f21895y0;
            if (i8 == 0 || i8 == 1) {
                eVar.l0(0, true);
            } else if (i8 == 2 || i8 == 3) {
                eVar.l0(1, true);
            }
        }
    }

    public void K0(boolean z6) {
        this.f21896z0 = z6;
    }

    public void L0(int i7) {
        this.f21895y0 = i7;
    }

    public void M0(int i7) {
        this.f21894A0 = i7;
    }

    @Override // r.e
    public void f(C1982d c1982d) {
        d[] dVarArr;
        boolean z6;
        q.i iVar;
        d dVar;
        int i7;
        int i8;
        int i9;
        d[] dVarArr2 = this.f21947J;
        dVarArr2[0] = this.f21939B;
        dVarArr2[2] = this.f21940C;
        dVarArr2[1] = this.f21941D;
        dVarArr2[3] = this.f21942E;
        int i10 = 0;
        while (true) {
            dVarArr = this.f21947J;
            if (i10 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i10];
            dVar2.f21925g = c1982d.q(dVar2);
            i10++;
        }
        int i11 = this.f21895y0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i11];
        for (int i12 = 0; i12 < this.f22049x0; i12++) {
            e eVar = this.f22048w0[i12];
            if ((this.f21896z0 || eVar.g()) && ((((i8 = this.f21895y0) == 0 || i8 == 1) && eVar.w() == e.b.MATCH_CONSTRAINT && eVar.f21939B.f21922d != null && eVar.f21941D.f21922d != null) || (((i9 = this.f21895y0) == 2 || i9 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.f21940C.f21922d != null && eVar.f21942E.f21922d != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = this.f21939B.h() || this.f21941D.h();
        boolean z8 = this.f21940C.h() || this.f21942E.h();
        int i13 = !(!z6 && (((i7 = this.f21895y0) == 0 && z7) || ((i7 == 2 && z8) || ((i7 == 1 && z7) || (i7 == 3 && z8))))) ? 4 : 5;
        for (int i14 = 0; i14 < this.f22049x0; i14++) {
            e eVar2 = this.f22048w0[i14];
            if (this.f21896z0 || eVar2.g()) {
                q.i iVarQ = c1982d.q(eVar2.f21947J[this.f21895y0]);
                d[] dVarArr3 = eVar2.f21947J;
                int i15 = this.f21895y0;
                d dVar4 = dVarArr3[i15];
                dVar4.f21925g = iVarQ;
                d dVar5 = dVar4.f21922d;
                int i16 = (dVar5 == null || dVar5.f21920b != this) ? 0 : dVar4.f21923e;
                if (i15 == 0 || i15 == 2) {
                    c1982d.i(dVar3.f21925g, iVarQ, this.f21894A0 - i16, z6);
                } else {
                    c1982d.g(dVar3.f21925g, iVarQ, this.f21894A0 + i16, z6);
                }
                c1982d.e(dVar3.f21925g, iVarQ, this.f21894A0 + i16, i13);
            }
        }
        int i17 = this.f21895y0;
        if (i17 == 0) {
            c1982d.e(this.f21941D.f21925g, this.f21939B.f21925g, 0, 8);
            c1982d.e(this.f21939B.f21925g, this.f21951N.f21941D.f21925g, 0, 4);
            iVar = this.f21939B.f21925g;
            dVar = this.f21951N.f21939B;
        } else if (i17 == 1) {
            c1982d.e(this.f21939B.f21925g, this.f21941D.f21925g, 0, 8);
            c1982d.e(this.f21939B.f21925g, this.f21951N.f21939B.f21925g, 0, 4);
            iVar = this.f21939B.f21925g;
            dVar = this.f21951N.f21941D;
        } else if (i17 == 2) {
            c1982d.e(this.f21942E.f21925g, this.f21940C.f21925g, 0, 8);
            c1982d.e(this.f21940C.f21925g, this.f21951N.f21942E.f21925g, 0, 4);
            iVar = this.f21940C.f21925g;
            dVar = this.f21951N.f21940C;
        } else {
            if (i17 != 3) {
                return;
            }
            c1982d.e(this.f21940C.f21925g, this.f21942E.f21925g, 0, 8);
            c1982d.e(this.f21940C.f21925g, this.f21951N.f21940C.f21925g, 0, 4);
            iVar = this.f21940C.f21925g;
            dVar = this.f21951N.f21942E;
        }
        c1982d.e(iVar, dVar.f21925g, 0, 0);
    }

    @Override // r.e
    public boolean g() {
        return true;
    }

    @Override // r.e
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i7 = 0; i7 < this.f22049x0; i7++) {
            e eVar = this.f22048w0[i7];
            if (i7 > 0) {
                str = str + ", ";
            }
            str = str + eVar.p();
        }
        return str + "}";
    }
}
