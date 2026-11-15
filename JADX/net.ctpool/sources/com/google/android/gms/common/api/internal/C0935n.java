package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0935n extends AbstractC0944x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zaaw f13639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f13640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0935n(BinderC0936o binderC0936o, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.l lVar) {
        super(zabfVar);
        this.f13639b = zaawVar;
        this.f13640c = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0944x
    public final void a() {
        zaaw.zar(this.f13639b, this.f13640c);
    }
}
