package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q f13742e = new q(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f13743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f13744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f13745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f13746d;

    private q(boolean z6, int i7, int i8, String str, Throwable th) {
        this.f13743a = z6;
        this.f13746d = i7;
        this.f13744b = str;
        this.f13745c = th;
    }

    static q b() {
        return f13742e;
    }

    static q c(String str) {
        return new q(false, 1, 5, str, null);
    }

    static q d(String str, Throwable th) {
        return new q(false, 1, 5, str, th);
    }

    static q f(int i7) {
        return new q(true, i7, 1, null, null);
    }

    static q g(int i7, int i8, String str, Throwable th) {
        return new q(false, i7, i8, str, th);
    }

    String a() {
        return this.f13744b;
    }

    final void e() {
        if (this.f13743a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f13745c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f13745c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
