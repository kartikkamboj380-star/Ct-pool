package v1;

import G1.i;
import android.graphics.Bitmap;
import w5.k;
import y1.C2238a;

/* JADX INFO: renamed from: v1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2155a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f22577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2238a f22578b;

    public C2155a(i iVar, C2238a c2238a) {
        k.f(iVar, "bitmapPool");
        k.f(c2238a, "closeableReferenceFactory");
        this.f22577a = iVar;
        this.f22578b = c2238a;
    }

    @Override // v1.b
    public S0.a d(int i7, int i8, Bitmap.Config config) {
        k.f(config, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f22577a.get(N1.b.f(i7, i8, config));
        if (bitmap.getAllocationByteCount() < i7 * i8 * N1.b.e(config)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        bitmap.reconfigure(i7, i8, config);
        S0.a aVarC = this.f22578b.c(bitmap, this.f22577a);
        k.e(aVarC, "closeableReferenceFactor…reate(bitmap, bitmapPool)");
        return aVarC;
    }
}
