package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n.g f8180a = new n.g();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        n.g gVar = f8180a;
        n.g gVar2 = (n.g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new n.g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
