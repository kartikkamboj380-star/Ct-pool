package u4;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: u4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2137c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2135a f22542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f22543b;

    public C2137c(C2135a c2135a) {
        this.f22542a = c2135a;
        this.f22543b = c(c2135a);
    }

    private static void b(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    private static Bundle c(C2135a c2135a) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (c2135a == null || c2135a.B0() == null || (bundle = c2135a.B0().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        b("medium", "utm_medium", bundle2, bundle3);
        b("source", "utm_source", bundle2, bundle3);
        b("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }

    public Bundle a() {
        return new Bundle(this.f22543b);
    }
}
