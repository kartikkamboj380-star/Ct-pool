package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2189B;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1438l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16161a;

    public C1438l5(Context context) {
        Preconditions.checkNotNull(context);
        this.f16161a = context;
    }

    private final void f(Runnable runnable) {
        H5 h5K = H5.k(this.f16161a);
        h5K.f().B(new RunnableC1445m5(this, h5K, runnable));
    }

    private final C1449n2 j() {
        return S2.b(this.f16161a, null, null).d();
    }

    public final int a(final Intent intent, int i7, final int i8) {
        final C1449n2 c1449n2D = S2.b(this.f16161a, null, null).d();
        if (intent == null) {
            c1449n2D.J().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c1449n2D.I().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16219m.d(i8, c1449n2D, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new X2(H5.k(this.f16161a));
        }
        j().J().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        S2.b(this.f16161a, null, null).d().I().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i7, C1449n2 c1449n2, Intent intent) {
        if (((InterfaceC2189B) this.f16161a).d(i7)) {
            c1449n2.I().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            j().I().a("Completed wakeful intent.");
            ((InterfaceC2189B) this.f16161a).a(intent);
        }
    }

    final /* synthetic */ void e(C1449n2 c1449n2, JobParameters jobParameters) {
        c1449n2.I().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC2189B) this.f16161a).b(jobParameters, false);
    }

    public final boolean g(final JobParameters jobParameters) {
        final C1449n2 c1449n2D = S2.b(this.f16161a, null, null).d();
        String string = jobParameters.getExtras().getString("action");
        c1449n2D.I().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
            @Override // java.lang.Runnable
            public final void run() {
                this.f16138m.e(c1449n2D, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        S2.b(this.f16161a, null, null).d().I().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().E().a("onRebind called with null intent");
        } else {
            j().I().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().E().a("onUnbind called with null intent");
            return true;
        }
        j().I().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
