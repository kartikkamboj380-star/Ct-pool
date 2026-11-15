package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC1263a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final AbstractC1311m f15139C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15154m;

    static {
        C1307l c1307l = new C1307l();
        for (EnumC1263a enumC1263a : values()) {
            c1307l.a(Integer.valueOf(enumC1263a.f15154m), enumC1263a);
        }
        f15139C = c1307l.b();
    }

    EnumC1263a(int i7) {
        this.f15154m = i7;
    }

    static EnumC1263a e(int i7) {
        AbstractC1311m abstractC1311m = f15139C;
        Integer numValueOf = Integer.valueOf(i7);
        return !abstractC1311m.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC1263a) abstractC1311m.get(numValueOf);
    }
}
