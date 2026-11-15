package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import java.util.Iterator;
import java.util.Set;
import n.C1890a;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public final class zal {
    private int zad;
    private final C1890a zab = new C1890a();
    private final C2273m zac = new C2273m();
    private boolean zae = false;
    private final C1890a zaa = new C1890a();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final AbstractC2272l zaa() {
        return this.zac.a();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.c(this.zab);
            } else {
                this.zac.b(new AvailabilityException(this.zaa));
            }
        }
    }
}
