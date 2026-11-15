package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.F;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class B extends F.d implements F.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f8274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.b f8275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC0651h f8277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Y.c f8278f;

    public B(Application application, Y.e eVar, Bundle bundle) {
        w5.k.f(eVar, "owner");
        this.f8278f = eVar.getSavedStateRegistry();
        this.f8277e = eVar.getLifecycle();
        this.f8276d = bundle;
        this.f8274b = application;
        this.f8275c = application != null ? F.a.f8294f.a(application) : new F.a();
    }

    @Override // androidx.lifecycle.F.b
    public E a(Class cls) {
        w5.k.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.F.b
    public E b(Class cls, P.a aVar) {
        w5.k.f(cls, "modelClass");
        w5.k.f(aVar, "extras");
        String str = (String) aVar.a(F.c.f8303d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(y.f8388a) == null || aVar.a(y.f8389b) == null) {
            if (this.f8277e != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(F.a.f8296h);
        boolean zIsAssignableFrom = AbstractC0644a.class.isAssignableFrom(cls);
        Constructor constructorC = C.c(cls, (!zIsAssignableFrom || application == null) ? C.f8280b : C.f8279a);
        return constructorC == null ? this.f8275c.b(cls, aVar) : (!zIsAssignableFrom || application == null) ? C.d(cls, constructorC, y.a(aVar)) : C.d(cls, constructorC, application, y.a(aVar));
    }

    @Override // androidx.lifecycle.F.d
    public void c(E e7) {
        w5.k.f(e7, "viewModel");
        AbstractC0651h abstractC0651h = this.f8277e;
        if (abstractC0651h != null) {
            LegacySavedStateHandleController.a(e7, this.f8278f, abstractC0651h);
        }
    }

    public final E d(String str, Class cls) {
        E eD;
        Application application;
        w5.k.f(str, "key");
        w5.k.f(cls, "modelClass");
        if (this.f8277e == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0644a.class.isAssignableFrom(cls);
        Constructor constructorC = C.c(cls, (!zIsAssignableFrom || this.f8274b == null) ? C.f8280b : C.f8279a);
        if (constructorC == null) {
            return this.f8274b != null ? this.f8275c.a(cls) : F.c.f8301b.a().a(cls);
        }
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(this.f8278f, this.f8277e, str, this.f8276d);
        if (!zIsAssignableFrom || (application = this.f8274b) == null) {
            x xVarI = savedStateHandleControllerB.i();
            w5.k.e(xVarI, "controller.handle");
            eD = C.d(cls, constructorC, xVarI);
        } else {
            w5.k.c(application);
            x xVarI2 = savedStateHandleControllerB.i();
            w5.k.e(xVarI2, "controller.handle");
            eD = C.d(cls, constructorC, application, xVarI2);
        }
        eD.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return eD;
    }
}
