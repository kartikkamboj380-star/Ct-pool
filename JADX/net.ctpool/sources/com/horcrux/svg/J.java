package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class J extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f17801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f17802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f17803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f17804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SVGLength f17805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SVGLength f17806r;

    public J(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d7;
        double d8;
        double d9;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f17801m);
        double dRelativeOnHeight2 = relativeOnHeight(this.f17802n);
        double dRelativeOnWidth3 = relativeOnWidth(this.f17803o);
        double dRelativeOnHeight3 = relativeOnHeight(this.f17804p);
        SVGLength sVGLength = this.f17805q;
        if (sVGLength == null && this.f17806r == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
            d9 = dRelativeOnWidth3;
        } else {
            if (sVGLength == null) {
                dRelativeOnWidth = relativeOnHeight(this.f17806r);
            } else if (this.f17806r == null) {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
                dRelativeOnHeight = relativeOnHeight(this.f17806r);
                d7 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d7) {
                    dRelativeOnWidth = d7;
                }
                d8 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d8) {
                    dRelativeOnHeight = d8;
                }
                d9 = dRelativeOnWidth3;
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d7 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d7) {
            }
            d8 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d8) {
            }
            d9 = dRelativeOnWidth3;
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<A> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new A(EnumC1567f.kCGPathElementMoveToPoint, new E[]{new E(dRelativeOnWidth2, dRelativeOnHeight2)}));
        ArrayList<A> arrayList2 = this.elements;
        EnumC1567f enumC1567f = EnumC1567f.kCGPathElementAddLineToPoint;
        double d10 = dRelativeOnWidth2 + d9;
        arrayList2.add(new A(enumC1567f, new E[]{new E(d10, dRelativeOnHeight2)}));
        double d11 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new A(enumC1567f, new E[]{new E(d10, d11)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(dRelativeOnWidth2, d11)}));
        this.elements.add(new A(enumC1567f, new E[]{new E(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public void q(Dynamic dynamic) {
        this.f17804p = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f17805q = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f17806r = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f17803o = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f17801m = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f17802n = SVGLength.b(dynamic);
        invalidate();
    }
}
