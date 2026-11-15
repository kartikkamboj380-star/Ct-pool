package p4;

import android.text.TextUtils;
import e4.C1629g;
import h4.C1710A;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import m4.C1881a;
import org.json.JSONObject;

/* JADX INFO: renamed from: p4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1972c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m4.b f21616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1629g f21617c;

    public C1972c(String str, m4.b bVar) {
        this(str, bVar, C1629g.f());
    }

    private C1881a b(C1881a c1881a, k kVar) {
        c(c1881a, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f21648a);
        c(c1881a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c1881a, "X-CRASHLYTICS-API-CLIENT-VERSION", C1710A.q());
        c(c1881a, "Accept", "application/json");
        c(c1881a, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f21649b);
        c(c1881a, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f21650c);
        c(c1881a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f21651d);
        c(c1881a, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f21652e.a().c());
        return c1881a;
    }

    private void c(C1881a c1881a, String str, String str2) {
        if (str2 != null) {
            c1881a.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e7) {
            this.f21617c.l("Failed to parse settings JSON from " + this.f21615a, e7);
            this.f21617c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f21655h);
        map.put("display_version", kVar.f21654g);
        map.put("source", Integer.toString(kVar.f21656i));
        String str = kVar.f21653f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // p4.l
    public JSONObject a(k kVar, boolean z6) {
        i4.f.d();
        if (!z6) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            C1881a c1881aB = b(d(mapF), kVar);
            this.f21617c.b("Requesting settings from " + this.f21615a);
            this.f21617c.i("Settings query params were: " + mapF);
            return g(c1881aB.c());
        } catch (IOException e7) {
            this.f21617c.e("Settings request failed.", e7);
            return null;
        }
    }

    protected C1881a d(Map map) {
        return this.f21616b.a(this.f21615a, map).d("User-Agent", "Crashlytics Android SDK/" + C1710A.q()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(m4.c cVar) {
        int iB = cVar.b();
        this.f21617c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f21617c.d("Settings request failed; (status: " + iB + ") from " + this.f21615a);
        return null;
    }

    boolean h(int i7) {
        return i7 == 200 || i7 == 201 || i7 == 202 || i7 == 203;
    }

    C1972c(String str, m4.b bVar, C1629g c1629g) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f21617c = c1629g;
        this.f21616b = bVar;
        this.f21615a = str;
    }
}
