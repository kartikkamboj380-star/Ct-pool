package d4;

import Z3.a;
import android.os.Bundle;
import e4.C1629g;
import f4.InterfaceC1651b;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1651b f18679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1651b f18680b;

    e() {
    }

    private static void b(InterfaceC1651b interfaceC1651b, String str, Bundle bundle) {
        if (interfaceC1651b == null) {
            return;
        }
        interfaceC1651b.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f18679a : this.f18680b, str, bundle);
    }

    @Override // Z3.a.b
    public void a(int i7, Bundle bundle) {
        String string;
        C1629g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i7), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(InterfaceC1651b interfaceC1651b) {
        this.f18680b = interfaceC1651b;
    }

    public void e(InterfaceC1651b interfaceC1651b) {
        this.f18679a = interfaceC1651b;
    }
}
