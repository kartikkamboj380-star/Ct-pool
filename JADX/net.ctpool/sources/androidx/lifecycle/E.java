package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8288a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f8289b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f8290c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    final void a() {
        this.f8290c = true;
        Map map = this.f8288a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f8288a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f8289b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f8289b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    Object c(String str) {
        Object obj;
        Map map = this.f8288a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f8288a.get(str);
        }
        return obj;
    }

    protected void d() {
    }

    Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f8288a) {
            try {
                obj2 = this.f8288a.get(str);
                if (obj2 == null) {
                    this.f8288a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f8290c) {
            b(obj);
        }
        return obj;
    }
}
