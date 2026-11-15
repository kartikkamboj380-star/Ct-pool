package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f11322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f11323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f11324j;

    public l(ReadableMap readableMap, p pVar) {
        w5.k.f(readableMap, "config");
        w5.k.f(pVar, "nativeAnimatedNodesManager");
        this.f11322h = pVar;
        this.f11323i = readableMap.getInt("input");
        this.f11324j = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.B, com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "NativeAnimatedNodesManager[" + this.f11274d + "] inputNode: " + this.f11323i + " modulus: " + this.f11324j + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        AbstractC0793b abstractC0793bL = this.f11322h.l(this.f11323i);
        if (!(abstractC0793bL instanceof B)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dL = ((B) abstractC0793bL).l();
        double d7 = this.f11324j;
        this.f11169e = ((dL % d7) + d7) % d7;
    }
}
