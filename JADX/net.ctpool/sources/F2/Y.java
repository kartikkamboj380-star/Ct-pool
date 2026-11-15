package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class Y extends AbstractC0873f {
    public Y(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((Z) this.f12591a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((Z) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((Z) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "orient":
                ((Z) this.f12591a).setOrient(view, obj != null ? (String) obj : null);
                break;
            case "propList":
                ((Z) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((Z) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((Z) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((Z) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((Z) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((Z) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((Z) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((Z) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((Z) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((Z) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((Z) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((Z) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((Z) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((Z) this.f12591a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((Z) this.f12591a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((Z) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "refX":
                ((Z) this.f12591a).setRefX(view, new DynamicFromObject(obj));
                break;
            case "refY":
                ((Z) this.f12591a).setRefY(view, new DynamicFromObject(obj));
                break;
            case "strokeMiterlimit":
                ((Z) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((Z) this.f12591a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "vectorEffect":
                ((Z) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((Z) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "markerUnits":
                ((Z) this.f12591a).setMarkerUnits(view, obj != null ? (String) obj : null);
                break;
            case "markerWidth":
                ((Z) this.f12591a).setMarkerWidth(view, new DynamicFromObject(obj));
                break;
            case "vbWidth":
                ((Z) this.f12591a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((Z) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((Z) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((Z) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((Z) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((Z) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((Z) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((Z) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((Z) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((Z) this.f12591a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((Z) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            case "markerHeight":
                ((Z) this.f12591a).setMarkerHeight(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
