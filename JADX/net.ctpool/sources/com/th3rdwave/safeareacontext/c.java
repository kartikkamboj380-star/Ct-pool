package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18593d;

    public c(float f7, float f8, float f9, float f10) {
        this.f18590a = f7;
        this.f18591b = f8;
        this.f18592c = f9;
        this.f18593d = f10;
    }

    public final float a() {
        return this.f18593d;
    }

    public final float b() {
        return this.f18592c;
    }

    public final float c() {
        return this.f18590a;
    }

    public final float d() {
        return this.f18591b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f18590a, cVar.f18590a) == 0 && Float.compare(this.f18591b, cVar.f18591b) == 0 && Float.compare(this.f18592c, cVar.f18592c) == 0 && Float.compare(this.f18593d, cVar.f18593d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f18590a) * 31) + Float.hashCode(this.f18591b)) * 31) + Float.hashCode(this.f18592c)) * 31) + Float.hashCode(this.f18593d);
    }

    public String toString() {
        return "Rect(x=" + this.f18590a + ", y=" + this.f18591b + ", width=" + this.f18592c + ", height=" + this.f18593d + ")";
    }
}
