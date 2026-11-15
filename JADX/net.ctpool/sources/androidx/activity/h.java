package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList f4888b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.util.a f4889c;

    public h(boolean z6) {
        this.f4887a = z6;
    }

    void a(a aVar) {
        this.f4888b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f4887a;
    }

    public final void d() {
        Iterator it = this.f4888b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    void e(a aVar) {
        this.f4888b.remove(aVar);
    }

    public final void f(boolean z6) {
        this.f4887a = z6;
        androidx.core.util.a aVar = this.f4889c;
        if (aVar != null) {
            aVar.a(Boolean.valueOf(z6));
        }
    }

    void g(androidx.core.util.a aVar) {
        this.f4889c = aVar;
    }
}
