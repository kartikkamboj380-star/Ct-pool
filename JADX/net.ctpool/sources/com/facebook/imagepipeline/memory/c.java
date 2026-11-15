package com.facebook.imagepipeline.memory;

import G1.G;
import G1.H;
import G1.i;
import O0.l;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class c extends a implements i {
    public c(R0.d dVar, G g7, H h7, boolean z6) {
        super(dVar, g7, h7, z6);
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void j(Bitmap bitmap) {
        l.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int n(Bitmap bitmap) {
        l.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Bitmap p(b bVar) {
        Bitmap bitmap = (Bitmap) super.p(bVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean t(Bitmap bitmap) {
        l.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int m(int i7) {
        return i7;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i7) {
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Bitmap f(int i7) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
    }
}
