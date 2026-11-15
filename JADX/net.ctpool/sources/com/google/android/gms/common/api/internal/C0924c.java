package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0924c implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f13613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zaad f13614b;

    C0924c(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f13614b = zaadVar;
        this.f13613a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.f13614b.zaa.remove(this.f13613a);
    }
}
