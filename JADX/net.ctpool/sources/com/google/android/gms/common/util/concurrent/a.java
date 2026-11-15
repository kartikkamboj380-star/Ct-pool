package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f13752m;

    public a(Runnable runnable, int i7) {
        this.f13752m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f13752m.run();
    }
}
