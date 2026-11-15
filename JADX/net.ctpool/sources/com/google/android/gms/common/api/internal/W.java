package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class W extends zabw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f13592b;

    W(X x6, Dialog dialog) {
        this.f13592b = x6;
        this.f13591a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.f13592b.f13594n.zad();
        if (this.f13591a.isShowing()) {
            this.f13591a.dismiss();
        }
    }
}
