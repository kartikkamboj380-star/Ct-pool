package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1218u3 extends AbstractC1183q3 {
    C1218u3(C1251y3 c1251y3, String str, Long l7, boolean z6) {
        super(c1251y3, str, l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1183q3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
