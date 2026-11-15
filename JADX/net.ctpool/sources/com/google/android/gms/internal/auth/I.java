package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f13802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f13803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f13804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f13805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f13806e;

    public I(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final I a() {
        return new I(null, this.f13802a, this.f13803b, this.f13804c, this.f13805d, false, true, false, null);
    }

    public final I b() {
        if (this.f13803b.isEmpty()) {
            return new I(null, this.f13802a, this.f13803b, this.f13804c, true, false, this.f13806e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final M c(String str, double d7) {
        return new G(this, str, Double.valueOf(0.0d), true);
    }

    public final M d(String str, long j7) {
        return new E(this, str, Long.valueOf(j7), true);
    }

    public final M e(String str, boolean z6) {
        return new F(this, str, Boolean.valueOf(z6), true);
    }

    public final M f(String str, Object obj, O1 o12) {
        return new H(this, "getTokenRefactor__blocked_packages", obj, true, o12);
    }

    private I(String str, Uri uri, String str2, String str3, boolean z6, boolean z7, boolean z8, boolean z9, Q q6) {
        this.f13802a = uri;
        this.f13803b = "";
        this.f13804c = "";
        this.f13805d = z6;
        this.f13806e = z8;
    }
}
