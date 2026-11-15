package N4;

import java.util.List;

/* JADX INFO: renamed from: N4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f2322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f2323f;

    public C0439a(String str, String str2, String str3, String str4, u uVar, List list) {
        w5.k.f(str, "packageName");
        w5.k.f(str2, "versionName");
        w5.k.f(str3, "appBuildVersion");
        w5.k.f(str4, "deviceManufacturer");
        w5.k.f(uVar, "currentProcessDetails");
        w5.k.f(list, "appProcessDetails");
        this.f2318a = str;
        this.f2319b = str2;
        this.f2320c = str3;
        this.f2321d = str4;
        this.f2322e = uVar;
        this.f2323f = list;
    }

    public final String a() {
        return this.f2320c;
    }

    public final List b() {
        return this.f2323f;
    }

    public final u c() {
        return this.f2322e;
    }

    public final String d() {
        return this.f2321d;
    }

    public final String e() {
        return this.f2318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0439a)) {
            return false;
        }
        C0439a c0439a = (C0439a) obj;
        return w5.k.b(this.f2318a, c0439a.f2318a) && w5.k.b(this.f2319b, c0439a.f2319b) && w5.k.b(this.f2320c, c0439a.f2320c) && w5.k.b(this.f2321d, c0439a.f2321d) && w5.k.b(this.f2322e, c0439a.f2322e) && w5.k.b(this.f2323f, c0439a.f2323f);
    }

    public final String f() {
        return this.f2319b;
    }

    public int hashCode() {
        return (((((((((this.f2318a.hashCode() * 31) + this.f2319b.hashCode()) * 31) + this.f2320c.hashCode()) * 31) + this.f2321d.hashCode()) * 31) + this.f2322e.hashCode()) * 31) + this.f2323f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f2318a + ", versionName=" + this.f2319b + ", appBuildVersion=" + this.f2320c + ", deviceManufacturer=" + this.f2321d + ", currentProcessDetails=" + this.f2322e + ", appProcessDetails=" + this.f2323f + ')';
    }
}
