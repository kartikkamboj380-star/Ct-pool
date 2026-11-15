package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class S extends AbstractC0873f {
    public S(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((T) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((T) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((T) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((T) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((T) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((T) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((T) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fillRule":
                ((T) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((T) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((T) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((T) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((T) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((T) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((T) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "src":
                ((T) this.f12591a).setSrc(view, (ReadableMap) obj);
                break;
            case "fill":
                ((T) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "mask":
                ((T) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((T) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((T) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((T) this.f12591a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "vectorEffect":
                ((T) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((T) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((T) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((T) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((T) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((T) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((T) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((T) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((T) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((T) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((T) this.f12591a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((T) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
