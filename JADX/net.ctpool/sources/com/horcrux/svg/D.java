package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C1562a;

/* JADX INFO: loaded from: classes.dex */
class D extends C1582u {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final float[] f17758E = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f17759A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    String f17760B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f17761C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Matrix f17762D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SVGLength f17763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SVGLength f17764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SVGLength f17765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SVGLength f17766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1562a.b f17767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1562a.b f17768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f17769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f17770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f17771z;

    public D(ReactContext reactContext) {
        super(reactContext);
        this.f17762D = null;
    }

    public void B(Dynamic dynamic) {
        this.f17766u = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f17768w = bVar;
        invalidate();
    }

    public void D(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17758E;
            int iC = F.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f17762D == null) {
                    this.f17762D = new Matrix();
                }
                this.f17762D.setValues(fArr);
            } else if (iC != -1) {
                P0.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17762D = null;
        }
        invalidate();
    }

    public void E(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f17767v = bVar;
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f17765t = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f17763r = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f17764s = SVGLength.b(dynamic);
        invalidate();
    }

    RectF getViewBox() {
        float f7 = this.f17769x;
        float f8 = this.mScale;
        float f9 = this.f17770y;
        return new RectF(f7 * f8, f9 * f8, (f7 + this.f17771z) * f8, (f9 + this.f17759A) * f8);
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C1562a c1562a = new C1562a(C1562a.EnumC0240a.PATTERN, new SVGLength[]{this.f17763r, this.f17764s, this.f17765t, this.f17766u}, this.f17767v);
            c1562a.d(this.f17768w);
            c1562a.g(this);
            Matrix matrix = this.f17762D;
            if (matrix != null) {
                c1562a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C1562a.b bVar = this.f17767v;
            C1562a.b bVar2 = C1562a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f17768w == bVar2) {
                c1562a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c1562a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f17760B = str;
        invalidate();
    }

    public void setMeetOrSlice(int i7) {
        this.f17761C = i7;
        invalidate();
    }

    public void setMinX(float f7) {
        this.f17769x = f7;
        invalidate();
    }

    public void setMinY(float f7) {
        this.f17770y = f7;
        invalidate();
    }

    public void setVbHeight(float f7) {
        this.f17759A = f7;
        invalidate();
    }

    public void setVbWidth(float f7) {
        this.f17771z = f7;
        invalidate();
    }
}
