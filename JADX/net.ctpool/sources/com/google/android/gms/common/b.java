package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.e;

/* JADX INFO: loaded from: classes.dex */
final class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Activity f13658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f13659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ androidx.activity.result.c f13660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f13661p;

    b(GoogleApiAvailability googleApiAvailability, Activity activity, int i7, androidx.activity.result.c cVar) {
        this.f13661p = googleApiAvailability;
        this.f13658m = activity;
        this.f13659n = i7;
        this.f13660o = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f13661p.getErrorResolutionPendingIntent(this.f13658m, this.f13659n, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.f13660o.a(new e.b(errorResolutionPendingIntent.getIntentSender()).a());
    }
}
