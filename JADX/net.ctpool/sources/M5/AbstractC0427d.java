package M5;

/* JADX INFO: renamed from: M5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0427d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f2082a = new F("CLOSED");

    public static final AbstractC0428e b(AbstractC0428e abstractC0428e) {
        while (true) {
            Object objF = abstractC0428e.f();
            if (objF == f2082a) {
                return abstractC0428e;
            }
            AbstractC0428e abstractC0428e2 = (AbstractC0428e) objF;
            if (abstractC0428e2 != null) {
                abstractC0428e = abstractC0428e2;
            } else if (abstractC0428e.j()) {
                return abstractC0428e;
            }
        }
    }

    public static final Object c(C c7, long j7, v5.p pVar) {
        while (true) {
            if (c7.f2062o >= j7 && !c7.h()) {
                return D.a(c7);
            }
            Object objF = c7.f();
            if (objF == f2082a) {
                return D.a(f2082a);
            }
            C c8 = (C) ((AbstractC0428e) objF);
            if (c8 == null) {
                c8 = (C) pVar.m(Long.valueOf(c7.f2062o + 1), c7);
                if (c7.l(c8)) {
                    if (c7.h()) {
                        c7.k();
                    }
                }
            }
            c7 = c8;
        }
    }
}
