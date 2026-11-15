package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0993p extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0996q f14011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0993p(C0996q c0996q, Handler handler) {
        super(null);
        this.f14011a = c0996q;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f14011a.e();
    }
}
