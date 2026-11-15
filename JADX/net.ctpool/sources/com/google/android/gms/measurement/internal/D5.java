package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes.dex */
public final class D5 extends E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AlarmManager f15415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1487t f15416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f15417f;

    protected D5(H5 h52) {
        super(h52);
        this.f15415d = (AlarmManager) a().getSystemService("alarm");
    }

    private final AbstractC1487t A() {
        if (this.f15416e == null) {
            this.f15416e = new C5(this, this.f15455b.r0());
        }
        return this.f15416e;
    }

    private final void B() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
    }

    private final int y() {
        if (this.f15417f == null) {
            this.f15417f = Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f15417f.intValue();
    }

    private final PendingIntent z() {
        Context contextA = a();
        return com.google.android.gms.internal.measurement.B0.a(contextA, 0, new Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B0.f14136a);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1425k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1424j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        AlarmManager alarmManager = this.f15415d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        B();
        return false;
    }

    public final void w(long j7) {
        s();
        Context contextA = a();
        if (!d6.b0(contextA)) {
            d().D().a("Receiver not registered/enabled");
        }
        if (!d6.c0(contextA, false)) {
            d().D().a("Service not registered/enabled");
        }
        x();
        d().I().b("Scheduling upload, millis", Long.valueOf(j7));
        zzb().elapsedRealtime();
        if (j7 < Math.max(0L, ((Long) G.f15571z.a(null)).longValue()) && !A().e()) {
            A().b(j7);
        }
        Context contextA2 = a();
        ComponentName componentName = new ComponentName(contextA2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iY = y();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.A0.c(contextA2, new JobInfo.Builder(iY, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void x() {
        s();
        d().I().a("Unscheduling upload");
        AlarmManager alarmManager = this.f15415d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        A().a();
        B();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
