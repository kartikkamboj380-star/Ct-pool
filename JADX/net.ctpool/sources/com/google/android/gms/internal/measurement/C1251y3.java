package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1251y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Uri f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f14981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f14982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f14983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f14984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f14986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final U3.c f14987i;

    public C1251y3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final AbstractC1183q3 a(String str, double d7) {
        return AbstractC1183q3.c(this, str, Double.valueOf(-3.0d), true);
    }

    public final AbstractC1183q3 b(String str, long j7) {
        return AbstractC1183q3.d(this, str, Long.valueOf(j7), true);
    }

    public final AbstractC1183q3 c(String str, String str2) {
        return AbstractC1183q3.e(this, str, str2, true);
    }

    public final AbstractC1183q3 d(String str, boolean z6) {
        return AbstractC1183q3.b(this, str, Boolean.valueOf(z6), true);
    }

    public final C1251y3 e() {
        return new C1251y3(this.f14979a, this.f14980b, this.f14981c, this.f14982d, this.f14983e, this.f14984f, true, this.f14986h, this.f14987i);
    }

    public final C1251y3 f() {
        if (!this.f14981c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        U3.c cVar = this.f14987i;
        if (cVar == null) {
            return new C1251y3(this.f14979a, this.f14980b, this.f14981c, this.f14982d, true, this.f14984f, this.f14985g, this.f14986h, cVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private C1251y3(String str, Uri uri, String str2, String str3, boolean z6, boolean z7, boolean z8, boolean z9, U3.c cVar) {
        this.f14979a = str;
        this.f14980b = uri;
        this.f14981c = str2;
        this.f14982d = str3;
        this.f14983e = z6;
        this.f14984f = z7;
        this.f14985g = z8;
        this.f14986h = z9;
        this.f14987i = cVar;
    }
}
