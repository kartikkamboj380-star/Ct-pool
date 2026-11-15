package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1235w3 extends AbstractC1183q3 {
    C1235w3(C1251y3 c1251y3, String str, Double d7, boolean z6) {
        super(c1251y3, str, d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1183q3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
