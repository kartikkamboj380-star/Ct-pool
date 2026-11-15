package z3;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: z3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2260D implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ E f23259n;

    RunnableC2260D(E e7, AbstractC2272l abstractC2272l) {
        this.f23259n = e7;
        this.f23258m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23259n.f23261b) {
            try {
                E e7 = this.f23259n;
                if (e7.f23262c != null) {
                    e7.f23262c.c((Exception) Preconditions.checkNotNull(this.f23258m.k()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
