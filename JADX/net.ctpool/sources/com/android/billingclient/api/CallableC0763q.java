package com.android.billingclient.api;

import C0.InterfaceC0341h;
import com.google.android.gms.internal.play_billing.AbstractC1299j;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.android.billingclient.api.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0763q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0341h f10336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0749c f10337c;

    CallableC0763q(C0749c c0749c, String str, InterfaceC0341h interfaceC0341h) {
        this.f10335a = str;
        this.f10336b = interfaceC0341h;
        this.f10337c = c0749c;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C0.D dL = C0749c.L(this.f10337c, this.f10335a, 9);
        if (dL.b() != null) {
            this.f10336b.a(dL.a(), dL.b());
            return null;
        }
        this.f10336b.a(dL.a(), AbstractC1299j.q());
        return null;
    }
}
