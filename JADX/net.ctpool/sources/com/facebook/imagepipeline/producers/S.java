package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class S implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f10796b;

    class a extends m0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g0 f10797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e0 f10798s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ J1.b f10799t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f10800u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, J1.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC0777n, g0Var, e0Var, str);
            this.f10797r = g0Var2;
            this.f10798s = e0Var2;
            this.f10799t = bVar;
            this.f10800u = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        protected void d() {
            super.d();
            this.f10800u.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        protected void e(Exception exc) {
            super.e(exc);
            this.f10797r.c(this.f10798s, "LocalThumbnailBitmapSdk29Producer", false);
            this.f10798s.g(ImagesContract.LOCAL, "thumbnail_bitmap");
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
        public S0.a c() throws IOException {
            String strE;
            Size size = new Size(this.f10799t.m(), this.f10799t.l());
            try {
                strE = S.this.e(this.f10799t);
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strE != null ? Q0.a.c(Q0.a.b(strE)) ? ThumbnailUtils.createVideoThumbnail(new File(strE), size, this.f10800u) : ThumbnailUtils.createImageThumbnail(new File(strE), size, this.f10800u) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = S.this.f10796b.loadThumbnail(this.f10799t.u(), size, this.f10800u);
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            D1.e eVarY = D1.e.y(bitmapCreateVideoThumbnail, v1.d.b(), D1.k.f996d, 0);
            this.f10798s.w("image_format", "thumbnail");
            eVarY.j(this.f10798s.getExtras());
            return S0.a.J(eVarY);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(S0.a aVar) {
            super.f(aVar);
            this.f10797r.c(this.f10798s, "LocalThumbnailBitmapSdk29Producer", aVar != null);
            this.f10798s.g(ImagesContract.LOCAL, "thumbnail_bitmap");
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f10802a;

        b(m0 m0Var) {
            this.f10802a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10802a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f10795a = executor;
        this.f10796b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(J1.b bVar) {
        return W0.f.e(this.f10796b, bVar.u());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.b bVarD = e0Var.d();
        e0Var.g(ImagesContract.LOCAL, "thumbnail_bitmap");
        a aVar = new a(interfaceC0777n, g0VarB, e0Var, "LocalThumbnailBitmapSdk29Producer", g0VarB, e0Var, bVarD, new CancellationSignal());
        e0Var.e(new b(aVar));
        this.f10795a.execute(aVar);
    }
}
