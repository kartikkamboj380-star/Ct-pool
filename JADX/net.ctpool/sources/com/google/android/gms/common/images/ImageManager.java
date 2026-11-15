package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.l;
import com.google.android.gms.internal.base.s;
import com.google.android.gms.internal.base.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new t(Looper.getMainLooper());
    private final ExecutorService zaf = s.a().a(4, 2);
    private final l zag = new l();
    private final Map zah = new HashMap();
    private final Map zai = new HashMap();
    private final Map zaj = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    @KeepName
    final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Uri f13669m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayList f13670n;

        ImageReceiver(Uri uri) {
            super(new t(Looper.getMainLooper()));
            this.f13669m = uri;
            this.f13670n = new ArrayList();
        }

        public final void b(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f13670n.add(zagVar);
        }

        public final void c(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f13670n.remove(zagVar);
        }

        public final void d() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.f13669m);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i7, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new a(imageManager, this.f13669m, parcelFileDescriptor));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z6);
    }

    private ImageManager(Context context, boolean z6) {
        this.zad = context.getApplicationContext();
    }

    public static ImageManager create(Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(ImageView imageView, int i7) {
        zaj(new zae(imageView, i7));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new b(this, zagVar).run();
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i7) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i7;
        zaj(zaeVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i7) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i7;
        zaj(zafVar);
    }
}
