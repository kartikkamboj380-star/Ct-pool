package T5;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f3339m = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: T5.E$a$a, reason: collision with other inner class name */
        public static final class C0076a extends E {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ i6.h f3340n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ x f3341o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ long f3342p;

            C0076a(i6.h hVar, x xVar, long j7) {
                this.f3340n = hVar;
                this.f3341o = xVar;
                this.f3342p = j7;
            }

            @Override // T5.E
            public long e() {
                return this.f3342p;
            }

            @Override // T5.E
            public x f() {
                return this.f3341o;
            }

            @Override // T5.E
            public i6.h j() {
                return this.f3340n;
            }
        }

        private a() {
        }

        public static /* synthetic */ E d(a aVar, byte[] bArr, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return aVar.c(bArr, xVar);
        }

        public final E a(x xVar, long j7, i6.h hVar) {
            w5.k.f(hVar, "content");
            return b(hVar, xVar, j7);
        }

        public final E b(i6.h hVar, x xVar, long j7) {
            w5.k.f(hVar, "$this$asResponseBody");
            return new C0076a(hVar, xVar, j7);
        }

        public final E c(byte[] bArr, x xVar) {
            w5.k.f(bArr, "$this$toResponseBody");
            return b(new i6.f().K0(bArr), xVar, bArr.length);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final Charset d() {
        Charset charsetC;
        x xVarF = f();
        return (xVarF == null || (charsetC = xVarF.c(F5.d.f1104b)) == null) ? F5.d.f1104b : charsetC;
    }

    public static final E g(x xVar, long j7, i6.h hVar) {
        return f3339m.a(xVar, j7, hVar);
    }

    public final InputStream a() {
        return j().e1();
    }

    public final byte[] b() throws IOException {
        long jE = e();
        if (jE > Api.BaseClientBuilder.API_PRIORITY_OTHER) {
            throw new IOException("Cannot buffer entire body for content length: " + jE);
        }
        i6.h hVarJ = j();
        try {
            byte[] bArrM = hVarJ.M();
            AbstractC2070a.a(hVarJ, null);
            int length = bArrM.length;
            if (jE == -1 || jE == length) {
                return bArrM;
            }
            throw new IOException("Content-Length (" + jE + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        U5.c.j(j());
    }

    public abstract long e();

    public abstract x f();

    public abstract i6.h j();

    public final String l() throws IOException {
        i6.h hVarJ = j();
        try {
            String strP0 = hVarJ.p0(U5.c.G(hVarJ, d()));
            AbstractC2070a.a(hVarJ, null);
            return strP0;
        } finally {
        }
    }
}
