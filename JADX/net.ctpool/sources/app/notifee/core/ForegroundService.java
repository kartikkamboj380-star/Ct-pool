package app.notifee.core;

import S5.e;
import S5.f;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.T;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: loaded from: classes.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f9532m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f9533n = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Exception exc, Void r22) {
        stopForeground(true);
        f9532m = null;
        f9533n = -1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        int foregroundServiceType;
        if (intent == null || "app.notifee.core.ForegroundService.STOP".equals(intent.getAction())) {
            stopSelf();
            f9532m = null;
            f9533n = -1;
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 2;
        }
        int i9 = extras.getInt("hashCode");
        Notification notification = (Notification) extras.getParcelable("notification");
        Bundle bundle = extras.getBundle("notificationBundle");
        if (!(bundle != null) || !(notification != null)) {
            return 2;
        }
        NotificationModel notificationModel = new NotificationModel(bundle);
        String str = f9532m;
        if (str == null) {
            f9532m = notificationModel.c();
            if (Build.VERSION.SDK_INT >= 29) {
                int foregroundServiceType2 = notificationModel.a().getForegroundServiceType();
                startForeground(i9, notification, foregroundServiceType2);
                f9533n = foregroundServiceType2;
            } else {
                startForeground(i9, notification);
            }
            f.a(new ForegroundServiceEvent(notificationModel, new MethodCallResult() { // from class: u0.e
                @Override // app.notifee.core.interfaces.MethodCallResult
                public final void onComplete(Exception exc, Object obj) {
                    this.f22447a.b(exc, (Void) obj);
                }
            }));
            return 2;
        }
        if (!str.equals(notificationModel.c())) {
            f.a(new NotificationEvent(8, notificationModel));
            return 2;
        }
        if (Build.VERSION.SDK_INT < 29 || (foregroundServiceType = notificationModel.a().getForegroundServiceType()) == f9533n) {
            T.i(e.f2956a).o(i9, notification);
            return 2;
        }
        startForeground(i9, notification, foregroundServiceType);
        f9533n = foregroundServiceType;
        return 2;
    }
}
