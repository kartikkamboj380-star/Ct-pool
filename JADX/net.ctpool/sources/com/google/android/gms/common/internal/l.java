package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.t;

/* JADX INFO: loaded from: classes.dex */
final class l extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f13698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f13698b = baseGmsClient;
    }

    private static final void a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f13698b.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f13698b.enableLocalFallback()) || message.what == 5)) && !this.f13698b.isConnecting()) {
            a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f13698b.zzB = new ConnectionResult(message.arg2);
            if (BaseGmsClient.zzo(this.f13698b)) {
                BaseGmsClient baseGmsClient = this.f13698b;
                if (!baseGmsClient.zzC) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.f13698b;
            ConnectionResult connectionResult = baseGmsClient2.zzB != null ? baseGmsClient2.zzB : new ConnectionResult(8);
            this.f13698b.zzc.onReportServiceBinding(connectionResult);
            this.f13698b.onConnectionFailed(connectionResult);
            return;
        }
        if (i8 == 5) {
            BaseGmsClient baseGmsClient3 = this.f13698b;
            ConnectionResult connectionResult2 = baseGmsClient3.zzB != null ? baseGmsClient3.zzB : new ConnectionResult(8);
            this.f13698b.zzc.onReportServiceBinding(connectionResult2);
            this.f13698b.onConnectionFailed(connectionResult2);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f13698b.zzc.onReportServiceBinding(connectionResult3);
            this.f13698b.onConnectionFailed(connectionResult3);
            return;
        }
        if (i8 == 6) {
            this.f13698b.zzp(5, null);
            BaseGmsClient baseGmsClient4 = this.f13698b;
            if (baseGmsClient4.zzw != null) {
                baseGmsClient4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f13698b.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.f13698b, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f13698b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
