package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1217u2;
import com.google.android.gms.internal.measurement.H6;
import java.util.HashSet;
import java.util.Iterator;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
final class l6 extends AbstractC1362b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.R1 f16162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f16163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l6(h6 h6Var, String str, int i7, com.google.android.gms.internal.measurement.R1 r12) {
        super(str, i7);
        this.f16163h = h6Var;
        this.f16162g = r12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final int a() {
        return this.f16162g.H();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final boolean i() {
        return this.f16162g.Q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1362b
    final boolean j() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d A[PHI: r12
      0x018d: PHI (r12v13 java.lang.String) = (r12v12 java.lang.String), (r12v15 java.lang.String) binds: [B:69:0x01a0, B:62:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean k(Long l7, Long l8, C1199s2 c1199s2, long j7, A a7, boolean z6) {
        C1463p2 c1463p2J;
        String strC;
        String str;
        C1463p2 c1463p2J2;
        String strC2;
        String strF;
        String str2;
        Boolean boolE;
        String strU;
        Object objV;
        boolean z7 = H6.a() && this.f16163h.b().F(this.f15911a, G.f15554q0);
        long j8 = this.f16162g.P() ? a7.f15339e : j7;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (this.f16163h.d().A(2)) {
            this.f16163h.d().I().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f15912b), this.f16162g.R() ? Integer.valueOf(this.f16162g.H()) : null, this.f16163h.e().c(this.f16162g.L()));
            this.f16163h.d().I().b("Filter definition", this.f16163h.m().I(this.f16162g));
        }
        if (!this.f16162g.R() || this.f16162g.H() > 256) {
            this.f16163h.d().J().c("Invalid event filter ID. appId, id", C1449n2.t(this.f15911a), String.valueOf(this.f16162g.R() ? Integer.valueOf(this.f16162g.H()) : null));
            return false;
        }
        boolean z8 = this.f16162g.N() || this.f16162g.O() || this.f16162g.P();
        if (z6 && !z8) {
            this.f16163h.d().I().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f15912b), this.f16162g.R() ? Integer.valueOf(this.f16162g.H()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.R1 r12 = this.f16162g;
        String strS = c1199s2.S();
        if (r12.Q()) {
            Boolean boolC = AbstractC1362b.c(j8, r12.K());
            if (boolC != null) {
                if (!boolC.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = r12.M().iterator();
            while (true) {
                if (it.hasNext()) {
                    com.google.android.gms.internal.measurement.S1 s12 = (com.google.android.gms.internal.measurement.S1) it.next();
                    if (s12.J().isEmpty()) {
                        c1463p2J = this.f16163h.d().J();
                        strC = this.f16163h.e().c(strS);
                        str = "null or empty param name in filter. event";
                        break;
                    }
                    hashSet.add(s12.J());
                } else {
                    C1890a c1890a = new C1890a();
                    Iterator it2 = c1199s2.T().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            Iterator it3 = r12.M().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.S1 s13 = (com.google.android.gms.internal.measurement.S1) it3.next();
                                boolean z9 = s13.L() && s13.K();
                                String strJ = s13.J();
                                if (strJ.isEmpty()) {
                                    c1463p2J = this.f16163h.d().J();
                                    strC = this.f16163h.e().c(strS);
                                    str = "Event has empty param name. event";
                                    break;
                                }
                                Object obj = c1890a.get(strJ);
                                if (obj instanceof Long) {
                                    if (!s13.M()) {
                                        c1463p2J2 = this.f16163h.d().J();
                                        strC2 = this.f16163h.e().c(strS);
                                        strF = this.f16163h.e().f(strJ);
                                        str2 = "No number filter for long param. event, param";
                                        break;
                                    }
                                    Boolean boolC2 = AbstractC1362b.c(((Long) obj).longValue(), s13.H());
                                    if (boolC2 == null) {
                                        break;
                                    }
                                    if (boolC2.booleanValue() == z9) {
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!s13.M()) {
                                        c1463p2J2 = this.f16163h.d().J();
                                        strC2 = this.f16163h.e().c(strS);
                                        strF = this.f16163h.e().f(strJ);
                                        str2 = "No number filter for double param. event, param";
                                        break;
                                    }
                                    Boolean boolB = AbstractC1362b.b(((Double) obj).doubleValue(), s13.H());
                                    if (boolB == null) {
                                        break;
                                    }
                                    if (boolB.booleanValue() == z9) {
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (!s13.O()) {
                                        if (!s13.M()) {
                                            c1463p2J2 = this.f16163h.d().J();
                                            strC2 = this.f16163h.e().c(strS);
                                            strF = this.f16163h.e().f(strJ);
                                            str2 = "No filter for String param. event, param";
                                            break;
                                        }
                                        String str3 = (String) obj;
                                        if (!Z5.e0(str3)) {
                                            c1463p2J2 = this.f16163h.d().J();
                                            strC2 = this.f16163h.e().c(strS);
                                            strF = this.f16163h.e().f(strJ);
                                            str2 = "Invalid param value for number filter. event, param";
                                            break;
                                        }
                                        boolE = AbstractC1362b.e(str3, s13.H());
                                    } else {
                                        boolE = AbstractC1362b.g((String) obj, s13.I(), this.f16163h.d());
                                    }
                                    if (boolE == null) {
                                        break;
                                    }
                                    if (boolE.booleanValue() == z9) {
                                        break;
                                    }
                                } else {
                                    C1449n2 c1449n2D = this.f16163h.d();
                                    if (obj == null) {
                                        c1449n2D.I().c("Missing param for filter. event, param", this.f16163h.e().c(strS), this.f16163h.e().f(strJ));
                                    } else {
                                        c1463p2J2 = c1449n2D.J();
                                        strC2 = this.f16163h.e().c(strS);
                                        strF = this.f16163h.e().f(strJ);
                                        str2 = "Unknown param type. event, param";
                                    }
                                }
                            }
                        } else {
                            C1217u2 c1217u2 = (C1217u2) it2.next();
                            if (hashSet.contains(c1217u2.U())) {
                                if (c1217u2.Z()) {
                                    strU = c1217u2.U();
                                    objV = c1217u2.Z() ? Long.valueOf(c1217u2.Q()) : null;
                                    c1890a.put(strU, objV);
                                } else {
                                    if (!c1217u2.X()) {
                                        if (!c1217u2.c0()) {
                                            c1463p2J2 = this.f16163h.d().J();
                                            strC2 = this.f16163h.e().c(strS);
                                            strF = this.f16163h.e().f(c1217u2.U());
                                            str2 = "Unknown value for param. event, param";
                                            break;
                                        }
                                        strU = c1217u2.U();
                                        objV = c1217u2.V();
                                    } else {
                                        strU = c1217u2.U();
                                        if (c1217u2.X()) {
                                            objV = Double.valueOf(c1217u2.E());
                                        }
                                    }
                                    c1890a.put(strU, objV);
                                }
                            }
                        }
                    }
                    c1463p2J2.c(str2, strC2, strF);
                }
            }
            c1463p2J.b(str, strC);
        }
        this.f16163h.d().I().b("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f15913c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f15914d = bool2;
        if (z8 && c1199s2.W()) {
            Long lValueOf = Long.valueOf(c1199s2.P());
            if (this.f16162g.O()) {
                if (z7 && this.f16162g.Q()) {
                    lValueOf = l7;
                }
                this.f15916f = lValueOf;
            } else {
                if (z7 && this.f16162g.Q()) {
                    lValueOf = l8;
                }
                this.f15915e = lValueOf;
            }
        }
        return true;
    }
}
