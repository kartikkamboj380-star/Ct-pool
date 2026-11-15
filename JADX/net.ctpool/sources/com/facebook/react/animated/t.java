package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class t extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f11349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f11350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f11351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f11352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f11354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f11355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f11356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f11357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f11358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f11359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f11362t;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f11363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f11364b;

        private a() {
        }
    }

    t(ReadableMap readableMap) {
        a aVar = new a();
        this.f11354l = aVar;
        aVar.f11364b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    private void c(double d7) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.f11359q += d7 <= 0.064d ? d7 : 0.064d;
        double d8 = this.f11350h;
        double d9 = this.f11351i;
        double d10 = this.f11349g;
        double d11 = -this.f11352j;
        double dSqrt = d8 / (Math.sqrt(d10 * d9) * 2.0d);
        double dSqrt2 = Math.sqrt(d10 / d9);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d12 = this.f11356n - this.f11355m;
        double d13 = this.f11359q;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d13);
            double d14 = dSqrt * dSqrt2;
            double d15 = d11 + (d14 * d12);
            double d16 = d13 * dSqrt3;
            dSin2 = this.f11356n - ((((d15 / dSqrt3) * Math.sin(d16)) + (Math.cos(d16) * d12)) * dExp);
            dSin = ((d14 * dExp) * (((Math.sin(d16) * d15) / dSqrt3) + (Math.cos(d16) * d12))) - (((Math.cos(d16) * d15) - ((dSqrt3 * d12) * Math.sin(d16))) * dExp);
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d13);
            double d17 = this.f11356n - (((((dSqrt2 * d12) + d11) * d13) + d12) * dExp2);
            dSin = dExp2 * ((d11 * ((d13 * dSqrt2) - 1.0d)) + (d13 * d12 * dSqrt2 * dSqrt2));
            dSin2 = d17;
        }
        a aVar = this.f11354l;
        aVar.f11363a = dSin2;
        aVar.f11364b = dSin;
        if (e() || (this.f11353k && f())) {
            if (this.f11349g > 0.0d) {
                double d18 = this.f11356n;
                this.f11355m = d18;
                this.f11354l.f11363a = d18;
            } else {
                double d19 = this.f11354l.f11363a;
                this.f11356n = d19;
                this.f11355m = d19;
            }
            this.f11354l.f11364b = 0.0d;
        }
    }

    private double d(a aVar) {
        return Math.abs(this.f11356n - aVar.f11363a);
    }

    private boolean e() {
        return Math.abs(this.f11354l.f11364b) <= this.f11357o && (d(this.f11354l) <= this.f11358p || this.f11349g == 0.0d);
    }

    private boolean f() {
        if (this.f11349g > 0.0d) {
            double d7 = this.f11355m;
            double d8 = this.f11356n;
            if ((d7 < d8 && this.f11354l.f11363a > d8) || (d7 > d8 && this.f11354l.f11363a < d8)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap readableMap) {
        this.f11349g = readableMap.getDouble("stiffness");
        this.f11350h = readableMap.getDouble("damping");
        this.f11351i = readableMap.getDouble("mass");
        this.f11352j = this.f11354l.f11364b;
        this.f11356n = readableMap.getDouble("toValue");
        this.f11357o = readableMap.getDouble("restSpeedThreshold");
        this.f11358p = readableMap.getDouble("restDisplacementThreshold");
        this.f11353k = readableMap.getBoolean("overshootClamping");
        int i7 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f11360r = i7;
        this.f11275a = i7 == 0;
        this.f11361s = 0;
        this.f11359q = 0.0d;
        this.f11348f = false;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j7) {
        long j8 = j7 / 1000000;
        if (!this.f11348f) {
            if (this.f11361s == 0) {
                this.f11362t = this.f11276b.f11169e;
                this.f11361s = 1;
            }
            a aVar = this.f11354l;
            double d7 = this.f11276b.f11169e;
            aVar.f11363a = d7;
            this.f11355m = d7;
            this.f11347e = j8;
            this.f11359q = 0.0d;
            this.f11348f = true;
        }
        c((j8 - this.f11347e) / 1000.0d);
        this.f11347e = j8;
        this.f11276b.f11169e = this.f11354l.f11363a;
        if (e()) {
            int i7 = this.f11360r;
            if (i7 != -1 && this.f11361s >= i7) {
                this.f11275a = true;
                return;
            }
            this.f11348f = false;
            this.f11276b.f11169e = this.f11362t;
            this.f11361s++;
        }
    }
}
