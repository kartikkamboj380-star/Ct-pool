package r0;

import androidx.work.impl.E;

/* JADX INFO: loaded from: classes.dex */
public class v implements Runnable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f22111p = l0.i.i("StopWorkRunnable");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final E f22112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.work.impl.v f22113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f22114o;

    public v(E e7, androidx.work.impl.v vVar, boolean z6) {
        this.f22112m = e7;
        this.f22113n = vVar;
        this.f22114o = z6;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zT = this.f22114o ? this.f22112m.s().t(this.f22113n) : this.f22112m.s().u(this.f22113n);
        l0.i.e().a(f22111p, "StopWorkRunnable for " + this.f22113n.a().b() + "; Processor.stopWork = " + zT);
    }
}
