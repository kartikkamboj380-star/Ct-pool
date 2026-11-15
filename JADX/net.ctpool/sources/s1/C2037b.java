package s1;

import j5.AbstractC1809n;
import java.util.List;
import w5.k;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2037b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2037b f22236a = new C2037b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2038c f22237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2038c f22238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2038c f22239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2038c f22240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2038c f22241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2038c f22242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2038c f22243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2038c f22244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2038c f22245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2038c f22246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2038c f22247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2038c f22248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f22249n;

    static {
        C2038c c2038c = new C2038c("JPEG", "jpeg");
        f22237b = c2038c;
        C2038c c2038c2 = new C2038c("PNG", "png");
        f22238c = c2038c2;
        C2038c c2038c3 = new C2038c("GIF", "gif");
        f22239d = c2038c3;
        C2038c c2038c4 = new C2038c("BMP", "bmp");
        f22240e = c2038c4;
        C2038c c2038c5 = new C2038c("ICO", "ico");
        f22241f = c2038c5;
        C2038c c2038c6 = new C2038c("WEBP_SIMPLE", "webp");
        f22242g = c2038c6;
        C2038c c2038c7 = new C2038c("WEBP_LOSSLESS", "webp");
        f22243h = c2038c7;
        C2038c c2038c8 = new C2038c("WEBP_EXTENDED", "webp");
        f22244i = c2038c8;
        C2038c c2038c9 = new C2038c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f22245j = c2038c9;
        C2038c c2038c10 = new C2038c("WEBP_ANIMATED", "webp");
        f22246k = c2038c10;
        C2038c c2038c11 = new C2038c("HEIF", "heif");
        f22247l = c2038c11;
        f22248m = new C2038c("DNG", "dng");
        f22249n = AbstractC1809n.k(c2038c, c2038c2, c2038c3, c2038c4, c2038c5, c2038c6, c2038c7, c2038c8, c2038c9, c2038c10, c2038c11);
    }

    private C2037b() {
    }

    public static final boolean a(C2038c c2038c) {
        k.f(c2038c, "imageFormat");
        return c2038c == f22242g || c2038c == f22243h || c2038c == f22244i || c2038c == f22245j;
    }

    public static final boolean b(C2038c c2038c) {
        k.f(c2038c, "imageFormat");
        return a(c2038c) || c2038c == f22246k;
    }
}
