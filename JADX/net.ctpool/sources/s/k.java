package s;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f22188h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f22191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f22192d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22195g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22189a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22190b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f22193e = new ArrayList();

    public k(m mVar, int i7) {
        this.f22191c = null;
        this.f22192d = null;
        int i8 = f22188h;
        this.f22194f = i8;
        f22188h = i8 + 1;
        this.f22191c = mVar;
        this.f22192d = mVar;
        this.f22195g = i7;
    }

    private long c(f fVar, long j7) {
        m mVar = fVar.f22167d;
        if (mVar instanceof i) {
            return j7;
        }
        int size = fVar.f22174k.size();
        long jMin = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) fVar.f22174k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22167d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f22169f) + j7));
                }
            }
        }
        if (fVar != mVar.f22207i) {
            return jMin;
        }
        long j8 = j7 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f22206h, j8)), j8 - ((long) mVar.f22206h.f22169f));
    }

    private long d(f fVar, long j7) {
        m mVar = fVar.f22167d;
        if (mVar instanceof i) {
            return j7;
        }
        int size = fVar.f22174k.size();
        long jMax = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) fVar.f22174k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22167d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f22169f) + j7));
                }
            }
        }
        if (fVar != mVar.f22206h) {
            return jMax;
        }
        long j8 = j7 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f22207i, j8)), j8 - ((long) mVar.f22207i.f22169f));
    }

    public void a(m mVar) {
        this.f22193e.add(mVar);
        this.f22192d = mVar;
    }

    public long b(r.f fVar, int i7) {
        long j7;
        m mVar;
        long j8;
        long jD;
        m mVar2 = this.f22191c;
        if (mVar2 instanceof c) {
            if (((c) mVar2).f22204f != i7) {
                return 0L;
            }
        } else if (i7 == 0) {
            if (!(mVar2 instanceof j)) {
                return 0L;
            }
        } else if (!(mVar2 instanceof l)) {
            return 0L;
        }
        f fVar2 = (i7 == 0 ? fVar.f21972e : fVar.f21974f).f22206h;
        f fVar3 = (i7 == 0 ? fVar.f21972e : fVar.f21974f).f22207i;
        boolean zContains = mVar2.f22206h.f22175l.contains(fVar2);
        boolean zContains2 = this.f22191c.f22207i.f22175l.contains(fVar3);
        long j9 = this.f22191c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jD = d(this.f22191c.f22206h, r12.f22169f);
                j8 = ((long) this.f22191c.f22206h.f22169f) + j9;
            } else if (zContains2) {
                long jC = c(this.f22191c.f22207i, r12.f22169f);
                j8 = ((long) (-this.f22191c.f22207i.f22169f)) + j9;
                jD = -jC;
            } else {
                m mVar3 = this.f22191c;
                j7 = ((long) mVar3.f22206h.f22169f) + mVar3.j();
                mVar = this.f22191c;
            }
            return Math.max(jD, j8);
        }
        long jD2 = d(this.f22191c.f22206h, 0L);
        long jC2 = c(this.f22191c.f22207i, 0L);
        long j10 = jD2 - j9;
        m mVar4 = this.f22191c;
        int i8 = mVar4.f22207i.f22169f;
        if (j10 >= (-i8)) {
            j10 += (long) i8;
        }
        int i9 = mVar4.f22206h.f22169f;
        long j11 = ((-jC2) - j9) - ((long) i9);
        if (j11 >= i9) {
            j11 -= (long) i9;
        }
        float fM = mVar4.f22200b.m(i7);
        float f7 = fM > 0.0f ? (long) ((j11 / fM) + (j10 / (1.0f - fM))) : 0L;
        long j12 = ((long) ((f7 * fM) + 0.5f)) + j9 + ((long) ((f7 * (1.0f - fM)) + 0.5f));
        mVar = this.f22191c;
        j7 = ((long) mVar.f22206h.f22169f) + j12;
        return j7 - ((long) mVar.f22207i.f22169f);
    }
}
