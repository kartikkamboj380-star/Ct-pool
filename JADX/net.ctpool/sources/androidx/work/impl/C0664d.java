package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: androidx.work.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0664d implements l0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f9409a = androidx.core.os.h.a(Looper.getMainLooper());

    @Override // l0.q
    public void a(long j7, Runnable runnable) {
        this.f9409a.postDelayed(runnable, j7);
    }

    @Override // l0.q
    public void b(Runnable runnable) {
        this.f9409a.removeCallbacks(runnable);
    }
}
