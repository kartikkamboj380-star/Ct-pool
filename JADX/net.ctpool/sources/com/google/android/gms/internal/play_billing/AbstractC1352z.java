package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352z implements W0 {
    protected int zza = 0;

    abstract int d(InterfaceC1293h1 interfaceC1293h1);

    public final byte[] f() {
        try {
            int iC = c();
            byte[] bArr = new byte[iC];
            AbstractC1264a0 abstractC1264a0Y = AbstractC1264a0.y(bArr, 0, iC);
            b(abstractC1264a0Y);
            abstractC1264a0Y.z();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }
}
