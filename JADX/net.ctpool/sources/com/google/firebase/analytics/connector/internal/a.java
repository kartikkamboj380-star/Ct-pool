package com.google.firebase.analytics.connector.internal;

import V3.AbstractC0487o;
import V3.r;
import android.os.Bundle;
import w3.s;
import w3.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f17350a = r.v("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0487o f17351b = AbstractC0487o.v("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0487o f17352c = AbstractC0487o.u("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0487o f17353d = AbstractC0487o.t("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0487o f17354e = new AbstractC0487o.a().e(t.f22703a).e(t.f22704b).f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC0487o f17355f = AbstractC0487o.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String strA = s.a(str);
        return strA != null ? strA : str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f17351b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC0487o abstractC0487o = f17353d;
        int size = abstractC0487o.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0487o.get(i7);
            i7++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f17354e.contains(str2)) {
            return false;
        }
        AbstractC0487o abstractC0487o = f17355f;
        int size = abstractC0487o.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0487o.get(i7);
            i7++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!g(str) || bundle == null) {
            return false;
        }
        AbstractC0487o abstractC0487o = f17353d;
        int size = abstractC0487o.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0487o.get(i7);
            i7++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                str3 = "fcm_integration";
                break;
            case "fdl":
                str3 = "fdl_integration";
                break;
            case "fiam":
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean f(String str) {
        return !f17350a.contains(str);
    }

    public static boolean g(String str) {
        return !f17352c.contains(str);
    }
}
