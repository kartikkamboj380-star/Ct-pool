package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0367t extends AbstractC0873f {
    public C0367t(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "cancelSearch":
                ((InterfaceC0368u) this.f12591a).cancelSearch(view);
                break;
            case "clearText":
                ((InterfaceC0368u) this.f12591a).clearText(view);
                break;
            case "toggleCancelButton":
                ((InterfaceC0368u) this.f12591a).toggleCancelButton(view, readableArray.getBoolean(0));
                break;
            case "blur":
                ((InterfaceC0368u) this.f12591a).blur(view);
                break;
            case "focus":
                ((InterfaceC0368u) this.f12591a).focus(view);
                break;
            case "setText":
                ((InterfaceC0368u) this.f12591a).setText(view, readableArray.getString(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "hideNavigationBar":
                ((InterfaceC0368u) this.f12591a).setHideNavigationBar(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "headerIconColor":
                ((InterfaceC0368u) this.f12591a).setHeaderIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "autoCapitalize":
                ((InterfaceC0368u) this.f12591a).setAutoCapitalize(view, (String) obj);
                break;
            case "textColor":
                ((InterfaceC0368u) this.f12591a).setTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "barTintColor":
                ((InterfaceC0368u) this.f12591a).setBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "hintTextColor":
                ((InterfaceC0368u) this.f12591a).setHintTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "hideWhenScrolling":
                ((InterfaceC0368u) this.f12591a).setHideWhenScrolling(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "cancelButtonText":
                ((InterfaceC0368u) this.f12591a).setCancelButtonText(view, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonOverride":
                ((InterfaceC0368u) this.f12591a).setDisableBackButtonOverride(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "shouldShowHintSearchIcon":
                ((InterfaceC0368u) this.f12591a).setShouldShowHintSearchIcon(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "placeholder":
                ((InterfaceC0368u) this.f12591a).setPlaceholder(view, obj != null ? (String) obj : null);
                break;
            case "tintColor":
                ((InterfaceC0368u) this.f12591a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "obscureBackground":
                ((InterfaceC0368u) this.f12591a).setObscureBackground(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "inputType":
                ((InterfaceC0368u) this.f12591a).setInputType(view, obj != null ? (String) obj : null);
                break;
            case "placement":
                ((InterfaceC0368u) this.f12591a).setPlacement(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
