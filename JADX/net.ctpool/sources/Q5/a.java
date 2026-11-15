package Q5;

import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: Q5.a$a, reason: collision with other inner class name */
    public static final class C0058a {
        public static /* synthetic */ void a(a aVar, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            aVar.c(obj);
        }
    }

    Object a(Object obj, InterfaceC1885d interfaceC1885d);

    boolean b();

    void c(Object obj);
}
