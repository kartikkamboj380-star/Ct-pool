package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
class V extends h0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f17865C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private f0 f17866D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private e0 f17867E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private SVGLength f17868F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private d0 f17869G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private g0 f17870H;

    public V(ReactContext reactContext) {
        super(reactContext);
        this.f17869G = d0.align;
        this.f17870H = g0.exact;
    }

    @Override // com.horcrux.svg.h0
    public void M(String str) {
        this.f17869G = d0.valueOf(str);
        invalidate();
    }

    e0 S() {
        return this.f17867E;
    }

    f0 T() {
        return this.f17866D;
    }

    SVGLength U() {
        return this.f17868F;
    }

    Path V(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17865C);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    public void W(String str) {
        this.f17865C = str;
        invalidate();
    }

    public void X(String str) {
        this.f17867E = e0.valueOf(str);
        invalidate();
    }

    public void Y(String str) {
        this.f17866D = f0.valueOf(str);
        invalidate();
    }

    public void Z(String str) {
        this.f17870H = g0.valueOf(str);
        invalidate();
    }

    public void a0(Dynamic dynamic) {
        this.f17868F = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        q(canvas, paint, f7);
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return D(canvas, paint);
    }

    @Override // com.horcrux.svg.C1582u
    void v() {
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.C1582u
    void w() {
    }
}
