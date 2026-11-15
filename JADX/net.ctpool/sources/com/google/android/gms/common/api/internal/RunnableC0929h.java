package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0929h implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ zaaw f13628m;

    RunnableC0929h(zaaw zaawVar) {
        this.f13628m = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.f13628m;
        zaawVar.zad.cancelAvailabilityErrorNotifications(zaawVar.zac);
    }
}
