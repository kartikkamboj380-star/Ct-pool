package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0946z implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ GoogleApiManager f13657a;

    C0946z(GoogleApiManager googleApiManager) {
        this.f13657a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z6) {
        GoogleApiManager googleApiManager = this.f13657a;
        googleApiManager.zar.sendMessage(googleApiManager.zar.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
