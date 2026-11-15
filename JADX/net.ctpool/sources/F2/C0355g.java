package F2;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0355g extends AbstractC0873f {
    public C0355g(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((InterfaceC0356h) this.f12591a).setNativeValue(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "thumbColor":
                ((InterfaceC0356h) this.f12591a).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "enabled":
                ((InterfaceC0356h) this.f12591a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((InterfaceC0356h) this.f12591a).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "on":
                ((InterfaceC0356h) this.f12591a).setOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((InterfaceC0356h) this.f12591a).setValue(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((InterfaceC0356h) this.f12591a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((InterfaceC0356h) this.f12591a).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "thumbTintColor":
                ((InterfaceC0356h) this.f12591a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "trackColorForTrue":
                ((InterfaceC0356h) this.f12591a).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
