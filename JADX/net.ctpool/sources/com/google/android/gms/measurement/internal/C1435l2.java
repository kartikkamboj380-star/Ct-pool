package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import z3.InterfaceC2267g;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1435l2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C1435l2 f16146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Duration f16147e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TelemetryLoggingClient f16149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f16150c = new AtomicLong(-1);

    private C1435l2(Context context, S2 s22) {
        this.f16149b = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.f16148a = s22;
    }

    static C1435l2 a(S2 s22) {
        if (f16146d == null) {
            f16146d = new C1435l2(s22.a(), s22);
        }
        return f16146d;
    }

    public final synchronized void b(int i7, int i8, long j7, long j8, int i9) {
        final long jElapsedRealtime = this.f16148a.zzb().elapsedRealtime();
        if (this.f16150c.get() != -1 && jElapsedRealtime - this.f16150c.get() <= f16147e.toMillis()) {
            return;
        }
        this.f16149b.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i8, 0, j7, j8, null, null, 0, i9)))).e(new InterfaceC2267g() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // z3.InterfaceC2267g
            public final void c(Exception exc) {
                this.f16130a.c(jElapsedRealtime, exc);
            }
        });
    }

    final /* synthetic */ void c(long j7, Exception exc) {
        this.f16150c.set(j7);
    }
}
