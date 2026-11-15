package q0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21770c;

    public i(String str, int i7, int i8) {
        w5.k.f(str, "workSpecId");
        this.f21768a = str;
        this.f21769b = i7;
        this.f21770c = i8;
    }

    public final int a() {
        return this.f21769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w5.k.b(this.f21768a, iVar.f21768a) && this.f21769b == iVar.f21769b && this.f21770c == iVar.f21770c;
    }

    public int hashCode() {
        return (((this.f21768a.hashCode() * 31) + Integer.hashCode(this.f21769b)) * 31) + Integer.hashCode(this.f21770c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f21768a + ", generation=" + this.f21769b + ", systemId=" + this.f21770c + ')';
    }
}
