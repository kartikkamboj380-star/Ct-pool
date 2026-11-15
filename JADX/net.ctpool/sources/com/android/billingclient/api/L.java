package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC1299j;
import com.google.android.gms.internal.play_billing.C1284f0;
import com.google.android.gms.internal.play_billing.S1;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class L extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ M f10166c;

    L(M m7, boolean z6) {
        this.f10166c = m7;
        this.f10165b = z6;
    }

    private final void d(Bundle bundle, C0751e c0751e, int i7) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f10166c.f10169c.e(w.a(23, i7, c0751e));
            return;
        }
        try {
            this.f10166c.f10169c.e(S1.A(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C1284f0.a()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.A.i("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f10164a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f10165b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f10164a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        try {
            if (this.f10164a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f10165b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.f10164a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f10164a) {
            com.google.android.gms.internal.play_billing.A.i("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f10164a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.A.i("BillingBroadcastManager", "Bundle is null.");
            x xVar = this.f10166c.f10169c;
            C0751e c0751e = y.f10366j;
            xVar.e(w.a(11, 1, c0751e));
            M m7 = this.f10166c;
            if (m7.f10168b != null) {
                m7.f10168b.onPurchasesUpdated(c0751e, null);
                return;
            }
            return;
        }
        C0751e c0751eD = com.google.android.gms.internal.play_billing.A.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i7 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List listG = com.google.android.gms.internal.play_billing.A.g(extras);
            if (c0751eD.b() == 0) {
                this.f10166c.f10169c.c(w.c(i7));
            } else {
                d(extras, c0751eD, i7);
            }
            this.f10166c.f10168b.onPurchasesUpdated(c0751eD, listG);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c0751eD.b() != 0) {
                d(extras, c0751eD, i7);
                this.f10166c.f10168b.onPurchasesUpdated(c0751eD, AbstractC1299j.q());
                return;
            }
            M m8 = this.f10166c;
            M.a(m8);
            M.e(m8);
            com.google.android.gms.internal.play_billing.A.i("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            x xVar2 = this.f10166c.f10169c;
            C0751e c0751e2 = y.f10366j;
            xVar2.e(w.a(77, i7, c0751e2));
            this.f10166c.f10168b.onPurchasesUpdated(c0751e2, AbstractC1299j.q());
        }
    }
}
