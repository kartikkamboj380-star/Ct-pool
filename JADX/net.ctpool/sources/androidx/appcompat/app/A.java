package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static A f4926d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4929c;

    A() {
    }

    static A b() {
        if (f4926d == null) {
            f4926d = new A();
        }
        return f4926d;
    }

    public void a(long j7, double d7, double d8) {
        double d9 = (0.01720197f * ((j7 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d9) * 0.03341960161924362d) + d9 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d8) / 360.0d) + (Math.sin(d9) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d10 = 0.01745329238474369d * d7;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d10) * Math.sin(dAsin))) / (Math.cos(d10) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f4929c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f4927a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f4928b = jRound;
                if (jRound >= j7 || this.f4927a <= j7) {
                    this.f4929c = 1;
                    return;
                } else {
                    this.f4929c = 0;
                    return;
                }
            }
            this.f4929c = 0;
        }
        this.f4927a = -1L;
        this.f4928b = -1L;
    }
}
