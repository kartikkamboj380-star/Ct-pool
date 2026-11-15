package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f17348a;

    b(FirebaseAnalytics firebaseAnalytics) {
        this.f17348a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f17348a.f17338a.F();
    }
}
