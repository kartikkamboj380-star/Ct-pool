package com.facebook.react.views.view;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0897x;
import com.facebook.react.uimanager.EnumC0898y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import i2.InterfaceC1741a;
import java.util.Map;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactViewManager.REACT_CLASS)
public class ReactViewManager extends ReactClippingViewManager<i> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ i f13242m;

        a(i iVar) {
            this.f13242m = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) this.f13242m.getContext(), this.f13242m.getId());
            if (eVarC == null) {
                return;
            }
            eVarC.c(new j(AbstractC0884k0.e(this.f13242m.getContext()), this.f13242m.getId()));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13244a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f13244a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13244a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13244a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactViewManager() {
        setupViewRecycling();
    }

    private void handleHotspotUpdate(i iVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        iVar.drawableHotspotChanged(G.c(readableArray.getDouble(0)), G.c(readableArray.getDouble(1)));
    }

    private void handleSetPressed(i iVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        iVar.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return S1.f.e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC2218a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(i iVar, int i7) {
        iVar.setNextFocusDownId(i7);
    }

    @InterfaceC2218a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(i iVar, int i7) {
        iVar.setNextFocusForwardId(i7);
    }

    @InterfaceC2218a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(i iVar, int i7) {
        iVar.setNextFocusLeftId(i7);
    }

    @InterfaceC2218a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(i iVar, int i7) {
        iVar.setNextFocusRightId(i7);
    }

    @InterfaceC2218a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(i iVar, int i7) {
        iVar.setNextFocusUpId(i7);
    }

    @InterfaceC2218a(name = "accessible")
    public void setAccessible(i iVar, boolean z6) {
        iVar.setFocusable(z6);
    }

    @InterfaceC2218a(name = "backfaceVisibility")
    public void setBackfaceVisibility(i iVar, String str) {
        iVar.setBackfaceVisibility(str);
    }

    @InterfaceC2219b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(i iVar, int i7, Integer num) {
        iVar.setBorderColor(SPACING_TYPES[i7], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    public void setBorderRadius(i iVar, int i7, float f7) {
        setBorderRadius(iVar, i7, new DynamicFromObject(Float.valueOf(f7)));
    }

    @InterfaceC2218a(name = "borderStyle")
    public void setBorderStyle(i iVar, String str) {
        iVar.setBorderStyle(str);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(i iVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7) && f7 < 0.0f) {
            f7 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        iVar.setBorderWidth(SPACING_TYPES[i7], f7);
    }

    @InterfaceC2218a(name = "collapsable")
    public void setCollapsable(i iVar, boolean z6) {
    }

    @InterfaceC2218a(name = "collapsableChildren")
    public void setCollapsableChildren(i iVar, boolean z6) {
    }

    @InterfaceC2218a(name = "focusable")
    public void setFocusable(i iVar, boolean z6) {
        if (z6) {
            iVar.setOnClickListener(new a(iVar));
            iVar.setFocusable(true);
        } else {
            iVar.setOnClickListener(null);
            iVar.setClickable(false);
        }
    }

    @InterfaceC2218a(name = "hitSlop")
    public void setHitSlop(i iVar, Dynamic dynamic) {
        Rect rect;
        int i7 = b.f13244a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            rect = new Rect(readableMapAsMap.hasKey("left") ? (int) G.c(readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) G.c(readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) G.c(readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) G.c(readableMapAsMap.getDouble("bottom")) : 0);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    P0.a.G("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
                }
                iVar.setHitSlopRect(null);
                return;
            }
            int iC = (int) G.c(dynamic.asDouble());
            rect = new Rect(iC, iC, iC, iC);
        }
        iVar.setHitSlopRect(rect);
    }

    @InterfaceC2218a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(i iVar, ReadableMap readableMap) {
        iVar.setTranslucentBackgroundDrawable(readableMap == null ? null : f.a(iVar.getContext(), readableMap));
    }

    @InterfaceC2218a(name = "nativeForegroundAndroid")
    public void setNativeForeground(i iVar, ReadableMap readableMap) {
        iVar.setForeground(readableMap == null ? null : f.a(iVar.getContext(), readableMap));
    }

    @InterfaceC2218a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(i iVar, boolean z6) {
        iVar.setNeedsOffscreenAlphaCompositing(z6);
    }

    @InterfaceC2218a(name = "overflow")
    public void setOverflow(i iVar, String str) {
        iVar.setOverflow(str);
    }

    @InterfaceC2218a(name = "pointerEvents")
    public void setPointerEvents(i iVar, String str) {
        iVar.setPointerEvents(H.k(str));
    }

    @InterfaceC2218a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(i iVar, boolean z6) {
        if (z6) {
            iVar.setFocusable(true);
            iVar.setFocusableInTouchMode(true);
            iVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(C0872e0 c0872e0) {
        return new i(c0872e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public i prepareToRecycleView(C0872e0 c0872e0, i iVar) {
        super.prepareToRecycleView(c0872e0, iVar);
        iVar.recycleView();
        return iVar;
    }

    @InterfaceC2219b(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(i iVar, int i7, Dynamic dynamic) {
        C0897x c0897xC = C0897x.c(dynamic);
        if (C2239a.c(iVar) != 2 && c0897xC != null && c0897xC.a() == EnumC0898y.f12741n) {
            c0897xC = null;
        }
        iVar.setBorderRadius(C2.a.values()[i7], c0897xC);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
    public void setOpacity(i iVar, float f7) {
        iVar.setOpacityIfPossible(f7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(i iVar, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty(iVar, readableArray, readableArray2);
        iVar.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(i iVar, int i7, ReadableArray readableArray) {
        if (i7 == 1) {
            handleHotspotUpdate(iVar, readableArray);
        } else {
            if (i7 != 2) {
                return;
            }
            handleSetPressed(iVar, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(i iVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(iVar, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(iVar, readableArray);
        }
    }
}
