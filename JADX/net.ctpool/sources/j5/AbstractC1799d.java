package j5;

import java.util.AbstractList;
import java.util.List;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: j5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1799d extends AbstractList implements List, InterfaceC2228b {
    protected AbstractC1799d() {
    }

    public abstract int f();

    public abstract Object h(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return h(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }
}
