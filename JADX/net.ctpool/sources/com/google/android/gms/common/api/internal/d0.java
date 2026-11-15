package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f13618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f13619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ zzb f13620o;

    d0(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f13620o = zzbVar;
        this.f13618m = lifecycleCallback;
        this.f13619n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzb zzbVar = this.f13620o;
        if (zzbVar.zzc > 0) {
            LifecycleCallback lifecycleCallback = this.f13618m;
            if (zzbVar.zzd != null) {
                bundle = zzbVar.zzd.getBundle(this.f13619n);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f13620o.zzc >= 2) {
            this.f13618m.onStart();
        }
        if (this.f13620o.zzc >= 3) {
            this.f13618m.onResume();
        }
        if (this.f13620o.zzc >= 4) {
            this.f13618m.onStop();
        }
        if (this.f13620o.zzc >= 5) {
            this.f13618m.onDestroy();
        }
    }
}
