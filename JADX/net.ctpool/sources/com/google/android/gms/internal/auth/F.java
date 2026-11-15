package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class F extends M {
    F(I i7, String str, Boolean bool, boolean z6) {
        super(i7, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        if (AbstractC0981l.f13990c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC0981l.f13991d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f13825b + ": " + ((String) obj));
        return null;
    }
}
