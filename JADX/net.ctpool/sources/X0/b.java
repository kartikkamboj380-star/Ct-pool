package X0;

import androidx.appcompat.app.y;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4286a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f4287b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f4288c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f4289d = a("RIFF");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f4290e = a("WEBP");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f4291f = a("VP8 ");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f4292g = a("VP8L");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f4293h = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("ASCII not found!", e7);
        }
    }

    public static boolean b(byte[] bArr, int i7) {
        return j(bArr, i7 + 12, f4293h) && ((bArr[i7 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i7, int i8) {
        return i8 >= 21 && j(bArr, i7 + 12, f4293h);
    }

    public static boolean d(byte[] bArr, int i7) {
        return j(bArr, i7 + 12, f4293h) && ((bArr[i7 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i7) {
        return j(bArr, i7 + 12, f4292g);
    }

    public static boolean g(byte[] bArr, int i7) {
        return j(bArr, i7 + 12, f4291f);
    }

    public static boolean h(byte[] bArr, int i7, int i8) {
        return i8 >= 20 && j(bArr, i7, f4289d) && j(bArr, i7 + 8, f4290e);
    }

    public static a i() {
        if (f4288c) {
            return null;
        }
        try {
            y.a(Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance());
        } catch (Throwable unused) {
        }
        f4288c = true;
        return null;
    }

    private static boolean j(byte[] bArr, int i7, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i7 > bArr.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8 + i7] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }
}
