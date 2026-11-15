package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class I extends LinkedHashMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final I f7536n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7537m;

    static {
        I i7 = new I();
        f7536n = i7;
        i7.k();
    }

    private I() {
        this.f7537m = true;
    }

    static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(Object obj) {
        return obj instanceof byte[] ? AbstractC0629y.d((byte[]) obj) : obj.hashCode();
    }

    private static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC0629y.a(obj);
            AbstractC0629y.a(map.get(obj));
        }
    }

    public static I e() {
        return f7536n;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean i(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f7537m;
    }

    public void k() {
        this.f7537m = false;
    }

    public void l(I i7) {
        g();
        if (i7.isEmpty()) {
            return;
        }
        putAll(i7);
    }

    public I m() {
        return isEmpty() ? new I() : new I(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC0629y.a(obj);
        AbstractC0629y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        g();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    private I(Map map) {
        super(map);
        this.f7537m = true;
    }
}
