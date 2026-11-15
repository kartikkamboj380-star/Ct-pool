package T5;

import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3305a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: T5.C$a$a, reason: collision with other inner class name */
        public static final class C0075a extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i6.i f3306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f3307c;

            C0075a(i6.i iVar, x xVar) {
                this.f3306b = iVar;
                this.f3307c = xVar;
            }

            @Override // T5.C
            public long a() {
                return this.f3306b.C();
            }

            @Override // T5.C
            public x b() {
                return this.f3307c;
            }

            @Override // T5.C
            public void h(i6.g gVar) {
                w5.k.f(gVar, "sink");
                gVar.H(this.f3306b);
            }
        }

        public static final class b extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ byte[] f3308b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f3309c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f3310d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f3311e;

            b(byte[] bArr, x xVar, int i7, int i8) {
                this.f3308b = bArr;
                this.f3309c = xVar;
                this.f3310d = i7;
                this.f3311e = i8;
            }

            @Override // T5.C
            public long a() {
                return this.f3310d;
            }

            @Override // T5.C
            public x b() {
                return this.f3309c;
            }

            @Override // T5.C
            public void h(i6.g gVar) {
                w5.k.f(gVar, "sink");
                gVar.r0(this.f3308b, this.f3311e, this.f3310d);
            }
        }

        private a() {
        }

        public static /* synthetic */ C g(a aVar, x xVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                i7 = 0;
            }
            if ((i9 & 8) != 0) {
                i8 = bArr.length;
            }
            return aVar.c(xVar, bArr, i7, i8);
        }

        public static /* synthetic */ C h(a aVar, byte[] bArr, x xVar, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                xVar = null;
            }
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return aVar.f(bArr, xVar, i7, i8);
        }

        public final C a(x xVar, i6.i iVar) {
            w5.k.f(iVar, "content");
            return d(iVar, xVar);
        }

        public final C b(x xVar, String str) {
            w5.k.f(str, "content");
            return e(str, xVar);
        }

        public final C c(x xVar, byte[] bArr, int i7, int i8) {
            w5.k.f(bArr, "content");
            return f(bArr, xVar, i7, i8);
        }

        public final C d(i6.i iVar, x xVar) {
            w5.k.f(iVar, "$this$toRequestBody");
            return new C0075a(iVar, xVar);
        }

        public final C e(String str, x xVar) {
            w5.k.f(str, "$this$toRequestBody");
            Charset charset = F5.d.f1104b;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f3645g.b(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            w5.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return f(bytes, xVar, 0, bytes.length);
        }

        public final C f(byte[] bArr, x xVar, int i7, int i8) {
            w5.k.f(bArr, "$this$toRequestBody");
            U5.c.i(bArr.length, i7, i8);
            return new b(bArr, xVar, i8, i7);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final C c(x xVar, i6.i iVar) {
        return f3305a.a(xVar, iVar);
    }

    public static final C d(x xVar, String str) {
        return f3305a.b(xVar, str);
    }

    public static final C e(x xVar, byte[] bArr) {
        return a.g(f3305a, xVar, bArr, 0, 0, 12, null);
    }

    public abstract long a();

    public abstract x b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(i6.g gVar);
}
