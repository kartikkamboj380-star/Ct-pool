package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.H;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.e;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactScrollViewManager.REACT_CLASS)
public class ReactScrollViewManager extends ViewGroupManager<c> implements e.a {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private K2.a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return S1.f.a().b(h.h(h.f12991p), S1.f.d("registrationName", "onScroll")).b(h.h(h.f12989n), S1.f.d("registrationName", "onScrollBeginDrag")).b(h.h(h.f12990o), S1.f.d("registrationName", "onScrollEndDrag")).b(h.h(h.f12992q), S1.f.d("registrationName", "onMomentumScrollBegin")).b(h.h(h.f12993r), S1.f.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void flashScrollIndicators(c cVar) {
        cVar.p();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollTo(c cVar, e.b bVar) {
        cVar.k();
        if (bVar.f12958c) {
            cVar.c(bVar.f12956a, bVar.f12957b);
        } else {
            cVar.scrollTo(bVar.f12956a, bVar.f12957b);
        }
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollToEnd(c cVar, e.c cVar2) {
        View childAt = cVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + cVar.getPaddingBottom();
        cVar.k();
        if (cVar2.f12959a) {
            cVar.c(cVar.getScrollX(), height);
        } else {
            cVar.scrollTo(cVar.getScrollX(), height);
        }
    }

    @InterfaceC2219b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(c cVar, int i7, Integer num) {
        cVar.C(SPACING_TYPES[i7], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(c cVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        if (i7 == 0) {
            cVar.setBorderRadius(f7);
        } else {
            cVar.D(f7, i7 - 1);
        }
    }

    @InterfaceC2218a(name = "borderStyle")
    public void setBorderStyle(c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(c cVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        cVar.E(SPACING_TYPES[i7], f7);
    }

    @InterfaceC2218a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(c cVar, int i7) {
        cVar.setEndFillColor(i7);
    }

    @InterfaceC2218a(customType = "Point", name = "contentOffset")
    public void setContentOffset(c cVar, ReadableMap readableMap) {
        cVar.setContentOffset(readableMap);
    }

    @InterfaceC2218a(name = "decelerationRate")
    public void setDecelerationRate(c cVar, float f7) {
        cVar.setDecelerationRate(f7);
    }

    @InterfaceC2218a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(c cVar, boolean z6) {
        cVar.setDisableIntervalMomentum(z6);
    }

    @InterfaceC2218a(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(c cVar, boolean z6) {
        cVar.setEnableSyncOnScroll(z6);
    }

    @InterfaceC2218a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(c cVar, int i7) {
        if (i7 > 0) {
            cVar.setVerticalFadingEdgeEnabled(true);
        } else {
            i7 = 0;
            cVar.setVerticalFadingEdgeEnabled(false);
        }
        cVar.setFadingEdgeLength(i7);
    }

    @InterfaceC2218a(name = "horizontal")
    public void setHorizontal(c cVar, boolean z6) {
    }

    @InterfaceC2218a(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(c cVar, boolean z6) {
        cVar.setVerticalScrollbarPosition(z6 ? 1 : 0);
    }

    @InterfaceC2218a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(c cVar, ReadableMap readableMap) {
        cVar.setMaintainVisibleContentPosition(readableMap != null ? a.b.a(readableMap) : null);
    }

    @InterfaceC2218a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(c cVar, boolean z6) {
        H.B0(cVar, z6);
    }

    @InterfaceC2218a(name = "overScrollMode")
    public void setOverScrollMode(c cVar, String str) {
        cVar.setOverScrollMode(f.l(str));
    }

    @InterfaceC2218a(name = "overflow")
    public void setOverflow(c cVar, String str) {
        cVar.setOverflow(str);
    }

    @InterfaceC2218a(name = "pagingEnabled")
    public void setPagingEnabled(c cVar, boolean z6) {
        cVar.setPagingEnabled(z6);
    }

    @InterfaceC2218a(name = "persistentScrollbar")
    public void setPersistentScrollbar(c cVar, boolean z6) {
        cVar.setScrollbarFadingEnabled(!z6);
    }

    @InterfaceC2218a(name = "pointerEvents")
    public void setPointerEvents(c cVar, String str) {
        cVar.setPointerEvents(com.facebook.react.uimanager.H.k(str));
    }

    @InterfaceC2218a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(c cVar, boolean z6) {
        cVar.setRemoveClippedSubviews(z6);
    }

    @InterfaceC2218a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(c cVar, boolean z6) {
        cVar.setScrollEnabled(z6);
        cVar.setFocusable(z6);
    }

    @InterfaceC2218a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(c cVar, int i7) {
        cVar.setScrollEventThrottle(i7);
    }

    @InterfaceC2218a(name = "scrollPerfTag")
    public void setScrollPerfTag(c cVar, String str) {
        cVar.setScrollPerfTag(str);
    }

    @InterfaceC2218a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(c cVar, boolean z6) {
        cVar.setSendMomentumEvents(z6);
    }

    @InterfaceC2218a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(c cVar, boolean z6) {
        cVar.setVerticalScrollBarEnabled(z6);
    }

    @InterfaceC2218a(name = "snapToAlignment")
    public void setSnapToAlignment(c cVar, String str) {
        cVar.setSnapToAlignment(f.m(str));
    }

    @InterfaceC2218a(name = "snapToEnd")
    public void setSnapToEnd(c cVar, boolean z6) {
        cVar.setSnapToEnd(z6);
    }

    @InterfaceC2218a(name = "snapToInterval")
    public void setSnapToInterval(c cVar, float f7) {
        cVar.setSnapInterval((int) (f7 * G.a()));
    }

    @InterfaceC2218a(name = "snapToOffsets")
    public void setSnapToOffsets(c cVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            cVar.setSnapOffsets(null);
            return;
        }
        float fA = G.a();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i7) * ((double) fA))));
        }
        cVar.setSnapOffsets(arrayList);
    }

    @InterfaceC2218a(name = "snapToStart")
    public void setSnapToStart(c cVar, boolean z6) {
        cVar.setSnapToStart(z6);
    }

    public ReactScrollViewManager(K2.a aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(C0872e0 c0872e0) {
        return new c(c0872e0, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(c cVar, W w6, InterfaceC0870d0 interfaceC0870d0) {
        cVar.setStateWrapper(interfaceC0870d0);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, int i7, ReadableArray readableArray) {
        e.b(this, cVar, i7, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, String str, ReadableArray readableArray) {
        e.c(this, cVar, str, readableArray);
    }
}
