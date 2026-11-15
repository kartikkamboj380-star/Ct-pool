package T5;

import com.google.android.gms.common.internal.ImagesContract;
import j5.AbstractC1809n;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f3629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f3630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f3631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f3632j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f3622l = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char[] f3621k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0083a f3633i = new C0083a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3634a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3637d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f3639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f3640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f3641h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3635b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3636c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3638e = -1;

        /* JADX INFO: renamed from: T5.u$a$a, reason: collision with other inner class name */
        public static final class C0083a {
            private C0083a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i7, int i8) {
                try {
                    int i9 = Integer.parseInt(b.b(u.f3622l, str, i7, i8, "", false, false, false, false, null, 248, null));
                    if (1 <= i9 && 65535 >= i9) {
                        return i9;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i7, int i8) {
                while (i7 < i8) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt == ':') {
                        return i7;
                    }
                    if (cCharAt == '[') {
                        do {
                            i7++;
                            if (i7 < i8) {
                            }
                        } while (str.charAt(i7) != ']');
                    }
                    i7++;
                }
                return i8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i7, int i8) {
                if (i8 - i7 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i7);
                if ((w5.k.g(cCharAt, 97) < 0 || w5.k.g(cCharAt, 122) > 0) && (w5.k.g(cCharAt, 65) < 0 || w5.k.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i7++;
                    if (i7 >= i8) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i7);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i7;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i7, int i8) {
                int i9 = 0;
                while (i7 < i8) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i9++;
                    i7++;
                }
                return i9;
            }

            public /* synthetic */ C0083a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f3639f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i7 = this.f3638e;
            if (i7 != -1) {
                return i7;
            }
            b bVar = u.f3622l;
            String str = this.f3634a;
            w5.k.c(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            return w5.k.b(str, ".") || F5.g.p(str, "%2e", true);
        }

        private final boolean g(String str) {
            return w5.k.b(str, "..") || F5.g.p(str, "%2e.", true) || F5.g.p(str, ".%2e", true) || F5.g.p(str, "%2e%2e", true);
        }

        private final void j() {
            if (((String) this.f3639f.remove(r0.size() - 1)).length() != 0 || !(!this.f3639f.isEmpty())) {
                this.f3639f.add("");
            } else {
                this.f3639f.set(r0.size() - 1, "");
            }
        }

        private final void l(String str, int i7, int i8, boolean z6, boolean z7) {
            String strB = b.b(u.f3622l, str, i7, i8, " \"<>^`{}|/\\?#", z7, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            if (((CharSequence) this.f3639f.get(r2.size() - 1)).length() == 0) {
                this.f3639f.set(r2.size() - 1, strB);
            } else {
                this.f3639f.add(strB);
            }
            if (z6) {
                this.f3639f.add("");
            }
        }

        private final void n(String str, int i7, int i8) {
            if (i7 == i8) {
                return;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f3639f.clear();
                this.f3639f.add("");
                i7++;
            } else {
                List list = this.f3639f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i9 = i7;
                if (i9 >= i8) {
                    return;
                }
                i7 = U5.c.n(str, "/\\", i9, i8);
                boolean z6 = i7 < i8;
                l(str, i9, i7, z6, true);
                if (z6) {
                    i7++;
                }
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f3634a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f3622l;
            String strG = b.g(bVar, this.f3635b, 0, 0, false, 7, null);
            String strG2 = b.g(bVar, this.f3636c, 0, 0, false, 7, null);
            String str2 = this.f3637d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f3639f;
            ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g(u.f3622l, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f3640g;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(AbstractC1809n.q(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? b.g(u.f3622l, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f3641h;
            return new u(str, strG, strG2, str2, iB, arrayList2, arrayList, str4 != null ? b.g(u.f3622l, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a c(String str) {
            List listI;
            if (str != null) {
                b bVar = u.f3622l;
                String strB = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                listI = strB != null ? bVar.i(strB) : null;
            }
            this.f3640g = listI;
            return this;
        }

        public final List d() {
            return this.f3639f;
        }

        public final a e(String str) {
            w5.k.f(str, "host");
            String strE = U5.a.e(b.g(u.f3622l, str, 0, 0, false, 7, null));
            if (strE != null) {
                this.f3637d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a h(u uVar, String str) {
            int iN;
            int i7;
            int i8;
            boolean z6;
            int i9;
            String str2;
            int i10;
            boolean z7;
            boolean z8;
            w5.k.f(str, "input");
            int iX = U5.c.x(str, 0, 0, 3, null);
            int iZ = U5.c.z(str, iX, 0, 2, null);
            C0083a c0083a = f3633i;
            int iG = c0083a.g(str, iX, iZ);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z9 = true;
            byte b7 = -1;
            if (iG != -1) {
                if (F5.g.y(str, "https:", iX, true)) {
                    this.f3634a = "https";
                    iX += 6;
                } else {
                    if (!F5.g.y(str, "http:", iX, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, iG);
                        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f3634a = "http";
                    iX += 5;
                }
            } else {
                if (uVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f3634a = uVar.p();
            }
            int iH = c0083a.h(str, iX, iZ);
            byte b8 = 63;
            byte b9 = 35;
            if (iH >= 2 || uVar == null || (!w5.k.b(uVar.p(), this.f3634a))) {
                int i11 = iX + iH;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iN = U5.c.n(str, "@/\\?#", i11, iZ);
                    byte bCharAt = iN != iZ ? str.charAt(iN) : b7;
                    if (bCharAt == b7 || bCharAt == b9 || bCharAt == 47 || bCharAt == 92 || bCharAt == b8) {
                        break;
                    }
                    if (bCharAt != 64) {
                        z6 = z9;
                        i9 = iZ;
                        str2 = str3;
                    } else {
                        if (z10) {
                            z6 = z9;
                            i9 = iZ;
                            str2 = str3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f3636c);
                            sb2.append("%40");
                            i10 = iN;
                            sb2.append(b.b(u.f3622l, str, i11, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f3636c = sb2.toString();
                            z7 = z11;
                        } else {
                            int iM = U5.c.m(str, ':', i11, iN);
                            b bVar = u.f3622l;
                            z6 = z9;
                            i9 = iZ;
                            str2 = str3;
                            String strB = b.b(bVar, str, i11, iM, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z11) {
                                strB = this.f3635b + "%40" + strB;
                            }
                            this.f3635b = strB;
                            i10 = iN;
                            if (iM != i10) {
                                this.f3636c = b.b(bVar, str, iM + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z8 = z6;
                            } else {
                                z8 = z10;
                            }
                            z10 = z8;
                            z7 = z6;
                        }
                        i11 = i10 + 1;
                        z11 = z7;
                    }
                    str3 = str2;
                    iZ = i9;
                    z9 = z6;
                    b9 = 35;
                    b8 = 63;
                    b7 = -1;
                }
                boolean z12 = z9;
                i7 = iZ;
                String str4 = str3;
                C0083a c0083a2 = f3633i;
                int iF = c0083a2.f(str, i11, iN);
                int i12 = iF + 1;
                if (i12 < iN) {
                    i8 = i11;
                    this.f3637d = U5.a.e(b.g(u.f3622l, str, i11, iF, false, 4, null));
                    int iE = c0083a2.e(str, i12, iN);
                    this.f3638e = iE;
                    if (!(iE != -1 ? z12 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i12, iN);
                        w5.k.e(strSubstring2, str4);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    i8 = i11;
                    b bVar2 = u.f3622l;
                    this.f3637d = U5.a.e(b.g(bVar2, str, i8, iF, false, 4, null));
                    String str5 = this.f3634a;
                    w5.k.c(str5);
                    this.f3638e = bVar2.c(str5);
                }
                if (!(this.f3637d != null ? z12 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i8, iF);
                    w5.k.e(strSubstring3, str4);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iX = iN;
            } else {
                this.f3635b = uVar.g();
                this.f3636c = uVar.c();
                this.f3637d = uVar.h();
                this.f3638e = uVar.l();
                this.f3639f.clear();
                this.f3639f.addAll(uVar.e());
                if (iX == iZ || str.charAt(iX) == '#') {
                    c(uVar.f());
                }
                i7 = iZ;
            }
            int i13 = i7;
            int iN2 = U5.c.n(str, "?#", iX, i13);
            n(str, iX, iN2);
            if (iN2 < i13 && str.charAt(iN2) == '?') {
                int iM2 = U5.c.m(str, '#', iN2, i13);
                b bVar3 = u.f3622l;
                this.f3640g = bVar3.i(b.b(bVar3, str, iN2 + 1, iM2, " \"'<>#", true, false, true, false, null, 208, null));
                iN2 = iM2;
            }
            if (iN2 < i13 && str.charAt(iN2) == '#') {
                this.f3641h = b.b(u.f3622l, str, iN2 + 1, i13, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String str) {
            w5.k.f(str, "password");
            this.f3636c = b.b(u.f3622l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i7) {
            if (1 <= i7 && 65535 >= i7) {
                this.f3638e = i7;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i7).toString());
        }

        public final a m() {
            String str = this.f3637d;
            this.f3637d = str != null ? new F5.f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f3639f.size();
            for (int i7 = 0; i7 < size; i7++) {
                List list = this.f3639f;
                list.set(i7, b.b(u.f3622l, (String) list.get(i7), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f3640g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    String str2 = (String) list2.get(i8);
                    list2.set(i8, str2 != null ? b.b(u.f3622l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f3641h;
            this.f3641h = str3 != null ? b.b(u.f3622l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String str) {
            w5.k.f(str, "scheme");
            String str2 = "http";
            if (!F5.g.p(str, "http", true)) {
                str2 = "https";
                if (!F5.g.p(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f3634a = str2;
            return this;
        }

        public final void p(String str) {
            this.f3641h = str;
        }

        public final void q(String str) {
            w5.k.f(str, "<set-?>");
            this.f3636c = str;
        }

        public final void r(String str) {
            w5.k.f(str, "<set-?>");
            this.f3635b = str;
        }

        public final void s(String str) {
            this.f3637d = str;
        }

        public final void t(int i7) {
            this.f3638e = i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f3634a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (this.f3635b.length() > 0 || this.f3636c.length() > 0) {
                sb.append(this.f3635b);
                if (this.f3636c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f3636c);
                }
                sb.append('@');
            }
            String str3 = this.f3637d;
            if (str3 != null) {
                w5.k.c(str3);
                if (F5.g.F(str3, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f3637d);
                    sb.append(']');
                } else {
                    sb.append(this.f3637d);
                }
            }
            if (this.f3638e != -1 || this.f3634a != null) {
                int iB = b();
                String str4 = this.f3634a;
                if (str4 != null) {
                    b bVar = u.f3622l;
                    w5.k.c(str4);
                    if (iB != bVar.c(str4)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
            }
            b bVar2 = u.f3622l;
            bVar2.h(this.f3639f, sb);
            if (this.f3640g != null) {
                sb.append('?');
                List list = this.f3640g;
                w5.k.c(list);
                bVar2.j(list, sb);
            }
            if (this.f3641h != null) {
                sb.append('#');
                sb.append(this.f3641h);
            }
            String string = sb.toString();
            w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f3634a = str;
        }

        public final a v(String str) {
            w5.k.f(str, "username");
            this.f3635b = b.b(u.f3622l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public static /* synthetic */ String b(b bVar, String str, int i7, int i8, String str2, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset, int i9, Object obj) {
            return bVar.a(str, (i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? str.length() : i8, str2, (i9 & 8) != 0 ? false : z6, (i9 & 16) != 0 ? false : z7, (i9 & 32) != 0 ? false : z8, (i9 & 64) != 0 ? false : z9, (i9 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i7, int i8) {
            int i9 = i7 + 2;
            return i9 < i8 && str.charAt(i7) == '%' && U5.c.F(str.charAt(i7 + 1)) != -1 && U5.c.F(str.charAt(i9)) != -1;
        }

        public static /* synthetic */ String g(b bVar, String str, int i7, int i8, boolean z6, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = str.length();
            }
            if ((i9 & 4) != 0) {
                z6 = false;
            }
            return bVar.f(str, i7, i8, z6);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[LOOP:1: B:52:0x0090->B:54:0x0096, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void k(i6.f fVar, String str, int i7, int i8, String str2, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset) throws EOFException {
            int iCharCount = i7;
            i6.f fVar2 = null;
            while (iCharCount < i8) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z6 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z8) {
                        fVar.k0(z6 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || F5.g.F(str2, (char) iCodePointAt, false, 2, null))) {
                        if (fVar2 == null) {
                            fVar2 = new i6.f();
                        }
                        if (charset != null || w5.k.b(charset, StandardCharsets.UTF_8)) {
                            fVar2.C1(iCodePointAt);
                        } else {
                            fVar2.z1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!fVar2.O()) {
                            byte bQ0 = fVar2.q0();
                            fVar.P(37);
                            fVar.P(u.f3621k[((bQ0 & 255) >> 4) & 15]);
                            fVar.P(u.f3621k[bQ0 & 15]);
                        }
                    } else if (iCodePointAt != 37) {
                        fVar.C1(iCodePointAt);
                    } else {
                        if (z6) {
                            if (z7) {
                                if (!e(str, iCharCount, i8)) {
                                }
                            }
                            fVar.C1(iCodePointAt);
                        }
                        if (fVar2 == null) {
                        }
                        if (charset != null) {
                            fVar2.C1(iCodePointAt);
                            while (!fVar2.O()) {
                            }
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void l(i6.f fVar, String str, int i7, int i8, boolean z6) {
            int i9;
            while (i7 < i8) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i7);
                if (iCodePointAt == 37 && (i9 = i7 + 2) < i8) {
                    int iF = U5.c.F(str.charAt(i7 + 1));
                    int iF2 = U5.c.F(str.charAt(i9));
                    if (iF == -1 || iF2 == -1) {
                        fVar.C1(iCodePointAt);
                        i7 += Character.charCount(iCodePointAt);
                    } else {
                        fVar.P((iF << 4) + iF2);
                        i7 = Character.charCount(iCodePointAt) + i9;
                    }
                } else if (iCodePointAt == 43 && z6) {
                    fVar.P(32);
                    i7++;
                } else {
                    fVar.C1(iCodePointAt);
                    i7 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String a(String str, int i7, int i8, String str2, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset) throws EOFException {
            w5.k.f(str, "$this$canonicalize");
            w5.k.f(str2, "encodeSet");
            int iCharCount = i7;
            while (iCharCount < i8) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z9) && !F5.g.F(str2, (char) iCodePointAt, false, 2, null))) {
                    if (iCodePointAt != 37) {
                        if (iCodePointAt == 43 || !z8) {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    } else if (z6) {
                        if (z7) {
                            if (e(str, iCharCount, i8)) {
                            }
                        }
                        if (iCodePointAt == 43) {
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    i6.f fVar = new i6.f();
                    fVar.B1(str, i7, iCharCount);
                    k(fVar, str, iCharCount, i8, str2, z6, z7, z8, z9, charset);
                    return fVar.J0();
                }
                i6.f fVar2 = new i6.f();
                fVar2.B1(str, i7, iCharCount);
                k(fVar2, str, iCharCount, i8, str2, z6, z7, z8, z9, charset);
                return fVar2.J0();
            }
            String strSubstring = str.substring(i7, i8);
            w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String str) {
            w5.k.f(str, "scheme");
            int iHashCode = str.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final u d(String str) {
            w5.k.f(str, "$this$toHttpUrl");
            return new a().h(null, str).a();
        }

        public final String f(String str, int i7, int i8, boolean z6) {
            w5.k.f(str, "$this$percentDecode");
            for (int i9 = i7; i9 < i8; i9++) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                    i6.f fVar = new i6.f();
                    fVar.B1(str, i7, i9);
                    l(fVar, str, i9, i8, z6);
                    return fVar.J0();
                }
            }
            String strSubstring = str.substring(i7, i8);
            w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(List list, StringBuilder sb) {
            w5.k.f(list, "$this$toPathString");
            w5.k.f(sb, "out");
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append('/');
                sb.append((String) list.get(i7));
            }
        }

        public final List i(String str) {
            String strSubstring;
            w5.k.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 <= str.length()) {
                int iQ = F5.g.Q(str, '&', i7, false, 4, null);
                if (iQ == -1) {
                    iQ = str.length();
                }
                int i8 = iQ;
                int iQ2 = F5.g.Q(str, '=', i7, false, 4, null);
                if (iQ2 == -1 || iQ2 > i8) {
                    String strSubstring2 = str.substring(i7, i8);
                    w5.k.e(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i7, iQ2);
                    w5.k.e(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iQ2 + 1, i8);
                    w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i7 = i8 + 1;
            }
            return arrayList;
        }

        public final void j(List list, StringBuilder sb) {
            w5.k.f(list, "$this$toQueryString");
            w5.k.f(sb, "out");
            C5.a aVarK = C5.g.k(C5.g.l(0, list.size()), 2);
            int iF = aVarK.f();
            int iH = aVarK.h();
            int i7 = aVarK.i();
            if (i7 >= 0) {
                if (iF > iH) {
                    return;
                }
            } else if (iF < iH) {
                return;
            }
            while (true) {
                String str = (String) list.get(iF);
                String str2 = (String) list.get(iF + 1);
                if (iF > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iF == iH) {
                    return;
                } else {
                    iF += i7;
                }
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u(String str, String str2, String str3, String str4, int i7, List list, List list2, String str5, String str6) {
        w5.k.f(str, "scheme");
        w5.k.f(str2, "username");
        w5.k.f(str3, "password");
        w5.k.f(str4, "host");
        w5.k.f(list, "pathSegments");
        w5.k.f(str6, ImagesContract.URL);
        this.f3624b = str;
        this.f3625c = str2;
        this.f3626d = str3;
        this.f3627e = str4;
        this.f3628f = i7;
        this.f3629g = list;
        this.f3630h = list2;
        this.f3631i = str5;
        this.f3632j = str6;
        this.f3623a = w5.k.b(str, "https");
    }

    public final String b() {
        if (this.f3631i == null) {
            return null;
        }
        int iQ = F5.g.Q(this.f3632j, '#', 0, false, 6, null) + 1;
        String str = this.f3632j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iQ);
        w5.k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f3626d.length() == 0) {
            return "";
        }
        int iQ = F5.g.Q(this.f3632j, ':', this.f3624b.length() + 3, false, 4, null) + 1;
        int iQ2 = F5.g.Q(this.f3632j, '@', 0, false, 6, null);
        String str = this.f3632j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iQ, iQ2);
        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iQ = F5.g.Q(this.f3632j, '/', this.f3624b.length() + 3, false, 4, null);
        String str = this.f3632j;
        int iN = U5.c.n(str, "?#", iQ, str.length());
        String str2 = this.f3632j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iQ, iN);
        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iQ = F5.g.Q(this.f3632j, '/', this.f3624b.length() + 3, false, 4, null);
        String str = this.f3632j;
        int iN = U5.c.n(str, "?#", iQ, str.length());
        ArrayList arrayList = new ArrayList();
        while (iQ < iN) {
            int i7 = iQ + 1;
            int iM = U5.c.m(this.f3632j, '/', i7, iN);
            String str2 = this.f3632j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i7, iM);
            w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iQ = iM;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && w5.k.b(((u) obj).f3632j, this.f3632j);
    }

    public final String f() {
        if (this.f3630h == null) {
            return null;
        }
        int iQ = F5.g.Q(this.f3632j, '?', 0, false, 6, null) + 1;
        String str = this.f3632j;
        int iM = U5.c.m(str, '#', iQ, str.length());
        String str2 = this.f3632j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iQ, iM);
        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f3625c.length() == 0) {
            return "";
        }
        int length = this.f3624b.length() + 3;
        String str = this.f3632j;
        int iN = U5.c.n(str, ":@", length, str.length());
        String str2 = this.f3632j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iN);
        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f3627e;
    }

    public int hashCode() {
        return this.f3632j.hashCode();
    }

    public final boolean i() {
        return this.f3623a;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f3624b);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f3627e);
        aVar.t(this.f3628f != f3622l.c(this.f3624b) ? this.f3628f : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String str) {
        w5.k.f(str, "link");
        try {
            return new a().h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f3628f;
    }

    public final String m() {
        if (this.f3630h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f3622l.j(this.f3630h, sb);
        return sb.toString();
    }

    public final String n() {
        a aVarK = k("/...");
        w5.k.c(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final u o(String str) {
        w5.k.f(str, "link");
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String p() {
        return this.f3624b;
    }

    public final URI q() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                URI uriCreate = URI.create(new F5.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                w5.k.e(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f3632j);
        } catch (MalformedURLException e7) {
            throw new RuntimeException(e7);
        }
    }

    public String toString() {
        return this.f3632j;
    }
}
