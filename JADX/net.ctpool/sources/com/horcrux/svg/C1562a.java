package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* JADX INFO: renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1562a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0240a f17921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SVGLength[] f17922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f17923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f17926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f17927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D f17928h;

    /* JADX INFO: renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    enum EnumC0240a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: renamed from: com.horcrux.svg.a$b */
    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C1562a(EnumC0240a enumC0240a, SVGLength[] sVGLengthArr, b bVar) {
        this.f17921a = enumC0240a;
        this.f17922b = sVGLengthArr;
        this.f17924d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f7;
        float f8;
        if (!this.f17924d) {
            rectF = new RectF(this.f17927g);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.f17924d) {
            f7 = rectF.left;
            f8 = rectF.top;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        return new RectF(f7, f8, fWidth + f7, fHeight + f8);
    }

    private double b(SVGLength sVGLength, double d7, float f7, float f8) {
        return F.a(sVGLength, d7, 0.0d, (this.f17924d && sVGLength.f17819b == SVGLength.UnitType.NUMBER) ? d7 : f7, f8);
    }

    private static void c(ReadableArray readableArray, int i7, float[] fArr, int[] iArr, float f7) {
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = i8 * 2;
            fArr[i8] = (float) readableArray.getDouble(i9);
            iArr[i8] = (readableArray.getInt(i9 + 1) & 16777215) | (Math.round((r1 >>> 24) * f7) << 24);
        }
    }

    void d(b bVar) {
        this.f17925e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    void e(ReadableArray readableArray) {
        this.f17923c = readableArray;
    }

    void f(Matrix matrix) {
        this.f17926f = matrix;
    }

    void g(D d7) {
        this.f17928h = d7;
    }

    void h(Rect rect) {
        this.f17927g = rect;
    }

    void i(Paint paint, RectF rectF, float f7, float f8) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d7;
        RectF rectFA = a(rectF);
        float fWidth = rectFA.width();
        float fHeight = rectFA.height();
        float f9 = rectFA.left;
        float f10 = rectFA.top;
        float textSize = paint.getTextSize();
        if (this.f17921a == EnumC0240a.PATTERN) {
            double d8 = fWidth;
            double dB = b(this.f17922b[0], d8, f7, textSize);
            double d9 = fHeight;
            double dB2 = b(this.f17922b[1], d9, f7, textSize);
            double dB3 = b(this.f17922b[2], d8, f7, textSize);
            double dB4 = b(this.f17922b[3], d9, f7, textSize);
            if (dB3 <= 1.0d || dB4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dB3, (int) dB4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.f17928h.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                RectF rectF2 = new RectF((float) dB, (float) dB2, (float) dB3, (float) dB4);
                D d10 = this.f17928h;
                canvas.concat(j0.a(viewBox, rectF2, d10.f17760B, d10.f17761C));
            }
            if (this.f17925e) {
                canvas.scale(fWidth / f7, fHeight / f7);
            }
            this.f17928h.draw(canvas, new Paint(), f8);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f17926f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f17923c.size();
        if (size == 0) {
            P0.a.G("ReactNative", "Gradient contains no stops");
            return;
        }
        int i7 = size / 2;
        int[] iArr3 = new int[i7];
        float[] fArr3 = new float[i7];
        c(this.f17923c, i7, fArr3, iArr3, f8);
        if (i7 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            P0.a.G("ReactNative", "Gradient contains only one stop");
            iArr = iArr4;
            fArr = fArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0240a enumC0240a = this.f17921a;
        if (enumC0240a == EnumC0240a.LINEAR_GRADIENT) {
            double d11 = fWidth;
            double d12 = f9;
            double dB5 = b(this.f17922b[0], d11, f7, textSize) + d12;
            double d13 = fHeight;
            double d14 = f10;
            LinearGradient linearGradient = new LinearGradient((float) dB5, (float) (b(this.f17922b[1], d13, f7, textSize) + d14), (float) (b(this.f17922b[2], d11, f7, textSize) + d12), (float) (b(this.f17922b[3], d13, f7, textSize) + d14), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f17926f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f17926f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0240a == EnumC0240a.RADIAL_GRADIENT) {
            double d15 = fWidth;
            double dB6 = b(this.f17922b[2], d15, f7, textSize);
            double d16 = fHeight;
            double dB7 = b(this.f17922b[3], d16, f7, textSize);
            if (dB6 <= 0.0d || dB7 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                dB7 = d16;
                d7 = d15;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d7 = dB6;
            }
            double d17 = dB7 / d7;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.f17922b[4], d15, f7, textSize) + ((double) f9)), (float) (b(this.f17922b[5], d16 / d17, f7, textSize) + (((double) f10) / d17)), (float) d7, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d17);
            Matrix matrix5 = this.f17926f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
