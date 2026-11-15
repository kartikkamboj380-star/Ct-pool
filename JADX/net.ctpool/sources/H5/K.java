package H5;

import m5.AbstractC1887f;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes2.dex */
public enum K {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1394a;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1394a = iArr;
        }
    }

    public final void h(v5.p pVar, Object obj, InterfaceC1885d interfaceC1885d) throws Throwable {
        int i7 = a.f1394a[ordinal()];
        if (i7 == 1) {
            N5.a.d(pVar, obj, interfaceC1885d, null, 4, null);
            return;
        }
        if (i7 == 2) {
            AbstractC1887f.a(pVar, obj, interfaceC1885d);
        } else if (i7 == 3) {
            N5.b.a(pVar, obj, interfaceC1885d);
        } else if (i7 != 4) {
            throw new i5.k();
        }
    }

    public final boolean j() {
        return this == LAZY;
    }
}
