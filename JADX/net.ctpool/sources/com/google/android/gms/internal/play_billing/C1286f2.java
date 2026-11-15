package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1286f2 implements InterfaceC1341v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final InterfaceC1341v0 f15180a = new C1286f2();

    private C1286f2() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1341v0
    public final boolean d(int i7) {
        EnumC1290g2 enumC1290g2 = EnumC1290g2.BROADCAST_ACTION_UNSPECIFIED;
        return (i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC1290g2.ALTERNATIVE_BILLING_ACTION : EnumC1290g2.LOCAL_PURCHASES_UPDATED_ACTION : EnumC1290g2.PURCHASES_UPDATED_ACTION : EnumC1290g2.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
