package W3;

import U3.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {
    public static int a(int i7, int i8, int i9) {
        h.f(i8 <= i9, "min (%s) must be less than or equal to max (%s)", i8, i9);
        return Math.min(Math.max(i7, i8), i9);
    }
}
