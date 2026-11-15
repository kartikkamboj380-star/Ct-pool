package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes.dex */
class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[] f11302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f11303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f11304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11307k = 0;

    j(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f11302f;
        if (dArr == null || dArr.length != size) {
            this.f11302f = new double[size];
        }
        for (int i7 = 0; i7 < size; i7++) {
            this.f11302f[i7] = array.getDouble(i7);
        }
        double d7 = 0.0d;
        if (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) {
            d7 = readableMap.getDouble("toValue");
        }
        this.f11303g = d7;
        if (readableMap.hasKey("iterations")) {
            this.f11305i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.f11305i = 1;
        }
        this.f11306j = 1;
        this.f11275a = this.f11305i == 0;
        this.f11301e = -1L;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j7) {
        double d7;
        if (this.f11301e < 0) {
            this.f11301e = j7;
            if (this.f11306j == 1) {
                this.f11304h = this.f11276b.f11169e;
            }
        }
        int iRound = (int) Math.round(((j7 - this.f11301e) / 1000000) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j7 + " and mStartFrameTimeNanos " + this.f11301e;
            if (this.f11307k < 100) {
                P0.a.G("ReactNative", str);
                this.f11307k++;
                return;
            }
            return;
        }
        if (this.f11275a) {
            return;
        }
        double[] dArr = this.f11302f;
        if (iRound >= dArr.length - 1) {
            d7 = this.f11303g;
            int i7 = this.f11305i;
            if (i7 == -1 || this.f11306j < i7) {
                this.f11301e = -1L;
                this.f11306j++;
            } else {
                this.f11275a = true;
            }
        } else {
            double d8 = this.f11304h;
            d7 = d8 + (dArr[iRound] * (this.f11303g - d8));
        }
        this.f11276b.f11169e = d7;
    }
}
