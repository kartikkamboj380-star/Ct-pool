package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, C0895v> implements InterfaceC0891q {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super(null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i7) {
        mZIndexHash.put(view, Integer.valueOf(i7));
    }

    public void addViews(T t6, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            addView((ViewGroup) t6, list.get(i7), i7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance() {
        return new C0895v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C0895v> getShadowNodeClass() {
        return C0895v.class;
    }

    @Override // com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(T t6, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i7 = 0; i7 < getChildCount((ViewGroup) t6); i7++) {
            if (getChildAt((ViewGroup) t6, i7) == view) {
                removeViewAt((ViewGroup) t6, i7);
                return;
            }
        }
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0891q
    public void addView(T t6, View view, int i7) {
        t6.addView(view, i7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0891q
    public View getChildAt(T t6, int i7) {
        return t6.getChildAt(i7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0891q
    public int getChildCount(T t6) {
        return t6.getChildCount();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0891q
    public void removeViewAt(T t6, int i7) {
        UiThreadUtil.assertOnUiThread();
        t6.removeViewAt(i7);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t6, Object obj) {
    }
}
