package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    private final U zai(int i7) {
        if (this.zad.size() <= i7) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (U) sparseArray.get(sparseArray.keyAt(i7));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            U uZai = zai(i7);
            if (uZai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(uZai.f13585a);
                printWriter.println(":");
                uZai.f13586b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        Log.d("AutoManageHelper", "onStart " + this.zaa + " " + String.valueOf(sparseArray));
        if (this.zab.get() == null) {
            for (int i7 = 0; i7 < this.zad.size(); i7++) {
                U uZai = zai(i7);
                if (uZai != null) {
                    uZai.f13586b.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            U uZai = zai(i7);
            if (uZai != null) {
                uZai.f13586b.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i7) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i7 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        U u6 = (U) this.zad.get(i7);
        if (u6 != null) {
            zae(i7);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = u6.f13587c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            U uZai = zai(i7);
            if (uZai != null) {
                uZai.f13586b.connect();
            }
        }
    }

    public final void zad(int i7, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.zad.indexOfKey(i7) < 0, "Already managing a GoogleApiClient with id " + i7);
        V v6 = (V) this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i7 + " " + this.zaa + " " + String.valueOf(v6));
        U u6 = new U(this, i7, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(u6);
        this.zad.put(i7, u6);
        if (this.zaa && v6 == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i7) {
        U u6 = (U) this.zad.get(i7);
        this.zad.remove(i7);
        if (u6 != null) {
            u6.f13586b.unregisterConnectionFailedListener(u6);
            u6.f13586b.disconnect();
        }
    }
}
