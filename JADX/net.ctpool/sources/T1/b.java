package T1;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f3006c = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f3007d = {".ttf", ".otf"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f3008e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3009a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f3010b = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SparseArray f3011a;

        private a() {
            this.f3011a = new SparseArray(4);
        }

        public Typeface a(int i7) {
            return (Typeface) this.f3011a.get(i7);
        }

        public void b(int i7, Typeface typeface) {
            this.f3011a.put(i7, typeface);
        }
    }

    /* JADX INFO: renamed from: T1.b$b, reason: collision with other inner class name */
    public static class C0069b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f3012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3013b;

        public C0069b(int i7) {
            i7 = i7 == -1 ? 0 : i7;
            this.f3012a = (i7 & 2) != 0;
            this.f3013b = (i7 & 1) != 0 ? 700 : 400;
        }

        public Typeface a(Typeface typeface) {
            return Build.VERSION.SDK_INT < 28 ? Typeface.create(typeface, b()) : Typeface.create(typeface, this.f3013b, this.f3012a);
        }

        public int b() {
            return this.f3013b < 700 ? this.f3012a ? 2 : 0 : this.f3012a ? 3 : 1;
        }

        public C0069b(int i7, int i8) {
            i7 = i7 == -1 ? 0 : i7;
            this.f3012a = (i7 & 2) != 0;
            this.f3013b = i8 == -1 ? (i7 & 1) != 0 ? 700 : 400 : i8;
        }
    }

    private b() {
    }

    private static Typeface a(String str, int i7, AssetManager assetManager) {
        String str2 = f3006c[i7];
        for (String str3 : f3007d) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i7);
    }

    public static b b() {
        if (f3008e == null) {
            f3008e = new b();
        }
        return f3008e;
    }

    public Typeface c(String str, int i7, AssetManager assetManager) {
        return d(str, new C0069b(i7), assetManager);
    }

    public Typeface d(String str, C0069b c0069b, AssetManager assetManager) {
        if (this.f3010b.containsKey(str)) {
            return c0069b.a((Typeface) this.f3010b.get(str));
        }
        a aVar = (a) this.f3009a.get(str);
        if (aVar == null) {
            aVar = new a();
            this.f3009a.put(str, aVar);
        }
        int iB = c0069b.b();
        Typeface typefaceA = aVar.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceA2 = a(str, iB, assetManager);
        aVar.b(iB, typefaceA2);
        return typefaceA2;
    }
}
