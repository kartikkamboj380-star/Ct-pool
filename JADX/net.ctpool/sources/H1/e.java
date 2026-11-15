package H1;

import G1.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f1355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, androidx.core.util.d dVar, h hVar) {
        super(iVar, dVar, hVar);
        k.f(iVar, "bitmapPool");
        k.f(dVar, "decodeBuffers");
        k.f(hVar, "platformDecoderOptions");
        this.f1355h = hVar;
    }

    @Override // H1.c
    public int d(int i7, int i8, BitmapFactory.Options options) {
        k.f(options, "options");
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return N1.b.f(i7, i8, config);
    }
}
