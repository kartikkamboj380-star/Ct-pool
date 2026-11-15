package b4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class x implements D4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f9727b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f9726a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f9726a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f9726a.iterator();
            while (it.hasNext()) {
                this.f9727b.add(((D4.b) it.next()).get());
            }
            this.f9726a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(D4.b bVar) {
        Set set;
        D4.b bVar2;
        try {
            if (this.f9727b == null) {
                set = this.f9726a;
                bVar2 = bVar;
            } else {
                set = this.f9727b;
                bVar2 = bVar.get();
            }
            set.add(bVar2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D4.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f9727b == null) {
            synchronized (this) {
                try {
                    if (this.f9727b == null) {
                        this.f9727b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f9727b);
    }
}
