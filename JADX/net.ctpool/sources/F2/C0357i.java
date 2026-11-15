package F2;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0357i extends AbstractC0873f {
    public C0357i(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "presentationStyle":
                ((InterfaceC0358j) this.f12591a).setPresentationStyle(view, (String) obj);
                break;
            case "supportedOrientations":
                ((InterfaceC0358j) this.f12591a).setSupportedOrientations(view, (ReadableArray) obj);
                break;
            case "transparent":
                ((InterfaceC0358j) this.f12591a).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((InterfaceC0358j) this.f12591a).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((InterfaceC0358j) this.f12591a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((InterfaceC0358j) this.f12591a).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((InterfaceC0358j) this.f12591a).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((InterfaceC0358j) this.f12591a).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((InterfaceC0358j) this.f12591a).setAnimationType(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
