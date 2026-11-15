package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i7, Activity activity, int i8) {
        return getErrorDialog(i7, activity, i8, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i7, Context context, int i8) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i7, i8);
    }

    @Deprecated
    public static String getErrorString(int i7) {
        return GooglePlayServicesUtilLight.getErrorString(i7);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i7) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i7);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i7, Activity activity, int i8) {
        return showErrorDialogFragment(i7, activity, i8, null);
    }

    @Deprecated
    public static void showErrorNotification(int i7, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i7) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i7)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i7);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i7, i8, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i7) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i7);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i7, activity, null, i8, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i7, Activity activity, Fragment fragment, int i8, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        int i9 = i7;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i9, i8, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i9, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i9, "d"), i8), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
