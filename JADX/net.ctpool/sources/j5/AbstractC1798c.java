package j5;

import java.util.AbstractCollection;
import java.util.Collection;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: j5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1798c extends AbstractCollection implements Collection, InterfaceC2228b {
    protected AbstractC1798c() {
    }

    public abstract int f();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }
}
