package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, Intent intent, int i7) {
        return new a(intent, activity, i7);
    }

    public static zag zac(Fragment fragment, Intent intent, int i7) {
        return new b(intent, fragment, i7);
    }

    public static zag zad(LifecycleFragment lifecycleFragment, Intent intent, int i7) {
        return new c(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
