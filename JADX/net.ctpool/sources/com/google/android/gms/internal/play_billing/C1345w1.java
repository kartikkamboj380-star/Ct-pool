package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1345w1 extends RuntimeException {
    public C1345w1(W0 w02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final B0 a() {
        return new B0(getMessage());
    }
}
