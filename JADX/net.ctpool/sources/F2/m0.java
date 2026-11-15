package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends AbstractC0873f {
    public m0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((n0) this.f12591a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((n0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((n0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((n0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((n0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((n0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((n0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((n0) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((n0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((n0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((n0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((n0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((n0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((n0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((n0) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((n0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((n0) this.f12591a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((n0) this.f12591a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((n0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((n0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((n0) this.f12591a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "vectorEffect":
                ((n0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((n0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((n0) this.f12591a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((n0) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((n0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((n0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((n0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((n0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((n0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((n0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((n0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((n0) this.f12591a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((n0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
