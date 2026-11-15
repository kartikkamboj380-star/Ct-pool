package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0934m extends AbstractRunnableC0938q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f13637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ zaaw f13638o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934m(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.f13638o = zaawVar;
        this.f13637n = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC0938q
    public final void a() {
        zaaw zaawVar = this.f13638o;
        zaawVar.zaa.zag.zad = zaaw.zao(zaawVar);
        ArrayList arrayList = this.f13637n;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Api.Client client = (Api.Client) arrayList.get(i7);
            zaaw zaawVar2 = this.f13638o;
            client.getRemoteService(zaawVar2.zao, zaawVar2.zaa.zag.zad);
        }
    }
}
