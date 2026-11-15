package R4;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T4.h f2887m = new T4.h(false);

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f2887m.equals(this.f2887m));
    }

    public int hashCode() {
        return this.f2887m.hashCode();
    }

    public void o(String str, f fVar) {
        T4.h hVar = this.f2887m;
        if (fVar == null) {
            fVar = h.f2886m;
        }
        hVar.put(str, fVar);
    }

    public Set p() {
        return this.f2887m.entrySet();
    }
}
