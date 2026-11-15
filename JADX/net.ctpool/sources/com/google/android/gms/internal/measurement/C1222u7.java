package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1222u7 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14927a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        c1251y3E.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f14927a = c1251y3E.d("measurement.session_stitching_token_enabled", false);
        c1251y3E.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean zzb() {
        return ((Boolean) f14927a.f()).booleanValue();
    }
}
