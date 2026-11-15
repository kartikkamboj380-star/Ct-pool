package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class H extends AbstractC0873f {
    public H(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((I) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((I) this.f12591a).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((I) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((I) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((I) this.f12591a).setNodes(view, (ReadableArray) obj);
                break;
            case "width":
                ((I) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
