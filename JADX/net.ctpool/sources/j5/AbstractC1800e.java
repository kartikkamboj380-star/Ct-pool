package j5;

import java.util.AbstractSet;
import java.util.Set;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: j5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1800e extends AbstractSet implements Set, InterfaceC2228b {
    protected AbstractC1800e() {
    }

    public abstract int f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }
}
