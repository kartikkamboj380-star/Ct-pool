package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f15906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f15907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f15908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f15909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f15910e;

    a6(String str, String str2, String str3, long j7, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.f15906a = str;
        this.f15907b = str2;
        this.f15908c = str3;
        this.f15909d = j7;
        this.f15910e = obj;
    }
}
