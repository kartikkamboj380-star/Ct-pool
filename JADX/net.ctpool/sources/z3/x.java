package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class x implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ y f23307n;

    x(y yVar, AbstractC2272l abstractC2272l) {
        this.f23307n = yVar;
        this.f23306m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC2272l abstractC2272l = (AbstractC2272l) this.f23307n.f23309b.a(this.f23306m);
            if (abstractC2272l == null) {
                this.f23307n.c(new NullPointerException("Continuation returned null"));
                return;
            }
            y yVar = this.f23307n;
            Executor executor = AbstractC2274n.f23289b;
            abstractC2272l.f(executor, yVar);
            abstractC2272l.d(executor, this.f23307n);
            abstractC2272l.a(executor, this.f23307n);
        } catch (C2270j e7) {
            if (e7.getCause() instanceof Exception) {
                this.f23307n.f23310c.s((Exception) e7.getCause());
            } else {
                this.f23307n.f23310c.s(e7);
            }
        } catch (Exception e8) {
            this.f23307n.f23310c.s(e8);
        }
    }
}
