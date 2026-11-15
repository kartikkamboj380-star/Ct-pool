package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class h0 extends C1582u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ArrayList f17980A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    double f17981B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    SVGLength f17982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    SVGLength f17983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f17984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c0 f17985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private W f17986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f17987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f17988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList f17989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f17990z;

    public h0(ReactContext reactContext) {
        super(reactContext);
        this.f17982r = null;
        this.f17983s = null;
        this.f17984t = null;
        this.f17985u = c0.spacing;
        this.f17981B = Double.NaN;
    }

    W B() {
        W w6;
        if (this.f17986v == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof h0) && (w6 = ((h0) parent).f17986v) != null) {
                    this.f17986v = w6;
                    return w6;
                }
            }
        }
        if (this.f17986v == null) {
            this.f17986v = W.baseline;
        }
        return this.f17986v;
    }

    String C() {
        String str;
        if (this.f17984t == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof h0) && (str = ((h0) parent).f17984t) != null) {
                    this.f17984t = str;
                    return str;
                }
            }
        }
        return this.f17984t;
    }

    Path D(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        w();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        v();
        return ((VirtualView) this).mPath;
    }

    double E(Paint paint) {
        if (!Double.isNaN(this.f17981B)) {
            return this.f17981B;
        }
        double dE = 0.0d;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof h0) {
                dE += ((h0) childAt).E(paint);
            }
        }
        this.f17981B = dE;
        return dE;
    }

    h0 F() {
        ArrayList arrayList = u().f18068a;
        ViewParent parent = getParent();
        h0 h0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof h0) && ((C1578q) arrayList.get(size)).f18039j != a0.start && h0Var.f17987w == null; size--) {
            h0Var = (h0) parent;
            parent = h0Var.getParent();
        }
        return h0Var;
    }

    h0 G() {
        ViewParent parent = getParent();
        h0 h0Var = this;
        while (parent instanceof h0) {
            h0Var = (h0) parent;
            parent = h0Var.getParent();
        }
        return h0Var;
    }

    public void H(Dynamic dynamic) {
        this.f17984t = SVGLength.c(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f17990z = SVGLength.a(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f17980A = SVGLength.a(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f17982r = SVGLength.b(dynamic);
        invalidate();
    }

    public void L(String str) {
        this.f17985u = c0.valueOf(str);
        invalidate();
    }

    public void M(String str) {
        this.f17986v = W.h(str);
        invalidate();
    }

    public void N(Dynamic dynamic) {
        this.f17987w = SVGLength.a(dynamic);
        invalidate();
    }

    public void O(Dynamic dynamic) {
        this.f17988x = SVGLength.a(dynamic);
        invalidate();
    }

    public void P(Dynamic dynamic) {
        this.f17989y = SVGLength.a(dynamic);
        invalidate();
    }

    public void Q(Dynamic dynamic) {
        this.f17983s = SVGLength.b(dynamic);
        invalidate();
    }

    public void R(Dynamic dynamic) {
        String strC = SVGLength.c(dynamic);
        if (strC != null) {
            String strTrim = strC.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.f17986v = W.h(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f17986v = W.baseline;
            }
            try {
                this.f17984t = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f17984t = null;
            }
            invalidate();
        }
        this.f17986v = W.baseline;
        this.f17984t = null;
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void clearCache() {
        this.f17981B = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        A(canvas);
        clip(canvas, paint);
        D(canvas, paint);
        w();
        q(canvas, paint, f7);
        v();
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        A(canvas);
        return D(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        G().clearChildCache();
    }

    @Override // com.horcrux.svg.C1582u
    Path t(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.C1582u
    void w() {
        u().p(((this instanceof V) || (this instanceof U)) ? false : true, this, this.f18097m, this.f17987w, this.f17988x, this.f17990z, this.f17980A, this.f17989y);
    }
}
