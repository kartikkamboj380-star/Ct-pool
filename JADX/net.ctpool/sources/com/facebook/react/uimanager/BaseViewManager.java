package com.facebook.react.uimanager;

import S1.f;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.AbstractC0834q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.C0899z;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.events.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends C0895v> extends ViewManager<T, C> implements InterfaceC0875g, View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final C0899z.a sMatrixDecompositionContext = new C0899z.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    public BaseViewManager() {
        super(null);
    }

    private void applyFilter(T t6, ReadableArray readableArray) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            t6.setRenderEffect(null);
        }
        Boolean bool = (Boolean) t6.getTag(AbstractC0831n.f11969A);
        t6.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
        if (readableArray == null) {
            return;
        }
        if (C0888n.s(readableArray)) {
            Paint paint = new Paint();
            paint.setColorFilter(C0888n.t(readableArray));
            t6.setLayerType(2, paint);
        } else if (i7 >= 31) {
            t6.setRenderEffect(C0888n.u(readableArray));
        }
    }

    private void logUnsupportedPropertyWarning(String str) {
        P0.a.I("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f7) {
        if (f7 >= -3.4028235E38f && f7 <= Float.MAX_VALUE) {
            return f7;
        }
        if (f7 < -3.4028235E38f || f7 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f7 > Float.MAX_VALUE || f7 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f7)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f7);
    }

    private static void setPointerEventsFlag(View view, o.b bVar, boolean z6) {
        Integer num = (Integer) view.getTag(AbstractC0831n.f11986p);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << bVar.ordinal();
        view.setTag(AbstractC0831n.f11986p, Integer.valueOf(z6 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewAccessibility(T t6) {
        I.k0(t6, t6.isFocusable(), t6.getImportantForAccessibility());
    }

    private void updateViewContentDescription(T t6) {
        Dynamic dynamic;
        Context context;
        int i7;
        String str = (String) t6.getTag(AbstractC0831n.f11975e);
        ReadableMap readableMap = (ReadableMap) t6.getTag(AbstractC0831n.f11978h);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t6.getTag(AbstractC0831n.f11980j);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    context = t6.getContext();
                    i7 = AbstractC0834q.f12009F;
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    context = t6.getContext();
                    i7 = AbstractC0834q.f12008E;
                }
                arrayList.add(context.getString(i7));
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t6.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        f.a aVarB = S1.f.a().b("topPointerCancel", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(aVarB.b("topPointerEnter", S1.f.d("phasedRegistrationNames", S1.f.f("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", S1.f.d("phasedRegistrationNames", S1.f.f("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onClick", "captured", "onClickCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S1.f.a().b("topAccessibilityAction", S1.f.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t6) {
        super.onAfterUpdateTransaction(t6);
        updateViewAccessibility(t6);
        Boolean bool = (Boolean) t6.getTag(AbstractC0831n.f11983m);
        if (bool != null && bool.booleanValue()) {
            t6.addOnLayoutChangeListener(this);
            setTransformProperty(t6, (ReadableArray) t6.getTag(AbstractC0831n.f11995y), (ReadableArray) t6.getTag(AbstractC0831n.f11996z));
            t6.setTag(AbstractC0831n.f11983m, Boolean.FALSE);
        }
        Boolean bool2 = (Boolean) t6.getTag(AbstractC0831n.f11969A);
        if (bool2 != null) {
            t6.setLayerType(bool2.booleanValue() ? 2 : 0, null);
        }
        applyFilter(t6, (ReadableArray) t6.getTag(AbstractC0831n.f11981k));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i11;
        int i16 = i9 - i7;
        if (i10 - i8 == i14 - i12 && i16 == i15) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC0831n.f11996z);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(AbstractC0831n.f11995y);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(C0872e0 c0872e0, T t6) {
        t6.setTag(null);
        t6.setTag(AbstractC0831n.f11986p, null);
        t6.setTag(AbstractC0831n.f11987q, null);
        t6.setTag(AbstractC0831n.f11970B, null);
        t6.setTag(AbstractC0831n.f11984n, null);
        t6.setTag(AbstractC0831n.f11975e, null);
        t6.setTag(AbstractC0831n.f11974d, null);
        t6.setTag(AbstractC0831n.f11977g, null);
        t6.setTag(AbstractC0831n.f11978h, null);
        t6.setTag(AbstractC0831n.f11971a, null);
        t6.setTag(AbstractC0831n.f11980j, null);
        t6.setTag(AbstractC0831n.f11979i, null);
        setTransformProperty(t6, null, null);
        t6.resetPivot();
        t6.setTop(0);
        t6.setBottom(0);
        t6.setLeft(0);
        t6.setRight(0);
        t6.setElevation(0.0f);
        t6.setAnimationMatrix(null);
        t6.setTag(AbstractC0831n.f11995y, null);
        t6.setTag(AbstractC0831n.f11996z, null);
        t6.setTag(AbstractC0831n.f11983m, null);
        t6.removeOnLayoutChangeListener(this);
        t6.setTag(AbstractC0831n.f11969A, null);
        t6.setTag(AbstractC0831n.f11981k, null);
        applyFilter(t6, null);
        if (Build.VERSION.SDK_INT >= 28) {
            t6.setOutlineAmbientShadowColor(-16777216);
            t6.setOutlineSpotShadowColor(-16777216);
        }
        t6.setNextFocusDownId(-1);
        t6.setNextFocusForwardId(-1);
        t6.setNextFocusRightId(-1);
        t6.setNextFocusUpId(-1);
        t6.setFocusable(false);
        t6.setFocusableInTouchMode(false);
        t6.setElevation(0.0f);
        t6.setAlpha(1.0f);
        setPadding(t6, 0, 0, 0, 0);
        t6.setForeground(null);
        return t6;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityActions")
    public void setAccessibilityActions(T t6, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t6.setTag(AbstractC0831n.f11971a, readableArray);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t6, ReadableMap readableMap) {
        t6.setTag(AbstractC0831n.f11972b, readableMap);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t6, ReadableMap readableMap) {
        t6.setTag(AbstractC0831n.f11973c, readableMap);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityHint")
    public void setAccessibilityHint(T t6, String str) {
        t6.setTag(AbstractC0831n.f11974d, str);
        updateViewContentDescription(t6);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t6, String str) {
        t6.setTag(AbstractC0831n.f11975e, str);
        updateViewContentDescription(t6);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t6, Dynamic dynamic) {
        int i7;
        String string;
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            i7 = AbstractC0831n.f11984n;
            string = dynamic.asString();
        } else {
            if (dynamic.getType() != ReadableType.Array) {
                return;
            }
            i7 = AbstractC0831n.f11984n;
            string = dynamic.asArray().getString(0);
        }
        t6.setTag(i7, string);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t6, String str) {
        int i7;
        if (str == null || str.equals("none")) {
            i7 = 0;
        } else if (str.equals("polite")) {
            i7 = 1;
        } else if (!str.equals("assertive")) {
            return;
        } else {
            i7 = 2;
        }
        androidx.core.view.H.r0(t6, i7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityRole")
    public void setAccessibilityRole(T t6, String str) {
        if (str == null) {
            t6.setTag(AbstractC0831n.f11977g, null);
        } else {
            t6.setTag(AbstractC0831n.f11977g, I.e.j(str));
        }
    }

    @InterfaceC2218a(name = "accessibilityValue")
    public void setAccessibilityValue(T t6, ReadableMap readableMap) {
        if (readableMap == null) {
            t6.setTag(AbstractC0831n.f11980j, null);
            t6.setContentDescription(null);
        } else {
            t6.setTag(AbstractC0831n.f11980j, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t6);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t6, int i7) {
        t6.setBackgroundColor(i7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    public void setBorderBottomLeftRadius(T t6, float f7) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    public void setBorderBottomRightRadius(T t6, float f7) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    public void setBorderRadius(T t6, float f7) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    public void setBorderTopLeftRadius(T t6, float f7) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    public void setBorderTopRightRadius(T t6, float f7) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @InterfaceC2218a(name = "onClick")
    public void setClick(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.CLICK, z6);
    }

    @InterfaceC2218a(name = "onClickCapture")
    public void setClickCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.CLICK_CAPTURE, z6);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "elevation")
    public void setElevation(T t6, float f7) {
        androidx.core.view.H.x0(t6, G.d(f7));
    }

    @InterfaceC2218a(customType = "Filter", name = "experimental_filter")
    public void setFilter(T t6, ReadableArray readableArray) {
        t6.setTag(AbstractC0831n.f11981k, readableArray);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t6, String str) {
        int i7;
        if (str == null || str.equals("auto")) {
            i7 = 0;
        } else if (str.equals("yes")) {
            i7 = 1;
        } else if (str.equals("no")) {
            i7 = 2;
        } else if (!str.equals("no-hide-descendants")) {
            return;
        } else {
            i7 = 4;
        }
        androidx.core.view.H.z0(t6, i7);
    }

    @InterfaceC2218a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t6, boolean z6) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "nativeID")
    public void setNativeId(T t6, String str) {
        t6.setTag(AbstractC0831n.f11970B, str);
        D2.a.c(t6);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t6, float f7) {
        t6.setAlpha(f7);
    }

    @InterfaceC2218a(name = "onPointerEnter")
    public void setPointerEnter(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.ENTER, z6);
    }

    @InterfaceC2218a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.ENTER_CAPTURE, z6);
    }

    @InterfaceC2218a(name = "onPointerLeave")
    public void setPointerLeave(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.LEAVE, z6);
    }

    @InterfaceC2218a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.LEAVE_CAPTURE, z6);
    }

    @InterfaceC2218a(name = "onPointerMove")
    public void setPointerMove(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.MOVE, z6);
    }

    @InterfaceC2218a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.MOVE_CAPTURE, z6);
    }

    @InterfaceC2218a(name = "onPointerOut")
    public void setPointerOut(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.OUT, z6);
    }

    @InterfaceC2218a(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.OUT_CAPTURE, z6);
    }

    @InterfaceC2218a(name = "onPointerOver")
    public void setPointerOver(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.OVER, z6);
    }

    @InterfaceC2218a(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t6, boolean z6) {
        setPointerEventsFlag(t6, o.b.OVER_CAPTURE, z6);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t6, boolean z6) {
        t6.setTag(AbstractC0831n.f11969A, Boolean.valueOf(z6));
    }

    @InterfaceC2218a(name = "onResponderEnd")
    public void setResponderEnd(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderGrant")
    public void setResponderGrant(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderMove")
    public void setResponderMove(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderReject")
    public void setResponderReject(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderRelease")
    public void setResponderRelease(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderStart")
    public void setResponderStart(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderTerminate")
    public void setResponderTerminate(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t6, boolean z6) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "role")
    public void setRole(T t6, String str) {
        if (str == null) {
            t6.setTag(AbstractC0831n.f11994x, null);
        } else {
            t6.setTag(AbstractC0831n.f11994x, I.f.h(str));
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "rotation")
    @Deprecated
    public void setRotation(T t6, float f7) {
        t6.setRotation(f7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t6, float f7) {
        t6.setScaleX(f7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t6, float f7) {
        t6.setScaleY(f7);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t6, int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            t6.setOutlineAmbientShadowColor(i7);
            t6.setOutlineSpotShadowColor(i7);
        }
    }

    @InterfaceC2218a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t6, boolean z6) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "testID")
    public void setTestId(T t6, String str) {
        t6.setTag(AbstractC0831n.f11987q, str);
        t6.setTag(str);
    }

    @InterfaceC2218a(name = "onTouchCancel")
    public void setTouchCancel(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onTouchEnd")
    public void setTouchEnd(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onTouchMove")
    public void setTouchMove(T t6, boolean z6) {
    }

    @InterfaceC2218a(name = "onTouchStart")
    public void setTouchStart(T t6, boolean z6) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "transform")
    public void setTransform(T t6, ReadableArray readableArray) {
        t6.setTag(AbstractC0831n.f11995y, readableArray);
        t6.setTag(AbstractC0831n.f11983m, Boolean.TRUE);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "transformOrigin")
    public void setTransformOrigin(T t6, ReadableArray readableArray) {
        t6.setTag(AbstractC0831n.f11996z, readableArray);
        t6.setTag(AbstractC0831n.f11983m, Boolean.TRUE);
    }

    protected void setTransformProperty(T t6, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t6.setTranslationX(G.d(0.0f));
            t6.setTranslationY(G.d(0.0f));
            t6.setRotation(0.0f);
            t6.setRotationX(0.0f);
            t6.setRotationY(0.0f);
            t6.setScaleX(1.0f);
            t6.setScaleY(1.0f);
            t6.setCameraDistance(0.0f);
            return;
        }
        boolean z6 = C2239a.c(t6) == 2;
        C0899z.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        AbstractC0878h0.e(readableArray, dArr, G.b(t6.getWidth()), G.b(t6.getHeight()), readableArray2, z6);
        C0899z.k(dArr, aVar);
        t6.setTranslationX(G.d(sanitizeFloatPropertyValue((float) aVar.f12752d[0])));
        t6.setTranslationY(G.d(sanitizeFloatPropertyValue((float) aVar.f12752d[1])));
        t6.setRotation(sanitizeFloatPropertyValue((float) aVar.f12753e[2]));
        t6.setRotationX(sanitizeFloatPropertyValue((float) aVar.f12753e[0]));
        t6.setRotationY(sanitizeFloatPropertyValue((float) aVar.f12753e[1]));
        t6.setScaleX(sanitizeFloatPropertyValue((float) aVar.f12750b[0]));
        t6.setScaleY(sanitizeFloatPropertyValue((float) aVar.f12750b[1]));
        double[] dArr2 = aVar.f12749a;
        if (dArr2.length > 2) {
            float f7 = (float) dArr2[2];
            if (f7 == 0.0f) {
                f7 = 7.8125E-4f;
            }
            float f8 = (-1.0f) / f7;
            float f9 = C0877h.c().density;
            t6.setCameraDistance(sanitizeFloatPropertyValue(f9 * f9 * f8 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t6, float f7) {
        t6.setTranslationX(G.d(f7));
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t6, float f7) {
        t6.setTranslationY(G.d(f7));
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "accessibilityState")
    public void setViewState(T t6, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t6.setTag(AbstractC0831n.f11979i, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t6.isSelected();
            boolean z6 = readableMap.getBoolean("selected");
            t6.setSelected(z6);
            if (t6.isAccessibilityFocused() && zIsSelected && !z6) {
                t6.announceForAccessibility(t6.getContext().getString(AbstractC0834q.f12010G));
            }
        } else {
            t6.setSelected(false);
        }
        t6.setTag(AbstractC0831n.f11978h, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t6.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t6);
                return;
            } else if (t6.isAccessibilityFocused()) {
                t6.sendAccessibilityEvent(1);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0875g
    @InterfaceC2218a(name = "zIndex")
    public void setZIndex(T t6, float f7) {
        ViewGroupManager.setViewZIndex(t6, Math.round(f7));
        ViewParent parent = t6.getParent();
        if (parent instanceof Y) {
            ((Y) parent).updateDrawingOrder();
        }
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
