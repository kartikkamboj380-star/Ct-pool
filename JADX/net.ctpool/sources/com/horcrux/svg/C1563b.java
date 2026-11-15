package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1563b extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f17940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f17941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f17942o;

    public C1563b(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f17940m);
        double dRelativeOnHeight = relativeOnHeight(this.f17941n);
        double dRelativeOnOther = relativeOnOther(this.f17942o);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<A> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d7 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new A(EnumC1567f.kCGPathElementMoveToPoint, new E[]{new E(dRelativeOnWidth, d7)}));
        ArrayList<A> arrayList2 = this.elements;
        EnumC1567f enumC1567f = EnumC1567f.kCGPathElementAddLineToPoint;
        E e7 = new E(dRelativeOnWidth, d7);
        double d8 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new A(enumC1567f, new E[]{e7, new E(d8, dRelativeOnHeight)}));
        double d9 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new A(enumC1567f, new E[]{new E(d8, dRelativeOnHeight), new E(dRelativeOnWidth, d9)}));
        double d10 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new A(enumC1567f, new E[]{new E(dRelativeOnWidth, d9), new E(d10, dRelativeOnHeight)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(d10, dRelativeOnHeight), new E(dRelativeOnWidth, d7)}));
        return path;
    }

    public void q(Dynamic dynamic) {
        this.f17940m = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f17941n = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f17942o = SVGLength.b(dynamic);
        invalidate();
    }
}
