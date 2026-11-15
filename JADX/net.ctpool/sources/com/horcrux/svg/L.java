package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
class L extends C1582u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f17810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f17811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f17812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f17813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f17814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17815w;

    public L(ReactContext reactContext) {
        super(reactContext);
    }

    void B(Canvas canvas, Paint paint, float f7, float f8, float f9) {
        if (this.f17814v != null) {
            float f10 = this.f17810r;
            float f11 = this.mScale;
            float f12 = this.f17811s;
            canvas.concat(j0.a(new RectF(f10 * f11, f12 * f11, (f10 + this.f17812t) * f11, (f12 + this.f17813u) * f11), new RectF(0.0f, 0.0f, f8, f9), this.f17814v, this.f17815w));
            super.draw(canvas, paint, f7);
        }
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f17814v = str;
        invalidate();
    }

    public void setMeetOrSlice(int i7) {
        this.f17815w = i7;
        invalidate();
    }

    public void setMinX(float f7) {
        this.f17810r = f7;
        invalidate();
    }

    public void setMinY(float f7) {
        this.f17811s = f7;
        invalidate();
    }

    public void setVbHeight(float f7) {
        this.f17813u = f7;
        invalidate();
    }

    public void setVbWidth(float f7) {
        this.f17812t = f7;
        invalidate();
    }
}
