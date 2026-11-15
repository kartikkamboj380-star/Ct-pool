package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class A5 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Comparable f14125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f14126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AbstractC1237w5 f14127o;

    A5(AbstractC1237w5 abstractC1237w5, Comparable comparable, Object obj) {
        this.f14127o = abstractC1237w5;
        this.f14125m = comparable;
        this.f14126n = obj;
    }

    private static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((A5) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e(this.f14125m, entry.getKey()) && e(this.f14126n, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f14125m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14126n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14125m;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14126n;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14127o.r();
        Object obj2 = this.f14126n;
        this.f14126n = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f14125m) + "=" + String.valueOf(this.f14126n);
    }

    A5(AbstractC1237w5 abstractC1237w5, Map.Entry entry) {
        this(abstractC1237w5, (Comparable) entry.getKey(), entry.getValue());
    }
}
