package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1321o1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Comparable f15279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f15280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC1339u1 f15281o;

    C1321o1(AbstractC1339u1 abstractC1339u1, Comparable comparable, Object obj) {
        this.f15281o = abstractC1339u1;
        this.f15279m = comparable;
        this.f15280n = obj;
    }

    private static final boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15279m.compareTo(((C1321o1) obj).f15279m);
    }

    public final Comparable e() {
        return this.f15279m;
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
        return h(this.f15279m, entry.getKey()) && h(this.f15280n, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f15279m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15280n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15279m;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15280n;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f15281o.o();
        Object obj2 = this.f15280n;
        this.f15280n = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f15279m) + "=" + String.valueOf(this.f15280n);
    }
}
