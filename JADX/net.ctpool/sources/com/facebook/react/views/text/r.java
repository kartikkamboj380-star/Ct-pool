package com.facebook.react.views.text;

import com.facebook.react.uimanager.G;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13130a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13131b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13132c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f13133d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f13134e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f13135f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f13136g = t.UNSET;

    public r a(r rVar) {
        r rVar2 = new r();
        rVar2.f13130a = this.f13130a;
        rVar2.f13131b = !Float.isNaN(rVar.f13131b) ? rVar.f13131b : this.f13131b;
        rVar2.f13132c = !Float.isNaN(rVar.f13132c) ? rVar.f13132c : this.f13132c;
        rVar2.f13133d = !Float.isNaN(rVar.f13133d) ? rVar.f13133d : this.f13133d;
        rVar2.f13134e = !Float.isNaN(rVar.f13134e) ? rVar.f13134e : this.f13134e;
        rVar2.f13135f = !Float.isNaN(rVar.f13135f) ? rVar.f13135f : this.f13135f;
        t tVar = rVar.f13136g;
        if (tVar == t.UNSET) {
            tVar = this.f13136g;
        }
        rVar2.f13136g = tVar;
        return rVar2;
    }

    public boolean b() {
        return this.f13130a;
    }

    public int c() {
        float f7 = !Float.isNaN(this.f13131b) ? this.f13131b : 14.0f;
        return (int) Math.ceil(this.f13130a ? G.g(f7, f()) : G.d(f7));
    }

    public float d() {
        if (Float.isNaN(this.f13133d)) {
            return Float.NaN;
        }
        return (this.f13130a ? G.g(this.f13133d, f()) : G.d(this.f13133d)) / c();
    }

    public float e() {
        if (Float.isNaN(this.f13132c)) {
            return Float.NaN;
        }
        float fG = this.f13130a ? G.g(this.f13132c, f()) : G.d(this.f13132c);
        if (Float.isNaN(this.f13135f)) {
            return fG;
        }
        float f7 = this.f13135f;
        return f7 > fG ? f7 : fG;
    }

    public float f() {
        if (Float.isNaN(this.f13134e)) {
            return 0.0f;
        }
        return this.f13134e;
    }

    public float g() {
        return this.f13131b;
    }

    public float h() {
        return this.f13135f;
    }

    public float i() {
        return this.f13133d;
    }

    public float j() {
        return this.f13132c;
    }

    public float k() {
        return this.f13134e;
    }

    public t l() {
        return this.f13136g;
    }

    public void m(boolean z6) {
        this.f13130a = z6;
    }

    public void n(float f7) {
        this.f13131b = f7;
    }

    public void o(float f7) {
        this.f13135f = f7;
    }

    public void p(float f7) {
        this.f13133d = f7;
    }

    public void q(float f7) {
        this.f13132c = f7;
    }

    public void r(float f7) {
        if (f7 == 0.0f || f7 >= 1.0f) {
            this.f13134e = f7;
        } else {
            P0.a.G("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f13134e = Float.NaN;
        }
    }

    public void s(t tVar) {
        this.f13136g = tVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
