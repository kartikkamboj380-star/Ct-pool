package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class B extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f11169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f11170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f11171g;

    public B() {
        this.f11169e = Double.NaN;
        this.f11170f = 0.0d;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "ValueAnimatedNode[" + this.f11274d + "]: value: " + this.f11169e + " offset: " + this.f11170f;
    }

    public void i() {
        this.f11170f += this.f11169e;
        this.f11169e = 0.0d;
    }

    public void j() {
        this.f11169e += this.f11170f;
        this.f11170f = 0.0d;
    }

    public Object k() {
        return null;
    }

    public double l() {
        if (Double.isNaN(this.f11170f + this.f11169e)) {
            h();
        }
        return this.f11170f + this.f11169e;
    }

    public void m() {
        c cVar = this.f11171g;
        if (cVar == null) {
            return;
        }
        cVar.a(l());
    }

    public void n(c cVar) {
        this.f11171g = cVar;
    }

    public B(ReadableMap readableMap) {
        this.f11169e = Double.NaN;
        this.f11170f = 0.0d;
        this.f11169e = readableMap.getDouble("value");
        this.f11170f = readableMap.getDouble("offset");
    }
}
