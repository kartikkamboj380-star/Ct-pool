package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC1311m;
import com.google.android.gms.internal.play_billing.C1274c2;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.Y1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10349a = 0;

    static {
        AbstractC1311m abstractC1311m = x.f10350a;
    }

    public static S1 a(int i7, int i8, C0751e c0751e) {
        try {
            R1 r1E = S1.E();
            Y1 y1E = C1274c2.E();
            y1E.q(c0751e.b());
            y1E.p(c0751e.a());
            y1E.r(i7);
            r1E.m(y1E);
            r1E.q(i8);
            return (S1) r1E.h();
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }

    public static S1 b(int i7, int i8, C0751e c0751e, String str) {
        try {
            Y1 y1E = C1274c2.E();
            y1E.q(c0751e.b());
            y1E.p(c0751e.a());
            y1E.r(i7);
            if (str != null) {
                y1E.m(str);
            }
            R1 r1E = S1.E();
            r1E.m(y1E);
            r1E.q(i8);
            return (S1) r1E.h();
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }

    public static W1 c(int i7) {
        try {
            V1 v1C = W1.C();
            v1C.p(i7);
            return (W1) v1C.h();
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }
}
