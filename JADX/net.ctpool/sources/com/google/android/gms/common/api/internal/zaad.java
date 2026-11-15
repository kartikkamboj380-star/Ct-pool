package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public final class zaad {
    private final Map zaa = Collections.synchronizedMap(new WeakHashMap());
    private final Map zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z6, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.zaa) {
            map = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            map2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2273m) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    final void zac(BasePendingResult basePendingResult, boolean z6) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z6));
        basePendingResult.addStatusListener(new C0924c(this, basePendingResult));
    }

    final void zad(C2273m c2273m, boolean z6) {
        this.zab.put(c2273m, Boolean.valueOf(z6));
        c2273m.a().c(new C0925d(this, c2273m));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zae(int i7, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 != 1) {
            str2 = i7 == 3 ? " due to dead object exception." : " due to service disconnection.";
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            zah(true, new Status(20, sb.toString()));
        }
        sb.append(str2);
        if (str != null) {
        }
        zah(true, new Status(20, sb.toString()));
    }

    public final void zaf() {
        zah(false, GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
