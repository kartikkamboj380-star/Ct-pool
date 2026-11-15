package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1476r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f16256d;

    public C1476r2(String str, String str2, Bundle bundle, long j7) {
        this.f16253a = str;
        this.f16254b = str2;
        this.f16256d = bundle == null ? new Bundle() : bundle;
        this.f16255c = j7;
    }

    public static C1476r2 b(E e7) {
        return new C1476r2(e7.f15418m, e7.f15420o, e7.f15419n.n0(), e7.f15421p);
    }

    public final E a() {
        return new E(this.f16253a, new D(new Bundle(this.f16256d)), this.f16254b, this.f16255c);
    }

    public final String toString() {
        return "origin=" + this.f16254b + ",name=" + this.f16253a + ",params=" + String.valueOf(this.f16256d);
    }
}
