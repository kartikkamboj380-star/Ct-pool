package s;

import r.d;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    r.e f22200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k f22201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e.b f22202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f22203e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22204f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f22205g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f22206h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f22207i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f22208j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22209a;

        static {
            int[] iArr = new int[d.b.values().length];
            f22209a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22209a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22209a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22209a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22209a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(r.e eVar) {
        this.f22200b = eVar;
    }

    private void l(int i7, int i8) {
        g gVar;
        int iG;
        int i9 = this.f22199a;
        if (i9 == 0) {
            gVar = this.f22203e;
            iG = g(i8, i7);
        } else if (i9 == 1) {
            int iG2 = g(this.f22203e.f22185m, i7);
            gVar = this.f22203e;
            iG = Math.min(iG2, i8);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    return;
                }
                r.e eVar = this.f22200b;
                m mVar = eVar.f21972e;
                e.b bVar = mVar.f22202d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f22199a == 3) {
                    l lVar = eVar.f21974f;
                    if (lVar.f22202d == bVar2 && lVar.f22199a == 3) {
                        return;
                    }
                }
                if (i7 == 0) {
                    mVar = eVar.f21974f;
                }
                if (mVar.f22203e.f22173j) {
                    float fR = eVar.r();
                    this.f22203e.d(i7 == 1 ? (int) ((mVar.f22203e.f22170g / fR) + 0.5f) : (int) ((fR * mVar.f22203e.f22170g) + 0.5f));
                    return;
                }
                return;
            }
            r.e eVarE = this.f22200b.E();
            if (eVarE == null) {
                return;
            }
            if (!(i7 == 0 ? eVarE.f21972e : eVarE.f21974f).f22203e.f22173j) {
                return;
            }
            r.e eVar2 = this.f22200b;
            i8 = (int) ((r9.f22170g * (i7 == 0 ? eVar2.f21996q : eVar2.f22002t)) + 0.5f);
            gVar = this.f22203e;
            iG = g(i8, i7);
        }
        gVar.d(iG);
    }

    @Override // s.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i7) {
        fVar.f22175l.add(fVar2);
        fVar.f22169f = i7;
        fVar2.f22174k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f22175l.add(fVar2);
        fVar.f22175l.add(this.f22203e);
        fVar.f22171h = i7;
        fVar.f22172i = gVar;
        fVar2.f22174k.add(fVar);
        gVar.f22174k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i7, int i8) {
        int iMax;
        if (i8 == 0) {
            r.e eVar = this.f22200b;
            int i9 = eVar.f21994p;
            iMax = Math.max(eVar.f21992o, i7);
            if (i9 > 0) {
                iMax = Math.min(i9, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        } else {
            r.e eVar2 = this.f22200b;
            int i10 = eVar2.f22000s;
            iMax = Math.max(eVar2.f21998r, i7);
            if (i10 > 0) {
                iMax = Math.min(i10, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        }
        return iMax;
    }

    protected final f h(r.d dVar) {
        m mVar;
        m mVar2;
        r.d dVar2 = dVar.f21922d;
        if (dVar2 == null) {
            return null;
        }
        r.e eVar = dVar2.f21920b;
        int i7 = a.f22209a[dVar2.f21921c.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                mVar2 = eVar.f21972e;
            } else if (i7 == 3) {
                mVar = eVar.f21974f;
            } else {
                if (i7 == 4) {
                    return eVar.f21974f.f22196k;
                }
                if (i7 != 5) {
                    return null;
                }
                mVar2 = eVar.f21974f;
            }
            return mVar2.f22207i;
        }
        mVar = eVar.f21972e;
        return mVar.f22206h;
    }

    protected final f i(r.d dVar, int i7) {
        r.d dVar2 = dVar.f21922d;
        if (dVar2 == null) {
            return null;
        }
        r.e eVar = dVar2.f21920b;
        m mVar = i7 == 0 ? eVar.f21972e : eVar.f21974f;
        int i8 = a.f22209a[dVar2.f21921c.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f22207i;
        }
        return mVar.f22206h;
    }

    public long j() {
        if (this.f22203e.f22173j) {
            return r0.f22170g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f22205g;
    }

    abstract boolean m();

    protected void n(d dVar, r.d dVar2, r.d dVar3, int i7) {
        f fVar;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f22173j && fVarH2.f22173j) {
            int iB = fVarH.f22170g + dVar2.b();
            int iB2 = fVarH2.f22170g - dVar3.b();
            int i8 = iB2 - iB;
            if (!this.f22203e.f22173j && this.f22202d == e.b.MATCH_CONSTRAINT) {
                l(i7, i8);
            }
            g gVar = this.f22203e;
            if (gVar.f22173j) {
                if (gVar.f22170g == i8) {
                    this.f22206h.d(iB);
                    fVar = this.f22207i;
                } else {
                    r.e eVar = this.f22200b;
                    float fU = i7 == 0 ? eVar.u() : eVar.I();
                    if (fVarH == fVarH2) {
                        iB = fVarH.f22170g;
                        iB2 = fVarH2.f22170g;
                        fU = 0.5f;
                    }
                    this.f22206h.d((int) (iB + 0.5f + (((iB2 - iB) - this.f22203e.f22170g) * fU)));
                    fVar = this.f22207i;
                    iB2 = this.f22206h.f22170g + this.f22203e.f22170g;
                }
                fVar.d(iB2);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
