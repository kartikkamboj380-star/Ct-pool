package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zac {
    private static final n.g zaa = new n.g();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i7) {
        return context.getResources().getString(i7 != 1 ? i7 != 2 ? i7 != 3 ? R.string.ok : m3.c.f21232a : m3.c.f21241j : m3.c.f21235d);
    }

    public static String zac(Context context, int i7) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i7 == 1) {
            return resources.getString(m3.c.f21236e, strZaa);
        }
        if (i7 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(m3.c.f21245n) : resources.getString(m3.c.f21242k, strZaa);
        }
        if (i7 == 3) {
            return resources.getString(m3.c.f21233b, strZaa);
        }
        if (i7 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i7 == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i7 == 9) {
            return resources.getString(m3.c.f21240i, strZaa);
        }
        if (i7 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i7) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return resources.getString(m3.c.f21244m, strZaa);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zad(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i7);
    }

    public static String zae(Context context, int i7) {
        String strZah = i7 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i7);
        return strZah == null ? context.getResources().getString(m3.c.f21239h) : strZah;
    }

    public static String zaf(Context context, int i7) {
        String str;
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(m3.c.f21237f);
            case 2:
                return resources.getString(m3.c.f21243l);
            case 3:
                return resources.getString(m3.c.f21234c);
            case 4:
            case 6:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i7;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        n.g gVar = zaa;
        synchronized (gVar) {
            try {
                Locale localeC = androidx.core.os.f.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(zab)) {
                    gVar.clear();
                    zab = localeC;
                }
                String str2 = (String) gVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    gVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
