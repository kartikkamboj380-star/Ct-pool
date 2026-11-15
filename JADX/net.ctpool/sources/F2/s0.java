package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends AbstractC0873f {
    public s0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "spacing":
                ((t0) this.f12591a).setSpacing(view, obj != null ? (String) obj : null);
                break;
            case "startOffset":
                ((t0) this.f12591a).setStartOffset(view, new DynamicFromObject(obj));
                break;
            case "lengthAdjust":
                ((t0) this.f12591a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((t0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((t0) this.f12591a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((t0) this.f12591a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((t0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "method":
                ((t0) this.f12591a).setMethod(view, obj != null ? (String) obj : null);
                break;
            case "propList":
                ((t0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((t0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((t0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((t0) this.f12591a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((t0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((t0) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((t0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((t0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((t0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((t0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((t0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((t0) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((t0) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((t0) this.f12591a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((t0) this.f12591a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((t0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((t0) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "href":
                ((t0) this.f12591a).setHref(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((t0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((t0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "side":
                ((t0) this.f12591a).setSide(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((t0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((t0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((t0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((t0) this.f12591a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((t0) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((t0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((t0) this.f12591a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((t0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((t0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((t0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "midLine":
                ((t0) this.f12591a).setMidLine(view, obj != null ? (String) obj : null);
                break;
            case "textLength":
                ((t0) this.f12591a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((t0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((t0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((t0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((t0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
