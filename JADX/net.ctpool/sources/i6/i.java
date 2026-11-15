package i6;

import j5.AbstractC1803h;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public class i implements Serializable, Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient int f20020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient String f20021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f20022o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f20019q = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f20018p = new i(new byte[0]);

    public static final class a {
        private a() {
        }

        public static /* synthetic */ i g(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = bArr.length;
            }
            return aVar.f(bArr, i7, i8);
        }

        public final i a(String str) {
            w5.k.f(str, "$this$decodeBase64");
            byte[] bArrA = AbstractC1749a.a(str);
            if (bArrA != null) {
                return new i(bArrA);
            }
            return null;
        }

        public final i b(String str) {
            w5.k.f(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) ((j6.b.g(str.charAt(i8)) << 4) + j6.b.g(str.charAt(i8 + 1)));
            }
            return new i(bArr);
        }

        public final i c(String str, Charset charset) {
            w5.k.f(str, "$this$encode");
            w5.k.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            w5.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i d(String str) {
            w5.k.f(str, "$this$encodeUtf8");
            i iVar = new i(AbstractC1750b.a(str));
            iVar.z(str);
            return iVar;
        }

        public final i e(byte... bArr) {
            w5.k.f(bArr, "data");
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            w5.k.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new i(bArrCopyOf);
        }

        public final i f(byte[] bArr, int i7, int i8) {
            w5.k.f(bArr, "$this$toByteString");
            AbstractC1751c.b(bArr.length, i7, i8);
            return new i(AbstractC1803h.h(bArr, i7, i8 + i7));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(byte[] bArr) {
        w5.k.f(bArr, "data");
        this.f20022o = bArr;
    }

    public static final i j(String str) {
        return f20019q.a(str);
    }

    public static final i l(String str) {
        return f20019q.d(str);
    }

    public static final i v(byte... bArr) {
        return f20019q.e(bArr);
    }

    public final i A() {
        return k("SHA-1");
    }

    public final i B() {
        return k("SHA-256");
    }

    public final int C() {
        return p();
    }

    public final boolean D(i iVar) {
        w5.k.f(iVar, "prefix");
        return w(0, iVar, 0, iVar.C());
    }

    public i E() {
        byte b7;
        for (int i7 = 0; i7 < n().length; i7++) {
            byte b8 = n()[i7];
            byte b9 = (byte) 65;
            if (b8 >= b9 && b8 <= (b7 = (byte) 90)) {
                byte[] bArrN = n();
                byte[] bArrCopyOf = Arrays.copyOf(bArrN, bArrN.length);
                w5.k.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b8 + 32);
                for (int i8 = i7 + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b10 = bArrCopyOf[i8];
                    if (b10 >= b9 && b10 <= b7) {
                        bArrCopyOf[i8] = (byte) (b10 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] F() {
        byte[] bArrN = n();
        byte[] bArrCopyOf = Arrays.copyOf(bArrN, bArrN.length);
        w5.k.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    public String G() {
        String strQ = q();
        if (strQ != null) {
            return strQ;
        }
        String strB = AbstractC1750b.b(s());
        z(strB);
        return strB;
    }

    public void H(f fVar, int i7, int i8) {
        w5.k.f(fVar, "buffer");
        j6.b.f(this, fVar, i7, i8);
    }

    public String e() {
        return AbstractC1749a.c(n(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.C() == n().length && iVar.x(0, n(), 0, n().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(i iVar) {
        w5.k.f(iVar, "other");
        int iC = C();
        int iC2 = iVar.C();
        int iMin = Math.min(iC, iC2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iM = m(i7) & 255;
            int iM2 = iVar.m(i7) & 255;
            if (iM == iM2) {
            }
        }
        if (iC == iC2) {
            return 0;
        }
    }

    public int hashCode() {
        int iO = o();
        if (iO != 0) {
            return iO;
        }
        int iHashCode = Arrays.hashCode(n());
        y(iHashCode);
        return iHashCode;
    }

    public i k(String str) {
        w5.k.f(str, "algorithm");
        return j6.b.d(this, str);
    }

    public final byte m(int i7) {
        return t(i7);
    }

    public final byte[] n() {
        return this.f20022o;
    }

    public final int o() {
        return this.f20020m;
    }

    public int p() {
        return n().length;
    }

    public final String q() {
        return this.f20021n;
    }

    public String r() {
        char[] cArr = new char[n().length * 2];
        int i7 = 0;
        for (byte b7 : n()) {
            int i8 = i7 + 1;
            cArr[i7] = j6.b.h()[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = j6.b.h()[b7 & 15];
        }
        return new String(cArr);
    }

    public byte[] s() {
        return n();
    }

    public byte t(int i7) {
        return n()[i7];
    }

    public String toString() {
        StringBuilder sb;
        if (n().length == 0) {
            return "[size=0]";
        }
        int iC = j6.b.c(n(), 64);
        if (iC != -1) {
            String strG = G();
            if (strG == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strG.substring(0, iC);
            w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strX = F5.g.x(F5.g.x(F5.g.x(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC < strG.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(n().length);
                sb.append(" text=");
                sb.append(strX);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(strX);
                sb.append(']');
            }
        } else if (n().length <= 64) {
            sb = new StringBuilder();
            sb.append("[hex=");
            sb.append(r());
            sb.append(']');
        } else {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(n().length);
            sb.append(" hex=");
            if (!(64 <= n().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + n().length + ')').toString());
            }
            sb.append((64 == n().length ? this : new i(AbstractC1803h.h(n(), 0, 64))).r());
            sb.append("…]");
        }
        return sb.toString();
    }

    public final i u() {
        return k("MD5");
    }

    public boolean w(int i7, i iVar, int i8, int i9) {
        w5.k.f(iVar, "other");
        return iVar.x(i8, n(), i7, i9);
    }

    public boolean x(int i7, byte[] bArr, int i8, int i9) {
        w5.k.f(bArr, "other");
        return i7 >= 0 && i7 <= n().length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && AbstractC1751c.a(n(), i7, bArr, i8, i9);
    }

    public final void y(int i7) {
        this.f20020m = i7;
    }

    public final void z(String str) {
        this.f20021n = str;
    }
}
