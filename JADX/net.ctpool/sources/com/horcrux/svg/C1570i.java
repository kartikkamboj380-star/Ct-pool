package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1570i extends AbstractC1573l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f17991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f17992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f17993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    EnumC1574m f17994r;

    public C1570i(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap y(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f17992p, this.f17993q) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public void A(String str) {
        this.f17991o = str;
        invalidate();
    }

    public void B(float f7) {
        this.f17992p = f7;
        invalidate();
    }

    public void C(float f7) {
        this.f17993q = f7;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC1573l
    public Bitmap q(HashMap map, Bitmap bitmap) {
        return y(getContext(), AbstractC1573l.s(map, bitmap, this.f17991o));
    }

    public void z(String str) {
        this.f17994r = EnumC1574m.h(str);
        invalidate();
    }
}
