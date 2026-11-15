package com.facebook.common.time;

import O0.d;
import V0.c;

/* JADX INFO: loaded from: classes.dex */
@d
public class AwakeTimeSinceBootClock implements c {

    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // V0.c, V0.b
    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // V0.c, V0.b
    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
