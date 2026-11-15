package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c0.AbstractC0708b;
import c0.C0709c;
import c0.InterfaceC0707a;
import f0.AbstractC1642a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f9084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f9085e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f9088c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f9087b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f9086a = new HashMap();

    a(Context context) {
        this.f9088c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (AbstractC1642a.h()) {
            try {
                AbstractC1642a.c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC1642a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f9086a.containsKey(cls)) {
            objB = this.f9086a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC0707a interfaceC0707a = (InterfaceC0707a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = interfaceC0707a.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f9086a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = interfaceC0707a.b(this.f9088c);
                set.remove(cls);
                this.f9086a.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0709c(th2);
            }
        }
        AbstractC1642a.f();
        return objB;
    }

    public static a e(Context context) {
        if (f9084d == null) {
            synchronized (f9085e) {
                try {
                    if (f9084d == null) {
                        f9084d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f9084d;
    }

    void a() {
        try {
            try {
                AbstractC1642a.c("Startup");
                b(this.f9088c.getPackageManager().getProviderInfo(new ComponentName(this.f9088c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e7) {
                throw new C0709c(e7);
            }
        } finally {
            AbstractC1642a.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f9088c.getString(AbstractC0708b.f9961a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0707a.class.isAssignableFrom(cls)) {
                            this.f9087b.add(cls);
                        }
                    }
                }
                Iterator it = this.f9087b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e7) {
                throw new C0709c(e7);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f9085e) {
            try {
                objD = this.f9086a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f9087b.contains(cls);
    }
}
