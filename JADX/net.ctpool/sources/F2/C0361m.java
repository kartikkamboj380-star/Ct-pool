package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0361m extends AbstractC0873f {
    public C0361m(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "homeIndicatorHidden":
                ((InterfaceC0362n) this.f12591a).setHomeIndicatorHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureEnabled":
                ((InterfaceC0362n) this.f12591a).setGestureEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "hideKeyboardOnSwipe":
                ((InterfaceC0362n) this.f12591a).setHideKeyboardOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetCornerRadius":
                ((InterfaceC0362n) this.f12591a).setSheetCornerRadius(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "navigationBarHidden":
                ((InterfaceC0362n) this.f12591a).setNavigationBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((InterfaceC0362n) this.f12591a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "stackPresentation":
                ((InterfaceC0362n) this.f12591a).setStackPresentation(view, (String) obj);
                break;
            case "activityState":
                ((InterfaceC0362n) this.f12591a).setActivityState(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "statusBarColor":
                ((InterfaceC0362n) this.f12591a).setStatusBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "statusBarStyle":
                ((InterfaceC0362n) this.f12591a).setStatusBarStyle(view, obj != null ? (String) obj : null);
                break;
            case "fullScreenSwipeShadowEnabled":
                ((InterfaceC0362n) this.f12591a).setFullScreenSwipeShadowEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "stackAnimation":
                ((InterfaceC0362n) this.f12591a).setStackAnimation(view, (String) obj);
                break;
            case "navigationBarColor":
                ((InterfaceC0362n) this.f12591a).setNavigationBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "sheetAllowedDetents":
                ((InterfaceC0362n) this.f12591a).setSheetAllowedDetents(view, (String) obj);
                break;
            case "replaceAnimation":
                ((InterfaceC0362n) this.f12591a).setReplaceAnimation(view, (String) obj);
                break;
            case "preventNativeDismiss":
                ((InterfaceC0362n) this.f12591a).setPreventNativeDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarHidden":
                ((InterfaceC0362n) this.f12591a).setStatusBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "fullScreenSwipeEnabled":
                ((InterfaceC0362n) this.f12591a).setFullScreenSwipeEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureResponseDistance":
                ((InterfaceC0362n) this.f12591a).setGestureResponseDistance(view, (ReadableMap) obj);
                break;
            case "screenOrientation":
                ((InterfaceC0362n) this.f12591a).setScreenOrientation(view, obj != null ? (String) obj : null);
                break;
            case "sheetLargestUndimmedDetent":
                ((InterfaceC0362n) this.f12591a).setSheetLargestUndimmedDetent(view, (String) obj);
                break;
            case "transitionDuration":
                ((InterfaceC0362n) this.f12591a).setTransitionDuration(view, obj == null ? 350 : ((Double) obj).intValue());
                break;
            case "swipeDirection":
                ((InterfaceC0362n) this.f12591a).setSwipeDirection(view, (String) obj);
                break;
            case "customAnimationOnSwipe":
                ((InterfaceC0362n) this.f12591a).setCustomAnimationOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((InterfaceC0362n) this.f12591a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetGrabberVisible":
                ((InterfaceC0362n) this.f12591a).setSheetGrabberVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarAnimation":
                ((InterfaceC0362n) this.f12591a).setStatusBarAnimation(view, obj != null ? (String) obj : null);
                break;
            case "nativeBackButtonDismissalEnabled":
                ((InterfaceC0362n) this.f12591a).setNativeBackButtonDismissalEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetExpandsWhenScrolledToEdge":
                ((InterfaceC0362n) this.f12591a).setSheetExpandsWhenScrolledToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
