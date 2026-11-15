package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1568g extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f17969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f17970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f17971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f17972p;

    public C1568g(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f17969m);
        double dRelativeOnHeight = relativeOnHeight(this.f17970n);
        double dRelativeOnWidth2 = relativeOnWidth(this.f17971o);
        double dRelativeOnHeight2 = relativeOnHeight(this.f17972p);
        double d7 = dRelativeOnWidth - dRelativeOnWidth2;
        double d8 = dRelativeOnHeight - dRelativeOnHeight2;
        double d9 = dRelativeOnWidth2 + dRelativeOnWidth;
        double d10 = dRelativeOnHeight2 + dRelativeOnHeight;
        path.addOval(new RectF((float) d7, (float) d8, (float) d9, (float) d10), Path.Direction.CW);
        ArrayList<A> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new A(EnumC1567f.kCGPathElementMoveToPoint, new E[]{new E(dRelativeOnWidth, d8)}));
        ArrayList<A> arrayList2 = this.elements;
        EnumC1567f enumC1567f = EnumC1567f.kCGPathElementAddLineToPoint;
        arrayList2.add(new A(enumC1567f, new E[]{new E(dRelativeOnWidth, d8), new E(d9, dRelativeOnHeight)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(d9, dRelativeOnHeight), new E(dRelativeOnWidth, d10)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(dRelativeOnWidth, d10), new E(d7, dRelativeOnHeight)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(d7, dRelativeOnHeight), new E(dRelativeOnWidth, d8)}));
        return path;
    }

    public void q(Dynamic dynamic) {
        this.f17969m = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f17970n = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f17971o = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f17972p = SVGLength.b(dynamic);
        invalidate();
    }
}
