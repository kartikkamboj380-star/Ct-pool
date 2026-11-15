package F5;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends r {
    public static final String D0(String str, int i7) {
        w5.k.f(str, "<this>");
        if (i7 >= 0) {
            String strSubstring = str.substring(C5.g.f(i7, str.length()));
            w5.k.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    public static char E0(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(q.L(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String F0(String str, int i7) {
        w5.k.f(str, "<this>");
        if (i7 >= 0) {
            String strSubstring = str.substring(0, C5.g.f(i7, str.length()));
            w5.k.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }
}
