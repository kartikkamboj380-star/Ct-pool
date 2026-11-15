package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0351c extends AbstractC0873f {
    public C0351c(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "progress":
                ((InterfaceC0352d) this.f12591a).setProgress(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "testID":
                ((InterfaceC0352d) this.f12591a).setTestID(view, obj == null ? "" : (String) obj);
                break;
            case "typeAttr":
                ((InterfaceC0352d) this.f12591a).setTypeAttr(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((InterfaceC0352d) this.f12591a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "indeterminate":
                ((InterfaceC0352d) this.f12591a).setIndeterminate(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animating":
                ((InterfaceC0352d) this.f12591a).setAnimating(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "styleAttr":
                ((InterfaceC0352d) this.f12591a).setStyleAttr(view, obj != null ? (String) obj : null);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
