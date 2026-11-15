package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC1311m;
import com.google.android.gms.internal.play_billing.D2;
import com.google.android.gms.internal.play_billing.EnumC1290g2;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.W1;

/* JADX INFO: loaded from: classes.dex */
interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1311m f10350a = AbstractC1311m.d("com.android.vending.billing.PURCHASES_UPDATED", EnumC1290g2.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", EnumC1290g2.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", EnumC1290g2.ALTERNATIVE_BILLING_ACTION);

    void a(D2 d22);

    void b(W1 w12, int i7);

    void c(W1 w12);

    void d(S1 s12, int i7);

    void e(S1 s12);
}
