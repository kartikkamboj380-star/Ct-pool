package M5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D {
    public static final C b(Object obj) {
        if (obj == AbstractC0427d.f2082a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        w5.k.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (C) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0427d.f2082a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
