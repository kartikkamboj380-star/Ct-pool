package j4;

import k4.F;
import org.json.JSONObject;
import w4.InterfaceC2196a;
import y4.C2248d;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2196a f20389a = new C2248d().j(C1780a.f20343a).i();

    static i a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static i b(String str, String str2, String str3, String str4, long j7) {
        return new C1781b(str, str2, i(str3), str4, j7);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0292e h() {
        return F.e.d.AbstractC0292e.a().d(F.e.d.AbstractC0292e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
