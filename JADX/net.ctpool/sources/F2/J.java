package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class J extends AbstractC0873f {
    public J(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((K) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((K) this.f12591a).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((K) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((K) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((K) this.f12591a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((K) this.f12591a).setDy(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((K) this.f12591a).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((K) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
