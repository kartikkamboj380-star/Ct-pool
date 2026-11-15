package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18586d;

    public a(float f7, float f8, float f9, float f10) {
        this.f18583a = f7;
        this.f18584b = f8;
        this.f18585c = f9;
        this.f18586d = f10;
    }

    public final float a() {
        return this.f18585c;
    }

    public final float b() {
        return this.f18586d;
    }

    public final float c() {
        return this.f18584b;
    }

    public final float d() {
        return this.f18583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f18583a, aVar.f18583a) == 0 && Float.compare(this.f18584b, aVar.f18584b) == 0 && Float.compare(this.f18585c, aVar.f18585c) == 0 && Float.compare(this.f18586d, aVar.f18586d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f18583a) * 31) + Float.hashCode(this.f18584b)) * 31) + Float.hashCode(this.f18585c)) * 31) + Float.hashCode(this.f18586d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f18583a + ", right=" + this.f18584b + ", bottom=" + this.f18585c + ", left=" + this.f18586d + ")";
    }
}
