package p0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s0.InterfaceC2034b;

/* JADX INFO: renamed from: p0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1960c extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1960c(Context context, InterfaceC2034b interfaceC2034b) {
        super(context, interfaceC2034b);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
    }

    @Override // p0.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p0.e
    public void k(Intent intent) {
        Boolean bool;
        w5.k.f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        l0.i.e().a(d.f21507a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1980154005) {
                if (iHashCode != 490310653 || !action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                } else {
                    bool = Boolean.FALSE;
                }
            } else if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
            g(bool);
        }
    }

    @Override // p0.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            l0.i.e().c(d.f21507a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z6 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z6 = false;
        }
        return Boolean.valueOf(z6);
    }
}
