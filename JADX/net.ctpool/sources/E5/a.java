package E5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f1042a;

    public a(d dVar) {
        w5.k.f(dVar, "sequence");
        this.f1042a = new AtomicReference(dVar);
    }

    @Override // E5.d
    public Iterator iterator() {
        d dVar = (d) this.f1042a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
