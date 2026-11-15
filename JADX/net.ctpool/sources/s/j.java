package s;

import java.util.List;
import r.d;
import r.e;
import s.f;
import s.m;

/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f22186k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22187a;

        static {
            int[] iArr = new int[m.b.values().length];
            f22187a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22187a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22187a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(r.e eVar) {
        super(eVar);
        this.f22206h.f22168e = f.a.LEFT;
        this.f22207i.f22168e = f.a.RIGHT;
        this.f22204f = 0;
    }

    private void q(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // s.m, s.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i7;
        int iG;
        int iG2;
        float f7;
        g gVar;
        int iG3;
        int iG4;
        float f8;
        float fR;
        int i8 = a.f22187a[this.f22208j.ordinal()];
        if (i8 == 1) {
            p(dVar);
        } else if (i8 == 2) {
            o(dVar);
        } else if (i8 == 3) {
            r.e eVar = this.f22200b;
            n(dVar, eVar.f21939B, eVar.f21941D, 0);
            return;
        }
        if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT) {
            r.e eVar2 = this.f22200b;
            int i9 = eVar2.f21986l;
            if (i9 == 2) {
                r.e eVarE = eVar2.E();
                if (eVarE != null) {
                    if (eVarE.f21972e.f22203e.f22173j) {
                        i7 = (int) ((r0.f22170g * this.f22200b.f21996q) + 0.5f);
                        this.f22203e.d(i7);
                    }
                }
            } else if (i9 == 3) {
                int i10 = eVar2.f21988m;
                if (i10 == 0 || i10 == 3) {
                    l lVar = eVar2.f21974f;
                    f fVar = lVar.f22206h;
                    f fVar2 = lVar.f22207i;
                    boolean z6 = eVar2.f21939B.f21922d != null;
                    boolean z7 = eVar2.f21940C.f21922d != null;
                    boolean z8 = eVar2.f21941D.f21922d != null;
                    boolean z9 = eVar2.f21942E.f21922d != null;
                    int iS = eVar2.s();
                    if (z6 && z7 && z8 && z9) {
                        float fR2 = this.f22200b.r();
                        if (fVar.f22173j && fVar2.f22173j) {
                            f fVar3 = this.f22206h;
                            if (fVar3.f22166c && this.f22207i.f22166c) {
                                q(f22186k, ((f) fVar3.f22175l.get(0)).f22170g + this.f22206h.f22169f, ((f) this.f22207i.f22175l.get(0)).f22170g - this.f22207i.f22169f, fVar.f22170g + fVar.f22169f, fVar2.f22170g - fVar2.f22169f, fR2, iS);
                                this.f22203e.d(f22186k[0]);
                                this.f22200b.f21974f.f22203e.d(f22186k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f22206h;
                        if (fVar4.f22173j) {
                            f fVar5 = this.f22207i;
                            if (fVar5.f22173j) {
                                if (!fVar.f22166c || !fVar2.f22166c) {
                                    return;
                                }
                                q(f22186k, fVar4.f22170g + fVar4.f22169f, fVar5.f22170g - fVar5.f22169f, ((f) fVar.f22175l.get(0)).f22170g + fVar.f22169f, ((f) fVar2.f22175l.get(0)).f22170g - fVar2.f22169f, fR2, iS);
                                this.f22203e.d(f22186k[0]);
                                this.f22200b.f21974f.f22203e.d(f22186k[1]);
                            }
                        }
                        f fVar6 = this.f22206h;
                        if (!fVar6.f22166c || !this.f22207i.f22166c || !fVar.f22166c || !fVar2.f22166c) {
                            return;
                        }
                        q(f22186k, ((f) fVar6.f22175l.get(0)).f22170g + this.f22206h.f22169f, ((f) this.f22207i.f22175l.get(0)).f22170g - this.f22207i.f22169f, ((f) fVar.f22175l.get(0)).f22170g + fVar.f22169f, ((f) fVar2.f22175l.get(0)).f22170g - fVar2.f22169f, fR2, iS);
                        this.f22203e.d(f22186k[0]);
                        gVar = this.f22200b.f21974f.f22203e;
                        iG = f22186k[1];
                    } else if (z6 && z8) {
                        if (!this.f22206h.f22166c || !this.f22207i.f22166c) {
                            return;
                        }
                        float fR3 = this.f22200b.r();
                        int i11 = ((f) this.f22206h.f22175l.get(0)).f22170g + this.f22206h.f22169f;
                        int i12 = ((f) this.f22207i.f22175l.get(0)).f22170g - this.f22207i.f22169f;
                        if (iS == -1 || iS == 0) {
                            iG3 = g(i12 - i11, 0);
                            int i13 = (int) ((iG3 * fR3) + 0.5f);
                            iG4 = g(i13, 1);
                            if (i13 != iG4) {
                                f8 = iG4 / fR3;
                                iG3 = (int) (f8 + 0.5f);
                            }
                            this.f22203e.d(iG3);
                            this.f22200b.f21974f.f22203e.d(iG4);
                        } else if (iS == 1) {
                            iG3 = g(i12 - i11, 0);
                            int i14 = (int) ((iG3 / fR3) + 0.5f);
                            iG4 = g(i14, 1);
                            if (i14 != iG4) {
                                f8 = iG4 * fR3;
                                iG3 = (int) (f8 + 0.5f);
                            }
                            this.f22203e.d(iG3);
                            this.f22200b.f21974f.f22203e.d(iG4);
                        }
                    } else if (z7 && z9) {
                        if (!fVar.f22166c || !fVar2.f22166c) {
                            return;
                        }
                        float fR4 = this.f22200b.r();
                        int i15 = ((f) fVar.f22175l.get(0)).f22170g + fVar.f22169f;
                        int i16 = ((f) fVar2.f22175l.get(0)).f22170g - fVar2.f22169f;
                        if (iS == -1) {
                            iG = g(i16 - i15, 1);
                            int i17 = (int) ((iG / fR4) + 0.5f);
                            iG2 = g(i17, 0);
                            if (i17 != iG2) {
                                f7 = iG2 * fR4;
                                iG = (int) (f7 + 0.5f);
                            }
                            this.f22203e.d(iG2);
                            gVar = this.f22200b.f21974f.f22203e;
                        } else if (iS == 0) {
                            iG = g(i16 - i15, 1);
                            int i18 = (int) ((iG * fR4) + 0.5f);
                            iG2 = g(i18, 0);
                            if (i18 != iG2) {
                                f7 = iG2 / fR4;
                                iG = (int) (f7 + 0.5f);
                            }
                            this.f22203e.d(iG2);
                            gVar = this.f22200b.f21974f.f22203e;
                        }
                    }
                    gVar.d(iG);
                } else {
                    int iS2 = eVar2.s();
                    if (iS2 == -1) {
                        fR = r0.f21974f.f22203e.f22170g * this.f22200b.r();
                        i7 = (int) (fR + 0.5f);
                        this.f22203e.d(i7);
                    } else if (iS2 != 0) {
                        if (iS2 != 1) {
                            i7 = 0;
                            this.f22203e.d(i7);
                        }
                        fR = r0.f21974f.f22203e.f22170g * this.f22200b.r();
                        i7 = (int) (fR + 0.5f);
                        this.f22203e.d(i7);
                    } else {
                        fR = r0.f21974f.f22203e.f22170g / this.f22200b.r();
                        i7 = (int) (fR + 0.5f);
                        this.f22203e.d(i7);
                    }
                }
            }
        }
        f fVar7 = this.f22206h;
        if (fVar7.f22166c) {
            f fVar8 = this.f22207i;
            if (fVar8.f22166c) {
                if (fVar7.f22173j && fVar8.f22173j && this.f22203e.f22173j) {
                    return;
                }
                if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT) {
                    r.e eVar3 = this.f22200b;
                    if (eVar3.f21986l == 0 && !eVar3.T()) {
                        f fVar9 = (f) this.f22206h.f22175l.get(0);
                        f fVar10 = (f) this.f22207i.f22175l.get(0);
                        int i19 = fVar9.f22170g;
                        f fVar11 = this.f22206h;
                        int i20 = i19 + fVar11.f22169f;
                        int i21 = fVar10.f22170g + this.f22207i.f22169f;
                        fVar11.d(i20);
                        this.f22207i.d(i21);
                        this.f22203e.d(i21 - i20);
                        return;
                    }
                }
                if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT && this.f22199a == 1 && this.f22206h.f22175l.size() > 0 && this.f22207i.f22175l.size() > 0) {
                    int iMin = Math.min((((f) this.f22207i.f22175l.get(0)).f22170g + this.f22207i.f22169f) - (((f) this.f22206h.f22175l.get(0)).f22170g + this.f22206h.f22169f), this.f22203e.f22185m);
                    r.e eVar4 = this.f22200b;
                    int i22 = eVar4.f21994p;
                    int iMax = Math.max(eVar4.f21992o, iMin);
                    if (i22 > 0) {
                        iMax = Math.min(i22, iMax);
                    }
                    this.f22203e.d(iMax);
                }
                if (this.f22203e.f22173j) {
                    f fVar12 = (f) this.f22206h.f22175l.get(0);
                    f fVar13 = (f) this.f22207i.f22175l.get(0);
                    int i23 = fVar12.f22170g + this.f22206h.f22169f;
                    int i24 = fVar13.f22170g + this.f22207i.f22169f;
                    float fU = this.f22200b.u();
                    if (fVar12 == fVar13) {
                        i23 = fVar12.f22170g;
                        i24 = fVar13.f22170g;
                        fU = 0.5f;
                    }
                    this.f22206h.d((int) (i23 + 0.5f + (((i24 - i23) - this.f22203e.f22170g) * fU)));
                    this.f22207i.d(this.f22206h.f22170g + this.f22203e.f22170g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    @Override // s.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        r.e eVarE;
        f fVarH;
        f fVar;
        int iO;
        f fVar2;
        r.d dVar;
        List list;
        d dVar2;
        f fVar3;
        f fVarH2;
        f fVar4;
        int iO2;
        f fVar5;
        f fVar6;
        int i7;
        r.e eVarE2;
        r.e eVar = this.f22200b;
        if (eVar.f21964a) {
            this.f22203e.d(eVar.N());
        }
        if (this.f22203e.f22173j) {
            e.b bVar = this.f22202d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarE = this.f22200b.E()) != null && eVarE.w() == e.b.FIXED) || eVarE.w() == bVar2)) {
                b(this.f22206h, eVarE.f21972e.f22206h, this.f22200b.f21939B.b());
                b(this.f22207i, eVarE.f21972e.f22207i, -this.f22200b.f21941D.b());
                return;
            }
        } else {
            e.b bVarW = this.f22200b.w();
            this.f22202d = bVarW;
            if (bVarW != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarW == bVar3 && (((eVarE2 = this.f22200b.E()) != null && eVarE2.w() == e.b.FIXED) || eVarE2.w() == bVar3)) {
                    int iN = (eVarE2.N() - this.f22200b.f21939B.b()) - this.f22200b.f21941D.b();
                    b(this.f22206h, eVarE2.f21972e.f22206h, this.f22200b.f21939B.b());
                    b(this.f22207i, eVarE2.f21972e.f22207i, -this.f22200b.f21941D.b());
                    this.f22203e.d(iN);
                    return;
                }
                if (this.f22202d == e.b.FIXED) {
                    this.f22203e.d(this.f22200b.N());
                }
            }
        }
        g gVar = this.f22203e;
        if (gVar.f22173j) {
            r.e eVar2 = this.f22200b;
            if (eVar2.f21964a) {
                r.d[] dVarArr = eVar2.f21947J;
                r.d dVar3 = dVarArr[0];
                r.d dVar4 = dVar3.f21922d;
                if (dVar4 == null || dVarArr[1].f21922d == null) {
                    if (dVar4 != null) {
                        fVarH2 = h(dVar3);
                        if (fVarH2 == null) {
                            return;
                        }
                        fVar4 = this.f22206h;
                        iO2 = this.f22200b.f21947J[0].b();
                    } else {
                        r.d dVar5 = dVarArr[1];
                        if (dVar5.f21922d != null) {
                            f fVarH3 = h(dVar5);
                            if (fVarH3 != null) {
                                b(this.f22207i, fVarH3, -this.f22200b.f21947J[1].b());
                                fVar5 = this.f22206h;
                                fVar6 = this.f22207i;
                                i7 = -this.f22203e.f22170g;
                                b(fVar5, fVar6, i7);
                                return;
                            }
                            return;
                        }
                        if ((eVar2 instanceof r.h) || eVar2.E() == null || this.f22200b.k(d.b.CENTER).f21922d != null) {
                            return;
                        }
                        fVarH2 = this.f22200b.E().f21972e.f22206h;
                        fVar4 = this.f22206h;
                        iO2 = this.f22200b.O();
                    }
                    b(fVar4, fVarH2, iO2);
                    fVar5 = this.f22207i;
                    fVar6 = this.f22206h;
                    i7 = this.f22203e.f22170g;
                    b(fVar5, fVar6, i7);
                    return;
                }
                if (!eVar2.T()) {
                    f fVarH4 = h(this.f22200b.f21947J[0]);
                    if (fVarH4 != null) {
                        b(this.f22206h, fVarH4, this.f22200b.f21947J[0].b());
                    }
                    f fVarH5 = h(this.f22200b.f21947J[1]);
                    if (fVarH5 != null) {
                        b(this.f22207i, fVarH5, -this.f22200b.f21947J[1].b());
                    }
                    this.f22206h.f22165b = true;
                    this.f22207i.f22165b = true;
                    return;
                }
                this.f22206h.f22169f = this.f22200b.f21947J[0].b();
                fVar2 = this.f22207i;
                dVar = this.f22200b.f21947J[1];
            } else {
                if (this.f22202d == e.b.MATCH_CONSTRAINT) {
                    r.e eVar3 = this.f22200b;
                    int i8 = eVar3.f21986l;
                    if (i8 == 2) {
                        r.e eVarE3 = eVar3.E();
                        if (eVarE3 != null) {
                            g gVar2 = eVarE3.f21974f.f22203e;
                            this.f22203e.f22175l.add(gVar2);
                            gVar2.f22174k.add(this.f22203e);
                            g gVar3 = this.f22203e;
                            gVar3.f22165b = true;
                            gVar3.f22174k.add(this.f22206h);
                            list = this.f22203e.f22174k;
                            dVar2 = this.f22207i;
                            list.add(dVar2);
                        }
                    } else if (i8 == 3) {
                        if (eVar3.f21988m == 3) {
                            this.f22206h.f22164a = this;
                            this.f22207i.f22164a = this;
                            l lVar = eVar3.f21974f;
                            lVar.f22206h.f22164a = this;
                            lVar.f22207i.f22164a = this;
                            gVar.f22164a = this;
                            if (eVar3.V()) {
                                this.f22203e.f22175l.add(this.f22200b.f21974f.f22203e);
                                this.f22200b.f21974f.f22203e.f22174k.add(this.f22203e);
                                l lVar2 = this.f22200b.f21974f;
                                lVar2.f22203e.f22164a = this;
                                this.f22203e.f22175l.add(lVar2.f22206h);
                                this.f22203e.f22175l.add(this.f22200b.f21974f.f22207i);
                                this.f22200b.f21974f.f22206h.f22174k.add(this.f22203e);
                                list = this.f22200b.f21974f.f22207i.f22174k;
                                dVar2 = this.f22203e;
                                list.add(dVar2);
                            } else if (this.f22200b.T()) {
                                this.f22200b.f21974f.f22203e.f22175l.add(this.f22203e);
                                list = this.f22203e.f22174k;
                                dVar2 = this.f22200b.f21974f.f22203e;
                                list.add(dVar2);
                            } else {
                                fVar3 = this.f22200b.f21974f.f22203e;
                            }
                        } else {
                            g gVar4 = eVar3.f21974f.f22203e;
                            gVar.f22175l.add(gVar4);
                            gVar4.f22174k.add(this.f22203e);
                            this.f22200b.f21974f.f22206h.f22174k.add(this.f22203e);
                            this.f22200b.f21974f.f22207i.f22174k.add(this.f22203e);
                            g gVar5 = this.f22203e;
                            gVar5.f22165b = true;
                            gVar5.f22174k.add(this.f22206h);
                            this.f22203e.f22174k.add(this.f22207i);
                            this.f22206h.f22175l.add(this.f22203e);
                            fVar3 = this.f22207i;
                        }
                        list = fVar3.f22175l;
                        dVar2 = this.f22203e;
                        list.add(dVar2);
                    }
                }
                r.e eVar4 = this.f22200b;
                r.d[] dVarArr2 = eVar4.f21947J;
                r.d dVar6 = dVarArr2[0];
                r.d dVar7 = dVar6.f21922d;
                if (dVar7 == null || dVarArr2[1].f21922d == null) {
                    if (dVar7 != null) {
                        fVarH = h(dVar6);
                        if (fVarH == null) {
                            return;
                        }
                        fVar = this.f22206h;
                        iO = this.f22200b.f21947J[0].b();
                    } else {
                        r.d dVar8 = dVarArr2[1];
                        if (dVar8.f21922d != null) {
                            f fVarH6 = h(dVar8);
                            if (fVarH6 != null) {
                                b(this.f22207i, fVarH6, -this.f22200b.f21947J[1].b());
                                c(this.f22206h, this.f22207i, -1, this.f22203e);
                                return;
                            }
                            return;
                        }
                        if ((eVar4 instanceof r.h) || eVar4.E() == null) {
                            return;
                        }
                        fVarH = this.f22200b.E().f21972e.f22206h;
                        fVar = this.f22206h;
                        iO = this.f22200b.O();
                    }
                    b(fVar, fVarH, iO);
                    c(this.f22207i, this.f22206h, 1, this.f22203e);
                    return;
                }
                if (!eVar4.T()) {
                    f fVarH7 = h(this.f22200b.f21947J[0]);
                    f fVarH8 = h(this.f22200b.f21947J[1]);
                    fVarH7.b(this);
                    fVarH8.b(this);
                    this.f22208j = m.b.CENTER;
                    return;
                }
                this.f22206h.f22169f = this.f22200b.f21947J[0].b();
                fVar2 = this.f22207i;
                dVar = this.f22200b.f21947J[1];
            }
        }
        fVar2.f22169f = -dVar.b();
    }

    @Override // s.m
    public void e() {
        f fVar = this.f22206h;
        if (fVar.f22173j) {
            this.f22200b.B0(fVar.f22170g);
        }
    }

    @Override // s.m
    void f() {
        this.f22201c = null;
        this.f22206h.c();
        this.f22207i.c();
        this.f22203e.c();
        this.f22205g = false;
    }

    @Override // s.m
    boolean m() {
        return this.f22202d != e.b.MATCH_CONSTRAINT || this.f22200b.f21986l == 0;
    }

    void r() {
        this.f22205g = false;
        this.f22206h.c();
        this.f22206h.f22173j = false;
        this.f22207i.c();
        this.f22207i.f22173j = false;
        this.f22203e.f22173j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f22200b.p();
    }
}
