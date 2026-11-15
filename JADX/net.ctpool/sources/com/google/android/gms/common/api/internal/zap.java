package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        this.zad = new com.google.android.gms.internal.base.t(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(ConnectionResult connectionResult, int i7) {
        this.zab.set(null);
        zab(connectionResult, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(V v6) {
        if (v6 == null) {
            return -1;
        }
        return v6.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i7, int i8, Intent intent) {
        V v6 = (V) this.zab.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                } else {
                    if (v6 == null) {
                        return;
                    }
                    if (v6.b().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            zad();
            return;
        } else if (i8 == 0) {
            if (v6 != null) {
                zaa(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, v6.b().toString()), zae(v6));
                return;
            }
            return;
        }
        if (v6 != null) {
            zaa(v6.b(), v6.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae((V) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new V(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        V v6 = (V) this.zab.get();
        if (v6 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", v6.a());
        bundle.putInt("failed_status", v6.b().getErrorCode());
        bundle.putParcelable("failed_resolution", v6.b().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    protected abstract void zab(ConnectionResult connectionResult, int i7);

    protected abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i7) {
        AtomicReference atomicReference;
        V v6 = new V(connectionResult, i7);
        do {
            atomicReference = this.zab;
            if (com.facebook.jni.a.a(atomicReference, null, v6)) {
                this.zad.post(new X(this, v6));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
