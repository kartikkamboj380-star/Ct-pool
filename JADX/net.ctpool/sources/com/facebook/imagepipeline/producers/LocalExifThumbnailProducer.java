package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import s1.C2037b;
import x1.C2215f;

/* JADX INFO: loaded from: classes.dex */
public class LocalExifThumbnailProducer implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.i f10785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f10786c;

    @com.facebook.soloader.f
    private class Api24Utils {
        private Api24Utils() {
        }

        ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }
    }

    class a extends m0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J1.b f10788r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, String str, J1.b bVar) {
            super(interfaceC0777n, g0Var, e0Var, str);
            this.f10788r = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(D1.g gVar) {
            D1.g.d(gVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(D1.g gVar) {
            return O0.g.of("createdThumbnail", Boolean.toString(gVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public D1.g c() {
            ExifInterface exifInterfaceG = LocalExifThumbnailProducer.this.g(this.f10788r.u());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f10785b.b((byte[]) O0.l.g(exifInterfaceG.getThumbnail())), exifInterfaceG);
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f10790a;

        b(m0 m0Var) {
            this.f10790a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10790a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, R0.i iVar, ContentResolver contentResolver) {
        this.f10784a = executor;
        this.f10785b = iVar;
        this.f10786c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public D1.g e(R0.h hVar, ExifInterface exifInterface) {
        Pair pairB = N1.b.b(new R0.j(hVar));
        int iH = h(exifInterface);
        int iIntValue = pairB != null ? ((Integer) pairB.first).intValue() : -1;
        int iIntValue2 = pairB != null ? ((Integer) pairB.second).intValue() : -1;
        S0.a aVarJ = S0.a.J(hVar);
        try {
            D1.g gVar = new D1.g(aVarJ);
            S0.a.g(aVarJ);
            gVar.b1(C2037b.f22237b);
            gVar.f1(iH);
            gVar.j1(iIntValue);
            gVar.S0(iIntValue2);
            return gVar;
        } catch (Throwable th) {
            S0.a.g(aVarJ);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return N1.g.a(Integer.parseInt((String) O0.l.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.b bVarD = e0Var.d();
        e0Var.g(ImagesContract.LOCAL, "exif");
        a aVar = new a(interfaceC0777n, g0VarB, e0Var, "LocalExifThumbnailProducer", bVarD);
        e0Var.e(new b(aVar));
        this.f10784a.execute(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(C2215f c2215f) {
        return v0.b(512, 512, c2215f);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String strE = W0.f.e(this.f10786c, uri);
        if (strE == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            P0.a.f(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(strE)) {
            return new ExifInterface(strE);
        }
        AssetFileDescriptor assetFileDescriptorA = W0.f.a(this.f10786c, uri);
        if (assetFileDescriptorA != null) {
            ExifInterface exifInterfaceA = new Api24Utils().a(assetFileDescriptorA.getFileDescriptor());
            assetFileDescriptorA.close();
            return exifInterfaceA;
        }
        return null;
    }
}
