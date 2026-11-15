package H5;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC0400j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final X f1411m;

    public Y(X x6) {
        this.f1411m = x6;
    }

    @Override // H5.AbstractC0402k
    public void a(Throwable th) {
        this.f1411m.c();
    }

    @Override // v5.l
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        a((Throwable) obj);
        return i5.u.f19985a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f1411m + ']';
    }
}
