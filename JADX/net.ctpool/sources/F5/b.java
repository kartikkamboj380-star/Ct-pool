package F5;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static int a(int i7) {
        if (new C5.c(2, 36).j0(i7)) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new C5.c(2, 36));
    }

    public static final int b(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    public static final boolean c(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }
}
