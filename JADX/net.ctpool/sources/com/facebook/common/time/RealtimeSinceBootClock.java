package com.facebook.common.time;

import O0.d;
import V0.b;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@d
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f10461a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f10461a;
    }

    @Override // V0.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // V0.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
