package R4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f2885m = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f2885m.equals(this.f2885m));
    }

    public int hashCode() {
        return this.f2885m.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f2885m.iterator();
    }

    public void o(f fVar) {
        if (fVar == null) {
            fVar = h.f2886m;
        }
        this.f2885m.add(fVar);
    }
}
