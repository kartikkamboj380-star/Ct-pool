package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends AbstractC0873f {
    public g0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "gradientUnits":
                ((h0) this.f12591a).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((h0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((h0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((h0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((h0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "cx":
                ((h0) this.f12591a).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((h0) this.f12591a).setCy(view, new DynamicFromObject(obj));
                break;
            case "fx":
                ((h0) this.f12591a).setFx(view, new DynamicFromObject(obj));
                break;
            case "fy":
                ((h0) this.f12591a).setFy(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((h0) this.f12591a).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((h0) this.f12591a).setRy(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((h0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((h0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "gradient":
                ((h0) this.f12591a).setGradient(view, (ReadableArray) obj);
                break;
            case "markerStart":
                ((h0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((h0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((h0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((h0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "gradientTransform":
                ((h0) this.f12591a).setGradientTransform(view, (ReadableArray) obj);
                break;
            case "responsible":
                ((h0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
