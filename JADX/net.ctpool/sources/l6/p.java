package l6;

import androidx.appcompat.app.y;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f21188d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a[] f21189e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f21190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21192c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f21193a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f21194b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f21195c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final StringBuilder f21196d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class f21197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Class f21198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f21199g;

        a() {
        }

        private boolean b(Method method, Class cls) {
            this.f21196d.setLength(0);
            this.f21196d.append(method.getName());
            StringBuilder sb = this.f21196d;
            sb.append('>');
            sb.append(cls.getName());
            String string = this.f21196d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f21195c.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f21195c.put(string, cls2);
            return false;
        }

        boolean a(Method method, Class cls) {
            Object objPut = this.f21194b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f21194b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class cls) {
            this.f21198f = cls;
            this.f21197e = cls;
            this.f21199g = false;
        }

        void d() {
            if (!this.f21199g) {
                Class superclass = this.f21198f.getSuperclass();
                this.f21198f = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && !name.startsWith("androidx.")) {
                    return;
                }
            }
            this.f21198f = null;
        }

        void e() {
            this.f21193a.clear();
            this.f21194b.clear();
            this.f21195c.clear();
            this.f21196d.setLength(0);
            this.f21197e = null;
            this.f21198f = null;
            this.f21199g = false;
        }
    }

    p(List list, boolean z6, boolean z7) {
        this.f21190a = list;
        this.f21191b = z6;
        this.f21192c = z7;
    }

    private List b(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f21198f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private List c(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f21198f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) {
        StringBuilder sb;
        String str;
        Method[] methods;
        try {
            try {
                methods = aVar.f21198f.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f21198f.getMethods();
                aVar.f21199g = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        m mVar = (m) method.getAnnotation(m.class);
                        if (mVar != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.a(method, cls)) {
                                aVar.f21193a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                            }
                        }
                    } else if (this.f21191b && method.isAnnotationPresent(m.class)) {
                        throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.f21191b && method.isAnnotationPresent(m.class)) {
                    throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e7) {
            String str2 = "Could not inspect methods of " + aVar.f21198f.getName();
            if (this.f21192c) {
                sb = new StringBuilder();
                sb.append(str2);
                str = ". Please consider using EventBus annotation processor to avoid reflection.";
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                str = ". Please make this class visible to EventBus annotation processor to avoid reflection.";
            }
            sb.append(str);
            throw new e(sb.toString(), e7);
        }
    }

    private List e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f21193a);
        aVar.e();
        synchronized (f21189e) {
            int i7 = 0;
            while (true) {
                if (i7 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f21189e;
                    if (aVarArr[i7] == null) {
                        aVarArr[i7] = aVar;
                        break;
                    }
                    i7++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private n6.a f(a aVar) {
        aVar.getClass();
        List list = this.f21190a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                y.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f21189e) {
            for (int i7 = 0; i7 < 4; i7++) {
                try {
                    a[] aVarArr = f21189e;
                    a aVar = aVarArr[i7];
                    if (aVar != null) {
                        aVarArr[i7] = null;
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a();
        }
    }

    List a(Class cls) {
        Map map = f21188d;
        List list = (List) map.get(cls);
        if (list != null) {
            return list;
        }
        List listC = this.f21192c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
