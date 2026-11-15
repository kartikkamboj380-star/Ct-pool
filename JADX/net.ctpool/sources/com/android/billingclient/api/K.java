package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C0751e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
abstract class K {
    static J a(Bundle bundle, String str, String str2) {
        C0751e c0751e = y.f10366j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("%s got null owned items list", str2));
            return new J(c0751e, 54);
        }
        int iB = com.google.android.gms.internal.play_billing.A.b(bundle, "BillingClient");
        String strE = com.google.android.gms.internal.play_billing.A.e(bundle, "BillingClient");
        C0751e.a aVarC = C0751e.c();
        aVarC.c(iB);
        aVarC.b(strE);
        C0751e c0751eA = aVarC.a();
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new J(c0751eA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new J(c0751e, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new J(c0751e, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new J(c0751e, 57);
        }
        if (stringArrayList3 != null) {
            return new J(y.f10368l, 1);
        }
        com.google.android.gms.internal.play_billing.A.i("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new J(c0751e, 58);
    }
}
