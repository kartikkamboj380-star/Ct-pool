package com.google.android.gms.common.api.internal;

import z3.AbstractC2272l;
import z3.C2273m;
import z3.InterfaceC2266f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0925d implements InterfaceC2266f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zaad f13617b;

    C0925d(zaad zaadVar, C2273m c2273m) {
        this.f13617b = zaadVar;
        this.f13616a = c2273m;
    }

    @Override // z3.InterfaceC2266f
    public final void a(AbstractC2272l abstractC2272l) {
        this.f13617b.zab.remove(this.f13616a);
    }
}
