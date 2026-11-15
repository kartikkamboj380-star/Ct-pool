package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.react.uimanager.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0864a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0864a0 f12483a = new C0864a0();

    private C0864a0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Z a(View view) {
        w5.k.f(view, "reactView");
        View view2 = view;
        while (!(view2 instanceof Z)) {
            Object parent = view2.getParent();
            if (parent == null) {
                return null;
            }
            O1.a.a(parent instanceof View);
            view2 = (View) parent;
        }
        return (Z) view2;
    }

    public static final Point b(View view) {
        w5.k.f(view, "v");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
