package Y;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.l;
import androidx.savedstate.Recreator;
import java.util.Map;
import k.C1813b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f4381g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Recreator.b f4386e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1813b f4382a = new C1813b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4387f = true;

    public interface a {
        void a(e eVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: Y.c$c, reason: collision with other inner class name */
    public interface InterfaceC0101c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c cVar, l lVar, AbstractC0651h.b bVar) {
        boolean z6;
        k.f(cVar, "this$0");
        k.f(lVar, "<anonymous parameter 0>");
        k.f(bVar, "event");
        if (bVar == AbstractC0651h.b.ON_START) {
            z6 = true;
        } else if (bVar != AbstractC0651h.b.ON_STOP) {
            return;
        } else {
            z6 = false;
        }
        cVar.f4387f = z6;
    }

    public final Bundle b(String str) {
        k.f(str, "key");
        if (!this.f4385d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f4384c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f4384c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4384c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f4384c = null;
        }
        return bundle2;
    }

    public final InterfaceC0101c c(String str) {
        k.f(str, "key");
        for (Map.Entry entry : this.f4382a) {
            k.e(entry, "components");
            String str2 = (String) entry.getKey();
            InterfaceC0101c interfaceC0101c = (InterfaceC0101c) entry.getValue();
            if (k.b(str2, str)) {
                return interfaceC0101c;
            }
        }
        return null;
    }

    public final void e(AbstractC0651h abstractC0651h) {
        k.f(abstractC0651h, "lifecycle");
        if (!(!this.f4383b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        abstractC0651h.a(new InterfaceC0653j() { // from class: Y.b
            @Override // androidx.lifecycle.InterfaceC0653j
            public final void g(l lVar, AbstractC0651h.b bVar) {
                c.d(this.f4380a, lVar, bVar);
            }
        });
        this.f4383b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f4383b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f4385d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f4384c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f4385d = true;
    }

    public final void g(Bundle bundle) {
        k.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4384c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1813b.d dVarH = this.f4382a.h();
        k.e(dVarH, "this.components.iteratorWithAdditions()");
        while (dVarH.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0101c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, InterfaceC0101c interfaceC0101c) {
        k.f(str, "key");
        k.f(interfaceC0101c, "provider");
        if (((InterfaceC0101c) this.f4382a.m(str, interfaceC0101c)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class cls) {
        k.f(cls, "clazz");
        if (!this.f4387f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f4386e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f4386e = bVar;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f4386e;
            if (bVar2 != null) {
                String name = cls.getName();
                k.e(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
