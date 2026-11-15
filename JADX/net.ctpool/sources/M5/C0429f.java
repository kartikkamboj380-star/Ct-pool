package M5;

import m5.InterfaceC1888g;

/* JADX INFO: renamed from: M5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0429f implements H5.I {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1888g f2085m;

    public C0429f(InterfaceC1888g interfaceC1888g) {
        this.f2085m = interfaceC1888g;
    }

    @Override // H5.I
    public InterfaceC1888g i() {
        return this.f2085m;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + i() + ')';
    }
}
