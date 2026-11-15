package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1125k implements InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Double f14658m;

    public C1125k(Double d7) {
        if (d7 == null) {
            this.f14658m = Double.valueOf(Double.NaN);
        } else {
            this.f14658m = d7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return this.f14658m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        if (Double.isNaN(this.f14658m.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f14658m.doubleValue())) {
            return this.f14658m.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f14658m.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : AbstractC1116j.a(bigDecimalValueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i7 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i7 >= 0 || i7 <= -7) && (i7 < 0 || i7 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1125k) {
            return this.f14658m.equals(((C1125k) obj).f14658m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14658m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        if ("toString".equals(str)) {
            return new C1214u(c());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", c(), str));
    }

    public final String toString() {
        return c();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return new C1125k(this.f14658m);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.valueOf((Double.isNaN(this.f14658m.doubleValue()) || this.f14658m.doubleValue() == 0.0d) ? false : true);
    }
}
