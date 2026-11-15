package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f18613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f18614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f18615d;

    public m(l lVar, l lVar2, l lVar3, l lVar4) {
        w5.k.f(lVar, "top");
        w5.k.f(lVar2, "right");
        w5.k.f(lVar3, "bottom");
        w5.k.f(lVar4, "left");
        this.f18612a = lVar;
        this.f18613b = lVar2;
        this.f18614c = lVar3;
        this.f18615d = lVar4;
    }

    public final l a() {
        return this.f18614c;
    }

    public final l b() {
        return this.f18615d;
    }

    public final l c() {
        return this.f18613b;
    }

    public final l d() {
        return this.f18612a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f18612a == mVar.f18612a && this.f18613b == mVar.f18613b && this.f18614c == mVar.f18614c && this.f18615d == mVar.f18615d;
    }

    public int hashCode() {
        return (((((this.f18612a.hashCode() * 31) + this.f18613b.hashCode()) * 31) + this.f18614c.hashCode()) * 31) + this.f18615d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f18612a + ", right=" + this.f18613b + ", bottom=" + this.f18614c + ", left=" + this.f18615d + ")";
    }
}
