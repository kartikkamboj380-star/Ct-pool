package androidx.lifecycle;

import Y.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class LegacySavedStateHandleController {

    static final class a implements c.a {
        a() {
        }

        @Override // Y.c.a
        public void a(Y.e eVar) {
            if (!(eVar instanceof I)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            H viewModelStore = ((I) eVar).getViewModelStore();
            Y.c savedStateRegistry = eVar.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.a(viewModelStore.b((String) it.next()), savedStateRegistry, eVar.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    static void a(E e7, Y.c cVar, AbstractC0651h abstractC0651h) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) e7.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(cVar, abstractC0651h);
        c(cVar, abstractC0651h);
    }

    static SavedStateHandleController b(Y.c cVar, AbstractC0651h abstractC0651h, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, x.c(cVar.b(str), bundle));
        savedStateHandleController.h(cVar, abstractC0651h);
        c(cVar, abstractC0651h);
        return savedStateHandleController;
    }

    private static void c(final Y.c cVar, final AbstractC0651h abstractC0651h) {
        AbstractC0651h.c cVarB = abstractC0651h.b();
        if (cVarB == AbstractC0651h.c.INITIALIZED || cVarB.e(AbstractC0651h.c.STARTED)) {
            cVar.i(a.class);
        } else {
            abstractC0651h.a(new InterfaceC0653j() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0653j
                public void g(l lVar, AbstractC0651h.b bVar) {
                    if (bVar == AbstractC0651h.b.ON_START) {
                        abstractC0651h.c(this);
                        cVar.i(a.class);
                    }
                }
            });
        }
    }
}
