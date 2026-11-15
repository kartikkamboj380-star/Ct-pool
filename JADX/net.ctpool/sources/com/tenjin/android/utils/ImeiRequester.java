package com.tenjin.android.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.tenjin.android.TenjinSDK;

/* JADX INFO: loaded from: classes.dex */
public class ImeiRequester {
    private static final String TAG = "ImeiRequester";
    private String imei;

    @SuppressLint({"MissingPermission"})
    public ImeiRequester(Context context) {
        String str;
        if (context == null) {
            Log.e(TAG, "invalid input param");
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            TenjinSDK.AppStoreType appStore = TenjinSDK.getAppStore();
            if (appStore != TenjinSDK.AppStoreType.googleplay && appStore != TenjinSDK.AppStoreType.unspecified) {
                this.imei = telephonyManager.getDeviceId();
            }
            Log.d(TAG, "IMEI " + this.imei);
        } catch (SecurityException unused) {
            str = "IMEI request failed with SecurityException";
            Log.e(TAG, str);
        } catch (Exception unused2) {
            str = "IMEI request failed";
            Log.e(TAG, str);
        }
    }

    public String getImei() {
        return this.imei;
    }
}
