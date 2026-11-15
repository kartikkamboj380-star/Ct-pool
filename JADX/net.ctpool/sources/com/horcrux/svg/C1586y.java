package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1586y extends C1582u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f18125A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    String f18126B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f18127C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    Matrix f18128D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SVGLength f18129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SVGLength f18130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SVGLength f18131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SVGLength f18132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f18133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f18134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f18135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f18137z;

    public C1586y(ReactContext reactContext) {
        super(reactContext);
        this.f18128D = new Matrix();
    }

    void B(Canvas canvas, Paint paint, float f7, G g7, float f8) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f18128D.reset();
        E e7 = g7.f17783b;
        this.f18128D.setTranslate((float) e7.f17772a, (float) e7.f17773b);
        double d7 = "auto".equals(this.f18134w) ? -1.0d : Double.parseDouble(this.f18134w);
        if (d7 == -1.0d) {
            d7 = g7.f17784c;
        }
        this.f18128D.preRotate(((float) d7) + 180.0f);
        if ("strokeWidth".equals(this.f18133v)) {
            Matrix matrix = this.f18128D;
            float f9 = this.mScale;
            matrix.preScale(f8 / f9, f8 / f9);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f18131t) / ((double) this.mScale)), (float) (relativeOnHeight(this.f18132u) / ((double) this.mScale)));
        if (this.f18126B != null) {
            float f10 = this.f18135x;
            float f11 = this.mScale;
            float f12 = this.f18136y;
            Matrix matrixA = j0.a(new RectF(f10 * f11, f12 * f11, (f10 + this.f18137z) * f11, (f12 + this.f18125A) * f11), rectF, this.f18126B, this.f18127C);
            float[] fArr = new float[9];
            matrixA.getValues(fArr);
            this.f18128D.preScale(fArr[0], fArr[4]);
        }
        this.f18128D.preTranslate((float) (-relativeOnWidth(this.f18129r)), (float) (-relativeOnHeight(this.f18130s)));
        canvas.concat(this.f18128D);
        q(canvas, paint, f7);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    public void C(Dynamic dynamic) {
        this.f18132u = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(String str) {
        this.f18133v = str;
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f18131t = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(String str) {
        this.f18134w = str;
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f18129r = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f18130s = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f18126B = str;
        invalidate();
    }

    public void setMeetOrSlice(int i7) {
        this.f18127C = i7;
        invalidate();
    }

    public void setMinX(float f7) {
        this.f18135x = f7;
        invalidate();
    }

    public void setMinY(float f7) {
        this.f18136y = f7;
        invalidate();
    }

    public void setVbHeight(float f7) {
        this.f18125A = f7;
        invalidate();
    }

    public void setVbWidth(float f7) {
        this.f18137z = f7;
        invalidate();
    }
}
