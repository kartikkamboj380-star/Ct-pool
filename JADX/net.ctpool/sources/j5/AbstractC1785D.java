package j5;

import java.util.Iterator;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1785D implements Iterator, InterfaceC2227a {
    public abstract long d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
