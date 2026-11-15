package com.facebook.react.uimanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

/* JADX INFO: renamed from: com.facebook.react.uimanager.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0877h f12601a = new C0877h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static DisplayMetrics f12602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DisplayMetrics f12603c;

    private C0877h() {
    }

    public static final WritableMap a(double d7) {
        if (f12602b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics".toString());
        }
        if (f12603c == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics".toString());
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        C0877h c0877h = f12601a;
        DisplayMetrics displayMetrics = f12602b;
        w5.k.d(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", c0877h.b(displayMetrics, d7));
        DisplayMetrics displayMetrics2 = f12603c;
        w5.k.d(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", c0877h.b(displayMetrics2, d7));
        return writableNativeMap;
    }

    private final WritableMap b(DisplayMetrics displayMetrics, double d7) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d7);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = f12603c;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics".toString());
        }
        w5.k.d(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final DisplayMetrics d() {
        DisplayMetrics displayMetrics = f12602b;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics".toString());
        }
        w5.k.d(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final void e(Context context) {
        w5.k.f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f12602b = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        w5.k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        f12603c = displayMetrics2;
    }

    public static final void f(Context context) {
        w5.k.f(context, "context");
        if (f12603c != null) {
            return;
        }
        e(context);
    }
}
