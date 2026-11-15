package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0363o extends AbstractC0873f {
    public C0363o(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "translucent":
                ((InterfaceC0364p) this.f12591a).setTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleColor":
                ((InterfaceC0364p) this.f12591a).setTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "largeTitleColor":
                ((InterfaceC0364p) this.f12591a).setLargeTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "titleFontFamily":
                ((InterfaceC0364p) this.f12591a).setTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonMenu":
                ((InterfaceC0364p) this.f12591a).setDisableBackButtonMenu(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleFontWeight":
                ((InterfaceC0364p) this.f12591a).setTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case "hidden":
                ((InterfaceC0364p) this.f12591a).setHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontSize":
                ((InterfaceC0364p) this.f12591a).setLargeTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backButtonDisplayMode":
                ((InterfaceC0364p) this.f12591a).setBackButtonDisplayMode(view, (String) obj);
                break;
            case "backTitleVisible":
                ((InterfaceC0364p) this.f12591a).setBackTitleVisible(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "direction":
                ((InterfaceC0364p) this.f12591a).setDirection(view, (String) obj);
                break;
            case "largeTitleBackgroundColor":
                ((InterfaceC0364p) this.f12591a).setLargeTitleBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backButtonInCustomView":
                ((InterfaceC0364p) this.f12591a).setBackButtonInCustomView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontFamily":
                ((InterfaceC0364p) this.f12591a).setLargeTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((InterfaceC0364p) this.f12591a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "title":
                ((InterfaceC0364p) this.f12591a).setTitle(view, obj != null ? (String) obj : null);
                break;
            case "backTitleFontSize":
                ((InterfaceC0364p) this.f12591a).setBackTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backTitleFontFamily":
                ((InterfaceC0364p) this.f12591a).setBackTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "hideShadow":
                ((InterfaceC0364p) this.f12591a).setHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontWeight":
                ((InterfaceC0364p) this.f12591a).setLargeTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case "hideBackButton":
                ((InterfaceC0364p) this.f12591a).setHideBackButton(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "backgroundColor":
                ((InterfaceC0364p) this.f12591a).setBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backTitle":
                ((InterfaceC0364p) this.f12591a).setBackTitle(view, obj != null ? (String) obj : null);
                break;
            case "titleFontSize":
                ((InterfaceC0364p) this.f12591a).setTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "largeTitleHideShadow":
                ((InterfaceC0364p) this.f12591a).setLargeTitleHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitle":
                ((InterfaceC0364p) this.f12591a).setLargeTitle(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "topInsetEnabled":
                ((InterfaceC0364p) this.f12591a).setTopInsetEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
