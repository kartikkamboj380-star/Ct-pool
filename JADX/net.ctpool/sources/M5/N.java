package M5;

import H5.K0;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1888g f2075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f2076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K0[] f2077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2078d;

    public N(InterfaceC1888g interfaceC1888g, int i7) {
        this.f2075a = interfaceC1888g;
        this.f2076b = new Object[i7];
        this.f2077c = new K0[i7];
    }

    public final void a(K0 k02, Object obj) {
        Object[] objArr = this.f2076b;
        int i7 = this.f2078d;
        objArr[i7] = obj;
        K0[] k0Arr = this.f2077c;
        this.f2078d = i7 + 1;
        w5.k.d(k02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k0Arr[i7] = k02;
    }

    public final void b(InterfaceC1888g interfaceC1888g) {
        int length = this.f2077c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            K0 k02 = this.f2077c[length];
            w5.k.c(k02);
            k02.n(interfaceC1888g, this.f2076b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
