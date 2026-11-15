package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends AbstractC0873f {
    public k0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "bbHeight":
                ((l0) this.f12591a).setBbHeight(view, new DynamicFromObject(obj));
                break;
            case "borderRightColor":
                ((l0) this.f12591a).setBorderRightColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backfaceVisibility":
                ((l0) this.f12591a).setBackfaceVisibility(view, obj != null ? (String) obj : null);
                break;
            case "vbHeight":
                ((l0) this.f12591a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderTopColor":
                ((l0) this.f12591a).setBorderTopColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderBottomColor":
                ((l0) this.f12591a).setBorderBottomColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopLeftRadius":
                ((l0) this.f12591a).setBorderTopLeftRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "accessible":
                ((l0) this.f12591a).setAccessible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderTopStartRadius":
                ((l0) this.f12591a).setBorderTopStartRadius(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderBottomStartRadius":
                ((l0) this.f12591a).setBorderBottomStartRadius(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "hasTVPreferredFocus":
                ((l0) this.f12591a).setHasTVPreferredFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "nextFocusDown":
                ((l0) this.f12591a).setNextFocusDown(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusLeft":
                ((l0) this.f12591a).setNextFocusLeft(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderTopEndRadius":
                ((l0) this.f12591a).setBorderTopEndRadius(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "bbWidth":
                ((l0) this.f12591a).setBbWidth(view, new DynamicFromObject(obj));
                break;
            case "pointerEvents":
                ((l0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "removeClippedSubviews":
                ((l0) this.f12591a).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderLeftColor":
                ((l0) this.f12591a).setBorderLeftColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStartEndRadius":
                ((l0) this.f12591a).setBorderStartEndRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "borderBottomEndRadius":
                ((l0) this.f12591a).setBorderBottomEndRadius(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "nativeForegroundAndroid":
                ((l0) this.f12591a).setNativeForegroundAndroid(view, (ReadableMap) obj);
                break;
            case "borderStartStartRadius":
                ((l0) this.f12591a).setBorderStartStartRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "minX":
                ((l0) this.f12591a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((l0) this.f12591a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((l0) this.f12591a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((l0) this.f12591a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vbWidth":
                ((l0) this.f12591a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderBlockStartColor":
                ((l0) this.f12591a).setBorderBlockStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopRightRadius":
                ((l0) this.f12591a).setBorderTopRightRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "nextFocusForward":
                ((l0) this.f12591a).setNextFocusForward(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBottomLeftRadius":
                ((l0) this.f12591a).setBorderBottomLeftRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "borderBottomRightRadius":
                ((l0) this.f12591a).setBorderBottomRightRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "nextFocusUp":
                ((l0) this.f12591a).setNextFocusUp(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBlockColor":
                ((l0) this.f12591a).setBorderBlockColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderColor":
                ((l0) this.f12591a).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStyle":
                ((l0) this.f12591a).setBorderStyle(view, obj != null ? (String) obj : null);
                break;
            case "borderBlockEndColor":
                ((l0) this.f12591a).setBorderBlockEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderEndStartRadius":
                ((l0) this.f12591a).setBorderEndStartRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "hitSlop":
                ((l0) this.f12591a).setHitSlop(view, new DynamicFromObject(obj));
                break;
            case "borderEndColor":
                ((l0) this.f12591a).setBorderEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "tintColor":
                ((l0) this.f12591a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderRadius":
                ((l0) this.f12591a).setBorderRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "focusable":
                ((l0) this.f12591a).setFocusable(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "needsOffscreenAlphaCompositing":
                ((l0) this.f12591a).setNeedsOffscreenAlphaCompositing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderEndEndRadius":
                ((l0) this.f12591a).setBorderEndEndRadius(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "nativeBackgroundAndroid":
                ((l0) this.f12591a).setNativeBackgroundAndroid(view, (ReadableMap) obj);
                break;
            case "meetOrSlice":
                ((l0) this.f12591a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusRight":
                ((l0) this.f12591a).setNextFocusRight(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderStartColor":
                ((l0) this.f12591a).setBorderStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
