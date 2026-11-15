package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class W extends AbstractC0873f {
    public W(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "gradientUnits":
                ((X) this.f12591a).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((X) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((X) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((X) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((X) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "x1":
                ((X) this.f12591a).setX1(view, new DynamicFromObject(obj));
                break;
            case "x2":
                ((X) this.f12591a).setX2(view, new DynamicFromObject(obj));
                break;
            case "y1":
                ((X) this.f12591a).setY1(view, new DynamicFromObject(obj));
                break;
            case "y2":
                ((X) this.f12591a).setY2(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((X) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((X) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "gradient":
                ((X) this.f12591a).setGradient(view, (ReadableArray) obj);
                break;
            case "markerStart":
                ((X) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((X) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((X) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((X) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "gradientTransform":
                ((X) this.f12591a).setGradientTransform(view, (ReadableArray) obj);
                break;
            case "responsible":
                ((X) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
