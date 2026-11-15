package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1572k extends AbstractC1573l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f18001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    SVGLength f18002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    SVGLength f18003q;

    public C1572k(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(String str) {
        this.f18001o = str;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC1573l
    public Bitmap q(HashMap map, Bitmap bitmap) {
        Bitmap bitmapS = AbstractC1573l.s(map, bitmap, this.f18001o);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.f18002p;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f18003q;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        canvas.drawBitmap(bitmapS, rectF.width(), rectF.height(), (Paint) null);
        return bitmapCreateBitmap;
    }

    public void y(Dynamic dynamic) {
        this.f18002p = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f18003q = SVGLength.b(dynamic);
        invalidate();
    }
}
