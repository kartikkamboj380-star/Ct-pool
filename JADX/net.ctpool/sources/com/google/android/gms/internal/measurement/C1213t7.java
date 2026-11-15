package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213t7 implements InterfaceC1187q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1183q3 f14912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1183q3 f14913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC1183q3 f14914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC1183q3 f14915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC1183q3 f14916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AbstractC1183q3 f14917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AbstractC1183q3 f14918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AbstractC1183q3 f14919k;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14909a = c1251y3E.d("measurement.rb.attribution.ad_campaign_info", false);
        f14910b = c1251y3E.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        f14911c = c1251y3E.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f14912d = c1251y3E.d("measurement.rb.attribution.client2", true);
        c1251y3E.d("measurement.rb.attribution.dma_fix", true);
        f14913e = c1251y3E.d("measurement.rb.attribution.followup1.service", false);
        c1251y3E.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f14914f = c1251y3E.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f14915g = c1251y3E.d("measurement.rb.attribution.retry_disposition", false);
        f14916h = c1251y3E.d("measurement.rb.attribution.service", true);
        f14917i = c1251y3E.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f14918j = c1251y3E.d("measurement.rb.attribution.uuid_generation", true);
        c1251y3E.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f14919k = c1251y3E.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean b() {
        return ((Boolean) f14912d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean c() {
        return ((Boolean) f14913e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean d() {
        return ((Boolean) f14917i.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean e() {
        return ((Boolean) f14915g.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean f() {
        return ((Boolean) f14919k.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean g() {
        return ((Boolean) f14918j.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean zzb() {
        return ((Boolean) f14909a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean zzc() {
        return ((Boolean) f14910b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean zzd() {
        return ((Boolean) f14911c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean zzg() {
        return ((Boolean) f14914f.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1187q7
    public final boolean zzi() {
        return ((Boolean) f14916h.f()).booleanValue();
    }
}
