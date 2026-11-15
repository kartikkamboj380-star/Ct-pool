package s;

import r.d;
import r.e;
import s.f;
import s.m;

/* JADX INFO: loaded from: classes.dex */
public class l extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f22196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f22197l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22198a;

        static {
            int[] iArr = new int[m.b.values().length];
            f22198a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22198a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22198a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(r.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f22196k = fVar;
        this.f22197l = null;
        this.f22206h.f22168e = f.a.TOP;
        this.f22207i.f22168e = f.a.BOTTOM;
        fVar.f22168e = f.a.BASELINE;
        this.f22204f = 1;
    }

    @Override // s.m, s.d
    public void a(d dVar) {
        int i7;
        float fR;
        int i8 = a.f22198a[this.f22208j.ordinal()];
        if (i8 == 1) {
            p(dVar);
        } else if (i8 == 2) {
            o(dVar);
        } else if (i8 == 3) {
            r.e eVar = this.f22200b;
            n(dVar, eVar.f21940C, eVar.f21942E, 1);
            return;
        }
        g gVar = this.f22203e;
        if (gVar.f22166c && !gVar.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT) {
            r.e eVar2 = this.f22200b;
            int i9 = eVar2.f21988m;
            if (i9 == 2) {
                r.e eVarE = eVar2.E();
                if (eVarE != null) {
                    if (eVarE.f21974f.f22203e.f22173j) {
                        i7 = (int) ((r7.f22170g * this.f22200b.f22002t) + 0.5f);
                        this.f22203e.d(i7);
                    }
                }
            } else if (i9 == 3 && eVar2.f21972e.f22203e.f22173j) {
                int iS = eVar2.s();
                if (iS == -1) {
                    fR = r7.f21972e.f22203e.f22170g / this.f22200b.r();
                    i7 = (int) (fR + 0.5f);
                    this.f22203e.d(i7);
                } else if (iS != 0) {
                    if (iS != 1) {
                        i7 = 0;
                        this.f22203e.d(i7);
                    }
                    fR = r7.f21972e.f22203e.f22170g / this.f22200b.r();
                    i7 = (int) (fR + 0.5f);
                    this.f22203e.d(i7);
                } else {
                    fR = r7.f21972e.f22203e.f22170g * this.f22200b.r();
                    i7 = (int) (fR + 0.5f);
                    this.f22203e.d(i7);
                }
            }
        }
        f fVar = this.f22206h;
        if (fVar.f22166c) {
            f fVar2 = this.f22207i;
            if (fVar2.f22166c) {
                if (fVar.f22173j && fVar2.f22173j && this.f22203e.f22173j) {
                    return;
                }
                if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT) {
                    r.e eVar3 = this.f22200b;
                    if (eVar3.f21986l == 0 && !eVar3.V()) {
                        f fVar3 = (f) this.f22206h.f22175l.get(0);
                        f fVar4 = (f) this.f22207i.f22175l.get(0);
                        int i10 = fVar3.f22170g;
                        f fVar5 = this.f22206h;
                        int i11 = i10 + fVar5.f22169f;
                        int i12 = fVar4.f22170g + this.f22207i.f22169f;
                        fVar5.d(i11);
                        this.f22207i.d(i12);
                        this.f22203e.d(i12 - i11);
                        return;
                    }
                }
                if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT && this.f22199a == 1 && this.f22206h.f22175l.size() > 0 && this.f22207i.f22175l.size() > 0) {
                    f fVar6 = (f) this.f22206h.f22175l.get(0);
                    int i13 = (((f) this.f22207i.f22175l.get(0)).f22170g + this.f22207i.f22169f) - (fVar6.f22170g + this.f22206h.f22169f);
                    g gVar2 = this.f22203e;
                    int i14 = gVar2.f22185m;
                    if (i13 < i14) {
                        gVar2.d(i13);
                    } else {
                        gVar2.d(i14);
                    }
                }
                if (this.f22203e.f22173j && this.f22206h.f22175l.size() > 0 && this.f22207i.f22175l.size() > 0) {
                    f fVar7 = (f) this.f22206h.f22175l.get(0);
                    f fVar8 = (f) this.f22207i.f22175l.get(0);
                    int i15 = fVar7.f22170g + this.f22206h.f22169f;
                    int i16 = fVar8.f22170g + this.f22207i.f22169f;
                    float fI = this.f22200b.I();
                    if (fVar7 == fVar8) {
                        i15 = fVar7.f22170g;
                        i16 = fVar8.f22170g;
                        fI = 0.5f;
                    }
                    this.f22206h.d((int) (i15 + 0.5f + (((i16 - i15) - this.f22203e.f22170g) * fI)));
                    this.f22207i.d(this.f22206h.f22170g + this.f22203e.f22170g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.f22200b.Q() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.f22196k;
        r1 = r10.f22206h;
        r2 = r10.f22197l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.f22200b.Q() != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d5 A[PHI: r0
      0x03d5: PHI (r0v32 s.j) = (r0v23 s.j), (r0v47 s.j) binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    @Override // s.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        r.e eVarE;
        j jVar;
        f fVar;
        f fVar2;
        g gVar;
        m mVar;
        f fVar3;
        f fVar4;
        int iL;
        r.e eVarE2;
        r.e eVar = this.f22200b;
        if (eVar.f21964a) {
            this.f22203e.d(eVar.t());
        }
        if (!this.f22203e.f22173j) {
            this.f22202d = this.f22200b.K();
            if (this.f22200b.Q()) {
                this.f22197l = new C2031a(this);
            }
            e.b bVar = this.f22202d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarE2 = this.f22200b.E()) != null && eVarE2.K() == e.b.FIXED) {
                    int iT = (eVarE2.t() - this.f22200b.f21940C.b()) - this.f22200b.f21942E.b();
                    b(this.f22206h, eVarE2.f21974f.f22206h, this.f22200b.f21940C.b());
                    b(this.f22207i, eVarE2.f21974f.f22207i, -this.f22200b.f21942E.b());
                    this.f22203e.d(iT);
                    return;
                }
                if (this.f22202d == e.b.FIXED) {
                    this.f22203e.d(this.f22200b.t());
                }
            }
        } else if (this.f22202d == e.b.MATCH_PARENT && (eVarE = this.f22200b.E()) != null && eVarE.K() == e.b.FIXED) {
            b(this.f22206h, eVarE.f21974f.f22206h, this.f22200b.f21940C.b());
            b(this.f22207i, eVarE.f21974f.f22207i, -this.f22200b.f21942E.b());
            return;
        }
        g gVar2 = this.f22203e;
        boolean z6 = gVar2.f22173j;
        if (z6) {
            r.e eVar2 = this.f22200b;
            if (eVar2.f21964a) {
                r.d[] dVarArr = eVar2.f21947J;
                r.d dVar = dVarArr[2];
                r.d dVar2 = dVar.f21922d;
                if (dVar2 != null && dVarArr[3].f21922d != null) {
                    if (eVar2.V()) {
                        this.f22206h.f22169f = this.f22200b.f21947J[2].b();
                        this.f22207i.f22169f = -this.f22200b.f21947J[3].b();
                    } else {
                        f fVarH = h(this.f22200b.f21947J[2]);
                        if (fVarH != null) {
                            b(this.f22206h, fVarH, this.f22200b.f21947J[2].b());
                        }
                        f fVarH2 = h(this.f22200b.f21947J[3]);
                        if (fVarH2 != null) {
                            b(this.f22207i, fVarH2, -this.f22200b.f21947J[3].b());
                        }
                        this.f22206h.f22165b = true;
                        this.f22207i.f22165b = true;
                    }
                    if (!this.f22200b.Q()) {
                        return;
                    }
                } else if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 == null) {
                        return;
                    }
                    b(this.f22206h, fVarH3, this.f22200b.f21947J[2].b());
                    b(this.f22207i, this.f22206h, this.f22203e.f22170g);
                    if (!this.f22200b.Q()) {
                        return;
                    }
                } else {
                    r.d dVar3 = dVarArr[3];
                    if (dVar3.f21922d != null) {
                        f fVarH4 = h(dVar3);
                        if (fVarH4 != null) {
                            b(this.f22207i, fVarH4, -this.f22200b.f21947J[3].b());
                            b(this.f22206h, this.f22207i, -this.f22203e.f22170g);
                        }
                        if (!this.f22200b.Q()) {
                            return;
                        }
                    } else {
                        r.d dVar4 = dVarArr[4];
                        if (dVar4.f21922d != null) {
                            f fVarH5 = h(dVar4);
                            if (fVarH5 != null) {
                                b(this.f22196k, fVarH5, 0);
                                b(this.f22206h, this.f22196k, -this.f22200b.l());
                                fVar3 = this.f22207i;
                                fVar4 = this.f22206h;
                                iL = this.f22203e.f22170g;
                                b(fVar3, fVar4, iL);
                                return;
                            }
                            return;
                        }
                        if ((eVar2 instanceof r.h) || eVar2.E() == null || this.f22200b.k(d.b.CENTER).f21922d != null) {
                            return;
                        }
                        b(this.f22206h, this.f22200b.E().f21974f.f22206h, this.f22200b.P());
                        b(this.f22207i, this.f22206h, this.f22203e.f22170g);
                        if (!this.f22200b.Q()) {
                            return;
                        }
                    }
                }
                fVar3 = this.f22196k;
                fVar4 = this.f22206h;
                iL = this.f22200b.l();
                b(fVar3, fVar4, iL);
                return;
            }
        }
        if (z6 || this.f22202d != e.b.MATCH_CONSTRAINT) {
            gVar2.b(this);
        } else {
            r.e eVar3 = this.f22200b;
            int i7 = eVar3.f21988m;
            if (i7 == 2) {
                r.e eVarE3 = eVar3.E();
                if (eVarE3 != null) {
                    mVar = eVarE3.f21974f;
                    g gVar3 = mVar.f22203e;
                    this.f22203e.f22175l.add(gVar3);
                    gVar3.f22174k.add(this.f22203e);
                    g gVar4 = this.f22203e;
                    gVar4.f22165b = true;
                    gVar4.f22174k.add(this.f22206h);
                    this.f22203e.f22174k.add(this.f22207i);
                }
            } else if (i7 == 3 && !eVar3.V()) {
                r.e eVar4 = this.f22200b;
                if (eVar4.f21986l != 3) {
                    mVar = eVar4.f21972e;
                    g gVar32 = mVar.f22203e;
                    this.f22203e.f22175l.add(gVar32);
                    gVar32.f22174k.add(this.f22203e);
                    g gVar42 = this.f22203e;
                    gVar42.f22165b = true;
                    gVar42.f22174k.add(this.f22206h);
                    this.f22203e.f22174k.add(this.f22207i);
                }
            }
        }
        r.e eVar5 = this.f22200b;
        r.d[] dVarArr2 = eVar5.f21947J;
        r.d dVar5 = dVarArr2[2];
        r.d dVar6 = dVar5.f21922d;
        if (dVar6 == null || dVarArr2[3].f21922d == null) {
            if (dVar6 != null) {
                f fVarH6 = h(dVar5);
                if (fVarH6 != null) {
                    b(this.f22206h, fVarH6, this.f22200b.f21947J[2].b());
                    c(this.f22207i, this.f22206h, 1, this.f22203e);
                    if (this.f22200b.Q()) {
                        c(this.f22196k, this.f22206h, 1, this.f22197l);
                    }
                    e.b bVar2 = this.f22202d;
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && this.f22200b.r() > 0.0f) {
                        jVar = this.f22200b.f21972e;
                        if (jVar.f22202d == bVar3) {
                            jVar.f22203e.f22174k.add(this.f22203e);
                            this.f22203e.f22175l.add(this.f22200b.f21972e.f22203e);
                            this.f22203e.f22164a = this;
                        }
                    }
                }
            } else {
                r.d dVar7 = dVarArr2[3];
                if (dVar7.f21922d != null) {
                    f fVarH7 = h(dVar7);
                    if (fVarH7 != null) {
                        b(this.f22207i, fVarH7, -this.f22200b.f21947J[3].b());
                        c(this.f22206h, this.f22207i, -1, this.f22203e);
                    }
                } else {
                    r.d dVar8 = dVarArr2[4];
                    if (dVar8.f21922d != null) {
                        f fVarH8 = h(dVar8);
                        if (fVarH8 != null) {
                            b(this.f22196k, fVarH8, 0);
                            c(this.f22206h, this.f22196k, -1, this.f22197l);
                            fVar = this.f22207i;
                            fVar2 = this.f22206h;
                            gVar = this.f22203e;
                        }
                    } else if (!(eVar5 instanceof r.h) && eVar5.E() != null) {
                        b(this.f22206h, this.f22200b.E().f21974f.f22206h, this.f22200b.P());
                        c(this.f22207i, this.f22206h, 1, this.f22203e);
                        if (this.f22200b.Q()) {
                            c(this.f22196k, this.f22206h, 1, this.f22197l);
                        }
                        e.b bVar4 = this.f22202d;
                        e.b bVar5 = e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar5 && this.f22200b.r() > 0.0f) {
                            jVar = this.f22200b.f21972e;
                            if (jVar.f22202d == bVar5) {
                            }
                        }
                    }
                }
            }
            if (this.f22203e.f22175l.size() != 0) {
                this.f22203e.f22166c = true;
                return;
            }
            return;
        }
        if (eVar5.V()) {
            this.f22206h.f22169f = this.f22200b.f21947J[2].b();
            this.f22207i.f22169f = -this.f22200b.f21947J[3].b();
        } else {
            f fVarH9 = h(this.f22200b.f21947J[2]);
            f fVarH10 = h(this.f22200b.f21947J[3]);
            fVarH9.b(this);
            fVarH10.b(this);
            this.f22208j = m.b.CENTER;
        }
        c(fVar, fVar2, 1, gVar);
        if (this.f22203e.f22175l.size() != 0) {
        }
    }

    @Override // s.m
    public void e() {
        f fVar = this.f22206h;
        if (fVar.f22173j) {
            this.f22200b.C0(fVar.f22170g);
        }
    }

    @Override // s.m
    void f() {
        this.f22201c = null;
        this.f22206h.c();
        this.f22207i.c();
        this.f22196k.c();
        this.f22203e.c();
        this.f22205g = false;
    }

    @Override // s.m
    boolean m() {
        return this.f22202d != e.b.MATCH_CONSTRAINT || this.f22200b.f21988m == 0;
    }

    void q() {
        this.f22205g = false;
        this.f22206h.c();
        this.f22206h.f22173j = false;
        this.f22207i.c();
        this.f22207i.f22173j = false;
        this.f22196k.c();
        this.f22196k.f22173j = false;
        this.f22203e.f22173j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f22200b.p();
    }
}
