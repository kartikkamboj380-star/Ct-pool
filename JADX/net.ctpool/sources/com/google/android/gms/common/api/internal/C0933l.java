package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0933l extends AbstractRunnableC0938q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f13635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ zaaw f13636o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933l(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.f13636o = zaawVar;
        this.f13635n = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC0938q
    public final void a() {
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(this.f13636o.zad);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f13635n.keySet()) {
            if (!client.requiresGooglePlayServices() || ((C0930i) this.f13635n.get(client)).f13631c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i7 = 0;
        int iZab = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i7 < size) {
                iZab = zalVar.zab(this.f13636o.zac, (Api.Client) arrayList.get(i7));
                i7++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i7 < size2) {
                iZab = zalVar.zab(this.f13636o.zac, (Api.Client) arrayList2.get(i7));
                i7++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            zaaw zaawVar = this.f13636o;
            zaawVar.zaa.zal(new C0931j(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.f13636o;
        if (zaawVar2.zam && zaawVar2.zak != null) {
            zaawVar2.zak.zab();
        }
        for (Api.Client client2 : this.f13635n.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.f13635n.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(this.f13636o.zac, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                zaaw zaawVar3 = this.f13636o;
                zaawVar3.zaa.zal(new C0932k(this, zaawVar3, connectionProgressReportCallbacks));
            }
        }
    }
}
