package k5;

import j5.AbstractC1800e;
import java.util.Map;
import w5.k;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1834a extends AbstractC1800e {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    public final boolean h(Map.Entry entry) {
        k.f(entry, "element");
        return i(entry);
    }

    public abstract boolean i(Map.Entry entry);

    public abstract /* bridge */ boolean k(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return k((Map.Entry) obj);
        }
        return false;
    }
}
