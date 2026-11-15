package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f17349a;

    c(FirebaseAnalytics firebaseAnalytics) {
        this.f17349a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f17349a.f17338a.M();
    }
}
