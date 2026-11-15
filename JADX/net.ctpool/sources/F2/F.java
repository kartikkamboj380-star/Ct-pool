package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class F extends AbstractC0873f {
    public F(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((G) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((G) this.f12591a).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((G) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((G) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((G) this.f12591a).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((G) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "edgeMode":
                ((G) this.f12591a).setEdgeMode(view, (String) obj);
                break;
            case "stdDeviationX":
                ((G) this.f12591a).setStdDeviationX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "stdDeviationY":
                ((G) this.f12591a).setStdDeviationY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
