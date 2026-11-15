package C;

/* JADX INFO: loaded from: classes.dex */
final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Throwable th) {
        super(null);
        w5.k.f(th, "readException");
        this.f791a = th;
    }

    public final Throwable a() {
        return this.f791a;
    }
}
