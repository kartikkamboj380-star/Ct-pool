package j5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1782A implements Map, Serializable, InterfaceC2227a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1782A f20409m = new C1782A();

    private C1782A() {
    }

    public boolean a(Void r22) {
        w5.k.f(r22, "value");
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public Set d() {
        return C1783B.f20410m;
    }

    public Set e() {
        return C1783B.f20410m;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public int f() {
        return 0;
    }

    public Collection g() {
        return z.f20431m;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
