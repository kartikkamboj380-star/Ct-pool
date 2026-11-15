package p0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, InterfaceC2034b interfaceC2034b) {
        super(context, interfaceC2034b);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
    }

    @Override // p0.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p0.e
    public void k(Intent intent) {
        Boolean bool;
        w5.k.f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        l0.i.e().a(m.f21523a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1181163412) {
                if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                } else {
                    bool = Boolean.TRUE;
                }
            } else if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return;
            } else {
                bool = Boolean.FALSE;
            }
            g(bool);
        }
    }

    @Override // p0.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, j());
        boolean z6 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z6 = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z6 = false;
            }
        }
        return Boolean.valueOf(z6);
    }
}
