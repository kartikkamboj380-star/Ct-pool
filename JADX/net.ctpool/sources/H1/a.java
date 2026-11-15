package H1;

import G1.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, androidx.core.util.d dVar, h hVar) {
        super(iVar, dVar, hVar);
        k.f(iVar, "bitmapPool");
        k.f(dVar, "decodeBuffers");
        k.f(hVar, "platformDecoderOptions");
    }

    @Override // H1.c
    public int d(int i7, int i8, BitmapFactory.Options options) {
        k.f(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return N1.b.f(i7, i8, config);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
