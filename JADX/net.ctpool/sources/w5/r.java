package w5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends AbstractC2199c implements D5.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f22736t;

    public r(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f22736t = (i7 & 2) == 2;
    }

    @Override // w5.AbstractC2199c
    public D5.a a() {
        return this.f22736t ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return g().equals(rVar.g()) && d().equals(rVar.d()) && k().equals(rVar.k()) && k.b(c(), rVar.c());
        }
        if (obj instanceof D5.g) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + d().hashCode()) * 31) + k().hashCode();
    }

    protected D5.g l() {
        if (this.f22736t) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (D5.g) super.h();
    }

    public String toString() {
        D5.a aVarA = a();
        if (aVarA != this) {
            return aVarA.toString();
        }
        return "property " + d() + " (Kotlin reflection is not available)";
    }
}
