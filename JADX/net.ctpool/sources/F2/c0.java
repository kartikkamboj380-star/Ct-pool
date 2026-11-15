package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends AbstractC0873f {
    public c0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((d0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((d0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((d0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((d0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((d0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((d0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fillRule":
                ((d0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((d0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((d0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((d0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((d0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "d":
                ((d0) this.f12591a).setD(view, obj != null ? (String) obj : null);
                break;
            case "fill":
                ((d0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "mask":
                ((d0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((d0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((d0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((d0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((d0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((d0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((d0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((d0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((d0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((d0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((d0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((d0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((d0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
