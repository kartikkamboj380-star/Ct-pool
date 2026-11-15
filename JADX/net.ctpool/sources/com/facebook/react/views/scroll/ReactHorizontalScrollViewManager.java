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
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<b> implements e.a {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private K2.a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void flashScrollIndicators(b bVar) {
        bVar.r();
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
    public void scrollTo(b bVar, e.b bVar2) {
        bVar.k();
        if (bVar2.f12958c) {
            bVar.c(bVar2.f12956a, bVar2.f12957b);
        } else {
            bVar.scrollTo(bVar2.f12956a, bVar2.f12957b);
        }
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollToEnd(b bVar, e.c cVar) {
        View childAt = bVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + bVar.getPaddingRight();
        bVar.k();
        if (cVar.f12959a) {
            bVar.c(width, bVar.getScrollY());
        } else {
            bVar.scrollTo(width, bVar.getScrollY());
        }
    }

    @InterfaceC2219b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(b bVar, int i7, Integer num) {
        bVar.G(SPACING_TYPES[i7], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(b bVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        if (i7 == 0) {
            bVar.setBorderRadius(f7);
        } else {
            bVar.H(f7, i7 - 1);
        }
    }

    @InterfaceC2218a(name = "borderStyle")
    public void setBorderStyle(b bVar, String str) {
        bVar.setBorderStyle(str);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(b bVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        bVar.I(SPACING_TYPES[i7], f7);
    }

    @InterfaceC2218a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(b bVar, int i7) {
        bVar.setEndFillColor(i7);
    }

    @InterfaceC2218a(name = "contentOffset")
    public void setContentOffset(b bVar, ReadableMap readableMap) {
        if (readableMap != null) {
            bVar.scrollTo((int) G.c(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) G.c(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            bVar.scrollTo(0, 0);
        }
    }

    @InterfaceC2218a(name = "decelerationRate")
    public void setDecelerationRate(b bVar, float f7) {
        bVar.setDecelerationRate(f7);
    }

    @InterfaceC2218a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(b bVar, boolean z6) {
        bVar.setDisableIntervalMomentum(z6);
    }

    @InterfaceC2218a(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(b bVar, boolean z6) {
        bVar.setEnableSyncOnScroll(z6);
    }

    @InterfaceC2218a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(b bVar, int i7) {
        if (i7 > 0) {
            bVar.setHorizontalFadingEdgeEnabled(true);
        } else {
            i7 = 0;
            bVar.setHorizontalFadingEdgeEnabled(false);
        }
        bVar.setFadingEdgeLength(i7);
    }

    @InterfaceC2218a(name = "horizontal")
    public void setHorizontal(b bVar, boolean z6) {
    }

    @InterfaceC2218a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(b bVar, ReadableMap readableMap) {
        bVar.setMaintainVisibleContentPosition(readableMap != null ? a.b.a(readableMap) : null);
    }

    @InterfaceC2218a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(b bVar, boolean z6) {
        H.B0(bVar, z6);
    }

    @InterfaceC2218a(name = "overScrollMode")
    public void setOverScrollMode(b bVar, String str) {
        bVar.setOverScrollMode(f.l(str));
    }

    @InterfaceC2218a(name = "overflow")
    public void setOverflow(b bVar, String str) {
        bVar.setOverflow(str);
    }

    @InterfaceC2218a(name = "pagingEnabled")
    public void setPagingEnabled(b bVar, boolean z6) {
        bVar.setPagingEnabled(z6);
    }

    @InterfaceC2218a(name = "persistentScrollbar")
    public void setPersistentScrollbar(b bVar, boolean z6) {
        bVar.setScrollbarFadingEnabled(!z6);
    }

    @InterfaceC2218a(name = "pointerEvents")
    public void setPointerEvents(b bVar, String str) {
        bVar.setPointerEvents(com.facebook.react.uimanager.H.k(str));
    }

    @InterfaceC2218a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(b bVar, boolean z6) {
        bVar.setRemoveClippedSubviews(z6);
    }

    @InterfaceC2218a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(b bVar, boolean z6) {
        bVar.setScrollEnabled(z6);
    }

    @InterfaceC2218a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(b bVar, int i7) {
        bVar.setScrollEventThrottle(i7);
    }

    @InterfaceC2218a(name = "scrollPerfTag")
    public void setScrollPerfTag(b bVar, String str) {
        bVar.setScrollPerfTag(str);
    }

    @InterfaceC2218a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(b bVar, boolean z6) {
        bVar.setSendMomentumEvents(z6);
    }

    @InterfaceC2218a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(b bVar, boolean z6) {
        bVar.setHorizontalScrollBarEnabled(z6);
    }

    @InterfaceC2218a(name = "snapToAlignment")
    public void setSnapToAlignment(b bVar, String str) {
        bVar.setSnapToAlignment(f.m(str));
    }

    @InterfaceC2218a(name = "snapToEnd")
    public void setSnapToEnd(b bVar, boolean z6) {
        bVar.setSnapToEnd(z6);
    }

    @InterfaceC2218a(name = "snapToInterval")
    public void setSnapToInterval(b bVar, float f7) {
        bVar.setSnapInterval((int) (f7 * G.a()));
    }

    @InterfaceC2218a(name = "snapToOffsets")
    public void setSnapToOffsets(b bVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            bVar.setSnapOffsets(null);
            return;
        }
        float fA = G.a();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i7) * ((double) fA))));
        }
        bVar.setSnapOffsets(arrayList);
    }

    @InterfaceC2218a(name = "snapToStart")
    public void setSnapToStart(b bVar, boolean z6) {
        bVar.setSnapToStart(z6);
    }

    public ReactHorizontalScrollViewManager(K2.a aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(C0872e0 c0872e0) {
        return new b(c0872e0, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(b bVar, W w6, InterfaceC0870d0 interfaceC0870d0) {
        bVar.setStateWrapper(interfaceC0870d0);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, int i7, ReadableArray readableArray) {
        e.b(this, bVar, i7, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, String str, ReadableArray readableArray) {
        e.c(this, bVar, str, readableArray);
    }
}
