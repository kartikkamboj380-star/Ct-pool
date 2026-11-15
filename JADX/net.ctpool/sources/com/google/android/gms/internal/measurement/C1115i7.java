package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115i7 implements InterfaceC1124j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14626a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        c1251y3E.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f14626a = c1251y3E.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c1251y3E.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1124j7
    public final boolean a() {
        return ((Boolean) f14626a.f()).booleanValue();
    }
}
