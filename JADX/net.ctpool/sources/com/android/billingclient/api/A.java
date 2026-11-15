package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.w2;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S2.i f10151b;

    A(Context context) {
        try {
            U2.u.f(context);
            this.f10151b = U2.u.c().g(com.google.android.datatransport.cct.a.f13455g).a("PLAY_BILLING_LIBRARY", w2.class, S2.c.b("proto"), new S2.h() { // from class: C0.z
                @Override // S2.h
                public final Object apply(Object obj) {
                    return ((w2) obj).f();
                }
            });
        } catch (Throwable unused) {
            this.f10150a = true;
        }
    }

    public final void a(w2 w2Var) {
        String str;
        if (this.f10150a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f10151b.a(S2.d.f(w2Var));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        com.google.android.gms.internal.play_billing.A.i("BillingLogger", str);
    }
}
