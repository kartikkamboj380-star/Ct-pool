package M5;

import m5.InterfaceC1888g;

/* JADX INFO: renamed from: M5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0432i extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final transient InterfaceC1888g f2087m;

    public C0432i(InterfaceC1888g interfaceC1888g) {
        this.f2087m = interfaceC1888g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f2087m.toString();
    }
}
