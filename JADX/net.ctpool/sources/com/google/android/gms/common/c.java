package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.t;

/* JADX INFO: loaded from: classes.dex */
final class c extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f13663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f13663b = googleApiAvailability;
        this.f13662a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f13663b;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.f13662a);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.f13663b.showErrorNotification(this.f13662a, iIsGooglePlayServicesAvailable);
        }
    }
}
