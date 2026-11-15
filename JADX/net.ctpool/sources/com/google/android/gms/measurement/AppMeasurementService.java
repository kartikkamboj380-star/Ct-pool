package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C1438l5;
import w3.InterfaceC2189B;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC2189B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C1438l5 f15331m;

    private final C1438l5 c() {
        if (this.f15331m == null) {
            this.f15331m = new C1438l5(this);
        }
        return this.f15331m;
    }

    @Override // w3.InterfaceC2189B
    public final void a(Intent intent) {
        N.a.b(intent);
    }

    @Override // w3.InterfaceC2189B
    public final void b(JobParameters jobParameters, boolean z6) {
        throw new UnsupportedOperationException();
    }

    @Override // w3.InterfaceC2189B
    public final boolean d(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        return c().a(intent, i7, i8);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
