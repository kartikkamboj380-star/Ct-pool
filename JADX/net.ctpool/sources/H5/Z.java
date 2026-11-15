package H5;

/* JADX INFO: loaded from: classes2.dex */
final class Z implements InterfaceC0405l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f1412m;

    public Z(boolean z6) {
        this.f1412m = z6;
    }

    @Override // H5.InterfaceC0405l0
    public boolean d() {
        return this.f1412m;
    }

    @Override // H5.InterfaceC0405l0
    public C0 g() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
