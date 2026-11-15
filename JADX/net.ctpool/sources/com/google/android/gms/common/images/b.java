package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;

/* JADX INFO: loaded from: classes.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zag f13675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ImageManager f13676n;

    public b(ImageManager imageManager, zag zagVar) {
        this.f13676n = imageManager;
        this.f13675m = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f13676n.zah.get(this.f13675m);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f13676n;
            imageManager.zah.remove(this.f13675m);
            imageReceiver.c(this.f13675m);
        }
        zag zagVar = this.f13675m;
        d dVar = zagVar.zaa;
        Uri uri = dVar.f13681a;
        if (uri != null) {
            Long l7 = (Long) this.f13676n.zaj.get(uri);
            if (l7 != null) {
                if (SystemClock.elapsedRealtime() - l7.longValue() < 3600000) {
                    zagVar = this.f13675m;
                } else {
                    ImageManager imageManager2 = this.f13676n;
                    imageManager2.zaj.remove(dVar.f13681a);
                }
            }
            this.f13675m.zaa(null, false, true, false);
            ImageManager imageManager3 = this.f13676n;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) imageManager3.zai.get(dVar.f13681a);
            if (imageReceiver2 == null) {
                ImageManager.ImageReceiver imageReceiver3 = this.f13676n.new ImageReceiver(dVar.f13681a);
                ImageManager imageManager4 = this.f13676n;
                imageManager4.zai.put(dVar.f13681a, imageReceiver3);
                imageReceiver2 = imageReceiver3;
            }
            imageReceiver2.b(this.f13675m);
            zag zagVar2 = this.f13675m;
            if (!(zagVar2 instanceof zaf)) {
                this.f13676n.zah.put(zagVar2, imageReceiver2);
            }
            synchronized (ImageManager.zaa) {
                try {
                    if (!ImageManager.zab.contains(dVar.f13681a)) {
                        ImageManager.zab.add(dVar.f13681a);
                        imageReceiver2.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ImageManager imageManager5 = this.f13676n;
        zagVar.zab(imageManager5.zad, imageManager5.zag, true);
    }
}
