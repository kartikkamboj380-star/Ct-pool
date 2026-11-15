package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C1562a;

/* JADX INFO: renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1585x extends AbstractC1565d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float[] f18117t = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f18118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f18119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f18120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f18121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ReadableArray f18122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1562a.b f18123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Matrix f18124s;

    public C1585x(ReactContext reactContext) {
        super(reactContext);
        this.f18124s = null;
    }

    public void q(ReadableArray readableArray) {
        this.f18122q = readableArray;
        invalidate();
    }

    public void r(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f18117t;
            int iC = F.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f18124s == null) {
                    this.f18124s = new Matrix();
                }
                this.f18124s.setValues(fArr);
            } else if (iC != -1) {
                P0.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f18124s = null;
        }
        invalidate();
    }

    public void s(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f18123r = bVar;
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C1562a c1562a = new C1562a(C1562a.EnumC0240a.LINEAR_GRADIENT, new SVGLength[]{this.f18118m, this.f18119n, this.f18120o, this.f18121p}, this.f18123r);
            c1562a.e(this.f18122q);
            Matrix matrix = this.f18124s;
            if (matrix != null) {
                c1562a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f18123r == C1562a.b.USER_SPACE_ON_USE) {
                c1562a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c1562a, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f18118m = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f18120o = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f18119n = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f18121p = SVGLength.b(dynamic);
        invalidate();
    }
}
