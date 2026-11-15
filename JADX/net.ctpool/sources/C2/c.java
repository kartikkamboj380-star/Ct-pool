package C2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f946d;

    public c() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final float a() {
        return this.f945c;
    }

    public final float b() {
        return this.f946d;
    }

    public final float c() {
        return this.f943a;
    }

    public final float d() {
        return this.f944b;
    }

    public final boolean e() {
        return this.f943a > 0.0f || this.f944b > 0.0f || this.f945c > 0.0f || this.f946d > 0.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f943a, cVar.f943a) == 0 && Float.compare(this.f944b, cVar.f944b) == 0 && Float.compare(this.f945c, cVar.f945c) == 0 && Float.compare(this.f946d, cVar.f946d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f943a) * 31) + Float.hashCode(this.f944b)) * 31) + Float.hashCode(this.f945c)) * 31) + Float.hashCode(this.f946d);
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f943a + ", topRight=" + this.f944b + ", bottomLeft=" + this.f945c + ", bottomRight=" + this.f946d + ")";
    }

    public c(float f7, float f8, float f9, float f10) {
        this.f943a = f7;
        this.f944b = f8;
        this.f945c = f9;
        this.f946d = f10;
    }
}
