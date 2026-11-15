package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends AbstractC0873f {
    public u0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((v0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((v0) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((v0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((v0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((v0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((v0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((v0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fillRule":
                ((v0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((v0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((v0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((v0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((v0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((v0) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((v0) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((v0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "href":
                ((v0) this.f12591a).setHref(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((v0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((v0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((v0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((v0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((v0) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((v0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((v0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((v0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((v0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((v0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((v0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((v0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((v0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((v0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
