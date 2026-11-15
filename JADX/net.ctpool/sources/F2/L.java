package F2;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: loaded from: classes.dex */
public class L extends AbstractC0873f {
    public L(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "primitiveUnits":
                ((M) this.f12591a).setPrimitiveUnits(view, (String) obj);
                break;
            case "height":
                ((M) this.f12591a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((M) this.f12591a).setFilterUnits(view, (String) obj);
                break;
            case "x":
                ((M) this.f12591a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((M) this.f12591a).setY(view, new DynamicFromObject(obj));
                break;
            case "name":
                ((M) this.f12591a).setName(view, obj == null ? null : (String) obj);
                break;
            case "width":
                ((M) this.f12591a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
