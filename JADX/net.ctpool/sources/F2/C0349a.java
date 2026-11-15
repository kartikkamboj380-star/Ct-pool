package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0349a extends AbstractC0873f {
    public C0349a(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            ((InterfaceC0350b) this.f12591a).closeDrawer(view);
        } else if (str.equals("openDrawer")) {
            ((InterfaceC0350b) this.f12591a).openDrawer(view);
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "statusBarBackgroundColor":
                ((InterfaceC0350b) this.f12591a).setStatusBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "drawerBackgroundColor":
                ((InterfaceC0350b) this.f12591a).setDrawerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "keyboardDismissMode":
                ((InterfaceC0350b) this.f12591a).setKeyboardDismissMode(view, (String) obj);
                break;
            case "drawerWidth":
                ((InterfaceC0350b) this.f12591a).setDrawerWidth(view, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                break;
            case "drawerPosition":
                ((InterfaceC0350b) this.f12591a).setDrawerPosition(view, (String) obj);
                break;
            case "drawerLockMode":
                ((InterfaceC0350b) this.f12591a).setDrawerLockMode(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
