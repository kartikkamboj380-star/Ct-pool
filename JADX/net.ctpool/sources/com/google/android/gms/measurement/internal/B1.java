package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3.r f15374a;

    B1(w3.r rVar) {
        this.f15374a = rVar;
    }

    static B1 a(String str) {
        return new B1((TextUtils.isEmpty(str) || str.length() > 1) ? w3.r.UNINITIALIZED : A3.i(str.charAt(0)));
    }

    final w3.r b() {
        return this.f15374a;
    }

    final String c() {
        return String.valueOf(A3.a(this.f15374a));
    }
}
