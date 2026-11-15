package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7186e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7187f;

    public e(String str, String str2, String str3, List list) {
        this.f7182a = (String) androidx.core.util.f.f(str);
        this.f7183b = (String) androidx.core.util.f.f(str2);
        this.f7184c = (String) androidx.core.util.f.f(str3);
        this.f7185d = (List) androidx.core.util.f.f(list);
        this.f7187f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f7185d;
    }

    public int c() {
        return this.f7186e;
    }

    String d() {
        return this.f7187f;
    }

    public String e() {
        return this.f7182a;
    }

    public String f() {
        return this.f7183b;
    }

    public String g() {
        return this.f7184c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f7182a + ", mProviderPackage: " + this.f7183b + ", mQuery: " + this.f7184c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f7185d.size(); i7++) {
            sb.append(" [");
            List list = (List) this.f7185d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f7186e);
        return sb.toString();
    }
}
