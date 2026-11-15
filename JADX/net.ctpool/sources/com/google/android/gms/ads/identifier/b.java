package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class b extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakReference f13474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f13475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final CountDownLatch f13476o = new CountDownLatch(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f13477p = false;

    public b(AdvertisingIdClient advertisingIdClient, long j7) {
        this.f13474m = new WeakReference(advertisingIdClient);
        this.f13475n = j7;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f13474m.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f13477p = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f13476o.await(this.f13475n, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
