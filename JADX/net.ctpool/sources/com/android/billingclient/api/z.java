package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C1310l2;
import com.google.android.gms.internal.play_billing.C1314m2;
import com.google.android.gms.internal.play_billing.D2;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.v2;
import com.google.android.gms.internal.play_billing.w2;

/* JADX INFO: loaded from: classes.dex */
final class z implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1314m2 f10383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A f10384c;

    z(Context context, C1314m2 c1314m2) {
        this.f10384c = new A(context);
        this.f10383b = c1314m2;
    }

    @Override // com.android.billingclient.api.x
    public final void a(D2 d22) {
        if (d22 == null) {
            return;
        }
        try {
            v2 v2VarE = w2.E();
            v2VarE.q(this.f10383b);
            v2VarE.r(d22);
            this.f10384c.a((w2) v2VarE.h());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.x
    public final void b(W1 w12, int i7) {
        try {
            C1310l2 c1310l2 = (C1310l2) this.f10383b.i();
            c1310l2.m(i7);
            this.f10383b = (C1314m2) c1310l2.h();
            c(w12);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.x
    public final void c(W1 w12) {
        if (w12 == null) {
            return;
        }
        try {
            v2 v2VarE = w2.E();
            v2VarE.q(this.f10383b);
            v2VarE.p(w12);
            this.f10384c.a((w2) v2VarE.h());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.x
    public final void d(S1 s12, int i7) {
        try {
            C1310l2 c1310l2 = (C1310l2) this.f10383b.i();
            c1310l2.m(i7);
            this.f10383b = (C1314m2) c1310l2.h();
            e(s12);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.x
    public final void e(S1 s12) {
        if (s12 == null) {
            return;
        }
        try {
            v2 v2VarE = w2.E();
            v2VarE.q(this.f10383b);
            v2VarE.m(s12);
            this.f10384c.a((w2) v2VarE.h());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to log.", th);
        }
    }
}
