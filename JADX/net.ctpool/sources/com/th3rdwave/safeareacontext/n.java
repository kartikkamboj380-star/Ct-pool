package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f18617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f18618c;

    public n(a aVar, o oVar, m mVar) {
        w5.k.f(aVar, "insets");
        w5.k.f(oVar, "mode");
        w5.k.f(mVar, "edges");
        this.f18616a = aVar;
        this.f18617b = oVar;
        this.f18618c = mVar;
    }

    public final m a() {
        return this.f18618c;
    }

    public final a b() {
        return this.f18616a;
    }

    public final o c() {
        return this.f18617b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return w5.k.b(this.f18616a, nVar.f18616a) && this.f18617b == nVar.f18617b && w5.k.b(this.f18618c, nVar.f18618c);
    }

    public int hashCode() {
        return (((this.f18616a.hashCode() * 31) + this.f18617b.hashCode()) * 31) + this.f18618c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f18616a + ", mode=" + this.f18617b + ", edges=" + this.f18618c + ")";
    }
}
