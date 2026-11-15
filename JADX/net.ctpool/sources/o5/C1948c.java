package o5;

import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: o5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1948c implements InterfaceC1885d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1948c f21487m = new C1948c();

    private C1948c() {
    }

    @Override // m5.InterfaceC1885d
    public InterfaceC1888g a() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // m5.InterfaceC1885d
    public void h(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
