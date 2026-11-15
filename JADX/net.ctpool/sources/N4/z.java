package N4;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0447i f2447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f2448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0440b f2449c;

    public z(EnumC0447i enumC0447i, C c7, C0440b c0440b) {
        w5.k.f(enumC0447i, "eventType");
        w5.k.f(c7, "sessionData");
        w5.k.f(c0440b, "applicationInfo");
        this.f2447a = enumC0447i;
        this.f2448b = c7;
        this.f2449c = c0440b;
    }

    public final C0440b a() {
        return this.f2449c;
    }

    public final EnumC0447i b() {
        return this.f2447a;
    }

    public final C c() {
        return this.f2448b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f2447a == zVar.f2447a && w5.k.b(this.f2448b, zVar.f2448b) && w5.k.b(this.f2449c, zVar.f2449c);
    }

    public int hashCode() {
        return (((this.f2447a.hashCode() * 31) + this.f2448b.hashCode()) * 31) + this.f2449c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f2447a + ", sessionData=" + this.f2448b + ", applicationInfo=" + this.f2449c + ')';
    }
}
