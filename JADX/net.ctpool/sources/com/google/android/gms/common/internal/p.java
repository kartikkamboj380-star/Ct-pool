package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class p implements ServiceConnection, zzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13700a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13701b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f13703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzo f13704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f13705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f13706g;

    public p(r rVar, zzo zzoVar) {
        this.f13706g = rVar;
        this.f13704e = zzoVar;
    }

    public final int a() {
        return this.f13701b;
    }

    public final ComponentName b() {
        return this.f13705f;
    }

    public final IBinder c() {
        return this.f13703d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f13700a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f13701b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            r rVar = this.f13706g;
            boolean zZza = rVar.f13712e.zza(rVar.f13709b, str, this.f13704e.zzb(rVar.f13709b), this, 4225, executor);
            this.f13702c = zZza;
            if (zZza) {
                this.f13706g.f13710c.sendMessageDelayed(this.f13706g.f13710c.obtainMessage(1, this.f13704e), this.f13706g.f13714g);
            } else {
                this.f13701b = 2;
                try {
                    r rVar2 = this.f13706g;
                    rVar2.f13712e.unbindService(rVar2.f13709b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f13700a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f13706g.f13710c.removeMessages(1, this.f13704e);
        r rVar = this.f13706g;
        rVar.f13712e.unbindService(rVar.f13709b, this);
        this.f13702c = false;
        this.f13701b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f13700a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f13700a.isEmpty();
    }

    public final boolean j() {
        return this.f13702c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13706g.f13708a) {
            try {
                this.f13706g.f13710c.removeMessages(1, this.f13704e);
                this.f13703d = iBinder;
                this.f13705f = componentName;
                Iterator it = this.f13700a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f13701b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13706g.f13708a) {
            try {
                this.f13706g.f13710c.removeMessages(1, this.f13704e);
                this.f13703d = null;
                this.f13705f = componentName;
                Iterator it = this.f13700a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f13701b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
