package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1066d3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1048b3 f14549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1066d3(C1048b3 c1048b3, Handler handler) {
        super(null);
        this.f14549a = c1048b3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f14549a.e();
    }
}
