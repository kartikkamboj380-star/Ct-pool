package w1;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import x1.C2212c;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2181b implements I0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2215f f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2216g f22606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2212c f22607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I0.d f22608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f22610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f22612i;

    public C2181b(String str, C2215f c2215f, C2216g c2216g, C2212c c2212c, I0.d dVar, String str2) {
        w5.k.f(str, "sourceString");
        w5.k.f(c2216g, "rotationOptions");
        w5.k.f(c2212c, "imageDecodeOptions");
        this.f22604a = str;
        this.f22605b = c2215f;
        this.f22606c = c2216g;
        this.f22607d = c2212c;
        this.f22608e = dVar;
        this.f22609f = str2;
        this.f22611h = (((((((((str.hashCode() * 31) + (c2215f != null ? c2215f.hashCode() : 0)) * 31) + c2216g.hashCode()) * 31) + c2212c.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.f22612i = RealtimeSinceBootClock.get().now();
    }

    @Override // I0.d
    public boolean a(Uri uri) {
        w5.k.f(uri, "uri");
        String strC = c();
        String string = uri.toString();
        w5.k.e(string, "uri.toString()");
        return F5.g.G(strC, string, false, 2, null);
    }

    @Override // I0.d
    public boolean b() {
        return false;
    }

    @Override // I0.d
    public String c() {
        return this.f22604a;
    }

    public final void d(Object obj) {
        this.f22610g = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w5.k.b(C2181b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        w5.k.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C2181b c2181b = (C2181b) obj;
        return w5.k.b(this.f22604a, c2181b.f22604a) && w5.k.b(this.f22605b, c2181b.f22605b) && w5.k.b(this.f22606c, c2181b.f22606c) && w5.k.b(this.f22607d, c2181b.f22607d) && w5.k.b(this.f22608e, c2181b.f22608e) && w5.k.b(this.f22609f, c2181b.f22609f);
    }

    public int hashCode() {
        return this.f22611h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f22604a + ", resizeOptions=" + this.f22605b + ", rotationOptions=" + this.f22606c + ", imageDecodeOptions=" + this.f22607d + ", postprocessorCacheKey=" + this.f22608e + ", postprocessorName=" + this.f22609f + ")";
    }
}
