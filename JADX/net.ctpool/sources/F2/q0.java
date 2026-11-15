package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends AbstractC0873f {
    public q0(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "lengthAdjust":
                ((r0) this.f12591a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((r0) this.f12591a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((r0) this.f12591a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((r0) this.f12591a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((r0) this.f12591a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((r0) this.f12591a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((r0) this.f12591a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((r0) this.f12591a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((r0) this.f12591a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((r0) this.f12591a).setStroke(view, (ReadableMap) obj);
                break;
            case "fontWeight":
                ((r0) this.f12591a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((r0) this.f12591a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((r0) this.f12591a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((r0) this.f12591a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((r0) this.f12591a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((r0) this.f12591a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((r0) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((r0) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((r0) this.f12591a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((r0) this.f12591a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((r0) this.f12591a).setFill(view, (ReadableMap) obj);
                break;
            case "font":
                ((r0) this.f12591a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((r0) this.f12591a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((r0) this.f12591a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((r0) this.f12591a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "vectorEffect":
                ((r0) this.f12591a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((r0) this.f12591a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((r0) this.f12591a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((r0) this.f12591a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((r0) this.f12591a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((r0) this.f12591a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((r0) this.f12591a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((r0) this.f12591a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((r0) this.f12591a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((r0) this.f12591a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((r0) this.f12591a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((r0) this.f12591a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((r0) this.f12591a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((r0) this.f12591a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
