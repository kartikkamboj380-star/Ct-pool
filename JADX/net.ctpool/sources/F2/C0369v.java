package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0369v extends AbstractC0873f {
    public C0369v(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((InterfaceC0370w) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC0370w) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC0370w) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC0370w) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC0370w) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC0370w) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fillRule":
                ((InterfaceC0370w) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC0370w) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC0370w) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC0370w) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC0370w) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "r":
                ((InterfaceC0370w) this.f12591a).setR(view, new DynamicFromObject(obj));
                break;
            case "cx":
                ((InterfaceC0370w) this.f12591a).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((InterfaceC0370w) this.f12591a).setCy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC0370w) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "mask":
                ((InterfaceC0370w) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC0370w) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC0370w) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((InterfaceC0370w) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC0370w) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC0370w) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC0370w) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC0370w) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC0370w) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC0370w) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC0370w) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC0370w) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC0370w) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
