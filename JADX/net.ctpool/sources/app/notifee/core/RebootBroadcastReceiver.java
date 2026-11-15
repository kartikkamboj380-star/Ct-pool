package app.notifee.core;

import S5.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import u0.w0;

/* JADX INFO: loaded from: classes.dex */
public class RebootBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i("RebootReceiver", "Received reboot event");
        if (e.f2956a == null) {
            e.a(context.getApplicationContext());
        }
        new w0().j();
    }
}
