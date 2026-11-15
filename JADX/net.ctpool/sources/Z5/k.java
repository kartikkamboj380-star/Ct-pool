package Z5;

import T5.A;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4663d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4666c;

    public static final class a {
        private a() {
        }

        public final k a(String str) throws ProtocolException {
            A a7;
            int i7;
            String strSubstring;
            w5.k.f(str, "statusLine");
            if (F5.g.B(str, "HTTP/1.", false, 2, null)) {
                i7 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    a7 = A.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    a7 = A.HTTP_1_1;
                }
            } else {
                if (!F5.g.B(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                a7 = A.HTTP_1_0;
                i7 = 4;
            }
            int i8 = i7 + 3;
            if (str.length() < i8) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String strSubstring2 = str.substring(i7, i8);
                w5.k.e(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i9 = Integer.parseInt(strSubstring2);
                if (str.length() <= i8) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i8) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    strSubstring = str.substring(i7 + 4);
                    w5.k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new k(a7, i9, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(A a7, int i7, String str) {
        w5.k.f(a7, "protocol");
        w5.k.f(str, "message");
        this.f4664a = a7;
        this.f4665b = i7;
        this.f4666c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4664a == A.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f4665b);
        sb.append(' ');
        sb.append(this.f4666c);
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
