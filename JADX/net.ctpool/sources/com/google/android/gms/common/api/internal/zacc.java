package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public final class zacc extends zap {
    private C2273m zad;

    private zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new C2273m();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zacc zaccVar = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zaccVar == null) {
            return new zacc(fragment);
        }
        if (zaccVar.zad.a().o()) {
            zaccVar.zad = new C2273m();
        }
        return zaccVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.zad.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i7) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.zad.b(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.d(new ApiException(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.zad.e(null);
        } else {
            if (this.zad.a().o()) {
                return;
            }
            zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    public final AbstractC2272l zad() {
        return this.zad.a();
    }
}
