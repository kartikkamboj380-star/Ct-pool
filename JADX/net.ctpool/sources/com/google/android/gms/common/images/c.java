package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f13677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bitmap f13678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CountDownLatch f13679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ ImageManager f13680p;

    public c(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z6, CountDownLatch countDownLatch) {
        this.f13680p = imageManager;
        this.f13677m = uri;
        this.f13678n = bitmap;
        this.f13679o = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f13680p.zai.remove(this.f13677m);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f13670n;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                zag zagVar = (zag) arrayList.get(i7);
                Bitmap bitmap = this.f13678n;
                if (bitmap != null) {
                    zagVar.zac(this.f13680p.zad, bitmap, false);
                } else {
                    this.f13680p.zaj.put(this.f13677m, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f13680p;
                    zagVar.zab(imageManager.zad, imageManager.zag, false);
                }
                if (!(zagVar instanceof zaf)) {
                    this.f13680p.zah.remove(zagVar);
                }
            }
        }
        this.f13679o.countDown();
        synchronized (ImageManager.zaa) {
            ImageManager.zab.remove(this.f13677m);
        }
    }
}
