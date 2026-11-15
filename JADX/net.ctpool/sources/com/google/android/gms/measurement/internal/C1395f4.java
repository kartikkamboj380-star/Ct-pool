package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1395f4 implements c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ F3 f16032a;

    C1395f4(F3 f32) {
        this.f16032a = f32;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void g(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f16032a.R0("auto", str2, bundle);
        } else {
            this.f16032a.e0("auto", str2, bundle, str);
        }
    }
}
