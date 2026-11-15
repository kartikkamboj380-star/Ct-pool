package androidx.lifecycle;

import P.a;
import Y.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.b f8388a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b f8389b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.b f8390c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    static final class d extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f8391m = new d();

        d() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A i(P.a aVar) {
            w5.k.f(aVar, "$this$initializer");
            return new A();
        }
    }

    public static final x a(P.a aVar) {
        w5.k.f(aVar, "<this>");
        Y.e eVar = (Y.e) aVar.a(f8388a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        I i7 = (I) aVar.a(f8389b);
        if (i7 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f8390c);
        String str = (String) aVar.a(F.c.f8303d);
        if (str != null) {
            return b(eVar, i7, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final x b(Y.e eVar, I i7, String str, Bundle bundle) {
        z zVarD = d(eVar);
        A aE = e(i7);
        x xVar = (x) aE.f().get(str);
        if (xVar != null) {
            return xVar;
        }
        x xVarA = x.f8381f.a(zVarD.b(str), bundle);
        aE.f().put(str, xVarA);
        return xVarA;
    }

    public static final void c(Y.e eVar) {
        w5.k.f(eVar, "<this>");
        AbstractC0651h.c cVarB = eVar.getLifecycle().b();
        w5.k.e(cVarB, "lifecycle.currentState");
        if (cVarB != AbstractC0651h.c.INITIALIZED && cVarB != AbstractC0651h.c.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            z zVar = new z(eVar.getSavedStateRegistry(), (I) eVar);
            eVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", zVar);
            eVar.getLifecycle().a(new SavedStateHandleAttacher(zVar));
        }
    }

    public static final z d(Y.e eVar) {
        w5.k.f(eVar, "<this>");
        c.InterfaceC0101c interfaceC0101cC = eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        z zVar = interfaceC0101cC instanceof z ? (z) interfaceC0101cC : null;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final A e(I i7) {
        w5.k.f(i7, "<this>");
        P.c cVar = new P.c();
        cVar.a(w5.w.b(A.class), d.f8391m);
        return (A) new F(i7, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", A.class);
    }
}
