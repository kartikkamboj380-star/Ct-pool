package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.E;
import l0.i;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9350a = i.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e().a(f9350a, "Received intent " + intent);
        try {
            E.q(context).A(goAsync());
        } catch (IllegalStateException e7) {
            i.e().d(f9350a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
