package okhttp3.internal.publicsuffix;

import E5.e;
import F5.g;
import U5.c;
import d6.j;
import i5.u;
import i6.h;
import i6.n;
import i6.q;
import j5.AbstractC1809n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f21501a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f21502b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f21503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f21504d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f21500h = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f21497e = {(byte) 42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f21498f = AbstractC1809n.d("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final PublicSuffixDatabase f21499g = new PublicSuffixDatabase();

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i7) {
            int i8;
            int iB;
            boolean z6;
            int iB2;
            int length = bArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = (i9 + length) / 2;
                while (i10 > -1 && bArr[i10] != ((byte) 10)) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i8 = i11 + i12;
                    if (bArr[i8] == ((byte) 10)) {
                        break;
                    }
                    i12++;
                }
                int i13 = i8 - i11;
                int i14 = i7;
                boolean z7 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z7) {
                        iB = 46;
                        z6 = false;
                    } else {
                        boolean z8 = z7;
                        iB = c.b(bArr2[i14][i15], 255);
                        z6 = z8;
                    }
                    iB2 = iB - c.b(bArr[i11 + i16], 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z7 = z6;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z7 = true;
                        i15 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i17 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i18 = i14 + 1; i18 < length3; i18++) {
                            length2 += bArr2[i18].length;
                        }
                        if (length2 >= i17) {
                            if (length2 <= i17) {
                                Charset charset = StandardCharsets.UTF_8;
                                k.e(charset, "UTF_8");
                                return new String(bArr, i11, i13, charset);
                            }
                        }
                    }
                    i9 = i8 + 1;
                }
                length = i10;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f21499g;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final List b(List list) {
        String str;
        String strB;
        String str2;
        List listI;
        List listI2;
        if (this.f21501a.get() || !this.f21501a.compareAndSet(false, true)) {
            try {
                this.f21502b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.f21503c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i7 = 0; i7 < size; i7++) {
            String str3 = (String) list.get(i7);
            Charset charset = StandardCharsets.UTF_8;
            k.e(charset, "UTF_8");
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str3.getBytes(charset);
            k.e(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i7] = bytes;
        }
        int i8 = 0;
        while (true) {
            str = null;
            if (i8 >= size) {
                strB = null;
                break;
            }
            a aVar = f21500h;
            byte[] bArr2 = this.f21503c;
            if (bArr2 == null) {
                k.t("publicSuffixListBytes");
            }
            strB = aVar.b(bArr2, bArr, i8);
            if (strB != null) {
                break;
            }
            i8++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i9 = 0; i9 < length; i9++) {
                bArr3[i9] = f21497e;
                a aVar2 = f21500h;
                byte[] bArr4 = this.f21503c;
                if (bArr4 == null) {
                    k.t("publicSuffixListBytes");
                }
                String strB2 = aVar2.b(bArr4, bArr3, i9);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i10 = size - 1;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                a aVar3 = f21500h;
                byte[] bArr5 = this.f21504d;
                if (bArr5 == null) {
                    k.t("publicSuffixExceptionListBytes");
                }
                String strB3 = aVar3.b(bArr5, bArr, i11);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i11++;
            }
        }
        if (str != null) {
            return g.p0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f21498f;
        }
        if (strB == null || (listI = g.p0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listI = AbstractC1809n.i();
        }
        if (str2 == null || (listI2 = g.p0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listI2 = AbstractC1809n.i();
        }
        return listI.size() > listI2.size() ? listI : listI2;
    }

    private final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        h hVarD = q.d(new n(q.l(resourceAsStream)));
        try {
            byte[] bArrG0 = hVarD.G0(hVarD.F());
            byte[] bArrG02 = hVarD.G0(hVarD.F());
            u uVar = u.f19985a;
            AbstractC2070a.a(hVarD, null);
            synchronized (this) {
                k.c(bArrG0);
                this.f21503c = bArrG0;
                k.c(bArrG02);
                this.f21504d = bArrG02;
            }
            this.f21502b.countDown();
        } finally {
        }
    }

    private final void e() {
        boolean z6 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z6 = true;
                } catch (IOException e7) {
                    j.f18715c.g().k("Failed to read public suffix list", 5, e7);
                    if (z6) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    private final List f(String str) {
        List listP0 = g.p0(str, new char[]{'.'}, false, 0, 6, null);
        return k.b((String) AbstractC1809n.P(listP0), "") ? AbstractC1809n.E(listP0, 1) : listP0;
    }

    public final String c(String str) {
        k.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        k.e(unicode, "unicodeDomain");
        List listF = f(unicode);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        char cCharAt = ((String) listB.get(0)).charAt(0);
        int size = listF.size();
        int size2 = listB.size();
        if (cCharAt != '!') {
            size2++;
        }
        return e.g(e.d(AbstractC1809n.C(f(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
