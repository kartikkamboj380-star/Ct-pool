package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes.dex */
final class c extends zag {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Intent f13688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LifecycleFragment f13689n;

    c(Intent intent, LifecycleFragment lifecycleFragment, int i7) {
        this.f13688m = intent;
        this.f13689n = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f13688m;
        if (intent != null) {
            this.f13689n.startActivityForResult(intent, 2);
        }
    }
}
