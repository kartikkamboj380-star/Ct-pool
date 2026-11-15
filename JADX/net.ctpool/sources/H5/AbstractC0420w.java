package H5;

/* JADX INFO: renamed from: H5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0420w {
    public static final InterfaceC0418u a(InterfaceC0415q0 interfaceC0415q0) {
        return new C0419v(interfaceC0415q0);
    }

    public static /* synthetic */ InterfaceC0418u b(InterfaceC0415q0 interfaceC0415q0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC0415q0 = null;
        }
        return a(interfaceC0415q0);
    }

    public static final boolean c(InterfaceC0418u interfaceC0418u, Object obj) {
        Throwable thB = i5.m.b(obj);
        return thB == null ? interfaceC0418u.j0(obj) : interfaceC0418u.a0(thB);
    }
}
