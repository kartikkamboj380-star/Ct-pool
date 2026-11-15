package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class a extends zag {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Intent f13682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Activity f13683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f13684o;

    a(Intent intent, Activity activity, int i7) {
        this.f13682m = intent;
        this.f13683n = activity;
        this.f13684o = i7;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f13682m;
        if (intent != null) {
            this.f13683n.startActivityForResult(intent, this.f13684o);
        }
    }
}
