package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
class i0 extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f17995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f17996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f17997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f17998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SVGLength f17999q;

    public i0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17995m);
        if (definedTemplate == null) {
            P0.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17995m + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f17996n), (float) relativeOnHeight(this.f17997o));
        boolean z6 = definedTemplate instanceof RenderableView;
        if (z6) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof L) {
            ((L) definedTemplate).B(canvas, paint, f7, (float) relativeOnWidth(this.f17998p), (float) relativeOnHeight(this.f17999q));
        } else {
            definedTemplate.draw(canvas, paint, f7 * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, iSaveAndSetupCanvas);
        if (z6) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17995m);
        if (definedTemplate == null) {
            P0.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17995m + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f17996n), (float) relativeOnHeight(this.f17997o));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17995m);
            if (definedTemplate == null) {
                P0.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17995m + " is not defined.");
                return -1;
            }
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
        }
        return -1;
    }

    public void q(Dynamic dynamic) {
        this.f17999q = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(String str) {
        this.f17995m = str;
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f17998p = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f17996n = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f17997o = SVGLength.b(dynamic);
        invalidate();
    }
}
