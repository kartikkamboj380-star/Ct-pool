package com.horcrux.svg;

import F2.k0;
import F2.l0;
import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
class SvgViewManager extends ReactViewManager implements l0 {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final A0 mDelegate = new k0(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17848a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f17848a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17848a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17848a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static SvgView getSvgViewByTag(int i7) {
        return mTagToSvgView.get(i7);
    }

    static void runWhenViewIsAvailable(int i7, Runnable runnable) {
        mTagToRunnable.put(i7, runnable);
    }

    static void setSvgView(int i7, SvgView svgView) {
        mTagToSvgView.put(i7, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i7);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.i createViewInstance(C0872e0 c0872e0) {
        return new SvgView(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.i iVar) {
        super.onDropViewInstance(iVar);
        mTagToSvgView.remove(iVar.getId());
    }

    @Override // F2.l0
    public void setAccessible(SvgView svgView, boolean z6) {
        super.setAccessible((com.facebook.react.views.view.i) svgView, z6);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // F2.l0
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((com.facebook.react.views.view.i) svgView, str);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // F2.l0
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // F2.l0
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // F2.l0
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // F2.l0
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // F2.l0
    public void setBorderBottomEndRadius(SvgView svgView, float f7) {
        super.setBorderRadius(svgView, 8, f7);
    }

    @Override // F2.l0
    public void setBorderBottomLeftRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 4, (float) d7);
    }

    @Override // F2.l0
    public void setBorderBottomRightRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 3, (float) d7);
    }

    @Override // F2.l0
    public void setBorderBottomStartRadius(SvgView svgView, float f7) {
        super.setBorderRadius(svgView, 7, f7);
    }

    @Override // F2.l0
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // F2.l0
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // F2.l0
    public void setBorderEndEndRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 9, (float) d7);
    }

    @Override // F2.l0
    public void setBorderEndStartRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 10, (float) d7);
    }

    @Override // F2.l0
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // F2.l0
    public void setBorderRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 0, (float) d7);
    }

    @Override // F2.l0
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // F2.l0
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // F2.l0
    public void setBorderStartEndRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 11, (float) d7);
    }

    @Override // F2.l0
    public void setBorderStartStartRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 12, (float) d7);
    }

    @Override // F2.l0
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((com.facebook.react.views.view.i) svgView, str);
    }

    @Override // F2.l0
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // F2.l0
    public void setBorderTopEndRadius(SvgView svgView, float f7) {
        super.setBorderRadius(svgView, 6, f7);
    }

    @Override // F2.l0
    public void setBorderTopLeftRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 1, (float) d7);
    }

    @Override // F2.l0
    public void setBorderTopRightRadius(SvgView svgView, double d7) {
        super.setBorderRadius(svgView, 2, (float) d7);
    }

    @Override // F2.l0
    public void setBorderTopStartRadius(SvgView svgView, float f7) {
        super.setBorderRadius(svgView, 5, f7);
    }

    @Override // F2.l0
    @InterfaceC2218a(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @Override // F2.l0
    public void setFocusable(SvgView svgView, boolean z6) {
        super.setFocusable((com.facebook.react.views.view.i) svgView, z6);
    }

    @Override // F2.l0
    public void setHasTVPreferredFocus(SvgView svgView, boolean z6) {
        super.setTVPreferredFocus(svgView, z6);
    }

    @Override // F2.l0
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        Rect rect;
        int i7 = a.f17848a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            rect = new Rect(readableMapAsMap.hasKey("left") ? (int) com.facebook.react.uimanager.G.c(readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) com.facebook.react.uimanager.G.c(readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) com.facebook.react.uimanager.G.c(readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) com.facebook.react.uimanager.G.c(readableMapAsMap.getDouble("bottom")) : 0);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    P0.a.G("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
                }
                svgView.setHitSlopRect(null);
                return;
            }
            int iC = (int) com.facebook.react.uimanager.G.c(dynamic.asDouble());
            rect = new Rect(iC, iC, iC, iC);
        }
        svgView.setHitSlopRect(rect);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i7) {
        svgView.setMeetOrSlice(i7);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "minX")
    public void setMinX(SvgView svgView, float f7) {
        svgView.setMinX(f7);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "minY")
    public void setMinY(SvgView svgView, float f7) {
        svgView.setMinY(f7);
    }

    @Override // F2.l0
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // F2.l0
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // F2.l0
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z6) {
        super.setNeedsOffscreenAlphaCompositing((com.facebook.react.views.view.i) svgView, z6);
    }

    @Override // F2.l0
    public void setNextFocusDown(SvgView svgView, int i7) {
        super.nextFocusDown(svgView, i7);
    }

    @Override // F2.l0
    public void setNextFocusForward(SvgView svgView, int i7) {
        super.nextFocusForward(svgView, i7);
    }

    @Override // F2.l0
    public void setNextFocusLeft(SvgView svgView, int i7) {
        super.nextFocusLeft(svgView, i7);
    }

    @Override // F2.l0
    public void setNextFocusRight(SvgView svgView, int i7) {
        super.nextFocusRight(svgView, i7);
    }

    @Override // F2.l0
    public void setNextFocusUp(SvgView svgView, int i7) {
        super.nextFocusUp(svgView, i7);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", com.facebook.react.uimanager.H.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, com.facebook.react.uimanager.H.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            e7.printStackTrace();
        }
    }

    @Override // F2.l0
    public void setRemoveClippedSubviews(SvgView svgView, boolean z6) {
        super.setRemoveClippedSubviews(svgView, z6);
    }

    @Override // F2.l0
    @InterfaceC2218a(customType = "Color", name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f7) {
        svgView.setVbHeight(f7);
    }

    @Override // F2.l0
    @InterfaceC2218a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f7) {
        svgView.setVbWidth(f7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.i iVar, Object obj) {
        super.updateExtraData(iVar, obj);
        iVar.invalidate();
    }
}
