package x1;

import O0.j;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: renamed from: x1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2212c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C2212c f22793m = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f22801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f22802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B1.c f22803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorSpace f22804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22805l;

    public C2212c(C2213d c2213d) {
        this.f22794a = c2213d.l();
        this.f22795b = c2213d.k();
        this.f22796c = c2213d.h();
        this.f22797d = c2213d.n();
        this.f22798e = c2213d.m();
        this.f22799f = c2213d.g();
        this.f22800g = c2213d.j();
        this.f22801h = c2213d.c();
        this.f22802i = c2213d.b();
        this.f22803j = c2213d.f();
        c2213d.d();
        this.f22804k = c2213d.e();
        this.f22805l = c2213d.i();
    }

    public static C2212c a() {
        return f22793m;
    }

    public static C2213d b() {
        return new C2213d();
    }

    protected j.a c() {
        return j.c(this).a("minDecodeIntervalMs", this.f22794a).a("maxDimensionPx", this.f22795b).c("decodePreviewFrame", this.f22796c).c("useLastFrameForPreview", this.f22797d).c("useEncodedImageForPreview", this.f22798e).c("decodeAllFrames", this.f22799f).c("forceStaticImage", this.f22800g).b("bitmapConfigName", this.f22801h.name()).b("animatedBitmapConfigName", this.f22802i.name()).b("customImageDecoder", this.f22803j).b("bitmapTransformation", null).b("colorSpace", this.f22804k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2212c c2212c = (C2212c) obj;
        if (this.f22794a != c2212c.f22794a || this.f22795b != c2212c.f22795b || this.f22796c != c2212c.f22796c || this.f22797d != c2212c.f22797d || this.f22798e != c2212c.f22798e || this.f22799f != c2212c.f22799f || this.f22800g != c2212c.f22800g) {
            return false;
        }
        boolean z6 = this.f22805l;
        if (z6 || this.f22801h == c2212c.f22801h) {
            return (z6 || this.f22802i == c2212c.f22802i) && this.f22803j == c2212c.f22803j && this.f22804k == c2212c.f22804k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f22794a * 31) + this.f22795b) * 31) + (this.f22796c ? 1 : 0)) * 31) + (this.f22797d ? 1 : 0)) * 31) + (this.f22798e ? 1 : 0)) * 31) + (this.f22799f ? 1 : 0)) * 31) + (this.f22800g ? 1 : 0);
        if (!this.f22805l) {
            iOrdinal = (iOrdinal * 31) + this.f22801h.ordinal();
        }
        if (!this.f22805l) {
            int i7 = iOrdinal * 31;
            Bitmap.Config config = this.f22802i;
            iOrdinal = i7 + (config != null ? config.ordinal() : 0);
        }
        int i8 = iOrdinal * 31;
        B1.c cVar = this.f22803j;
        int iHashCode = (i8 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f22804k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
