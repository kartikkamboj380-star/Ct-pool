package app.notifee.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import u0.w0;

/* JADX INFO: loaded from: classes.dex */
public class NotificationAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w0.f(intent.getExtras());
    }
}
