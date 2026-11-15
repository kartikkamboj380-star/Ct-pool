package com.facebook.react.uimanager;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public interface K {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void updateClippingRect();
}
