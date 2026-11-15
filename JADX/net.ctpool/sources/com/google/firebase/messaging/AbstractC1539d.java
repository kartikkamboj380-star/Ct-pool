package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.AbstractC0559k;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1539d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f17619a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC0559k.e f17620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17622c;

        a(AbstractC0559k.e eVar, String str, int i7) {
            this.f17620a = eVar;
            this.f17621b = str;
            this.f17622c = i7;
        }
    }

    private static PendingIntent a(Context context, M m7, String str, PackageManager packageManager) {
        Intent intentF = f(str, m7, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(m7.y());
        if (q(m7)) {
            intentF.putExtra("gcm.n.analytics_data", m7.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, M m7) {
        if (q(m7)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(m7.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, M m7, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        AbstractC0559k.e eVar = new AbstractC0559k.e(context2, str);
        String strN = m7.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.q(strN);
        }
        String strN2 = m7.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.p(strN2);
            eVar.O(new AbstractC0559k.c().h(strN2));
        }
        eVar.K(m(packageManager, resources, packageName, m7.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, m7, resources);
        if (uriN != null) {
            eVar.N(uriN);
        }
        eVar.o(a(context, m7, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, m7);
        if (pendingIntentB != null) {
            eVar.s(pendingIntentB);
        }
        Integer numH = h(context2, m7.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.m(numH.intValue());
        }
        eVar.h(!m7.a("gcm.n.sticky"));
        eVar.B(m7.a("gcm.n.local_only"));
        String strP = m7.p("gcm.n.ticker");
        if (strP != null) {
            eVar.Q(strP);
        }
        Integer numM = m7.m();
        if (numM != null) {
            eVar.F(numM.intValue());
        }
        Integer numR = m7.r();
        if (numR != null) {
            eVar.U(numR.intValue());
        }
        Integer numL = m7.l();
        if (numL != null) {
            eVar.C(numL.intValue());
        }
        Long lJ = m7.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.J(true);
            eVar.V(lJ.longValue());
        }
        long[] jArrQ = m7.q();
        if (jArrQ != null) {
            eVar.T(jArrQ);
        }
        int[] iArrE = m7.e();
        if (iArrE != null) {
            eVar.A(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.r(i(m7));
        return new a(eVar, o(m7), 0);
    }

    static a e(Context context, M m7) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, m7, k(context, m7.k(), bundleJ), bundleJ);
    }

    private static Intent f(String str, M m7, PackageManager packageManager) {
        String strP = m7.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = m7.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f17619a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.b.c(context, i7));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(M m7) {
        boolean zA = m7.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (m7.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return m7.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(u0.U.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i7) {
        return i7 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0 || !p(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
            }
        }
        return (i7 == 0 || !p(resources, i7)) ? R.drawable.sym_def_app_icon : i7;
    }

    private static Uri n(String str, M m7, Resources resources) {
        String strO = m7.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String o(M m7) {
        String strP = m7.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC1538c.a(resources.getDrawable(i7, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(M m7) {
        return m7.a("google.c.a.e");
    }
}
