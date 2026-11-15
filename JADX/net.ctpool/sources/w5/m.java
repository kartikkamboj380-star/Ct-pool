package w5;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC2200d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f22734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22735b;

    public m(Class cls, String str) {
        k.f(cls, "jClass");
        k.f(str, "moduleName");
        this.f22734a = cls;
        this.f22735b = str;
    }

    @Override // w5.InterfaceC2200d
    public Class b() {
        return this.f22734a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.b(b(), ((m) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
