package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class W2 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ U2 f14404a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W2(U2 u22, Handler handler) {
        super(null);
        this.f14404a = u22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f14404a.f14371a.set(true);
    }
}
