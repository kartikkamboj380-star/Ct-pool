package o5;

import m5.C1889h;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: o5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1955j extends AbstractC1946a {
    public AbstractC1955j(InterfaceC1885d interfaceC1885d) {
        super(interfaceC1885d);
        if (interfaceC1885d != null && interfaceC1885d.a() != C1889h.f21267m) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // m5.InterfaceC1885d
    public InterfaceC1888g a() {
        return C1889h.f21267m;
    }
}
