package androidx.savedstate;

import Y.c;
import Y.e;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0653j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9081b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9082a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements c.InterfaceC0101c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f9083a;

        public b(c cVar) {
            k.f(cVar, "registry");
            this.f9083a = new LinkedHashSet();
            cVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // Y.c.InterfaceC0101c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f9083a));
            return bundle;
        }

        public final void b(String str) {
            k.f(str, "className");
            this.f9083a.add(str);
        }
    }

    public Recreator(e eVar) {
        k.f(eVar, "owner");
        this.f9082a = eVar;
    }

    private final void h(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            k.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    k.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) objNewInstance).a(this.f9082a);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + str, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + str + " wasn't found", e9);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        k.f(lVar, "source");
        k.f(bVar, "event");
        if (bVar != AbstractC0651h.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lVar.getLifecycle().c(this);
        Bundle bundleB = this.f9082a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }
}
