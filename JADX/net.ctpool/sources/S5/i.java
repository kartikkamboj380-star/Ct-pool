package S5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import app.notifee.core.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static Class a(String str) {
        String className;
        Class<?> cls;
        String str2;
        if (str == null || str.equals("default")) {
            Intent launchIntentForPackage = e.f2956a.getPackageManager().getLaunchIntentForPackage(e.f2956a.getPackageName());
            className = (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) ? null : launchIntentForPackage.getComponent().getClassName();
        } else {
            className = str;
        }
        if (className == null) {
            str2 = "Launch Activity for notification could not be found.";
        } else {
            try {
                cls = Class.forName(className);
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
            str2 = String.format("Launch Activity for notification does not exist ('%s').", str);
        }
        Logger.e("ReceiverService", str2);
        return null;
    }

    public static String b(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            String className = intent.getComponent().getClassName();
            int iLastIndexOf = className.lastIndexOf(".");
            if (iLastIndexOf != -1) {
                return className.substring(iLastIndexOf + 1);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void c(Activity activity, final Intent intent) {
        if (activity == null) {
            Logger.w("IntentUtils", "Activity or intent is null when calling startActivityOnUiThread()");
            return;
        }
        final Context context = e.f2956a;
        if (context == null) {
            Logger.w("IntentUtils", "Unable to get application context when calling startActivityOnUiThread()");
        }
        activity.runOnUiThread(new Runnable() { // from class: S5.h
            @Override // java.lang.Runnable
            public final void run() {
                i.e(context, intent);
            }
        });
    }

    public static boolean d(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
            } catch (Exception e7) {
                Logger.e("IntentUtils", "An error occurred whilst trying to check if intent is available on device", e7);
            }
        }
        return false;
    }

    public static /* synthetic */ void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e7) {
            Logger.e("IntentUtils", "An error occurred whilst trying to start activity on Ui Thread", e7);
        }
    }
}
