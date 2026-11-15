package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
final class b extends zag {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Intent f13685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Fragment f13686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f13687o;

    b(Intent intent, Fragment fragment, int i7) {
        this.f13685m = intent;
        this.f13686n = fragment;
        this.f13687o = i7;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f13685m;
        if (intent != null) {
            this.f13686n.startActivityForResult(intent, this.f13687o);
        }
    }
}
