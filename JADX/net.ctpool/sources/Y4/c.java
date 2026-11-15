package Y4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f4492v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String[] f4493w = new String[128];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String[] f4494x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Writer f4495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f4496n = new int[32];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4497o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f4498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f4499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f4501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f4502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4503u;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f4493w[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f4493w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4494x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a0(6);
        this.f4499q = ":";
        this.f4503u = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4495m = writer;
    }

    private void B() throws IOException {
        if (this.f4498p == null) {
            return;
        }
        this.f4495m.write(10);
        int i7 = this.f4497o;
        for (int i8 = 1; i8 < i7; i8++) {
            this.f4495m.write(this.f4498p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H0(String str) throws IOException {
        String str2;
        String[] strArr = this.f4501s ? f4494x : f4493w;
        this.f4495m.write(34);
        int length = str.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i7 < i8) {
                        this.f4495m.write(str, i7, i8 - i7);
                    }
                    this.f4495m.write(str2);
                    i7 = i8 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i7 < i8) {
                }
                this.f4495m.write(str2);
                i7 = i8 + 1;
            }
        }
        if (i7 < length) {
            this.f4495m.write(str, i7, length - i7);
        }
        this.f4495m.write(34);
    }

    private c U(int i7, char c7) throws IOException {
        b();
        a0(i7);
        this.f4495m.write(c7);
        return this;
    }

    private int W() {
        int i7 = this.f4497o;
        if (i7 != 0) {
            return this.f4496n[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void a() throws IOException {
        int iW = W();
        if (iW == 5) {
            this.f4495m.write(44);
        } else if (iW != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        B();
        h0(4);
    }

    private void a0(int i7) {
        int i8 = this.f4497o;
        int[] iArr = this.f4496n;
        if (i8 == iArr.length) {
            this.f4496n = Arrays.copyOf(iArr, i8 * 2);
        }
        int[] iArr2 = this.f4496n;
        int i9 = this.f4497o;
        this.f4497o = i9 + 1;
        iArr2[i9] = i7;
    }

    private void b() throws IOException {
        int iW = W();
        if (iW == 1) {
            h0(2);
        } else {
            if (iW != 2) {
                if (iW == 4) {
                    this.f4495m.append((CharSequence) this.f4499q);
                    h0(5);
                    return;
                }
                if (iW != 6) {
                    if (iW != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f4500r) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                h0(7);
                return;
            }
            this.f4495m.append(',');
        }
        B();
    }

    private c f(int i7, int i8, char c7) throws IOException {
        int iW = W();
        if (iW != i8 && iW != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4502t != null) {
            throw new IllegalStateException("Dangling name: " + this.f4502t);
        }
        this.f4497o--;
        if (iW == i8) {
            B();
        }
        this.f4495m.write(c7);
        return this;
    }

    private void h0(int i7) {
        this.f4496n[this.f4497o - 1] = i7;
    }

    private void i1() throws IOException {
        if (this.f4502t != null) {
            a();
            H0(this.f4502t);
            this.f4502t = null;
        }
    }

    private static boolean w(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final void B0(boolean z6) {
        this.f4500r = z6;
    }

    public final void D0(boolean z6) {
        this.f4503u = z6;
    }

    public c J() throws IOException {
        if (this.f4502t != null) {
            if (!this.f4503u) {
                this.f4502t = null;
                return this;
            }
            i1();
        }
        b();
        this.f4495m.write("null");
        return this;
    }

    public c M0(double d7) throws IOException {
        i1();
        if (this.f4500r || !(Double.isNaN(d7) || Double.isInfinite(d7))) {
            b();
            this.f4495m.append((CharSequence) Double.toString(d7));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d7);
    }

    public c R0(long j7) throws IOException {
        i1();
        b();
        this.f4495m.write(Long.toString(j7));
        return this;
    }

    public c S0(Boolean bool) throws IOException {
        if (bool == null) {
            return J();
        }
        i1();
        b();
        this.f4495m.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c b1(Number number) throws IOException {
        if (number == null) {
            return J();
        }
        i1();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!w(cls) && !f4492v.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f4500r) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        b();
        this.f4495m.append((CharSequence) string);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4495m.close();
        int i7 = this.f4497o;
        if (i7 > 1 || (i7 == 1 && this.f4496n[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4497o = 0;
    }

    public c d() throws IOException {
        i1();
        return U(1, '[');
    }

    public c e() throws IOException {
        i1();
        return U(3, '{');
    }

    public c f1(String str) throws IOException {
        if (str == null) {
            return J();
        }
        i1();
        b();
        H0(str);
        return this;
    }

    public void flush() throws IOException {
        if (this.f4497o == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4495m.flush();
    }

    public c g() {
        return f(1, 2, ']');
    }

    public c h1(boolean z6) throws IOException {
        i1();
        b();
        this.f4495m.write(z6 ? "true" : "false");
        return this;
    }

    public c j() {
        return f(3, 5, '}');
    }

    public final void j0(boolean z6) {
        this.f4501s = z6;
    }

    public final boolean l() {
        return this.f4503u;
    }

    public final boolean n() {
        return this.f4501s;
    }

    public final void n0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f4498p = null;
            str2 = ":";
        } else {
            this.f4498p = str;
            str2 = ": ";
        }
        this.f4499q = str2;
    }

    public boolean o() {
        return this.f4500r;
    }

    public c z(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4502t != null) {
            throw new IllegalStateException();
        }
        if (this.f4497o == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4502t = str;
        return this;
    }
}
