package O5;

import H5.M;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f2534o;

    public k(Runnable runnable, long j7, i iVar) {
        super(j7, iVar);
        this.f2534o = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f2534o.run();
        } finally {
            this.f2532n.a();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.f2534o) + '@' + M.b(this.f2534o) + ", " + this.f2531m + ", " + this.f2532n + ']';
    }
}
