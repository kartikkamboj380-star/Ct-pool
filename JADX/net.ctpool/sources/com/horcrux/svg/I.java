package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C1562a;

/* JADX INFO: loaded from: classes.dex */
class I extends AbstractC1565d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float[] f17791v = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f17792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f17793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f17794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f17795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SVGLength f17796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SVGLength f17797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ReadableArray f17798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1562a.b f17799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Matrix f17800u;

    public I(ReactContext reactContext) {
        super(reactContext);
        this.f17800u = null;
    }

    public void q(Dynamic dynamic) {
        this.f17796q = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f17797r = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f17792m = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C1562a c1562a = new C1562a(C1562a.EnumC0240a.RADIAL_GRADIENT, new SVGLength[]{this.f17792m, this.f17793n, this.f17794o, this.f17795p, this.f17796q, this.f17797r}, this.f17799t);
            c1562a.e(this.f17798s);
            Matrix matrix = this.f17800u;
            if (matrix != null) {
                c1562a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f17799t == C1562a.b.USER_SPACE_ON_USE) {
                c1562a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c1562a, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f17793n = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(ReadableArray readableArray) {
        this.f17798s = readableArray;
        invalidate();
    }

    public void v(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17791v;
            int iC = F.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f17800u == null) {
                    this.f17800u = new Matrix();
                }
                this.f17800u.setValues(fArr);
            } else if (iC != -1) {
                P0.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17800u = null;
        }
        invalidate();
    }

    public void w(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f17799t = bVar;
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f17794o = SVGLength.b(dynamic);
        invalidate();
    }

    public void y(Dynamic dynamic) {
        this.f17795p = SVGLength.b(dynamic);
        invalidate();
    }
}
