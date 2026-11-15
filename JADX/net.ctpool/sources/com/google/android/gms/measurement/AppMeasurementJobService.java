package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.C1438l5;
import w3.InterfaceC2189B;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
public final class AppMeasurementJobService extends JobService implements InterfaceC2189B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C1438l5 f15329m;

    private final C1438l5 c() {
        if (this.f15329m == null) {
            this.f15329m = new C1438l5(this);
        }
        return this.f15329m;
    }

    @Override // w3.InterfaceC2189B
    public final void a(Intent intent) {
    }

    @Override // w3.InterfaceC2189B
    public final void b(JobParameters jobParameters, boolean z6) {
        jobFinished(jobParameters, false);
    }

    @Override // w3.InterfaceC2189B
    public final boolean d(int i7) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
