package H5;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v5.l f1377b;

    public A(Object obj, v5.l lVar) {
        this.f1376a = obj;
        this.f1377b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return w5.k.b(this.f1376a, a7.f1376a) && w5.k.b(this.f1377b, a7.f1377b);
    }

    public int hashCode() {
        Object obj = this.f1376a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f1377b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f1376a + ", onCancellation=" + this.f1377b + ')';
    }
}
