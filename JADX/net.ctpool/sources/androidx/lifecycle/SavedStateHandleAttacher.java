package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f8333a;

    public SavedStateHandleAttacher(z zVar) {
        w5.k.f(zVar, "provider");
        this.f8333a = zVar;
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        w5.k.f(lVar, "source");
        w5.k.f(bVar, "event");
        if (bVar == AbstractC0651h.b.ON_CREATE) {
            lVar.getLifecycle().c(this);
            this.f8333a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
        }
    }
}
