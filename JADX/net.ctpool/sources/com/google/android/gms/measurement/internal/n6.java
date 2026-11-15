package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.H6;

/* JADX INFO: loaded from: classes.dex */
final class n6 extends AbstractC1362b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.U1 f16203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f16204h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n6(h6 h6Var, String str, int i7, com.google.android.gms.internal.measurement.U1 u12) {
        super(str, i7);
        this.f16204h = h6Var;
        this.f16203g = u12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final int a() {
        return this.f16203g.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l7, Long l8, com.google.android.gms.internal.measurement.B2 b22, boolean z6) {
        C1463p2 c1463p2J;
        String strG;
        String str;
        Boolean boolG;
        Object[] objArr = H6.a() && this.f16204h.b().F(this.f15911a, G.f15550o0);
        boolean zJ = this.f16203g.J();
        boolean zK = this.f16203g.K();
        boolean zL = this.f16203g.L();
        Object[] objArr2 = zJ || zK || zL;
        Boolean boolD = null;
        boolD = null;
        if (z6 && objArr2 != true) {
            this.f16204h.d().I().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f15912b), this.f16203g.M() ? Integer.valueOf(this.f16203g.j()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.S1 s1F = this.f16203g.F();
        boolean zK2 = s1F.K();
        if (b22.W()) {
            if (s1F.M()) {
                boolG = AbstractC1362b.c(b22.N(), s1F.H());
                boolD = AbstractC1362b.d(boolG, zK2);
            } else {
                c1463p2J = this.f16204h.d().J();
                strG = this.f16204h.e().g(b22.S());
                str = "No number filter for long property. property";
                c1463p2J.b(str, strG);
            }
        } else if (!b22.U()) {
            if (b22.Y()) {
                if (s1F.O()) {
                    boolG = AbstractC1362b.g(b22.T(), s1F.I(), this.f16204h.d());
                } else if (!s1F.M()) {
                    c1463p2J = this.f16204h.d().J();
                    strG = this.f16204h.e().g(b22.S());
                    str = "No string or number filter defined. property";
                } else if (Z5.e0(b22.T())) {
                    boolG = AbstractC1362b.e(b22.T(), s1F.H());
                } else {
                    this.f16204h.d().J().c("Invalid user property value for Numeric number filter. property, value", this.f16204h.e().g(b22.S()), b22.T());
                }
                boolD = AbstractC1362b.d(boolG, zK2);
            } else {
                c1463p2J = this.f16204h.d().J();
                strG = this.f16204h.e().g(b22.S());
                str = "User property has no value, property";
            }
            c1463p2J.b(str, strG);
        } else if (s1F.M()) {
            boolG = AbstractC1362b.b(b22.E(), s1F.H());
            boolD = AbstractC1362b.d(boolG, zK2);
        } else {
            c1463p2J = this.f16204h.d().J();
            strG = this.f16204h.e().g(b22.S());
            str = "No number filter for double property. property";
            c1463p2J.b(str, strG);
        }
        this.f16204h.d().I().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f15913c = Boolean.TRUE;
        if (zL && !boolD.booleanValue()) {
            return true;
        }
        if (!z6 || this.f16203g.J()) {
            this.f15914d = boolD;
        }
        if (boolD.booleanValue() && objArr2 != false && b22.X()) {
            long jP = b22.P();
            if (l7 != null) {
                jP = l7.longValue();
            }
            if (objArr != false && this.f16203g.J() && !this.f16203g.K() && l8 != null) {
                jP = l8.longValue();
            }
            if (this.f16203g.K()) {
                this.f15916f = Long.valueOf(jP);
            } else {
                this.f15915e = Long.valueOf(jP);
            }
        }
        return true;
    }
}
