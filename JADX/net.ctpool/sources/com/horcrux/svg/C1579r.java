package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1579r extends C1582u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    SVGLength f18047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    SVGLength f18048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    SVGLength f18049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    SVGLength f18050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Bitmap f18051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Canvas f18052w;

    public C1579r(ReactContext reactContext) {
        super(reactContext);
        this.f18051v = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f18052w = new Canvas(this.f18051v);
    }

    public void B(Dynamic dynamic) {
        this.f18050u = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f18049t = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f18047r = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f18048s = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f18052w);
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f18047r);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f18048s);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f18049t);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f18050u);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f7);
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(this.f18052w, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    @Override // com.horcrux.svg.C1582u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void q(Canvas canvas, Paint paint, float f7) {
        w();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof C1587z)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z6 = virtualView instanceof RenderableView;
                        if (z6) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f7);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z6) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        v();
    }
}
