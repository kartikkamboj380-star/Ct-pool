package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
abstract class j0 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Matrix a(RectF rectF, RectF rectF2, String str, int i7) {
        double dMin;
        double d7;
        double d8 = rectF.left;
        double d9 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d10 = rectF2.left;
        double d11 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d12 = dHeight2 / dHeight;
        double d13 = d10 - (d8 * dMax);
        double d14 = d11 - (d9 * d12);
        if (i7 == 2) {
            dMin = Math.min(dMax, d12);
            if (dMin > 1.0d) {
                d13 -= ((dWidth2 / dMin) - dWidth) / 2.0d;
                d7 = (dHeight2 / dMin) - dHeight;
            } else {
                d13 -= (dWidth2 - (dWidth * dMin)) / 2.0d;
                d7 = dHeight2 - (dHeight * dMin);
            }
            d14 -= d7 / 2.0d;
            d12 = dMin;
        } else {
            if (str.equals("none") || i7 != 0) {
                if (!str.equals("none") && i7 == 1) {
                    dMax = Math.max(dMax, d12);
                }
                if (str.contains("xMid")) {
                    d13 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d13 += dWidth2 - (dWidth * dMax);
                }
                if (str.contains("YMid")) {
                    d14 += (dHeight2 - (dHeight * d12)) / 2.0d;
                }
                if (str.contains("YMax")) {
                    d14 += dHeight2 - (dHeight * d12);
                }
                dMin = dMax;
            } else {
                dMax = Math.min(dMax, d12);
            }
            d12 = dMax;
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            if (str.contains("YMid")) {
            }
            if (str.contains("YMax")) {
            }
            dMin = dMax;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d13, (float) d14);
        matrix.preScale((float) dMin, (float) d12);
        return matrix;
    }
}
