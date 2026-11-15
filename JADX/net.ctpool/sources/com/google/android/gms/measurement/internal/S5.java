package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class S5 implements c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ H5 f15800a;

    S5(H5 h52) {
        this.f15800a = h52;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void g(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f15800a.f().B(new U5(this, str, str2, bundle));
        } else if (this.f15800a.f15600l != null) {
            this.f15800a.f15600l.d().E().b("AppId not known when logging event", str2);
        }
    }
}
