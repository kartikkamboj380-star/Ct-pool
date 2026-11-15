package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class w extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f11372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JavaOnlyMap f11373i;

    w(ReadableMap readableMap, p pVar) {
        this.f11369e = pVar;
        this.f11370f = readableMap.getInt("animationId");
        this.f11371g = readableMap.getInt("toValue");
        this.f11372h = readableMap.getInt("value");
        this.f11373i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "TrackingAnimatedNode[" + this.f11274d + "]: animationID: " + this.f11370f + " toValueNode: " + this.f11371g + " valueNode: " + this.f11372h + " animationConfig: " + this.f11373i;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        this.f11373i.putDouble("toValue", ((B) this.f11369e.l(this.f11371g)).l());
        this.f11369e.w(this.f11370f, this.f11372h, this.f11373i, null);
    }
}
