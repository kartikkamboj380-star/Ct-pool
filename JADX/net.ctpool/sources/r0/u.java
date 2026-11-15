package r0;

import androidx.work.WorkerParameters;
import androidx.work.impl.E;

/* JADX INFO: loaded from: classes.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private E f22108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.work.impl.v f22109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WorkerParameters.a f22110o;

    public u(E e7, androidx.work.impl.v vVar, WorkerParameters.a aVar) {
        this.f22108m = e7;
        this.f22109n = vVar;
        this.f22110o = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22108m.s().q(this.f22109n, this.f22110o);
    }
}
