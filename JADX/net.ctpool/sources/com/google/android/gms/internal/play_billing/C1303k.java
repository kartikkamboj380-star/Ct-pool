package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1303k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15208c;

    C1303k(Object obj, Object obj2, Object obj3) {
        this.f15206a = obj;
        this.f15207b = obj2;
        this.f15208c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f15208c;
        Object obj2 = this.f15207b;
        Object obj3 = this.f15206a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
