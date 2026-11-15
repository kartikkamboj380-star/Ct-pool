package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f12284a = new G();

    private G() {
    }

    public static final float a() {
        return C0877h.d().density;
    }

    public static final float b(float f7) {
        return f7 / C0877h.d().density;
    }

    public static final float c(double d7) {
        return d((float) d7);
    }

    public static final float d(float f7) {
        return TypedValue.applyDimension(1, f7, C0877h.d());
    }

    public static final float e(double d7) {
        return h((float) d7, 0.0f, 2, null);
    }

    public static final float f(float f7) {
        return h(f7, 0.0f, 2, null);
    }

    public static final float g(float f7, float f8) {
        DisplayMetrics displayMetricsD = C0877h.d();
        float fApplyDimension = TypedValue.applyDimension(2, f7, displayMetricsD);
        return f8 >= 1.0f ? Math.min(fApplyDimension, f7 * displayMetricsD.density * f8) : fApplyDimension;
    }

    public static /* synthetic */ float h(float f7, float f8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f8 = Float.NaN;
        }
        return g(f7, f8);
    }
}
