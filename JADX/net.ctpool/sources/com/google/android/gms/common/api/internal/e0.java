package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f13623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f13624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ zzd f13625o;

    e0(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f13625o = zzdVar;
        this.f13623m = lifecycleCallback;
        this.f13624n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzd zzdVar = this.f13625o;
        if (zzdVar.zzc > 0) {
            LifecycleCallback lifecycleCallback = this.f13623m;
            if (zzdVar.zzd != null) {
                bundle = zzdVar.zzd.getBundle(this.f13624n);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f13625o.zzc >= 2) {
            this.f13623m.onStart();
        }
        if (this.f13625o.zzc >= 3) {
            this.f13623m.onResume();
        }
        if (this.f13625o.zzc >= 4) {
            this.f13623m.onStop();
        }
        if (this.f13625o.zzc >= 5) {
            this.f13623m.onDestroy();
        }
    }
}
