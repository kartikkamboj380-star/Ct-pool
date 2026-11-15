package Y4;

import T4.f;
import com.google.android.gms.common.ConnectionResult;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int[] f4466A;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Reader f4467m;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f4475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f4477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f4478x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String[] f4480z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4468n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final char[] f4469o = new char[1024];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4470p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4471q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4472r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4473s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f4474t = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f4479y = 1;

    /* JADX INFO: renamed from: Y4.a$a, reason: collision with other inner class name */
    class C0105a extends f {
        C0105a() {
        }

        @Override // T4.f
        public void a(a aVar) throws IOException {
            int i7;
            int iF = aVar.f4474t;
            if (iF == 0) {
                iF = aVar.f();
            }
            if (iF == 13) {
                i7 = 9;
            } else if (iF == 12) {
                i7 = 8;
            } else {
                if (iF != 14) {
                    throw new IllegalStateException("Expected a name but was " + aVar.R0() + aVar.J());
                }
                i7 = 10;
            }
            aVar.f4474t = i7;
        }
    }

    static {
        f.f3245a = new C0105a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4478x = iArr;
        iArr[0] = 6;
        this.f4480z = new String[32];
        this.f4466A = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4467m = reader;
    }

    private boolean B(char c7) throws IOException {
        if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
            return false;
        }
        if (c7 != '#') {
            if (c7 == ',') {
                return false;
            }
            if (c7 != '/' && c7 != '=') {
                if (c7 == '{' || c7 == '}' || c7 == ':') {
                    return false;
                }
                if (c7 != ';') {
                    switch (c7) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    private String D0(char c7) throws IOException {
        char[] cArr = this.f4469o;
        StringBuilder sb = null;
        while (true) {
            int i7 = this.f4470p;
            int i8 = this.f4471q;
            while (true) {
                if (i7 < i8) {
                    int i9 = i7 + 1;
                    char c8 = cArr[i7];
                    if (c8 == c7) {
                        this.f4470p = i9;
                        int i10 = (i9 - i7) - 1;
                        if (sb == null) {
                            return new String(cArr, i7, i10);
                        }
                        sb.append(cArr, i7, i10);
                        return sb.toString();
                    }
                    if (c8 == '\\') {
                        this.f4470p = i9;
                        int i11 = i9 - i7;
                        int i12 = i11 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i11 * 2, 16));
                        }
                        sb.append(cArr, i7, i12);
                        sb.append(h1());
                    } else {
                        if (c8 == '\n') {
                            this.f4472r++;
                            this.f4473s = i9;
                        }
                        i7 = i9;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i7 - i7) * 2, 16));
                    }
                    sb.append(cArr, i7, i7 - i7);
                    this.f4470p = i7;
                    if (!l(1)) {
                        throw o1("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String M0() throws IOException {
        String string;
        StringBuilder sb = null;
        int i7 = 0;
        do {
            int i8 = 0;
            while (true) {
                int i9 = this.f4470p;
                if (i9 + i8 < this.f4471q) {
                    char c7 = this.f4469o[i9 + i8];
                    if (c7 != '\t' && c7 != '\n' && c7 != '\f' && c7 != '\r' && c7 != ' ') {
                        if (c7 != '#') {
                            if (c7 != ',') {
                                if (c7 != '/' && c7 != '=') {
                                    if (c7 != '{' && c7 != '}' && c7 != ':') {
                                        if (c7 != ';') {
                                            switch (c7) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i8 >= this.f4469o.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i8, 16));
                    }
                    sb.append(this.f4469o, this.f4470p, i8);
                    this.f4470p += i8;
                } else if (l(i8 + 1)) {
                }
            }
            i7 = i8;
            if (sb != null) {
                string = new String(this.f4469o, this.f4470p, i7);
            } else {
                sb.append(this.f4469o, this.f4470p, i7);
                string = sb.toString();
            }
            this.f4470p += i7;
            return string;
        } while (l(1));
        if (sb != null) {
        }
        this.f4470p += i7;
        return string;
    }

    private int S0() {
        String str;
        String str2;
        int i7;
        char c7 = this.f4469o[this.f4470p];
        if (c7 == 't' || c7 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c7 == 'f' || c7 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c7 != 'n' && c7 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i7 = 7;
        }
        int length = str.length();
        for (int i8 = 1; i8 < length; i8++) {
            if (this.f4470p + i8 >= this.f4471q && !l(i8 + 1)) {
                return 0;
            }
            char c8 = this.f4469o[this.f4470p + i8];
            if (c8 != str.charAt(i8) && c8 != str2.charAt(i8)) {
                return 0;
            }
        }
        if ((this.f4470p + length < this.f4471q || l(length + 1)) && B(this.f4469o[this.f4470p + length])) {
            return 0;
        }
        this.f4470p += length;
        this.f4474t = i7;
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (B(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f4475u = r11;
        r18.f4470p += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
    
        r18.f4474t = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
    
        r18.f4476v = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int b1() {
        char c7;
        char c8;
        char[] cArr = this.f4469o;
        int i7 = this.f4470p;
        int i8 = this.f4471q;
        int i9 = 0;
        int i10 = 0;
        char c9 = 0;
        boolean z6 = false;
        boolean z7 = true;
        long j7 = 0;
        while (true) {
            if (i7 + i10 != i8) {
                c7 = cArr[i7 + i10];
                if (c7 == '+') {
                    if (c7 == 'E' || c7 == 'e') {
                        i9 = 0;
                        if (c9 != 2 && c9 != 4) {
                            return 0;
                        }
                        c9 = 5;
                    } else if (c7 != '-') {
                        c8 = 3;
                        if (c7 == '.') {
                            i9 = 0;
                            if (c9 != 2) {
                                return 0;
                            }
                        } else {
                            if (c7 < '0' || c7 > '9') {
                                break;
                            }
                            if (c9 == 1 || c9 == 0) {
                                j7 = -(c7 - '0');
                                c9 = 2;
                            } else if (c9 == 2) {
                                if (j7 == 0) {
                                    return 0;
                                }
                                long j8 = (10 * j7) - ((long) (c7 - '0'));
                                z7 &= j7 > -922337203685477580L || (j7 == -922337203685477580L && j8 < j7);
                                j7 = j8;
                            } else if (c9 == 3) {
                                i9 = 0;
                                c9 = 4;
                            } else if (c9 == 5 || c9 == 6) {
                                i9 = 0;
                                c9 = 7;
                            }
                            i9 = 0;
                        }
                    } else {
                        c8 = 6;
                        i9 = 0;
                        if (c9 == 0) {
                            c9 = 1;
                            z6 = true;
                        } else if (c9 != 5) {
                            return 0;
                        }
                    }
                    i10++;
                } else {
                    c8 = 6;
                    i9 = 0;
                    if (c9 != 5) {
                        return 0;
                    }
                }
                c9 = c8;
                i10++;
            } else {
                if (i10 == cArr.length) {
                    return i9;
                }
                if (!l(i10 + 1)) {
                    break;
                }
                i7 = this.f4470p;
                i8 = this.f4471q;
                c7 = cArr[i7 + i10];
                if (c7 == '+') {
                }
                c9 = c8;
                i10++;
            }
        }
    }

    private void d() throws IOException {
        if (!this.f4468n) {
            throw o1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void e() throws IOException {
        n0(true);
        int i7 = this.f4470p;
        this.f4470p = i7 - 1;
        if (i7 + 4 <= this.f4471q || l(5)) {
            int i8 = this.f4470p;
            char[] cArr = this.f4469o;
            if (cArr[i8] == ')' && cArr[i8 + 1] == ']' && cArr[i8 + 2] == '}' && cArr[i8 + 3] == '\'' && cArr[i8 + 4] == '\n') {
                this.f4470p = i8 + 5;
            }
        }
    }

    private void f1(int i7) {
        int i8 = this.f4479y;
        int[] iArr = this.f4478x;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f4478x = Arrays.copyOf(iArr, i9);
            this.f4466A = Arrays.copyOf(this.f4466A, i9);
            this.f4480z = (String[]) Arrays.copyOf(this.f4480z, i9);
        }
        int[] iArr2 = this.f4478x;
        int i10 = this.f4479y;
        this.f4479y = i10 + 1;
        iArr2[i10] = i7;
    }

    private char h1() throws IOException {
        int i7;
        if (this.f4470p == this.f4471q && !l(1)) {
            throw o1("Unterminated escape sequence");
        }
        char[] cArr = this.f4469o;
        int i8 = this.f4470p;
        int i9 = i8 + 1;
        this.f4470p = i9;
        char c7 = cArr[i8];
        if (c7 == '\n') {
            this.f4472r++;
            this.f4473s = i9;
        } else if (c7 != '\"' && c7 != '\'' && c7 != '/' && c7 != '\\') {
            if (c7 == 'b') {
                return '\b';
            }
            if (c7 == 'f') {
                return '\f';
            }
            if (c7 == 'n') {
                return '\n';
            }
            if (c7 == 'r') {
                return '\r';
            }
            if (c7 == 't') {
                return '\t';
            }
            if (c7 != 'u') {
                throw o1("Invalid escape sequence");
            }
            if (i8 + 5 > this.f4471q && !l(4)) {
                throw o1("Unterminated escape sequence");
            }
            int i10 = this.f4470p;
            int i11 = i10 + 4;
            char c8 = 0;
            while (i10 < i11) {
                char c9 = this.f4469o[i10];
                char c10 = (char) (c8 << 4);
                if (c9 >= '0' && c9 <= '9') {
                    i7 = c9 - '0';
                } else if (c9 >= 'a' && c9 <= 'f') {
                    i7 = c9 - 'W';
                } else {
                    if (c9 < 'A' || c9 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f4469o, this.f4470p, 4));
                    }
                    i7 = c9 - '7';
                }
                c8 = (char) (c10 + i7);
                i10++;
            }
            this.f4470p += 4;
            return c8;
        }
        return c7;
    }

    private void j1(char c7) throws IOException {
        char[] cArr = this.f4469o;
        while (true) {
            int i7 = this.f4470p;
            int i8 = this.f4471q;
            while (true) {
                if (i7 < i8) {
                    int i9 = i7 + 1;
                    char c8 = cArr[i7];
                    if (c8 == c7) {
                        this.f4470p = i9;
                        return;
                    }
                    if (c8 == '\\') {
                        this.f4470p = i9;
                        h1();
                        break;
                    } else {
                        if (c8 == '\n') {
                            this.f4472r++;
                            this.f4473s = i9;
                        }
                        i7 = i9;
                    }
                } else {
                    this.f4470p = i7;
                    if (!l(1)) {
                        throw o1("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean k1(String str) {
        int length = str.length();
        while (true) {
            if (this.f4470p + length > this.f4471q && !l(length)) {
                return false;
            }
            char[] cArr = this.f4469o;
            int i7 = this.f4470p;
            if (cArr[i7] != '\n') {
                for (int i8 = 0; i8 < length; i8++) {
                    if (this.f4469o[this.f4470p + i8] != str.charAt(i8)) {
                        break;
                    }
                }
                return true;
            }
            this.f4472r++;
            this.f4473s = i7 + 1;
            this.f4470p++;
        }
    }

    private boolean l(int i7) throws IOException {
        int i8;
        int i9;
        char[] cArr = this.f4469o;
        int i10 = this.f4473s;
        int i11 = this.f4470p;
        this.f4473s = i10 - i11;
        int i12 = this.f4471q;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f4471q = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f4471q = 0;
        }
        this.f4470p = 0;
        do {
            Reader reader = this.f4467m;
            int i14 = this.f4471q;
            int i15 = reader.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.f4471q + i15;
            this.f4471q = i8;
            if (this.f4472r == 0 && (i9 = this.f4473s) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f4470p++;
                this.f4473s = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    private void l1() {
        char c7;
        do {
            if (this.f4470p >= this.f4471q && !l(1)) {
                return;
            }
            char[] cArr = this.f4469o;
            int i7 = this.f4470p;
            int i8 = i7 + 1;
            this.f4470p = i8;
            c7 = cArr[i7];
            if (c7 == '\n') {
                this.f4472r++;
                this.f4473s = i8;
                return;
            }
        } while (c7 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1() throws IOException {
        do {
            int i7 = 0;
            while (true) {
                int i8 = this.f4470p;
                if (i8 + i7 < this.f4471q) {
                    char c7 = this.f4469o[i8 + i7];
                    if (c7 != '\t' && c7 != '\n' && c7 != '\f' && c7 != '\r' && c7 != ' ') {
                        if (c7 != '#') {
                            if (c7 != ',') {
                                if (c7 != '/' && c7 != '=') {
                                    if (c7 != '{' && c7 != '}' && c7 != ':') {
                                        if (c7 != ';') {
                                            switch (c7) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i7++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f4470p = i8 + i7;
                }
            }
            this.f4470p += i7;
            return;
        } while (l(1));
    }

    private String n(boolean z6) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i7 = 0;
        while (true) {
            int i8 = this.f4479y;
            if (i7 >= i8) {
                return sb.toString();
            }
            int i9 = this.f4478x[i7];
            if (i9 == 1 || i9 == 2) {
                int i10 = this.f4466A[i7];
                if (z6 && i10 > 0 && i7 == i8 - 1) {
                    i10--;
                }
                sb.append('[');
                sb.append(i10);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.f4480z[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r5 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r8.f4470p = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r8.f4470p = r1;
        r1 = l(2);
        r8.f4470p++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r1 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        d();
        r1 = r8.f4470p;
        r2 = r0[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r2 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r2 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r8.f4470p = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        r8.f4470p = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (k1("*\/") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        throw o1("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r8.f4470p = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r5 != '#') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int n0(boolean z6) throws IOException {
        char[] cArr = this.f4469o;
        while (true) {
            int i7 = this.f4470p;
            while (true) {
                int i8 = this.f4471q;
                while (true) {
                    if (i7 == i8) {
                        this.f4470p = i7;
                        if (!l(1)) {
                            if (!z6) {
                                return -1;
                            }
                            throw new EOFException("End of input" + J());
                        }
                        i7 = this.f4470p;
                        i8 = this.f4471q;
                    }
                    int i9 = i7 + 1;
                    char c7 = cArr[i7];
                    if (c7 != '\n') {
                        if (c7 != ' ' && c7 != '\r' && c7 != '\t') {
                            break;
                        }
                    } else {
                        this.f4472r++;
                        this.f4473s = i9;
                    }
                    i7 = i9;
                }
                i7 = this.f4470p + 2;
            }
            l1();
        }
    }

    private IOException o1(String str) throws d {
        throw new d(str + J());
    }

    public void B0() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 7) {
            this.f4474t = 0;
            int[] iArr = this.f4466A;
            int i7 = this.f4479y - 1;
            iArr[i7] = iArr[i7] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + R0() + J());
    }

    public String F0() {
        return n(false);
    }

    public String H0() throws IOException {
        String str;
        char c7;
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = M0();
        } else {
            if (iF == 8) {
                c7 = '\'';
            } else if (iF == 9) {
                c7 = '\"';
            } else if (iF == 11) {
                str = this.f4477w;
                this.f4477w = null;
            } else if (iF == 15) {
                str = Long.toString(this.f4475u);
            } else {
                if (iF != 16) {
                    throw new IllegalStateException("Expected a string but was " + R0() + J());
                }
                str = new String(this.f4469o, this.f4470p, this.f4476v);
                this.f4470p += this.f4476v;
            }
            str = D0(c7);
        }
        this.f4474t = 0;
        int[] iArr = this.f4466A;
        int i7 = this.f4479y - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    String J() {
        return " at line " + (this.f4472r + 1) + " column " + ((this.f4470p - this.f4473s) + 1) + " path " + F0();
    }

    public b R0() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
            case 10:
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean U() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.f4474t = 0;
            int[] iArr = this.f4466A;
            int i7 = this.f4479y - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iF == 6) {
            this.f4474t = 0;
            int[] iArr2 = this.f4466A;
            int i8 = this.f4479y - 1;
            iArr2[i8] = iArr2[i8] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + R0() + J());
    }

    public double W() throws IOException {
        String strD0;
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f4474t = 0;
            int[] iArr = this.f4466A;
            int i7 = this.f4479y - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f4475u;
        }
        if (iF == 16) {
            this.f4477w = new String(this.f4469o, this.f4470p, this.f4476v);
            this.f4470p += this.f4476v;
        } else {
            if (iF == 8 || iF == 9) {
                strD0 = D0(iF == 8 ? '\'' : '\"');
            } else if (iF == 10) {
                strD0 = M0();
            } else if (iF != 11) {
                throw new IllegalStateException("Expected a double but was " + R0() + J());
            }
            this.f4477w = strD0;
        }
        this.f4474t = 11;
        double d7 = Double.parseDouble(this.f4477w);
        if (!this.f4468n && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw new d("JSON forbids NaN and infinities: " + d7 + J());
        }
        this.f4477w = null;
        this.f4474t = 0;
        int[] iArr2 = this.f4466A;
        int i8 = this.f4479y - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return d7;
    }

    public void a() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            f1(1);
            this.f4466A[this.f4479y - 1] = 0;
            this.f4474t = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + R0() + J());
        }
    }

    public int a0() throws IOException {
        String strD0;
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j7 = this.f4475u;
            int i7 = (int) j7;
            if (j7 == i7) {
                this.f4474t = 0;
                int[] iArr = this.f4466A;
                int i8 = this.f4479y - 1;
                iArr[i8] = iArr[i8] + 1;
                return i7;
            }
            throw new NumberFormatException("Expected an int but was " + this.f4475u + J());
        }
        if (iF == 16) {
            this.f4477w = new String(this.f4469o, this.f4470p, this.f4476v);
            this.f4470p += this.f4476v;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected an int but was " + R0() + J());
            }
            if (iF == 10) {
                strD0 = M0();
            } else {
                strD0 = D0(iF == 8 ? '\'' : '\"');
            }
            this.f4477w = strD0;
            try {
                int i9 = Integer.parseInt(this.f4477w);
                this.f4474t = 0;
                int[] iArr2 = this.f4466A;
                int i10 = this.f4479y - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4474t = 11;
        double d7 = Double.parseDouble(this.f4477w);
        int i11 = (int) d7;
        if (i11 != d7) {
            throw new NumberFormatException("Expected an int but was " + this.f4477w + J());
        }
        this.f4477w = null;
        this.f4474t = 0;
        int[] iArr3 = this.f4466A;
        int i12 = this.f4479y - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    public void b() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            f1(3);
            this.f4474t = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + R0() + J());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4474t = 0;
        this.f4478x[0] = 8;
        this.f4479y = 1;
        this.f4467m.close();
    }

    int f() throws IOException {
        int i7;
        int iN0;
        int[] iArr = this.f4478x;
        int i8 = this.f4479y;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else {
            if (i9 != 2) {
                if (i9 == 3 || i9 == 5) {
                    iArr[i8 - 1] = 4;
                    if (i9 == 5 && (iN0 = n0(true)) != 44) {
                        if (iN0 != 59) {
                            if (iN0 != 125) {
                                throw o1("Unterminated object");
                            }
                            this.f4474t = 2;
                            return 2;
                        }
                        d();
                    }
                    int iN02 = n0(true);
                    if (iN02 == 34) {
                        i7 = 13;
                    } else if (iN02 == 39) {
                        d();
                        i7 = 12;
                    } else {
                        if (iN02 == 125) {
                            if (i9 == 5) {
                                throw o1("Expected name");
                            }
                            this.f4474t = 2;
                            return 2;
                        }
                        d();
                        this.f4470p--;
                        if (!B((char) iN02)) {
                            throw o1("Expected name");
                        }
                        i7 = 14;
                    }
                } else if (i9 == 4) {
                    iArr[i8 - 1] = 5;
                    int iN03 = n0(true);
                    if (iN03 != 58) {
                        if (iN03 != 61) {
                            throw o1("Expected ':'");
                        }
                        d();
                        if (this.f4470p < this.f4471q || l(1)) {
                            char[] cArr = this.f4469o;
                            int i10 = this.f4470p;
                            if (cArr[i10] == '>') {
                                this.f4470p = i10 + 1;
                            }
                        }
                    }
                } else if (i9 == 6) {
                    if (this.f4468n) {
                        e();
                    }
                    this.f4478x[this.f4479y - 1] = 7;
                } else if (i9 == 7) {
                    if (n0(false) == -1) {
                        i7 = 17;
                    } else {
                        d();
                        this.f4470p--;
                    }
                } else if (i9 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f4474t = i7;
                return i7;
            }
            int iN04 = n0(true);
            if (iN04 != 44) {
                if (iN04 != 59) {
                    if (iN04 != 93) {
                        throw o1("Unterminated array");
                    }
                    this.f4474t = 4;
                    return 4;
                }
                d();
            }
        }
        int iN05 = n0(true);
        if (iN05 != 34) {
            if (iN05 == 39) {
                d();
                this.f4474t = 8;
                return 8;
            }
            if (iN05 != 44 && iN05 != 59) {
                if (iN05 == 91) {
                    this.f4474t = 3;
                    return 3;
                }
                if (iN05 != 93) {
                    if (iN05 == 123) {
                        this.f4474t = 1;
                        return 1;
                    }
                    this.f4470p--;
                    int iS0 = S0();
                    if (iS0 != 0) {
                        return iS0;
                    }
                    int iB1 = b1();
                    if (iB1 != 0) {
                        return iB1;
                    }
                    if (!B(this.f4469o[this.f4470p])) {
                        throw o1("Expected value");
                    }
                    d();
                    i7 = 10;
                } else if (i9 == 1) {
                    this.f4474t = 4;
                    return 4;
                }
            }
            if (i9 != 1 && i9 != 2) {
                throw o1("Unexpected value");
            }
            d();
            this.f4470p--;
            this.f4474t = 7;
            return 7;
        }
        i7 = 9;
        this.f4474t = i7;
        return i7;
    }

    public void g() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + R0() + J());
        }
        int i7 = this.f4479y;
        this.f4479y = i7 - 1;
        int[] iArr = this.f4466A;
        int i8 = i7 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f4474t = 0;
    }

    public long h0() throws IOException {
        String strD0;
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f4474t = 0;
            int[] iArr = this.f4466A;
            int i7 = this.f4479y - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f4475u;
        }
        if (iF == 16) {
            this.f4477w = new String(this.f4469o, this.f4470p, this.f4476v);
            this.f4470p += this.f4476v;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected a long but was " + R0() + J());
            }
            if (iF == 10) {
                strD0 = M0();
            } else {
                strD0 = D0(iF == 8 ? '\'' : '\"');
            }
            this.f4477w = strD0;
            try {
                long j7 = Long.parseLong(this.f4477w);
                this.f4474t = 0;
                int[] iArr2 = this.f4466A;
                int i8 = this.f4479y - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4474t = 11;
        double d7 = Double.parseDouble(this.f4477w);
        long j8 = (long) d7;
        if (j8 != d7) {
            throw new NumberFormatException("Expected a long but was " + this.f4477w + J());
        }
        this.f4477w = null;
        this.f4474t = 0;
        int[] iArr3 = this.f4466A;
        int i9 = this.f4479y - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j8;
    }

    public final void i1(boolean z6) {
        this.f4468n = z6;
    }

    public void j() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + R0() + J());
        }
        int i7 = this.f4479y;
        int i8 = i7 - 1;
        this.f4479y = i8;
        this.f4480z[i8] = null;
        int[] iArr = this.f4466A;
        int i9 = i7 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f4474t = 0;
    }

    public String j0() throws IOException {
        char c7;
        String strD0;
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strD0 = M0();
        } else {
            if (iF == 12) {
                c7 = '\'';
            } else {
                if (iF != 13) {
                    throw new IllegalStateException("Expected a name but was " + R0() + J());
                }
                c7 = '\"';
            }
            strD0 = D0(c7);
        }
        this.f4474t = 0;
        this.f4480z[this.f4479y - 1] = strD0;
        return strD0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void n1() throws IOException {
        int i7 = 0;
        do {
            int iF = this.f4474t;
            if (iF == 0) {
                iF = f();
            }
            switch (iF) {
                case 1:
                    f1(3);
                    i7++;
                    this.f4474t = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f4480z[this.f4479y - 1] = null;
                    }
                    this.f4479y--;
                    i7--;
                    this.f4474t = 0;
                    break;
                case 3:
                    f1(1);
                    i7++;
                    this.f4474t = 0;
                    break;
                case 4:
                    this.f4479y--;
                    i7--;
                    this.f4474t = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 15:
                default:
                    this.f4474t = 0;
                    break;
                case 8:
                    j1('\'');
                    this.f4474t = 0;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    j1('\"');
                    this.f4474t = 0;
                    break;
                case 10:
                    m1();
                    this.f4474t = 0;
                    break;
                case 12:
                    j1('\'');
                    if (i7 == 0) {
                        this.f4480z[this.f4479y - 1] = "<skipped>";
                    }
                    this.f4474t = 0;
                    break;
                case 13:
                    j1('\"');
                    if (i7 == 0) {
                        this.f4480z[this.f4479y - 1] = "<skipped>";
                    }
                    this.f4474t = 0;
                    break;
                case 14:
                    m1();
                    if (i7 == 0) {
                        this.f4480z[this.f4479y - 1] = "<skipped>";
                    }
                    this.f4474t = 0;
                    break;
                case 16:
                    this.f4470p += this.f4476v;
                    this.f4474t = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.f4466A;
        int i8 = this.f4479y - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    public String o() {
        return n(true);
    }

    public String toString() {
        return getClass().getSimpleName() + J();
    }

    public boolean w() throws IOException {
        int iF = this.f4474t;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 17) ? false : true;
    }

    public final boolean z() {
        return this.f4468n;
    }
}
