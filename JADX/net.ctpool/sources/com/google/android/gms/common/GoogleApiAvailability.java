package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.AbstractC0559k;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import u0.U;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2271k;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.d.class, com.google.android.gms.internal.base.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final AbstractC2272l zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public AbstractC2272l checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).r(new InterfaceC2271k() { // from class: com.google.android.gms.common.zab
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                int i7 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return AbstractC2275o.f(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i7, int i8) {
        return getErrorDialog(activity, i7, i8, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context context, int i7, String str) {
        return super.getErrorResolutionIntent(context, i7, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i7, int i8) {
        return super.getErrorResolutionPendingIntent(context, i7, i8);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i7) {
        return super.getErrorString(i7);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    @HideFirstParty
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i7) {
        return super.isUserResolvableError(i7);
    }

    public AbstractC2272l makeGooglePlayServicesAvailable(Activity activity) {
        int i7 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i7);
        if (iIsGooglePlayServicesAvailable == 0) {
            return AbstractC2275o.f(null);
        }
        zacc zaccVarZaa = zacc.zaa(activity);
        zaccVarZaa.zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zaccVarZaa.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i7, int i8) {
        return showErrorDialogFragment(activity, i7, i8, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i7) {
        zae(context, i7, null, getErrorResolutionPendingIntent(context, i7, 0, "n"));
    }

    final Dialog zaa(Context context, int i7, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(zac.zac(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strZab = zac.zab(context, i7);
        DialogInterface.OnClickListener onClickListener2 = zagVar;
        if (strZab != null) {
            if (zagVar == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strZab, onClickListener2);
        }
        String strZaf = zac.zaf(context, i7);
        if (strZaf != null) {
            builder.setTitle(strZaf);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        com.google.android.gms.internal.base.n.o(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0640j) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((AbstractActivityC0640j) activity).O(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void zae(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZae = zac.zae(context, i7);
        String strZad = zac.zad(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        AbstractC0559k.e eVarO = new AbstractC0559k.e(context).B(true).h(true).q(strZae).O(new AbstractC0559k.c().h(strZad));
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            eVarO.K(context.getApplicationInfo().icon).F(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                eVarO.a(m3.b.f21227a, resources.getString(m3.c.f21246o), pendingIntent);
            } else {
                eVarO.o(pendingIntent);
            }
        } else {
            eVarO.K(android.R.drawable.stat_sys_warning).Q(resources.getString(m3.c.f21239h)).V(System.currentTimeMillis()).o(pendingIntent).p(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(m3.c.f21238g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(U.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarO.k(str2);
        }
        Notification notificationD = eVarO.d();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, notificationD);
    }

    final void zaf(Context context) {
        new c(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i7, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i7, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i7) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i7, true), com.google.android.gms.internal.base.o.f14076a | 134217728));
        return true;
    }

    public AbstractC2272l checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).r(new InterfaceC2271k() { // from class: com.google.android.gms.common.zaa
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                int i7 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return AbstractC2275o.f(null);
            }
        });
    }

    public Dialog getErrorDialog(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i7, zag.zab(activity, getErrorResolutionIntent(activity, i7, "d"), i8), onCancelListener, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context, int i7) {
        return super.isGooglePlayServicesAvailable(context, i7);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i7, i8, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog getErrorDialog(Fragment fragment, int i7, int i8) {
        return getErrorDialog(fragment, i7, i8, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i7, androidx.activity.result.c cVar, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i7, null, onCancelListener, new b(this, activity, i7, cVar));
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Fragment fragment, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i7, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i7, "d"), i8), onCancelListener, null);
    }
}
