package b4;

/* JADX INFO: renamed from: b4.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f9658b;

    /* JADX INFO: renamed from: b4.E$a */
    private @interface a {
    }

    public C0684E(Class cls, Class cls2) {
        this.f9657a = cls;
        this.f9658b = cls2;
    }

    public static C0684E a(Class cls, Class cls2) {
        return new C0684E(cls, cls2);
    }

    public static C0684E b(Class cls) {
        return new C0684E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0684E.class != obj.getClass()) {
            return false;
        }
        C0684E c0684e = (C0684E) obj;
        if (this.f9658b.equals(c0684e.f9658b)) {
            return this.f9657a.equals(c0684e.f9657a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f9658b.hashCode() * 31) + this.f9657a.hashCode();
    }

    public String toString() {
        if (this.f9657a == a.class) {
            return this.f9658b.getName();
        }
        return "@" + this.f9657a.getName() + " " + this.f9658b.getName();
    }
}
