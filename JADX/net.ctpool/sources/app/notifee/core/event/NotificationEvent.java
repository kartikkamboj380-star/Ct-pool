package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.KeepForSdk;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NotificationEvent {

    @KeepForSdk
    public static final int TYPE_ACTION_PRESS = 2;

    @KeepForSdk
    public static final int TYPE_DELIVERED = 3;

    @KeepForSdk
    public static final int TYPE_DISMISSED = 0;

    @KeepForSdk
    public static final int TYPE_FG_ALREADY_EXIST = 8;

    @KeepForSdk
    public static final int TYPE_PRESS = 1;

    @KeepForSdk
    public static final int TYPE_TRIGGER_NOTIFICATION_CREATED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f9557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationModel f9558c;

    public NotificationEvent(int i7, NotificationModel notificationModel) {
        this.f9556a = i7;
        this.f9558c = notificationModel;
        this.f9557b = null;
    }

    @KeepForSdk
    public Bundle getExtras() {
        return this.f9557b;
    }

    @KeepForSdk
    public NotificationModel getNotification() {
        return this.f9558c;
    }

    @KeepForSdk
    public int getType() {
        return this.f9556a;
    }

    public NotificationEvent(int i7, NotificationModel notificationModel, Bundle bundle) {
        this.f9556a = i7;
        this.f9558c = notificationModel;
        this.f9557b = bundle;
    }
}
