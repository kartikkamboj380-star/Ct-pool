package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.t;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class r extends GmsClientSupervisor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f13708a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f13710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f13711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConnectionTracker f13712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f13713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f13714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Executor f13715h;

    r(Context context, Looper looper, Executor executor) {
        q qVar = new q(this, null);
        this.f13711d = qVar;
        this.f13709b = context.getApplicationContext();
        this.f13710c = new t(looper, qVar);
        this.f13712e = ConnectionTracker.getInstance();
        this.f13713f = 5000L;
        this.f13714g = 300000L;
        this.f13715h = executor;
    }

    final void f(Executor executor) {
        synchronized (this.f13708a) {
            this.f13715h = executor;
        }
    }

    final void g(Looper looper) {
        synchronized (this.f13708a) {
            this.f13710c = new t(looper, this.f13711d);
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f13708a) {
            try {
                p pVar = (p) this.f13708a.get(zzoVar);
                if (pVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + zzoVar.toString());
                }
                if (!pVar.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar.toString());
                }
                pVar.f(serviceConnection, str);
                if (pVar.i()) {
                    this.f13710c.sendMessageDelayed(this.f13710c.obtainMessage(0, zzoVar), this.f13713f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f13708a) {
            try {
                p pVar = (p) this.f13708a.get(zzoVar);
                if (executor == null) {
                    executor = this.f13715h;
                }
                if (pVar == null) {
                    pVar = new p(this, zzoVar);
                    pVar.d(serviceConnection, serviceConnection, str);
                    pVar.e(str, executor);
                    this.f13708a.put(zzoVar, pVar);
                } else {
                    this.f13710c.removeMessages(0, zzoVar);
                    if (pVar.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar.toString());
                    }
                    pVar.d(serviceConnection, serviceConnection, str);
                    int iA = pVar.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(pVar.b(), pVar.c());
                    } else if (iA == 2) {
                        pVar.e(str, executor);
                    }
                }
                zJ = pVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
