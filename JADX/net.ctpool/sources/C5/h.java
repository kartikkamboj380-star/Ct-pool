package C5;

import w5.k;

/* JADX INFO: loaded from: classes2.dex */
abstract class h {
    public static final void a(boolean z6, Number number) {
        k.f(number, "step");
        if (z6) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
