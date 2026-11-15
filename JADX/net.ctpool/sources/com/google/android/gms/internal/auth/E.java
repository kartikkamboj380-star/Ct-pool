package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class E extends M {
    E(I i7, String str, Long l7, boolean z6) {
        super(i7, str, l7, true, null);
    }

    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f13825b + ": " + ((String) obj));
            return null;
        }
    }
}
