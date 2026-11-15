package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.A3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1535z5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f16400b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16401a;

    private C1535z5(Map map) {
        HashMap map2 = new HashMap();
        this.f16401a = map2;
        map2.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C1535z5 c(SharedPreferences sharedPreferences) {
        HashMap map = new HashMap();
        String strF = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strF) && strF.length() > 754) {
            map.put("GoogleConsent", String.valueOf(strF.charAt(754)));
        }
        int iA = a(sharedPreferences, "IABTCF_gdprApplies");
        if (iA != -1) {
            map.put("gdprApplies", String.valueOf(iA));
        }
        int iA2 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iA2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(iA2));
        }
        int iA3 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (iA3 != -1) {
            map.put("PolicyVersion", String.valueOf(iA3));
        }
        String strF2 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strF2)) {
            map.put("PurposeConsents", strF2);
        }
        int iA4 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (iA4 != -1) {
            map.put("CmpSdkID", String.valueOf(iA4));
        }
        return new C1535z5(map);
    }

    public static String d(String str, boolean z6) {
        if (!z6 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i7 = 1;
        while (true) {
            if (i7 >= 64) {
                i7 = 0;
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7)) {
                break;
            }
            i7++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i7);
        return String.valueOf(charArray);
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = (String) this.f16401a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = (String) this.f16401a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        if (!"1".equals(this.f16401a.get("GoogleConsent")) || !"1".equals(this.f16401a.get("gdprApplies")) || !"1".equals(this.f16401a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i7 = i();
        if (i7 < 0) {
            return Bundle.EMPTY;
        }
        String str = (String) this.f16401a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(A3.a.AD_STORAGE.f15359m, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(A3.a.AD_PERSONALIZATION.f15359m, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && i7 >= 4) {
            String str3 = A3.a.AD_USER_DATA.f15359m;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int iH = h();
        if (iH < 0 || iH > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iH >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iH & 63));
        }
        int i7 = i();
        if (i7 < 0 || i7 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7));
        }
        Preconditions.checkArgument(true);
        int i8 = "1".equals(this.f16401a.get("gdprApplies")) ? 2 : 0;
        int i9 = i8 | 4;
        if ("1".equals(this.f16401a.get("EnableAdvertiserConsentMode"))) {
            i9 = i8 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1535z5) {
            return g().equalsIgnoreCase(((C1535z5) obj).g());
        }
        return false;
    }

    final String g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f16400b) {
            if (this.f16401a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) this.f16401a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
