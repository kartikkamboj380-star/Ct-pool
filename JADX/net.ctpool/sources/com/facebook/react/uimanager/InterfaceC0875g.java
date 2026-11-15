package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: renamed from: com.facebook.react.uimanager.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0875g {
    void setAccessibilityActions(View view, ReadableArray readableArray);

    void setAccessibilityCollection(View view, ReadableMap readableMap);

    void setAccessibilityCollectionItem(View view, ReadableMap readableMap);

    void setAccessibilityHint(View view, String str);

    void setAccessibilityLabel(View view, String str);

    void setAccessibilityLabelledBy(View view, Dynamic dynamic);

    void setAccessibilityLiveRegion(View view, String str);

    void setAccessibilityRole(View view, String str);

    void setBackgroundColor(View view, int i7);

    void setBorderBottomLeftRadius(View view, float f7);

    void setBorderBottomRightRadius(View view, float f7);

    void setBorderRadius(View view, float f7);

    void setBorderTopLeftRadius(View view, float f7);

    void setBorderTopRightRadius(View view, float f7);

    void setElevation(View view, float f7);

    void setImportantForAccessibility(View view, String str);

    void setNativeId(View view, String str);

    void setOpacity(View view, float f7);

    void setRenderToHardwareTexture(View view, boolean z6);

    void setRole(View view, String str);

    void setRotation(View view, float f7);

    void setScaleX(View view, float f7);

    void setScaleY(View view, float f7);

    void setShadowColor(View view, int i7);

    void setTestId(View view, String str);

    void setTransform(View view, ReadableArray readableArray);

    void setTransformOrigin(View view, ReadableArray readableArray);

    void setTranslateX(View view, float f7);

    void setTranslateY(View view, float f7);

    void setViewState(View view, ReadableMap readableMap);

    void setZIndex(View view, float f7);
}
