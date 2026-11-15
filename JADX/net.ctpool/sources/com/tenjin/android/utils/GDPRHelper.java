package com.tenjin.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tenjin.android.config.TenjinConsts;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class GDPRHelper {
    private static final String CONSENT_KEY = "IABTCF_PurposeConsents";
    private final SharedPreferences sharedPreferences;

    public GDPRHelper(Context context) {
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    private boolean hasConsent(int[] iArr, String str) {
        for (int i7 : iArr) {
            if (!resultFromConsentIndex(str, i7)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidTCFString(String str) {
        return Pattern.compile("^[01]{1,12}$").matcher(str).matches();
    }

    private boolean resultFromConsentIndex(String str, int i7) {
        return str.length() >= i7 && str.charAt(i7 - 1) == '1';
    }

    public Boolean getGoogleAdPersonalization() {
        if (this.sharedPreferences.contains(TenjinConsts.GOOGLE_AD_PERSONALIZATION_KEY)) {
            return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.GOOGLE_AD_PERSONALIZATION_KEY, true));
        }
        String string = this.sharedPreferences.getString(CONSENT_KEY, "");
        if (string.isEmpty() || !isValidTCFString(string)) {
            return null;
        }
        return Boolean.valueOf(hasConsent(new int[]{3, 4}, string));
    }

    public Boolean getGoogleAdUserData() {
        if (this.sharedPreferences.contains(TenjinConsts.GOOGLE_AD_USER_DATA_KEY)) {
            return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.GOOGLE_AD_USER_DATA_KEY, true));
        }
        String string = this.sharedPreferences.getString(CONSENT_KEY, "");
        if (string.isEmpty() || !isValidTCFString(string)) {
            return null;
        }
        return Boolean.valueOf(hasConsent(new int[]{1, 7}, string));
    }

    public String getPurposeConsentsTCF() {
        String string = this.sharedPreferences.getString(CONSENT_KEY, "");
        if (string.isEmpty() || !isValidTCFString(string)) {
            return null;
        }
        return string;
    }

    public boolean isGoogleDMADisabled() {
        return this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_GOOGLE_DMA_DISABLED, false);
    }

    public boolean optIn() {
        String string = this.sharedPreferences.getString(CONSENT_KEY, "");
        if (string.isEmpty() || !isValidTCFString(string)) {
            return true;
        }
        return hasConsent(new int[]{1}, string);
    }

    public void setGoogleDMAParameters(boolean z6, boolean z7) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean(TenjinConsts.GOOGLE_AD_PERSONALIZATION_KEY, z6);
        editorEdit.putBoolean(TenjinConsts.GOOGLE_AD_USER_DATA_KEY, z7);
        editorEdit.apply();
    }

    public void setGoogleDMASetting(boolean z6) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean(TenjinConsts.TENJIN_GOOGLE_DMA_DISABLED, z6);
        editorEdit.apply();
    }
}
