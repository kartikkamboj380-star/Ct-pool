package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8335b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f8336c;

    SavedStateHandleController(String str, x xVar) {
        this.f8334a = str;
        this.f8336c = xVar;
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        if (bVar == AbstractC0651h.b.ON_DESTROY) {
            this.f8335b = false;
            lVar.getLifecycle().c(this);
        }
    }

    void h(Y.c cVar, AbstractC0651h abstractC0651h) {
        if (this.f8335b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f8335b = true;
        abstractC0651h.a(this);
        cVar.h(this.f8334a, this.f8336c.d());
    }

    x i() {
        return this.f8336c;
    }

    boolean j() {
        return this.f8335b;
    }
}
