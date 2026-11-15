package T5;

import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.AbstractC1859a;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C0463i[] f3558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0463i[] f3559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f3560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f3561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f3562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f3563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f3564k = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f3567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f3568d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f3570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f3571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3572d;

        public a(l lVar) {
            w5.k.f(lVar, "connectionSpec");
            this.f3569a = lVar.f();
            this.f3570b = lVar.f3567c;
            this.f3571c = lVar.f3568d;
            this.f3572d = lVar.h();
        }

        public final l a() {
            return new l(this.f3569a, this.f3572d, this.f3570b, this.f3571c);
        }

        public final a b(C0463i... c0463iArr) {
            w5.k.f(c0463iArr, "cipherSuites");
            if (!this.f3569a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c0463iArr.length);
            for (C0463i c0463i : c0463iArr) {
                arrayList.add(c0463i.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... strArr) throws CloneNotSupportedException {
            w5.k.f(strArr, "cipherSuites");
            if (!this.f3569a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f3570b = (String[]) objClone;
            return this;
        }

        public final a d(boolean z6) {
            if (!this.f3569a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f3572d = z6;
            return this;
        }

        public final a e(G... gArr) {
            w5.k.f(gArr, "tlsVersions");
            if (!this.f3569a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(gArr.length);
            for (G g7 : gArr) {
                arrayList.add(g7.e());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... strArr) throws CloneNotSupportedException {
            w5.k.f(strArr, "tlsVersions");
            if (!this.f3569a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f3571c = (String[]) objClone;
            return this;
        }

        public a(boolean z6) {
            this.f3569a = z6;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C0463i c0463i = C0463i.f3526n1;
        C0463i c0463i2 = C0463i.f3529o1;
        C0463i c0463i3 = C0463i.f3532p1;
        C0463i c0463i4 = C0463i.f3485Z0;
        C0463i c0463i5 = C0463i.f3496d1;
        C0463i c0463i6 = C0463i.f3487a1;
        C0463i c0463i7 = C0463i.f3499e1;
        C0463i c0463i8 = C0463i.f3517k1;
        C0463i c0463i9 = C0463i.f3514j1;
        C0463i[] c0463iArr = {c0463i, c0463i2, c0463i3, c0463i4, c0463i5, c0463i6, c0463i7, c0463i8, c0463i9};
        f3558e = c0463iArr;
        C0463i[] c0463iArr2 = {c0463i, c0463i2, c0463i3, c0463i4, c0463i5, c0463i6, c0463i7, c0463i8, c0463i9, C0463i.f3455K0, C0463i.f3457L0, C0463i.f3510i0, C0463i.f3513j0, C0463i.f3446G, C0463i.f3454K, C0463i.f3515k};
        f3559f = c0463iArr2;
        a aVarB = new a(true).b((C0463i[]) Arrays.copyOf(c0463iArr, c0463iArr.length));
        G g7 = G.TLS_1_3;
        G g8 = G.TLS_1_2;
        f3560g = aVarB.e(g7, g8).d(true).a();
        f3561h = new a(true).b((C0463i[]) Arrays.copyOf(c0463iArr2, c0463iArr2.length)).e(g7, g8).d(true).a();
        f3562i = new a(true).b((C0463i[]) Arrays.copyOf(c0463iArr2, c0463iArr2.length)).e(g7, g8, G.TLS_1_1, G.TLS_1_0).d(true).a();
        f3563j = new a(false).a();
    }

    public l(boolean z6, boolean z7, String[] strArr, String[] strArr2) {
        this.f3565a = z6;
        this.f3566b = z7;
        this.f3567c = strArr;
        this.f3568d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z6) throws CloneNotSupportedException {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f3567c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            w5.k.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = U5.c.B(enabledCipherSuites2, this.f3567c, C0463i.f3541s1.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f3568d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            w5.k.e(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = U5.c.B(enabledProtocols2, this.f3568d, AbstractC1859a.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        w5.k.e(supportedCipherSuites, "supportedCipherSuites");
        int iU = U5.c.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C0463i.f3541s1.c());
        if (z6 && iU != -1) {
            w5.k.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iU];
            w5.k.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = U5.c.l(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        w5.k.e(enabledCipherSuites, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        w5.k.e(enabledProtocols, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z6) throws CloneNotSupportedException {
        w5.k.f(sSLSocket, "sslSocket");
        l lVarG = g(sSLSocket, z6);
        if (lVarG.i() != null) {
            sSLSocket.setEnabledProtocols(lVarG.f3568d);
        }
        if (lVarG.d() != null) {
            sSLSocket.setEnabledCipherSuites(lVarG.f3567c);
        }
    }

    public final List d() {
        String[] strArr = this.f3567c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0463i.f3541s1.b(str));
        }
        return AbstractC1809n.b0(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "socket");
        if (!this.f3565a) {
            return false;
        }
        String[] strArr = this.f3568d;
        if (strArr != null && !U5.c.r(strArr, sSLSocket.getEnabledProtocols(), AbstractC1859a.b())) {
            return false;
        }
        String[] strArr2 = this.f3567c;
        return strArr2 == null || U5.c.r(strArr2, sSLSocket.getEnabledCipherSuites(), C0463i.f3541s1.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z6 = this.f3565a;
        l lVar = (l) obj;
        if (z6 != lVar.f3565a) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f3567c, lVar.f3567c) && Arrays.equals(this.f3568d, lVar.f3568d) && this.f3566b == lVar.f3566b);
    }

    public final boolean f() {
        return this.f3565a;
    }

    public final boolean h() {
        return this.f3566b;
    }

    public int hashCode() {
        if (!this.f3565a) {
            return 17;
        }
        String[] strArr = this.f3567c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f3568d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3566b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f3568d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(G.f3352t.a(str));
        }
        return AbstractC1809n.b0(arrayList);
    }

    public String toString() {
        if (!this.f3565a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3566b + ')';
    }
}
