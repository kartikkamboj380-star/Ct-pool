package V3;

/* JADX INFO: loaded from: classes.dex */
final class N extends r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Object f4078o;

    N(Object obj) {
        this.f4078o = U3.h.i(obj);
    }

    @Override // V3.AbstractC0486n
    int c(Object[] objArr, int i7) {
        objArr[i7] = this.f4078o;
        return i7 + 1;
    }

    @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f4078o.equals(obj);
    }

    @Override // V3.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4078o.hashCode();
    }

    @Override // V3.AbstractC0486n
    boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f4078o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return w.c(this.f4078o);
    }
}
