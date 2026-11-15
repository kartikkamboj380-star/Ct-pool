package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 extends LinkedHashMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Z4 f14493n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14494m;

    static {
        Z4 z42 = new Z4();
        f14493n = z42;
        z42.f14494m = false;
    }

    private Z4() {
        this.f14494m = true;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return B4.d((byte[]) obj);
        }
        if (obj instanceof E4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static Z4 b() {
        return f14493n;
    }

    private final void i() {
        if (!this.f14494m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(Z4 z42) {
        i();
        if (z42.isEmpty()) {
            return;
        }
        putAll(z42);
    }

    public final Z4 e() {
        return isEmpty() ? new Z4() : new Z4(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z6;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z6 = true;
                if (z6) {
                    return true;
                }
            } else {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z6 = true;
                    if (z6) {
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
        }
        return false;
    }

    public final void g() {
        this.f14494m = false;
    }

    public final boolean h() {
        return this.f14494m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iA = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        B4.e(obj);
        B4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            B4.e(obj);
            B4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private Z4(Map map) {
        super(map);
        this.f14494m = true;
    }
}
