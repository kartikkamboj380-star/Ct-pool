package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import w3.n;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends N.a implements n.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f15330c;

    @Override // w3.n.a
    public final void a(Context context, Intent intent) {
        N.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f15330c == null) {
            this.f15330c = new n(this);
        }
        this.f15330c.a(context, intent);
    }
}
