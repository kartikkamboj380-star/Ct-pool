package l6;

/* JADX INFO: loaded from: classes2.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f21200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o f21201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f21202c = true;

    q(Object obj, o oVar) {
        this.f21200a = obj;
        this.f21201b = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f21200a == qVar.f21200a && this.f21201b.equals(qVar.f21201b);
    }

    public int hashCode() {
        return this.f21200a.hashCode() + this.f21201b.f21187f.hashCode();
    }
}
