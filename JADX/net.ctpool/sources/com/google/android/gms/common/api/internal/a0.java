package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ C0923b f13597m;

    a0(C0923b c0923b) {
        this.f13597m = c0923b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13597m.f13610m.lock();
        try {
            C0923b.p(this.f13597m);
        } finally {
            this.f13597m.f13610m.unlock();
        }
    }
}
