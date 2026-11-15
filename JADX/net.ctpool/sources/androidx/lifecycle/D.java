package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f8283b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f8284c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f8285m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AbstractC0651h.b f8286n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f8287o = false;

        a(m mVar, AbstractC0651h.b bVar) {
            this.f8285m = mVar;
            this.f8286n = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8287o) {
                return;
            }
            this.f8285m.h(this.f8286n);
            this.f8287o = true;
        }
    }

    public D(l lVar) {
        this.f8282a = new m(lVar);
    }

    private void f(AbstractC0651h.b bVar) {
        a aVar = this.f8284c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f8282a, bVar);
        this.f8284c = aVar2;
        this.f8283b.postAtFrontOfQueue(aVar2);
    }

    public AbstractC0651h a() {
        return this.f8282a;
    }

    public void b() {
        f(AbstractC0651h.b.ON_START);
    }

    public void c() {
        f(AbstractC0651h.b.ON_CREATE);
    }

    public void d() {
        f(AbstractC0651h.b.ON_STOP);
        f(AbstractC0651h.b.ON_DESTROY);
    }

    public void e() {
        f(AbstractC0651h.b.ON_START);
    }
}
