package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1514w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1466p5 f16336a;

    C1514w5(C1466p5 c1466p5) {
        this.f16336a = c1466p5;
    }

    private final void c(long j7, boolean z6) {
        this.f16336a.l();
        if (this.f16336a.f16325a.n()) {
            this.f16336a.g().f16385r.b(j7);
            this.f16336a.d().I().b("Session started, time", Long.valueOf(this.f16336a.zzb().elapsedRealtime()));
            long j8 = j7 / 1000;
            this.f16336a.p().g0("auto", "_sid", Long.valueOf(j8), j7);
            this.f16336a.g().f16386s.b(j8);
            this.f16336a.g().f16381n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            this.f16336a.p().a0("auto", "_s", j7, bundle);
            String strA = this.f16336a.g().f16391x.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            this.f16336a.p().a0("auto", "_ssr", j7, bundle2);
        }
    }

    final void a() {
        this.f16336a.l();
        if (this.f16336a.g().x(this.f16336a.zzb().currentTimeMillis())) {
            this.f16336a.g().f16381n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f16336a.d().I().a("Detected application was in foreground");
                c(this.f16336a.zzb().currentTimeMillis(), false);
            }
        }
    }

    final void b(long j7, boolean z6) {
        this.f16336a.l();
        this.f16336a.E();
        if (this.f16336a.g().x(j7)) {
            this.f16336a.g().f16381n.a(true);
            this.f16336a.n().G();
        }
        this.f16336a.g().f16385r.b(j7);
        if (this.f16336a.g().f16381n.b()) {
            c(j7, z6);
        }
    }
}
