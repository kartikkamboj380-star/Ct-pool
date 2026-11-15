package z3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class H implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ I f23269n;

    H(I i7, AbstractC2272l abstractC2272l) {
        this.f23269n = i7;
        this.f23268m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC2272l abstractC2272lThen = this.f23269n.f23271b.then(this.f23268m.l());
            if (abstractC2272lThen == null) {
                this.f23269n.c(new NullPointerException("Continuation returned null"));
                return;
            }
            I i7 = this.f23269n;
            Executor executor = AbstractC2274n.f23289b;
            abstractC2272lThen.f(executor, i7);
            abstractC2272lThen.d(executor, this.f23269n);
            abstractC2272lThen.a(executor, this.f23269n);
        } catch (CancellationException unused) {
            this.f23269n.a();
        } catch (C2270j e7) {
            if (e7.getCause() instanceof Exception) {
                this.f23269n.c((Exception) e7.getCause());
            } else {
                this.f23269n.c(e7);
            }
        } catch (Exception e8) {
            this.f23269n.c(e8);
        }
    }
}
