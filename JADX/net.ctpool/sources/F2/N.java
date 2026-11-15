package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class N extends AbstractC0873f {
    public N(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((O) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((O) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((O) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((O) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((O) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((O) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((O) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((O) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((O) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((O) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((O) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((O) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((O) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((O) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((O) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((O) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((O) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((O) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((O) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((O) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((O) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((O) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((O) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((O) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((O) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((O) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((O) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((O) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((O) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((O) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((O) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((O) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
