package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
abstract class S {
    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void c(Context context) {
        if (U.c(context)) {
            return;
        }
        f(new U.m(), context, g(context));
    }

    static boolean d(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, boolean z6, C2273m c2273m) {
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            U.f(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z6) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c2273m.e(null);
        }
    }

    static AbstractC2272l f(Executor executor, final Context context, final boolean z6) {
        if (!PlatformVersion.isAtLeastQ()) {
            return AbstractC2275o.f(null);
        }
        final C2273m c2273m = new C2273m();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.e(context, z6, c2273m);
            }
        });
        return c2273m.a();
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
