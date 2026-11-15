package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    zab(C0922a c0922a) {
        this.zaa = new WeakReference(c0922a);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0922a c0922a = (C0922a) this.zaa.get();
        if (c0922a == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c0922a.c(runnable);
        return this;
    }
}
