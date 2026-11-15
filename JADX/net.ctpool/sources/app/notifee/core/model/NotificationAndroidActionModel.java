package app.notifee.core.model;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.core.app.AbstractC0559k;
import androidx.core.app.Y;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidActionModel {
    private Bundle mNotificationAndroidActionBundle;

    private NotificationAndroidActionModel(Bundle bundle) {
        this.mNotificationAndroidActionBundle = bundle;
    }

    public static NotificationAndroidActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidActionModel(bundle);
    }

    public String getIcon() {
        return this.mNotificationAndroidActionBundle.getString("icon");
    }

    public NotificationAndroidPressActionModel getPressAction() {
        return NotificationAndroidPressActionModel.fromBundle(this.mNotificationAndroidActionBundle.getBundle("pressAction"));
    }

    public Y getRemoteInput(AbstractC0559k.a.C0132a c0132a) {
        if (!this.mNotificationAndroidActionBundle.containsKey("input")) {
            return null;
        }
        Bundle bundle = this.mNotificationAndroidActionBundle.getBundle("input");
        Objects.requireNonNull(bundle);
        Y.d dVar = new Y.d("app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY");
        if (bundle.containsKey("allowFreeFormInput")) {
            dVar.b(bundle.getBoolean("allowFreeFormInput"));
        }
        if (bundle.containsKey("allowGeneratedReplies")) {
            c0132a.d(bundle.getBoolean("allowGeneratedReplies"));
        }
        if (bundle.containsKey("placeholder")) {
            dVar.e(bundle.getCharSequence("placeholder"));
        }
        if (bundle.containsKey("choices")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("choices");
            Objects.requireNonNull(stringArrayList);
            dVar.c((CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]));
        }
        dVar.d(bundle.containsKey("editableChoices") ? bundle.getBoolean("editableChoices") ? 2 : 1 : 0);
        return dVar.a();
    }

    public String getTitle() {
        String string = this.mNotificationAndroidActionBundle.getString("title");
        Objects.requireNonNull(string);
        return string;
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidActionBundle.clone();
    }
}
