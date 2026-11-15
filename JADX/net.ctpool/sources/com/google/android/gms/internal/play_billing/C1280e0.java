package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1280e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15170b;

    C1280e0(Object obj, int i7) {
        this.f15169a = obj;
        this.f15170b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1280e0)) {
            return false;
        }
        C1280e0 c1280e0 = (C1280e0) obj;
        return this.f15169a == c1280e0.f15169a && this.f15170b == c1280e0.f15170b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15169a) * 65535) + this.f15170b;
    }
}
