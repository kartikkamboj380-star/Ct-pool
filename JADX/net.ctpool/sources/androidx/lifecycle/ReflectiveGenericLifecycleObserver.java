package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.C0645b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0645b.a f8332b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f8331a = obj;
        this.f8332b = C0645b.f8337c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        this.f8332b.a(lVar, bVar, this.f8331a);
    }
}
