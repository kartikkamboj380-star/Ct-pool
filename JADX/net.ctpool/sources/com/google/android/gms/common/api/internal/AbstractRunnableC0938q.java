package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractRunnableC0938q implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ zaaw f13643m;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        this.f13643m.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e7) {
                this.f13643m.zaa.zam(e7);
            }
        } finally {
            this.f13643m.zab.unlock();
        }
    }
}
