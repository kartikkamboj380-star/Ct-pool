package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1116j {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
