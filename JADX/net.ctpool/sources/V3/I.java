package V3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class I extends AbstractC0487o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final AbstractC0487o f4047q = new I(new Object[0], 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Object[] f4048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient int f4049p;

    I(Object[] objArr, int i7) {
        this.f4048o = objArr;
        this.f4049p = i7;
    }

    @Override // V3.AbstractC0487o, V3.AbstractC0486n
    int c(Object[] objArr, int i7) {
        System.arraycopy(this.f4048o, 0, objArr, i7, this.f4049p);
        return i7 + this.f4049p;
    }

    @Override // V3.AbstractC0486n
    Object[] f() {
        return this.f4048o;
    }

    @Override // java.util.List
    public Object get(int i7) {
        U3.h.g(i7, this.f4049p);
        Object obj = this.f4048o[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // V3.AbstractC0486n
    int h() {
        return this.f4049p;
    }

    @Override // V3.AbstractC0486n
    int i() {
        return 0;
    }

    @Override // V3.AbstractC0486n
    boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4049p;
    }
}
