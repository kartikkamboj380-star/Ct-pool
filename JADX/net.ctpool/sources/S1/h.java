package S1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread f2941a;

    public final void a() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f2941a == null) {
            this.f2941a = threadCurrentThread;
        }
        O1.a.a(w5.k.b(this.f2941a, threadCurrentThread));
    }
}
