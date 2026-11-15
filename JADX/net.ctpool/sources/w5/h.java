package w5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends AbstractC2199c implements g, D5.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f22732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f22733u;

    public h(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f22732t = i7;
        this.f22733u = i8 >> 1;
    }

    @Override // w5.AbstractC2199c
    protected D5.a b() {
        return w.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return d().equals(hVar.d()) && k().equals(hVar.k()) && this.f22733u == hVar.f22733u && this.f22732t == hVar.f22732t && k.b(c(), hVar.c()) && k.b(g(), hVar.g());
        }
        if (obj instanceof D5.d) {
            return obj.equals(a());
        }
        return false;
    }

    @Override // w5.g
    public int getArity() {
        return this.f22732t;
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + d().hashCode()) * 31) + k().hashCode();
    }

    public String toString() {
        D5.a aVarA = a();
        if (aVarA != this) {
            return aVarA.toString();
        }
        if ("<init>".equals(d())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + d() + " (Kotlin reflection is not available)";
    }
}
