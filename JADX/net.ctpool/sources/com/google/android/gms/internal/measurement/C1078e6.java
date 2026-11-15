package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1078e6 implements InterfaceC1087f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14575a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14575a = c1251y3E.d("measurement.service.ad_impression.convert_value_to_double", true);
        c1251y3E.d("measurement.client.ad_impression", true);
        c1251y3E.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c1251y3E.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1087f6
    public final boolean a() {
        return ((Boolean) f14575a.f()).booleanValue();
    }
}
