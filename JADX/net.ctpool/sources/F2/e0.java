package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends AbstractC0873f {
    public e0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((f0) this.f12591a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((f0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((f0) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((f0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((f0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((f0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((f0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((f0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((f0) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((f0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((f0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((f0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "patternUnits":
                ((f0) this.f12591a).setPatternUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "patternContentUnits":
                ((f0) this.f12591a).setPatternContentUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "fillOpacity":
                ((f0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((f0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((f0) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((f0) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((f0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((f0) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((f0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((f0) this.f12591a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((f0) this.f12591a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((f0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((f0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((f0) this.f12591a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "vectorEffect":
                ((f0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((f0) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((f0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((f0) this.f12591a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((f0) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((f0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "patternTransform":
                ((f0) this.f12591a).setPatternTransform(view, (ReadableArray) obj);
                break;
            case "clipPath":
                ((f0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((f0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((f0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((f0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((f0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((f0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((f0) this.f12591a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((f0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
