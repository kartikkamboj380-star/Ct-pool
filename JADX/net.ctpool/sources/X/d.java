package X;

import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f4258a = new String[0];

    public static final void a(StringBuilder sb, int i7) {
        k.f(sb, "builder");
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("?");
            if (i8 < i7 - 1) {
                sb.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
