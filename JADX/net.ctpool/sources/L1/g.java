package L1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.C2037b;
import s1.C2038c;
import w5.k;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1965d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1968c = "SimpleImageTranscoder";

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat b(C2038c c2038c) {
            if (c2038c == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (c2038c != C2037b.f22237b) {
                if (c2038c == C2037b.f22238c) {
                    return Bitmap.CompressFormat.PNG;
                }
                if (C2037b.a(c2038c)) {
                    return Bitmap.CompressFormat.WEBP;
                }
            }
            return Bitmap.CompressFormat.JPEG;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(boolean z6, int i7) {
        this.f1966a = z6;
        this.f1967b = i7;
    }

    private final int e(D1.g gVar, C2216g c2216g, C2215f c2215f) {
        if (this.f1966a) {
            return L1.a.b(c2216g, c2215f, gVar, this.f1967b);
        }
        return 1;
    }

    @Override // L1.c
    public String a() {
        return this.f1968c;
    }

    @Override // L1.c
    public b b(D1.g gVar, OutputStream outputStream, C2216g c2216g, C2215f c2215f, C2038c c2038c, Integer num, ColorSpace colorSpace) throws Throwable {
        g gVar2;
        C2216g c2216gA;
        Bitmap bitmap;
        b bVar;
        k.f(gVar, "encodedImage");
        k.f(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        if (c2216g == null) {
            c2216gA = C2216g.f22828c.a();
            gVar2 = this;
        } else {
            gVar2 = this;
            c2216gA = c2216g;
        }
        int iE = gVar2.e(gVar, c2216gA, c2215f);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVar.o(), null, options);
            if (bitmapDecodeStream == null) {
                P0.a.j("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(gVar, c2216gA);
            if (matrixG != null) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                    k.e(bitmapCreateBitmap, "createBitmap(\n          …x,\n                false)");
                    bitmap = bitmapCreateBitmap;
                } catch (OutOfMemoryError e7) {
                    e = e7;
                    bitmap = bitmapDecodeStream;
                    P0.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    bVar = new b(2);
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeStream;
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmap.compress(f1965d.b(c2038c), num2.intValue(), outputStream);
                    bVar = new b(iE > 1 ? 0 : 1);
                } catch (OutOfMemoryError e8) {
                    e = e8;
                    P0.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    bVar = new b(2);
                }
                bitmap.recycle();
                bitmapDecodeStream.recycle();
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                bitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e9) {
            P0.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e9);
            return new b(2);
        }
    }

    @Override // L1.c
    public boolean c(C2038c c2038c) {
        k.f(c2038c, "imageFormat");
        return c2038c == C2037b.f22247l || c2038c == C2037b.f22237b;
    }

    @Override // L1.c
    public boolean d(D1.g gVar, C2216g c2216g, C2215f c2215f) {
        k.f(gVar, "encodedImage");
        if (c2216g == null) {
            c2216g = C2216g.f22828c.a();
        }
        return this.f1966a && L1.a.b(c2216g, c2215f, gVar, this.f1967b) > 1;
    }
}
