package app.notifee.core.model;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidPressActionModel {
    private Bundle mNotificationAndroidPressActionBundle;

    private NotificationAndroidPressActionModel(Bundle bundle) {
        this.mNotificationAndroidPressActionBundle = bundle;
    }

    public static NotificationAndroidPressActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidPressActionModel(bundle);
    }

    public String getId() {
        String string = this.mNotificationAndroidPressActionBundle.getString("id");
        Objects.requireNonNull(string);
        return string;
    }

    public String getLaunchActivity() {
        return this.mNotificationAndroidPressActionBundle.getString("launchActivity");
    }

    public int getLaunchActivityFlags() {
        int i7;
        if (!this.mNotificationAndroidPressActionBundle.containsKey("launchActivityFlags")) {
            return -1;
        }
        ArrayList<Integer> integerArrayList = this.mNotificationAndroidPressActionBundle.getIntegerArrayList("launchActivityFlags");
        Objects.requireNonNull(integerArrayList);
        int i8 = 0;
        for (int i9 = 0; i9 < integerArrayList.size(); i9++) {
            switch (integerArrayList.get(i9).intValue()) {
                case 0:
                    i7 = 1073741824;
                    i8 |= i7;
                    break;
                case 1:
                    i7 = 536870912;
                    i8 |= i7;
                    break;
                case 2:
                    i7 = 268435456;
                    i8 |= i7;
                    break;
                case 3:
                    i7 = 134217728;
                    i8 |= i7;
                    break;
                case 4:
                    i7 = 67108864;
                    i8 |= i7;
                    break;
                case 5:
                    i7 = 33554432;
                    i8 |= i7;
                    break;
                case 6:
                    i7 = 16777216;
                    i8 |= i7;
                    break;
                case 7:
                    i7 = 8388608;
                    i8 |= i7;
                    break;
                case 8:
                    i7 = 4194304;
                    i8 |= i7;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i7 = 2097152;
                    i8 |= i7;
                    break;
                case 10:
                    i7 = 1048576;
                    i8 |= i7;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                    i7 = 524288;
                    i8 |= i7;
                    break;
                case 13:
                    i7 = 262144;
                    i8 |= i7;
                    break;
                case 14:
                    i7 = 131072;
                    i8 |= i7;
                    break;
                case 15:
                    i7 = 65536;
                    i8 |= i7;
                    break;
                case 16:
                    i7 = 32768;
                    i8 |= i7;
                    break;
                case 17:
                    i7 = 16384;
                    i8 |= i7;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    i7 = 8192;
                    i8 |= i7;
                    break;
                case 19:
                    i7 = 4096;
                    i8 |= i7;
                    break;
                case 20:
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = 2048;
                        i8 |= i7;
                    }
                    break;
            }
        }
        return i8;
    }

    public String getMainComponent() {
        return this.mNotificationAndroidPressActionBundle.getString("mainComponent");
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidPressActionBundle.clone();
    }
}
