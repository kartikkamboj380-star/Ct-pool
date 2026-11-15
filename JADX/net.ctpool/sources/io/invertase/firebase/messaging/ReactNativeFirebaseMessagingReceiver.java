package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.AbstractServiceC0825h;
import com.google.firebase.messaging.V;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static HashMap f20123a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
        if (io.invertase.firebase.app.a.a() == null) {
            io.invertase.firebase.app.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.e("RNFirebaseMsgReceiver", "broadcast intent received with no extras");
            return;
        }
        V v6 = new V(intent.getExtras());
        g5.g gVarI = g5.g.i();
        if (v6.h1() != null) {
            f20123a.put(v6.B0(), v6);
            s.a().b().c(v6);
        }
        if (g5.m.c(context)) {
            gVarI.o(q.h(v6, Boolean.FALSE));
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra("message", v6);
            if (context.startService(intent2) != null) {
                AbstractServiceC0825h.e(context);
            }
        } catch (IllegalStateException e7) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e7);
        }
    }
}
