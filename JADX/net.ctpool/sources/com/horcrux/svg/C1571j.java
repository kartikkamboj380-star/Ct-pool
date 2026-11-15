package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1571j extends AbstractC1573l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ReadableArray f18000o;

    public C1571j(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC1573l
    public Bitmap q(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f18000o.size();
        for (int i7 = 0; i7 < size; i7++) {
            String string = this.f18000o.getString(i7);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }

    public void y(ReadableArray readableArray) {
        this.f18000o = readableArray;
        invalidate();
    }
}
