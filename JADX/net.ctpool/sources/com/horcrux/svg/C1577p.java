package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1577p extends AbstractC1565d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HashMap f18025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private EnumC1576o f18026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private EnumC1576o f18027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final FilterRegion f18028p;

    public C1577p(ReactContext reactContext) {
        super(reactContext);
        this.f18025m = new HashMap();
        this.f18028p = new FilterRegion();
    }

    public Bitmap q(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f18025m.clear();
        this.f18025m.put("SourceGraphic", bitmap);
        this.f18025m.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f18025m.put("BackgroundImage", bitmap2);
        this.f18025m.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof AbstractC1573l) {
                AbstractC1573l abstractC1573l = (AbstractC1573l) childAt;
                bitmapCreateBitmap.eraseColor(0);
                Rect cropRect = abstractC1573l.f18005n.getCropRect(abstractC1573l, this.f18027o, rectF);
                canvas.drawBitmap(abstractC1573l.q(this.f18025m, bitmap), cropRect, cropRect, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strR = abstractC1573l.r();
                if (strR != null) {
                    this.f18025m.put(strR, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        Rect cropRect2 = this.f18028p.getCropRect(this, this.f18026n, rectF);
        canvas.drawBitmap(bitmap, cropRect2, cropRect2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void r(String str) {
        this.f18026n = EnumC1576o.h(str);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f18028p.setHeight(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }

    public void t(String str) {
        this.f18027o = EnumC1576o.h(str);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f18028p.setWidth(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f18028p.setX(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f18028p.setY(dynamic);
        invalidate();
    }
}
