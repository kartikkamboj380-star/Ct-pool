package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class T implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f10805b;

    class a extends m0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g0 f10806r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e0 f10807s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ J1.b f10808t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, J1.b bVar) {
            super(interfaceC0777n, g0Var, e0Var, str);
            this.f10806r = g0Var2;
            this.f10807s = e0Var2;
            this.f10808t = bVar;
        }

        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        protected void e(Exception exc) {
            super.e(exc);
            this.f10806r.c(this.f10807s, "VideoThumbnailProducer", false);
            this.f10807s.g(ImagesContract.LOCAL, "video");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(S0.a aVar) {
            S0.a.g(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(S0.a aVar) {
            return O0.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public S0.a c() {
            String strI;
            try {
                strI = T.this.i(this.f10808t);
            } catch (IllegalArgumentException unused) {
                strI = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strI != null ? ThumbnailUtils.createVideoThumbnail(strI, T.g(this.f10808t)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = T.h(T.this.f10805b, this.f10808t.u());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            D1.e eVarY = D1.e.y(bitmapCreateVideoThumbnail, v1.d.b(), D1.k.f996d, 0);
            this.f10807s.w("image_format", "thumbnail");
            eVarY.j(this.f10807s.getExtras());
            return S0.a.J(eVarY);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(S0.a aVar) {
            super.f(aVar);
            this.f10806r.c(this.f10807s, "VideoThumbnailProducer", aVar != null);
            this.f10807s.g(ImagesContract.LOCAL, "video");
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f10810a;

        b(m0 m0Var) {
            this.f10810a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10810a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f10804a = executor;
        this.f10805b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(J1.b bVar) {
        return (bVar.m() > 96 || bVar.l() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            O0.l.g(parcelFileDescriptorOpenFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(J1.b bVar) {
        return W0.f.e(this.f10805b, bVar.u());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.b bVarD = e0Var.d();
        e0Var.g(ImagesContract.LOCAL, "video");
        a aVar = new a(interfaceC0777n, g0VarB, e0Var, "VideoThumbnailProducer", g0VarB, e0Var, bVarD);
        e0Var.e(new b(aVar));
        this.f10804a.execute(aVar);
    }
}
