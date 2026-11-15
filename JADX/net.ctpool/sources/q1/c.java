package q1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a(char c7) {
        return c7 >= '0' && c7 <= '9';
    }

    public static boolean b(char c7) {
        return (c7 >= 'a' && c7 <= 'z') || (c7 >= 'A' && c7 <= 'Z');
    }

    public static boolean c(char c7) {
        return b(c7) || a(c7);
    }

    public static boolean d(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        int i11;
        if (i8 >= charSequence.length() || (i11 = (i8 - i7) + 1) < i9 || i11 > i10) {
            return false;
        }
        while (i7 <= i8) {
            if (!c(charSequence.charAt(i7))) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static boolean e(CharSequence charSequence, int i7, int i8) {
        return d(charSequence, i7, i8, 3, 8);
    }
}
