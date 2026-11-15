package i5;

import i5.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final Object a(Throwable th) {
        w5.k.f(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f19974m;
        }
    }
}
