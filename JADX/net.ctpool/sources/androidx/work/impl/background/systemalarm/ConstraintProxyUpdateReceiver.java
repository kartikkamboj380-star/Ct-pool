package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.E;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import l0.i;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f9345a = i.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Intent f9346m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f9347n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f9348o;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f9346m = intent;
            this.f9347n = context;
            this.f9348o = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f9346m.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f9346m.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f9346m.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f9346m.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.e().a(ConstraintProxyUpdateReceiver.f9345a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.a(this.f9347n, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.a(this.f9347n, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.a(this.f9347n, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.a(this.f9347n, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f9348o.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            E.q(context).w().c(new a(intent, context, goAsync()));
            return;
        }
        i.e().a(f9345a, "Ignoring unknown action " + action);
    }
}
