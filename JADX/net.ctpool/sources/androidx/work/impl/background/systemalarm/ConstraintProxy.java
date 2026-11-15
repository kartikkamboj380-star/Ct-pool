package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import l0.C1844b;
import l0.i;
import l0.j;
import q0.u;

/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9344a = i.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean zF = false;
        boolean zG = false;
        boolean zI = false;
        boolean z6 = false;
        while (it.hasNext()) {
            C1844b c1844b = ((u) it.next()).f21804j;
            zF |= c1844b.f();
            zG |= c1844b.g();
            zI |= c1844b.i();
            z6 |= c1844b.d() != j.NOT_REQUIRED;
            if (zF && zG && zI && z6) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, zF, zG, zI, z6));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e().a(f9344a, "onReceive : " + intent);
        context.startService(b.b(context));
    }
}
