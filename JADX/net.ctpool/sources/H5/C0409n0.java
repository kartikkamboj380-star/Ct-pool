package H5;

/* JADX INFO: renamed from: H5.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0409n0 extends AbstractC0400j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v5.l f1438m;

    public C0409n0(v5.l lVar) {
        this.f1438m = lVar;
    }

    @Override // H5.AbstractC0402k
    public void a(Throwable th) {
        this.f1438m.i(th);
    }

    @Override // v5.l
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        a((Throwable) obj);
        return i5.u.f19985a;
    }

    public String toString() {
        return "InvokeOnCancel[" + M.a(this.f1438m) + '@' + M.b(this) + ']';
    }
}
