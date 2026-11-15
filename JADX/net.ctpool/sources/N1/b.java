package N1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import v5.InterfaceC2171a;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2127a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f2128b = i5.g.b(a.f2130m);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2129c;

    static final class a extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2130m = new a();

        a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.core.util.e invoke() {
            return new androidx.core.util.e(12);
        }
    }

    /* JADX INFO: renamed from: N1.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0042b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2131a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2131a = iArr;
        }
    }

    private b() {
    }

    private final ByteBuffer a() {
        return f2129c ? R0.b.f2825a.b() : (ByteBuffer) d().b();
    }

    public static final Pair b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        b bVar = f2127a;
        ByteBuffer byteBufferH = bVar.h();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferH.array();
            Pair pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            bVar.i(byteBufferH);
            return pair;
        } catch (Throwable th) {
            f2127a.i(byteBufferH);
            throw th;
        }
    }

    public static final f c(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        b bVar = f2127a;
        ByteBuffer byteBufferH = bVar.h();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferH.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            f fVar = new f(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            bVar.i(byteBufferH);
            return fVar;
        } catch (Throwable th) {
            f2127a.i(byteBufferH);
            throw th;
        }
    }

    private final androidx.core.util.e d() {
        return (androidx.core.util.e) f2128b.getValue();
    }

    public static final int e(Bitmap.Config config) {
        switch (config == null ? -1 : C0042b.f2131a[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int f(int i7, int i8, Bitmap.Config config) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i7).toString());
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i8).toString());
        }
        int iE = e(config);
        int i9 = i7 * i8 * iE;
        if (i9 > 0) {
            return i9;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i9 + ", width: " + i7 + ", height: " + i8 + ", pixelSize: " + iE).toString());
    }

    public static final int g(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer h() {
        ByteBuffer byteBufferA = a();
        if (byteBufferA != null) {
            return byteBufferA;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(R0.b.e());
        k.e(byteBufferAllocate, "allocate(DecodeBufferHel…mendedDecodeBufferSize())");
        return byteBufferAllocate;
    }

    private final void i(ByteBuffer byteBuffer) {
        if (f2129c) {
            return;
        }
        d().a(byteBuffer);
    }
}
