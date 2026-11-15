package T4;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3279a = c();

    class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f3280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3281c;

        a(Method method, Object obj) {
            this.f3280b = method;
            this.f3281c = obj;
        }

        @Override // T4.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f3280b.invoke(this.f3281c, cls);
        }
    }

    class b extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f3282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3283c;

        b(Method method, int i7) {
            this.f3282b = method;
            this.f3283c = i7;
        }

        @Override // T4.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f3282b.invoke(null, cls, Integer.valueOf(this.f3283c));
        }
    }

    class c extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f3284b;

        c(Method method) {
            this.f3284b = method;
        }

        @Override // T4.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f3284b.invoke(null, cls, Object.class);
        }
    }

    class d extends n {
        d() {
        }

        @Override // T4.n
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strA = T4.c.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    private static n c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract Object d(Class cls);
}
