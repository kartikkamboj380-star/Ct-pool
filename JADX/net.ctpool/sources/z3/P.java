package z3;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class P implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ O f23284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Callable f23285n;

    P(O o6, Callable callable) {
        this.f23284m = o6;
        this.f23285n = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f23284m.t(this.f23285n.call());
        } catch (Exception e7) {
            this.f23284m.s(e7);
        } catch (Throwable th) {
            this.f23284m.s(new RuntimeException(th));
        }
    }
}
