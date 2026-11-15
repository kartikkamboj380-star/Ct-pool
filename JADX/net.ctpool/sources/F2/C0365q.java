package F2;

import android.view.View;
import com.facebook.react.uimanager.AbstractC0873f;
import com.facebook.react.uimanager.InterfaceC0875g;

/* JADX INFO: renamed from: F2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0365q extends AbstractC0873f {
    public C0365q(InterfaceC0875g interfaceC0875g) {
        super(interfaceC0875g);
    }

    @Override // com.facebook.react.uimanager.AbstractC0873f, com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        if (str.equals("type")) {
            ((r) this.f12591a).setType(view, (String) obj);
        } else {
            super.b(view, str, obj);
        }
    }
}
