package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1528y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f16362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16363b;

    public C1528y5(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f16362a = clock;
    }

    public final void a() {
        this.f16363b = 0L;
    }

    public final boolean b(long j7) {
        return this.f16363b == 0 || this.f16362a.elapsedRealtime() - this.f16363b >= 3600000;
    }

    public final void c() {
        this.f16363b = this.f16362a.elapsedRealtime();
    }
}
