package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
class I implements InterfaceC0650g, Y.e, androidx.lifecycle.I {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Fragment f8055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.lifecycle.H f8056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.lifecycle.m f8057o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Y.d f8058p = null;

    I(Fragment fragment, androidx.lifecycle.H h7) {
        this.f8055m = fragment;
        this.f8056n = h7;
    }

    void a(AbstractC0651h.b bVar) {
        this.f8057o.h(bVar);
    }

    void c() {
        if (this.f8057o == null) {
            this.f8057o = new androidx.lifecycle.m(this);
            Y.d dVarA = Y.d.a(this);
            this.f8058p = dVarA;
            dVarA.c();
        }
    }

    boolean d() {
        return this.f8057o != null;
    }

    void e(Bundle bundle) {
        this.f8058p.d(bundle);
    }

    void f(Bundle bundle) {
        this.f8058p.e(bundle);
    }

    void g(AbstractC0651h.c cVar) {
        this.f8057o.o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0650g
    public P.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f8055m.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        P.d dVar = new P.d();
        if (application != null) {
            dVar.c(F.a.f8296h, application);
        }
        dVar.c(androidx.lifecycle.y.f8388a, this.f8055m);
        dVar.c(androidx.lifecycle.y.f8389b, this);
        if (this.f8055m.getArguments() != null) {
            dVar.c(androidx.lifecycle.y.f8390c, this.f8055m.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.l
    public AbstractC0651h getLifecycle() {
        c();
        return this.f8057o;
    }

    @Override // Y.e
    public Y.c getSavedStateRegistry() {
        c();
        return this.f8058p.b();
    }

    @Override // androidx.lifecycle.I
    public androidx.lifecycle.H getViewModelStore() {
        c();
        return this.f8056n;
    }
}
