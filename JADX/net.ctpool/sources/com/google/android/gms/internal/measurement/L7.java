package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class L7 implements J7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14265a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14265a = c1251y3E.d("measurement.currency.escape_underscore_fix", true);
        c1251y3E.d("measurement.validation.value_and_currency_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.J7
    public final boolean a() {
        return ((Boolean) f14265a.f()).booleanValue();
    }
}
