package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1290g2 implements InterfaceC1335t0 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final InterfaceC1338u0 f15190r = new InterfaceC1338u0() { // from class: com.google.android.gms.internal.play_billing.e2
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15192m;

    EnumC1290g2(int i7) {
        this.f15192m = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15192m);
    }
}
