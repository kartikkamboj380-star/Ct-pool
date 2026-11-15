package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7262b;

    public c(Object obj, Object obj2) {
        this.f7261a = obj;
        this.f7262b = obj2;
    }

    public static c a(Object obj, Object obj2) {
        return new c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f7261a, this.f7261a) && b.a(cVar.f7262b, this.f7262b);
    }

    public int hashCode() {
        Object obj = this.f7261a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7262b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f7261a + " " + this.f7262b + "}";
    }
}
