package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f15336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f15337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f15338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f15339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f15340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f15341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f15342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f15343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f15344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f15345k;

    A(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j9 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        this.f15335a = str;
        this.f15336b = str2;
        this.f15337c = j7;
        this.f15338d = j8;
        this.f15339e = j9;
        this.f15340f = j10;
        this.f15341g = j11;
        this.f15342h = l7;
        this.f15343i = l8;
        this.f15344j = l9;
        this.f15345k = bool;
    }

    final A a(long j7) {
        return new A(this.f15335a, this.f15336b, this.f15337c, this.f15338d, this.f15339e, j7, this.f15341g, this.f15342h, this.f15343i, this.f15344j, this.f15345k);
    }

    final A b(long j7, long j8) {
        return new A(this.f15335a, this.f15336b, this.f15337c, this.f15338d, this.f15339e, this.f15340f, j7, Long.valueOf(j8), this.f15343i, this.f15344j, this.f15345k);
    }

    final A c(Long l7, Long l8, Boolean bool) {
        return new A(this.f15335a, this.f15336b, this.f15337c, this.f15338d, this.f15339e, this.f15340f, this.f15341g, this.f15342h, l7, l8, (bool == null || bool.booleanValue()) ? bool : null);
    }

    A(String str, String str2, long j7, long j8, long j9, long j10, Long l7, Long l8, Long l9, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j9, 0L, null, null, null, null);
    }
}
