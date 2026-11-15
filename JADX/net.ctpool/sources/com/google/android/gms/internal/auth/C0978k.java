package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0978k extends ContentObserver {
    C0978k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        AbstractC0981l.f13992e.set(true);
    }
}
