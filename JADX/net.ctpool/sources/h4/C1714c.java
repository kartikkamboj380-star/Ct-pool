package h4;

import java.io.File;

/* JADX INFO: renamed from: h4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1714c extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k4.F f19716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f19718c;

    C1714c(k4.F f7, String str, File file) {
        if (f7 == null) {
            throw new NullPointerException("Null report");
        }
        this.f19716a = f7;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f19717b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f19718c = file;
    }

    @Override // h4.D
    public k4.F b() {
        return this.f19716a;
    }

    @Override // h4.D
    public File c() {
        return this.f19718c;
    }

    @Override // h4.D
    public String d() {
        return this.f19717b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        return this.f19716a.equals(d7.b()) && this.f19717b.equals(d7.d()) && this.f19718c.equals(d7.c());
    }

    public int hashCode() {
        return ((((this.f19716a.hashCode() ^ 1000003) * 1000003) ^ this.f19717b.hashCode()) * 1000003) ^ this.f19718c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f19716a + ", sessionId=" + this.f19717b + ", reportFile=" + this.f19718c + "}";
    }
}
