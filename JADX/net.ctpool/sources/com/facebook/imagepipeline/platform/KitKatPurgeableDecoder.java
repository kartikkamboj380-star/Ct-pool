package com.facebook.imagepipeline.platform;

import G1.t;
import O0.d;
import O0.l;
import R0.h;
import S0.a;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* JADX INFO: loaded from: classes.dex */
@d
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f10709c;

    @d
    public KitKatPurgeableDecoder(t tVar) {
    }

    private static void h(byte[] bArr, int i7) {
        bArr[i7] = -1;
        bArr[i7 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.j();
        int size = hVar.size();
        a aVarA = this.f10709c.a(size);
        try {
            byte[] bArr = (byte[]) aVarA.j();
            hVar.m(0, bArr, 0, size);
            return (Bitmap) l.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.g(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i7, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i7) ? null : DalvikPurgeableDecoder.f10697b;
        h hVar = (h) aVar.j();
        l.b(Boolean.valueOf(i7 <= hVar.size()));
        int i8 = i7 + 2;
        a aVarA = this.f10709c.a(i8);
        try {
            byte[] bArr2 = (byte[]) aVarA.j();
            hVar.m(0, bArr2, 0, i7);
            if (bArr != null) {
                h(bArr2, i7);
                i7 = i8;
            }
            Bitmap bitmap = (Bitmap) l.h(BitmapFactory.decodeByteArray(bArr2, 0, i7, options), "BitmapFactory returned null");
            a.g(aVarA);
            return bitmap;
        } catch (Throwable th) {
            a.g(aVarA);
            throw th;
        }
    }
}
