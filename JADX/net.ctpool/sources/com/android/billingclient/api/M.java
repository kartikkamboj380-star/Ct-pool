package com.android.billingclient.api;

import C0.InterfaceC0342i;
import C0.InterfaceC0345l;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0342i f10168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f10169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L f10170d = new L(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L f10171e = new L(this, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10172f;

    M(Context context, InterfaceC0342i interfaceC0342i, C0.A a7, C0.u uVar, InterfaceC0345l interfaceC0345l, x xVar) {
        this.f10167a = context;
        this.f10168b = interfaceC0342i;
        this.f10169c = xVar;
    }

    static /* bridge */ /* synthetic */ C0.u a(M m7) {
        m7.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ InterfaceC0345l e(M m7) {
        m7.getClass();
        return null;
    }

    final InterfaceC0342i d() {
        return this.f10168b;
    }

    final void f() {
        this.f10170d.c(this.f10167a);
        this.f10171e.c(this.f10167a);
    }

    final void g(boolean z6) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f10172f = z6;
        this.f10171e.a(this.f10167a, intentFilter2);
        if (this.f10172f) {
            this.f10170d.b(this.f10167a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f10170d.a(this.f10167a, intentFilter);
        }
    }
}
