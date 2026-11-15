package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0353e extends AbstractC0873f {
    public C0353e(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((InterfaceC0354f) this.f12591a).setNativeRefreshing(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "enabled":
                ((InterfaceC0354f) this.f12591a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((InterfaceC0354f) this.f12591a).setColors(view, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((InterfaceC0354f) this.f12591a).setProgressBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "progressViewOffset":
                ((InterfaceC0354f) this.f12591a).setProgressViewOffset(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((InterfaceC0354f) this.f12591a).setRefreshing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((InterfaceC0354f) this.f12591a).setSize(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
