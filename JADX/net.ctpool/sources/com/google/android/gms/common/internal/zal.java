package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i7) {
        return this.zaa.get(i7, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int zab(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i7 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa == -1) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.zaa.size()) {
                    i7 = -1;
                    break;
                }
                int iKeyAt = this.zaa.keyAt(i8);
                if (iKeyAt > minApkVersion && this.zaa.get(iKeyAt) == 0) {
                    break;
                }
                i8++;
            }
            iZaa = i7 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i7;
            this.zaa.put(minApkVersion, iZaa);
        }
        return iZaa;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
