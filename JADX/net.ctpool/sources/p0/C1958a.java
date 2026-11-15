package p0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s0.InterfaceC2034b;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1958a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1958a(Context context, InterfaceC2034b interfaceC2034b) {
        super(context, interfaceC2034b);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // p0.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p0.e
    public void k(Intent intent) {
        Boolean bool;
        w5.k.f(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        l0.i.e().a(AbstractC1959b.f21506a, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                }
                bool = Boolean.FALSE;
                g(bool);
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                }
                bool = Boolean.FALSE;
                g(bool);
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                }
                bool = Boolean.TRUE;
                g(bool);
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                }
                bool = Boolean.TRUE;
                g(bool);
                break;
        }
    }

    @Override // p0.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(m(intentRegisterReceiver));
        }
        l0.i.e().c(AbstractC1959b.f21506a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
