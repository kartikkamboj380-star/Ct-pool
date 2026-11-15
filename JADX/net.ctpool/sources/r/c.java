package r;

import java.util.ArrayList;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f21897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f21898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f21899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f21900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f21901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f21902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f21903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f21904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f21905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f21906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f21907k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f21908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f21909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f21910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f21911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f21914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f21915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f21916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f21917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f21918v;

    public c(e eVar, int i7, boolean z6) {
        this.f21897a = eVar;
        this.f21912p = i7;
        this.f21913q = z6;
    }

    private void b() {
        int i7 = this.f21912p * 2;
        e eVar = this.f21897a;
        this.f21911o = true;
        e eVar2 = eVar;
        boolean z6 = false;
        while (!z6) {
            this.f21905i++;
            e[] eVarArr = eVar.f22001s0;
            int i8 = this.f21912p;
            e eVar3 = null;
            eVarArr[i8] = null;
            eVar.f21999r0[i8] = null;
            if (eVar.M() != 8) {
                this.f21908l++;
                e.b bVarQ = eVar.q(this.f21912p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar) {
                    this.f21909m += eVar.y(this.f21912p);
                }
                int iB = this.f21909m + eVar.f21947J[i7].b();
                this.f21909m = iB;
                int i9 = i7 + 1;
                this.f21909m = iB + eVar.f21947J[i9].b();
                int iB2 = this.f21910n + eVar.f21947J[i7].b();
                this.f21910n = iB2;
                this.f21910n = iB2 + eVar.f21947J[i9].b();
                if (this.f21898b == null) {
                    this.f21898b = eVar;
                }
                this.f21900d = eVar;
                e.b[] bVarArr = eVar.f21950M;
                int i10 = this.f21912p;
                if (bVarArr[i10] == bVar) {
                    int i11 = eVar.f21990n[i10];
                    if (i11 == 0 || i11 == 3 || i11 == 2) {
                        this.f21906j++;
                        float f7 = eVar.f21997q0[i10];
                        if (f7 > 0.0f) {
                            this.f21907k += f7;
                        }
                        if (c(eVar, i10)) {
                            if (f7 < 0.0f) {
                                this.f21914r = true;
                            } else {
                                this.f21915s = true;
                            }
                            if (this.f21904h == null) {
                                this.f21904h = new ArrayList();
                            }
                            this.f21904h.add(eVar);
                        }
                        if (this.f21902f == null) {
                            this.f21902f = eVar;
                        }
                        e eVar4 = this.f21903g;
                        if (eVar4 != null) {
                            eVar4.f21999r0[this.f21912p] = eVar;
                        }
                        this.f21903g = eVar;
                    }
                    if (this.f21912p != 0 ? !(eVar.f21988m == 0 && eVar.f21998r == 0 && eVar.f22000s == 0) : !(eVar.f21986l == 0 && eVar.f21992o == 0 && eVar.f21994p == 0)) {
                        this.f21911o = false;
                    }
                    if (eVar.f21954Q != 0.0f) {
                        this.f21911o = false;
                        this.f21917u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f22001s0[this.f21912p] = eVar;
            }
            d dVar = eVar.f21947J[i7 + 1].f21922d;
            if (dVar != null) {
                e eVar5 = dVar.f21920b;
                d dVar2 = eVar5.f21947J[i7].f21922d;
                if (dVar2 != null && dVar2.f21920b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z6 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f21898b;
        if (eVar6 != null) {
            this.f21909m -= eVar6.f21947J[i7].b();
        }
        e eVar7 = this.f21900d;
        if (eVar7 != null) {
            this.f21909m -= eVar7.f21947J[i7 + 1].b();
        }
        this.f21899c = eVar;
        if (this.f21912p == 0 && this.f21913q) {
            this.f21901e = eVar;
        } else {
            this.f21901e = this.f21897a;
        }
        this.f21916t = this.f21915s && this.f21914r;
    }

    private static boolean c(e eVar, int i7) {
        int i8;
        return eVar.M() != 8 && eVar.f21950M[i7] == e.b.MATCH_CONSTRAINT && ((i8 = eVar.f21990n[i7]) == 0 || i8 == 3);
    }

    public void a() {
        if (!this.f21918v) {
            b();
        }
        this.f21918v = true;
    }
}
