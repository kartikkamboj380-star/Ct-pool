package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043a7 implements X6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14513b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14512a = c1251y3E.d("measurement.gbraid_campaign.gbraid.client", true);
        f14513b = c1251y3E.d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzb() {
        return ((Boolean) f14512a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzc() {
        return ((Boolean) f14513b.f()).booleanValue();
    }
}
