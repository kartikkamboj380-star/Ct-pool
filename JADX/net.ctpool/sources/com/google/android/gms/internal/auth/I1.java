package com.google.android.gms.internal.auth;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends C0 implements InterfaceC0950a1 {
    private static final I1 zzb;
    private E0 zzd = C0.f();

    static {
        I1 i12 = new I1();
        zzb = i12;
        C0.k(I1.class, i12);
    }

    private I1() {
    }

    public static I1 q(byte[] bArr) {
        return (I1) C0.e(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.C0
    protected final Object n(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return C0.h(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i8 == 3) {
            return new I1();
        }
        G1 g12 = null;
        if (i8 == 4) {
            return new H1(g12);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final List r() {
        return this.zzd;
    }
}
