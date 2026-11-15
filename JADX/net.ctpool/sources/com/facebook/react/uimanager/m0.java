package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class m0 {
    static Map a() {
        return S1.f.a().b("topChange", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(com.facebook.react.uimanager.events.s.h(com.facebook.react.uimanager.events.s.f12583o), S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(com.facebook.react.uimanager.events.s.h(com.facebook.react.uimanager.events.s.f12585q), S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(com.facebook.react.uimanager.events.s.h(com.facebook.react.uimanager.events.s.f12584p), S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(com.facebook.react.uimanager.events.s.h(com.facebook.react.uimanager.events.s.f12586r), S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map b() {
        HashMap mapB = S1.f.b();
        mapB.put("UIView", S1.f.d("ContentMode", S1.f.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        mapB.put("StyleConstants", S1.f.d("PointerEventsValues", S1.f.g("none", Integer.valueOf(H.f12290n.ordinal()), "boxNone", Integer.valueOf(H.f12291o.ordinal()), "boxOnly", Integer.valueOf(H.f12292p.ordinal()), "unspecified", Integer.valueOf(H.f12293q.ordinal()))));
        mapB.put("AccessibilityEventTypes", S1.f.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return mapB;
    }

    static Map c() {
        return S1.f.a().b("topContentSizeChange", S1.f.d("registrationName", "onContentSizeChange")).b("topLayout", S1.f.d("registrationName", "onLayout")).b("topLoadingError", S1.f.d("registrationName", "onLoadingError")).b("topLoadingFinish", S1.f.d("registrationName", "onLoadingFinish")).b("topLoadingStart", S1.f.d("registrationName", "onLoadingStart")).b("topSelectionChange", S1.f.d("registrationName", "onSelectionChange")).b("topMessage", S1.f.d("registrationName", "onMessage")).b("topScrollBeginDrag", S1.f.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", S1.f.d("registrationName", "onScrollEndDrag")).b("topScroll", S1.f.d("registrationName", "onScroll")).b("topMomentumScrollBegin", S1.f.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", S1.f.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
