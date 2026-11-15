package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class G extends M {
    G(I i7, String str, Double d7, boolean z6) {
        super(i7, str, d7, true, null);
    }

    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f13825b + ": " + ((String) obj));
            return null;
        }
    }
}
