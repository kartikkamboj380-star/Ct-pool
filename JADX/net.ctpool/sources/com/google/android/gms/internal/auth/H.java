package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class H extends M {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ O1 f13800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(I i7, String str, Object obj, boolean z6, O1 o12) {
        super(i7, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f13800l = o12;
    }

    @Override // com.google.android.gms.internal.auth.M
    final Object a(Object obj) {
        try {
            return I1.q(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.f13825b + ": " + ((String) obj));
            return null;
        }
    }
}
