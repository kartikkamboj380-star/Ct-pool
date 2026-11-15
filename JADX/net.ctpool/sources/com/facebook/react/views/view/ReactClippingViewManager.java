package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.i;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactClippingViewManager<T extends i> extends ViewGroupManager<T> {
    @InterfaceC2218a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t6, boolean z6) {
        UiThreadUtil.assertOnUiThread();
        t6.setRemoveClippedSubviews(z6);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public void removeAllViews(T t6) {
        UiThreadUtil.assertOnUiThread();
        if (t6.getRemoveClippedSubviews()) {
            t6.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t6.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(T t6, View view, int i7) {
        UiThreadUtil.assertOnUiThread();
        if (t6.getRemoveClippedSubviews()) {
            t6.addViewWithSubviewClippingEnabled(view, i7);
        } else {
            t6.addView(view, i7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(T t6, int i7) {
        return t6.getRemoveClippedSubviews() ? t6.getChildAtWithSubviewClippingEnabled(i7) : t6.getChildAt(i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(T t6) {
        return t6.getRemoveClippedSubviews() ? t6.getAllChildrenCount() : t6.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(T t6, int i7) {
        UiThreadUtil.assertOnUiThread();
        if (!t6.getRemoveClippedSubviews()) {
            t6.removeViewAt(i7);
            return;
        }
        View childAt = getChildAt((i) t6, i7);
        if (childAt != null) {
            if (childAt.getParent() != null) {
                t6.removeView(childAt);
            }
            t6.removeViewWithSubviewClippingEnabled(childAt);
        }
    }
}
