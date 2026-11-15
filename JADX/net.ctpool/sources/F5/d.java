package F5;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1103a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f1104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f1105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f1106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f1107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f1108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f1109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f1110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f1111i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        w5.k.e(charsetForName, "forName(...)");
        f1104b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        w5.k.e(charsetForName2, "forName(...)");
        f1105c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        w5.k.e(charsetForName3, "forName(...)");
        f1106d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        w5.k.e(charsetForName4, "forName(...)");
        f1107e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        w5.k.e(charsetForName5, "forName(...)");
        f1108f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        w5.k.e(charsetForName6, "forName(...)");
        f1109g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f1111i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        w5.k.e(charsetForName, "forName(...)");
        f1111i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f1110h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        w5.k.e(charsetForName, "forName(...)");
        f1110h = charsetForName;
        return charsetForName;
    }
}
