package app.notifee.core.event;

import app.notifee.core.KeepForSdk;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class ForegroundServiceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationModel f9549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodCallResult f9550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9551c = false;

    public ForegroundServiceEvent(NotificationModel notificationModel, MethodCallResult methodCallResult) {
        this.f9549a = notificationModel;
        this.f9550b = methodCallResult;
    }

    @KeepForSdk
    public NotificationModel getNotification() {
        return this.f9549a;
    }

    @KeepForSdk
    public void setCompletionResult() {
        if (this.f9551c) {
            return;
        }
        this.f9551c = true;
        this.f9550b.onComplete(null, null);
    }
}
