package T4;

import androidx.appcompat.app.y;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3273a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f3274b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f3274b = method;
            }

            @Override // T4.l.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f3274b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e7) {
                    throw new RuntimeException("Failed invoking canAccess", e7);
                }
            }
        }

        /* JADX INFO: renamed from: T4.l$b$b, reason: collision with other inner class name */
        class C0074b extends b {
            C0074b() {
                super();
            }

            @Override // T4.l.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (e.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0074b();
            }
            f3273a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f3273a.a(accessibleObject, obj);
    }

    public static R4.n b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return R4.n.ALLOW;
        }
        y.a(it.next());
        throw null;
    }
}
