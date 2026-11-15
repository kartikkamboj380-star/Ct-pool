package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1569h extends AbstractC1573l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f17976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    EnumC1575n f17977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ReadableArray f17978q;

    /* JADX INFO: renamed from: com.horcrux.svg.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17979a;

        static {
            int[] iArr = new int[EnumC1575n.values().length];
            f17979a = iArr;
            try {
                iArr[EnumC1575n.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17979a[EnumC1575n.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17979a[EnumC1575n.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17979a[EnumC1575n.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C1569h(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(ReadableArray readableArray) {
        this.f17978q = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC1573l
    public Bitmap q(HashMap map, Bitmap bitmap) {
        Bitmap bitmapS = AbstractC1573l.s(map, bitmap, this.f17976o);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i7 = a.f17979a[this.f17977p.ordinal()];
        if (i7 == 1) {
            if (this.f17978q.size() < 20) {
                return bitmapS;
            }
            float[] fArr = new float[this.f17978q.size()];
            for (int i8 = 0; i8 < this.f17978q.size(); i8++) {
                fArr[i8] = ((float) this.f17978q.getDouble(i8)) * (i8 % 5 == 4 ? 255 : 1);
            }
            colorMatrix.set(fArr);
        } else if (i7 == 2) {
            if (this.f17978q.size() != 1) {
                return bitmapS;
            }
            colorMatrix.setSaturation((float) this.f17978q.getDouble(0));
        } else if (i7 == 3) {
            if (this.f17978q.size() != 1) {
                return bitmapS;
            }
            double d7 = (((double) ((float) this.f17978q.getDouble(0))) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d7);
            float fSin = (float) Math.sin(d7);
            float f7 = 0.715f - (fCos * 0.715f);
            float f8 = fSin * 0.715f;
            float f9 = 0.072f - (fCos * 0.072f);
            float f10 = 0.213f - (fCos * 0.213f);
            colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f7 - f8, f9 + (fSin * 0.928f), 0.0f, 0.0f, f10 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f9 - (0.283f * fSin), 0.0f, 0.0f, f10 - (0.787f * fSin), f7 + f8, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        } else if (i7 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapS);
    }

    public void y(String str) {
        this.f17976o = str;
        invalidate();
    }

    public void z(String str) {
        this.f17977p = EnumC1575n.h(str);
        invalidate();
    }
}
