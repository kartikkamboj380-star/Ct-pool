package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: renamed from: com.facebook.react.uimanager.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0891q extends r {
    void addView(View view, View view2, int i7);

    View getChildAt(View view, int i7);

    int getChildCount(View view);

    default void removeAllViews(View view) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount(view) - 1; childCount >= 0; childCount--) {
            removeViewAt(view, childCount);
        }
    }

    void removeViewAt(View view, int i7);
}
