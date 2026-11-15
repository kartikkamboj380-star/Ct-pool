package S5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.notifee.core.Logger;
import app.notifee.core.NotificationReceiverActivity;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static PendingIntent a(int i7, Bundle bundle, int i8, String[] strArr, Bundle... bundleArr) {
        Intent[] intentArr;
        NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle;
        Context context = e.f2956a;
        Intent intent = null;
        if (bundle != null && (notificationAndroidPressActionModelFromBundle = NotificationAndroidPressActionModel.fromBundle(bundle)) != null && (notificationAndroidPressActionModelFromBundle.getLaunchActivity() != null || notificationAndroidPressActionModelFromBundle.getMainComponent() != null)) {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                String launchActivity = notificationAndroidPressActionModelFromBundle != null ? notificationAndroidPressActionModelFromBundle.getLaunchActivity() : null;
                Boolean boolValueOf = Boolean.valueOf(launchIntentForPackage == null);
                if (launchIntentForPackage != null) {
                    boolValueOf = Boolean.valueOf((launchActivity == "default" || launchIntentForPackage.getComponent().getClassName() == launchActivity) ? false : true);
                }
                if (launchActivity != null && boolValueOf.booleanValue()) {
                    Intent intent2 = new Intent(context, (Class<?>) i.a(launchActivity));
                    intent2.setPackage(null);
                    intent2.setFlags(270532608);
                    launchIntentForPackage = intent2;
                }
                if (notificationAndroidPressActionModelFromBundle.getLaunchActivityFlags() != -1) {
                    launchIntentForPackage.setFlags(notificationAndroidPressActionModelFromBundle.getLaunchActivityFlags());
                }
                if (notificationAndroidPressActionModelFromBundle.getMainComponent() != null) {
                    launchIntentForPackage.putExtra("mainComponent", notificationAndroidPressActionModelFromBundle.getMainComponent());
                    f.b(new j(notificationAndroidPressActionModelFromBundle.getMainComponent()));
                }
                intent = launchIntentForPackage;
            } catch (Exception e7) {
                Logger.e("NotificationPendingIntent", "Failed to create LaunchActivityIntent for notification " + i7, e7);
            }
        }
        Intent intent3 = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
        b(intent, i8, i7, strArr, bundleArr);
        b(intent3, i8, i7, strArr, bundleArr);
        int iHashCode = UUID.randomUUID().hashCode();
        if (intent != null) {
            intent3.setFlags(603979776);
            intentArr = new Intent[]{intent, intent3};
        } else {
            intent3.setFlags(403177472);
            intentArr = new Intent[]{intent3};
        }
        return PendingIntent.getActivities(context, iHashCode, intentArr, 167772160);
    }

    public static void b(Intent intent, int i7, int i8, String[] strArr, Bundle... bundleArr) {
        if (intent == null) {
            return;
        }
        intent.putExtra("notifee_event_type", i7);
        intent.putExtra("notification_id", i8);
        for (int i9 = 0; i9 < strArr.length; i9++) {
            String str = strArr[i9];
            if (i9 <= bundleArr.length - 1) {
                intent.putExtra(str, bundleArr[i9]);
            } else {
                intent.putExtra(str, (String) null);
            }
        }
    }
}
