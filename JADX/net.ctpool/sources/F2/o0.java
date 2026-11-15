package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends AbstractC0873f {
    public o0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "lengthAdjust":
                ((p0) this.f12591a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((p0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((p0) this.f12591a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((p0) this.f12591a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((p0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((p0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((p0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((p0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((p0) this.f12591a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((p0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((p0) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((p0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((p0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((p0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((p0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((p0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((p0) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((p0) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((p0) this.f12591a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((p0) this.f12591a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((p0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((p0) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((p0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((p0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((p0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((p0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((p0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((p0) this.f12591a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((p0) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((p0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((p0) this.f12591a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((p0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((p0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "content":
                ((p0) this.f12591a).setContent(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinecap":
                ((p0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((p0) this.f12591a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((p0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((p0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((p0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((p0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
