package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class J3 implements InterfaceC1095g5 {
    protected int zza = 0;

    protected static void f(Iterable iterable, List list) {
        K3.h(iterable, list);
    }

    abstract int e(InterfaceC1229v5 interfaceC1229v5);

    abstract int g();

    abstract void h(int i7);

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            AbstractC1112i4 abstractC1112i4D = AbstractC1112i4.D(bArr);
            a(abstractC1112i4D);
            abstractC1112i4D.E();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }
}
