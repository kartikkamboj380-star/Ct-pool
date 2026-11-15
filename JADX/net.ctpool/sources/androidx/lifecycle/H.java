package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f8308a = new HashMap();

    public final void a() {
        Iterator it = this.f8308a.values().iterator();
        while (it.hasNext()) {
            ((E) it.next()).a();
        }
        this.f8308a.clear();
    }

    final E b(String str) {
        return (E) this.f8308a.get(str);
    }

    Set c() {
        return new HashSet(this.f8308a.keySet());
    }

    final void d(String str, E e7) {
        E e8 = (E) this.f8308a.put(str, e7);
        if (e8 != null) {
            e8.d();
        }
    }
}
