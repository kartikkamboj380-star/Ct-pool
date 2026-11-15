package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class q implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f13707a;

    /* synthetic */ q(r rVar, zzq zzqVar) {
        this.f13707a = rVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f13707a.f13708a) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    p pVar = (p) this.f13707a.f13708a.get(zzoVar);
                    if (pVar != null && pVar.i()) {
                        if (pVar.j()) {
                            pVar.g("GmsClientSupervisor");
                        }
                        this.f13707a.f13708a.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f13707a.f13708a) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                p pVar2 = (p) this.f13707a.f13708a.get(zzoVar2);
                if (pVar2 != null && pVar2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(zzoVar2), new Exception());
                    ComponentName componentNameB = pVar2.b();
                    if (componentNameB == null) {
                        componentNameB = zzoVar2.zza();
                    }
                    if (componentNameB == null) {
                        String strZzc = zzoVar2.zzc();
                        Preconditions.checkNotNull(strZzc);
                        componentNameB = new ComponentName(strZzc, "unknown");
                    }
                    pVar2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
