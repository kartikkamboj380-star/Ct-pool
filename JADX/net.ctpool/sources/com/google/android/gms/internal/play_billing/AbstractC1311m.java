package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1311m implements Map, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient AbstractC1315n f15272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient AbstractC1315n f15273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient AbstractC1287g f15274o;

    AbstractC1311m() {
    }

    public static AbstractC1311m d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        AbstractC1279e.a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        AbstractC1279e.a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        AbstractC1279e.a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C1337u.h(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract AbstractC1287g a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1287g values() {
        AbstractC1287g abstractC1287g = this.f15274o;
        if (abstractC1287g != null) {
            return abstractC1287g;
        }
        AbstractC1287g abstractC1287gA = a();
        this.f15274o = abstractC1287gA;
        return abstractC1287gA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC1315n e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract AbstractC1315n f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC1315n entrySet() {
        AbstractC1315n abstractC1315n = this.f15272m;
        if (abstractC1315n != null) {
            return abstractC1315n;
        }
        AbstractC1315n abstractC1315nE = e();
        this.f15272m = abstractC1315nE;
        return abstractC1315nE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1340v.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1315n abstractC1315n = this.f15273n;
        if (abstractC1315n != null) {
            return abstractC1315n;
        }
        AbstractC1315n abstractC1315nF = f();
        this.f15273n = abstractC1315nF;
        return abstractC1315nF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
