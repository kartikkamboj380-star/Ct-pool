package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class W5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f15843a;

    public W5(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f15843a = applicationContext;
    }
}
