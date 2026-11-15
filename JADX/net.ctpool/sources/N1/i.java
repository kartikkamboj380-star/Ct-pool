package N1;

import java.io.IOException;
import java.io.InputStream;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f2137a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f2138b = i.class;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2141c;

        public final int a() {
            return this.f2140b;
        }

        public final int b() {
            return this.f2141c;
        }

        public final boolean c() {
            return this.f2139a;
        }

        public final void d(int i7) {
            this.f2140b = i7;
        }

        public final void e(int i7) {
            this.f2141c = i7;
        }

        public final void f(boolean z6) {
            this.f2139a = z6;
        }
    }

    private i() {
    }

    public static final int a(int i7) {
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        if (i7 == 3) {
            return 180;
        }
        if (i7 != 6) {
            return i7 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int b(InputStream inputStream, int i7, boolean z6) {
        if (i7 >= 10 && h.a(inputStream, 2, z6) == 3 && h.a(inputStream, 4, z6) == 1) {
            return h.a(inputStream, 2, z6);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int c(InputStream inputStream, int i7, boolean z6, int i8) throws IOException {
        if (i7 < 14) {
            return 0;
        }
        int iA = h.a(inputStream, 2, z6);
        int i9 = i7 - 2;
        while (true) {
            int i10 = iA - 1;
            if (iA <= 0 || i9 < 12) {
                break;
            }
            int i11 = i9 - 2;
            if (h.a(inputStream, 2, z6) == i8) {
                return i11;
            }
            inputStream.skip(10L);
            i9 -= 12;
            iA = i10;
        }
    }

    public static final int d(InputStream inputStream, int i7) throws IOException {
        k.f(inputStream, "stream");
        a aVar = new a();
        i iVar = f2137a;
        int iE = iVar.e(inputStream, i7, aVar);
        int iB = aVar.b() - 8;
        if (iE == 0 || iB > iE) {
            return 0;
        }
        inputStream.skip(iB);
        return iVar.b(inputStream, iVar.c(inputStream, iE - iB, aVar.c(), 274), aVar.c());
    }

    private final int e(InputStream inputStream, int i7, a aVar) {
        Class cls;
        String str;
        if (i7 <= 8) {
            return 0;
        }
        aVar.d(h.a(inputStream, 4, false));
        if (aVar.a() == 1229531648 || aVar.a() == 1296891946) {
            aVar.f(aVar.a() == 1229531648);
            aVar.e(h.a(inputStream, 4, aVar.c()));
            int i8 = i7 - 8;
            if (aVar.b() >= 8 && aVar.b() - 8 <= i8) {
                return i8;
            }
            cls = f2138b;
            str = "Invalid offset";
        } else {
            cls = f2138b;
            str = "Invalid TIFF header";
        }
        P0.a.f(cls, str);
        return 0;
    }
}
