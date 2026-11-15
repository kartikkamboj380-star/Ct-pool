package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f11287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f11288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f11290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f11291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11293k;

    public g(ReadableMap readableMap) {
        this.f11287e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap readableMap) {
        this.f11288f = readableMap.getDouble("deceleration");
        int i7 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f11292j = i7;
        this.f11293k = 1;
        this.f11275a = i7 == 0;
        this.f11289g = -1L;
        this.f11290h = 0.0d;
        this.f11291i = 0.0d;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j7) {
        long j8 = j7 / 1000000;
        if (this.f11289g == -1) {
            this.f11289g = j8 - 16;
            double d7 = this.f11290h;
            if (d7 == this.f11291i) {
                this.f11290h = this.f11276b.f11169e;
            } else {
                this.f11276b.f11169e = d7;
            }
            this.f11291i = this.f11276b.f11169e;
        }
        double d8 = this.f11290h;
        double d9 = this.f11287e;
        double d10 = this.f11288f;
        double dExp = d8 + ((d9 / (1.0d - d10)) * (1.0d - Math.exp((-(1.0d - d10)) * (j8 - this.f11289g))));
        if (Math.abs(this.f11291i - dExp) < 0.1d) {
            int i7 = this.f11292j;
            if (i7 != -1 && this.f11293k >= i7) {
                this.f11275a = true;
                return;
            } else {
                this.f11289g = -1L;
                this.f11293k++;
            }
        }
        this.f11291i = dExp;
        this.f11276b.f11169e = dExp;
    }
}
