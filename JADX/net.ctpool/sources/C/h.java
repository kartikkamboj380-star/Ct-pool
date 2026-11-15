package C;

/* JADX INFO: loaded from: classes.dex */
final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super(null);
        w5.k.f(th, "finalException");
        this.f790a = th;
    }

    public final Throwable a() {
        return this.f790a;
    }
}
