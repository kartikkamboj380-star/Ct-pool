package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class p extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f13741f;

    /* synthetic */ p(Callable callable, zzu zzuVar) {
        super();
        this.f13741f = callable;
    }

    @Override // com.google.android.gms.common.q
    final String a() {
        try {
            return (String) this.f13741f.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
