package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class h extends B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f11294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f11295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f11296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f11297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f11298l = 0.0d;

    public h(ReadableMap readableMap, p pVar) {
        this.f11294h = pVar;
        this.f11295i = readableMap.getInt("input");
        this.f11296j = readableMap.getDouble("min");
        this.f11297k = readableMap.getDouble("max");
        this.f11169e = 0.0d;
    }

    private double o() {
        AbstractC0793b abstractC0793bL = this.f11294h.l(this.f11295i);
        if (abstractC0793bL == null || !(abstractC0793bL instanceof B)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((B) abstractC0793bL).l();
    }

    @Override // com.facebook.react.animated.B, com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "DiffClampAnimatedNode[" + this.f11274d + "]: InputNodeTag: " + this.f11295i + " min: " + this.f11296j + " max: " + this.f11297k + " lastValue: " + this.f11298l + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        double dO = o();
        double d7 = dO - this.f11298l;
        this.f11298l = dO;
        this.f11169e = Math.min(Math.max(this.f11169e + d7, this.f11296j), this.f11297k);
    }
}
