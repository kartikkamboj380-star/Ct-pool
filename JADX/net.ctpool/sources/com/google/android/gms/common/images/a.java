package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f13672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ParcelFileDescriptor f13673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ImageManager f13674o;

    public a(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13674o = imageManager;
        this.f13672m = uri;
        this.f13673n = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f13673n;
        Bitmap bitmapDecodeFileDescriptor = null;
        boolean z6 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e7) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f13672m)), e7);
                z6 = true;
            }
            try {
                this.f13673n.close();
            } catch (IOException e8) {
                Log.e("ImageManager", "closed failed", e8);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f13674o;
        imageManager.zae.post(new c(imageManager, this.f13672m, bitmapDecodeFileDescriptor, z6, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f13672m)));
        }
    }
}
