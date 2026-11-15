package com.facebook.react.views.modal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12816a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Point f12817b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Point f12818c = new Point();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Point f12819d = new Point();

    private a() {
    }

    public static final Point a(Context context) {
        k.f(context, "context");
        Object systemService = context.getSystemService("window");
        k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = f12817b;
        Point point2 = f12818c;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = f12819d;
        defaultDisplay.getSize(point3);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen});
        k.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimension = 0;
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z6 && identifier > 0) {
            dimension = (int) resources.getDimension(identifier);
        }
        return point3.x < point3.y ? new Point(point.x, point2.y + dimension) : new Point(point2.x, point.y + dimension);
    }
}
