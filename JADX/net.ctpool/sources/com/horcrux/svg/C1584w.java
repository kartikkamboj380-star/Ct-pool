package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1584w extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f18113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f18114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f18115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f18116p;

    public C1584w(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f18113m);
        double dRelativeOnHeight = relativeOnHeight(this.f18114n);
        double dRelativeOnWidth2 = relativeOnWidth(this.f18115o);
        double dRelativeOnHeight2 = relativeOnHeight(this.f18116p);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<A> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new A(EnumC1567f.kCGPathElementMoveToPoint, new E[]{new E(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new A(EnumC1567f.kCGPathElementAddLineToPoint, new E[]{new E(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public void q(Dynamic dynamic) {
        this.f18113m = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f18115o = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f18114n = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f18116p = SVGLength.b(dynamic);
        invalidate();
    }
}
