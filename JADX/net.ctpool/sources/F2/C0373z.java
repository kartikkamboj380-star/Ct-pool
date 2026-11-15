package F2;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0373z extends AbstractC0873f {
    public C0373z(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "opacity":
                this.f12591a.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((A) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((A) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((A) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((A) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((A) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((A) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "markerStart":
                ((A) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((A) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((A) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((A) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "responsible":
                ((A) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
