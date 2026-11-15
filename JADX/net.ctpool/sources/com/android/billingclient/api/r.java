package com.android.billingclient.api;

import C0.InterfaceC0340g;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0340g f10339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0749c f10340c;

    r(C0749c c0749c, String str, InterfaceC0340g interfaceC0340g) {
        this.f10338a = str;
        this.f10339b = interfaceC0340g;
        this.f10340c = c0749c;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        v vVarF0 = C0749c.f0(this.f10340c, this.f10338a);
        this.f10339b.a(vVarF0.a(), vVarF0.b());
        return null;
    }
}
