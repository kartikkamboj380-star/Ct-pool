package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1243x3 extends AbstractC1183q3 {
    C1243x3(C1251y3 c1251y3, String str, Boolean bool, boolean z6) {
        super(c1251y3, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1183q3
    final /* synthetic */ Object h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (P2.f14307c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (P2.f14308d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
