package H5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: H5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0422y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0400j f1464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5.l f1465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f1467e;

    public C0422y(Object obj, AbstractC0400j abstractC0400j, v5.l lVar, Object obj2, Throwable th) {
        this.f1463a = obj;
        this.f1464b = abstractC0400j;
        this.f1465c = lVar;
        this.f1466d = obj2;
        this.f1467e = th;
    }

    public static /* synthetic */ C0422y b(C0422y c0422y, Object obj, AbstractC0400j abstractC0400j, v5.l lVar, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = c0422y.f1463a;
        }
        if ((i7 & 2) != 0) {
            abstractC0400j = c0422y.f1464b;
        }
        AbstractC0400j abstractC0400j2 = abstractC0400j;
        if ((i7 & 4) != 0) {
            lVar = c0422y.f1465c;
        }
        v5.l lVar2 = lVar;
        if ((i7 & 8) != 0) {
            obj2 = c0422y.f1466d;
        }
        Object obj4 = obj2;
        if ((i7 & 16) != 0) {
            th = c0422y.f1467e;
        }
        return c0422y.a(obj, abstractC0400j2, lVar2, obj4, th);
    }

    public final C0422y a(Object obj, AbstractC0400j abstractC0400j, v5.l lVar, Object obj2, Throwable th) {
        return new C0422y(obj, abstractC0400j, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f1467e != null;
    }

    public final void d(C0406m c0406m, Throwable th) {
        AbstractC0400j abstractC0400j = this.f1464b;
        if (abstractC0400j != null) {
            c0406m.n(abstractC0400j, th);
        }
        v5.l lVar = this.f1465c;
        if (lVar != null) {
            c0406m.o(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0422y)) {
            return false;
        }
        C0422y c0422y = (C0422y) obj;
        return w5.k.b(this.f1463a, c0422y.f1463a) && w5.k.b(this.f1464b, c0422y.f1464b) && w5.k.b(this.f1465c, c0422y.f1465c) && w5.k.b(this.f1466d, c0422y.f1466d) && w5.k.b(this.f1467e, c0422y.f1467e);
    }

    public int hashCode() {
        Object obj = this.f1463a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0400j abstractC0400j = this.f1464b;
        int iHashCode2 = (iHashCode + (abstractC0400j == null ? 0 : abstractC0400j.hashCode())) * 31;
        v5.l lVar = this.f1465c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1466d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1467e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f1463a + ", cancelHandler=" + this.f1464b + ", onCancellation=" + this.f1465c + ", idempotentResume=" + this.f1466d + ", cancelCause=" + this.f1467e + ')';
    }

    public /* synthetic */ C0422y(Object obj, AbstractC0400j abstractC0400j, v5.l lVar, Object obj2, Throwable th, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i7 & 2) != 0 ? null : abstractC0400j, (i7 & 4) != 0 ? null : lVar, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
