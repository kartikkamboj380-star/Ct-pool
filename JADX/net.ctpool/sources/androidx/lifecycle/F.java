package androidx.lifecycle;

import P.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f8291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f8292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P.a f8293c;

    public static class a extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f8295g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f8297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0159a f8294f = new C0159a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a.b f8296h = C0159a.C0160a.f8298a;

        /* JADX INFO: renamed from: androidx.lifecycle.F$a$a, reason: collision with other inner class name */
        public static final class C0159a {

            /* JADX INFO: renamed from: androidx.lifecycle.F$a$a$a, reason: collision with other inner class name */
            private static final class C0160a implements a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0160a f8298a = new C0160a();

                private C0160a() {
                }
            }

            private C0159a() {
            }

            public final a a(Application application) {
                w5.k.f(application, "application");
                if (a.f8295g == null) {
                    a.f8295g = new a(application);
                }
                a aVar = a.f8295g;
                w5.k.c(aVar);
                return aVar;
            }

            public /* synthetic */ C0159a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            this(null, 0);
        }

        private final E g(Class cls, Application application) {
            if (!AbstractC0644a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                E e7 = (E) cls.getConstructor(Application.class).newInstance(application);
                w5.k.e(e7, "{\n                try {\n…          }\n            }");
                return e7;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        @Override // androidx.lifecycle.F.c, androidx.lifecycle.F.b
        public E a(Class cls) {
            w5.k.f(cls, "modelClass");
            Application application = this.f8297e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.F.b
        public E b(Class cls, P.a aVar) {
            w5.k.f(cls, "modelClass");
            w5.k.f(aVar, "extras");
            if (this.f8297e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f8296h);
            if (application != null) {
                return g(cls, application);
            }
            if (AbstractC0644a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            w5.k.f(application, "application");
        }

        private a(Application application, int i7) {
            this.f8297e = application;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8299a = a.f8300a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f8300a = new a();

            private a() {
            }
        }

        default E a(Class cls) {
            w5.k.f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default E b(Class cls, P.a aVar) {
            w5.k.f(cls, "modelClass");
            w5.k.f(aVar, "extras");
            return a(cls);
        }
    }

    public static class c implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static c f8302c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f8301b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a.b f8303d = a.C0161a.f8304a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.F$c$a$a, reason: collision with other inner class name */
            private static final class C0161a implements a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0161a f8304a = new C0161a();

                private C0161a() {
                }
            }

            private a() {
            }

            public final c a() {
                if (c.f8302c == null) {
                    c.f8302c = new c();
                }
                c cVar = c.f8302c;
                w5.k.c(cVar);
                return cVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.lifecycle.F.b
        public E a(Class cls) {
            w5.k.f(cls, "modelClass");
            try {
                Object objNewInstance = cls.newInstance();
                w5.k.e(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (E) objNewInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }
    }

    public static class d {
        public abstract void c(E e7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(H h7, b bVar) {
        this(h7, bVar, null, 4, null);
        w5.k.f(h7, "store");
        w5.k.f(bVar, "factory");
    }

    public E a(Class cls) {
        w5.k.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public E b(String str, Class cls) {
        E eA;
        w5.k.f(str, "key");
        w5.k.f(cls, "modelClass");
        E eB = this.f8291a.b(str);
        if (!cls.isInstance(eB)) {
            P.d dVar = new P.d(this.f8293c);
            dVar.c(c.f8303d, str);
            try {
                eA = this.f8292b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                eA = this.f8292b.a(cls);
            }
            this.f8291a.d(str, eA);
            return eA;
        }
        Object obj = this.f8292b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            w5.k.e(eB, "viewModel");
            dVar2.c(eB);
        }
        if (eB != null) {
            return eB;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }

    public F(H h7, b bVar, P.a aVar) {
        w5.k.f(h7, "store");
        w5.k.f(bVar, "factory");
        w5.k.f(aVar, "defaultCreationExtras");
        this.f8291a = h7;
        this.f8292b = bVar;
        this.f8293c = aVar;
    }

    public /* synthetic */ F(H h7, b bVar, P.a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(h7, bVar, (i7 & 4) != 0 ? a.C0052a.f2550b : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(I i7, b bVar) {
        w5.k.f(i7, "owner");
        w5.k.f(bVar, "factory");
        H viewModelStore = i7.getViewModelStore();
        w5.k.e(viewModelStore, "owner.viewModelStore");
        this(viewModelStore, bVar, G.a(i7));
    }
}
