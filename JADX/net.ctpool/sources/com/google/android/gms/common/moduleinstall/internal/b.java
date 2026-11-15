package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes.dex */
final class b extends zag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListenerHolder f13722a;

    public b(ListenerHolder listenerHolder) {
        this.f13722a = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f13722a.notifyListener(new a(this, moduleInstallStatusUpdate));
    }
}
