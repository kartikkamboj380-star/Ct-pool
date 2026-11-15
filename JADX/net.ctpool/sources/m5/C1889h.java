package m5;

import java.io.Serializable;
import m5.InterfaceC1888g;
import v5.p;
import w5.k;

/* JADX INFO: renamed from: m5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1889h implements InterfaceC1888g, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1889h f21267m = new C1889h();

    private C1889h() {
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        return null;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    @Override // m5.InterfaceC1888g
    public Object j(Object obj, p pVar) {
        k.f(pVar, "operation");
        return obj;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g o(InterfaceC1888g interfaceC1888g) {
        k.f(interfaceC1888g, "context");
        return interfaceC1888g;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
