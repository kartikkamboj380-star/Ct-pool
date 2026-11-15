package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C1562a;

/* JADX INFO: renamed from: com.horcrux.svg.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1587z extends C1582u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    SVGLength f18138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    SVGLength f18139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    SVGLength f18140t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    SVGLength f18141u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1562a.b f18142v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1562a.b f18143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    a f18144x;

    /* JADX INFO: renamed from: com.horcrux.svg.z$a */
    enum a {
        LUMINANCE,
        ALPHA
    }

    public C1587z(ReactContext reactContext) {
        super(reactContext);
    }

    public a B() {
        return this.f18144x;
    }

    public void C(Dynamic dynamic) {
        this.f18141u = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f18143w = bVar;
        invalidate();
    }

    public void E(int i7) {
        a aVar;
        if (i7 != 0) {
            if (i7 == 1) {
                aVar = a.ALPHA;
            }
            invalidate();
        }
        aVar = a.LUMINANCE;
        this.f18144x = aVar;
        invalidate();
    }

    public void F(int i7) {
        C1562a.b bVar;
        if (i7 != 0) {
            if (i7 == 1) {
                bVar = C1562a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C1562a.b.OBJECT_BOUNDING_BOX;
        this.f18142v = bVar;
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f18140t = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f18138r = SVGLength.b(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f18139s = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
