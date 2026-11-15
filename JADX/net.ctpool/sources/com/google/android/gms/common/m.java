package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class m extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f13719c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f13720b;

    m(byte[] bArr) {
        super(bArr);
        this.f13720b = f13719c;
    }

    @Override // com.google.android.gms.common.k
    final byte[] j0() {
        byte[] bArrK0;
        synchronized (this) {
            try {
                bArrK0 = (byte[]) this.f13720b.get();
                if (bArrK0 == null) {
                    bArrK0 = k0();
                    this.f13720b = new WeakReference(bArrK0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrK0;
    }

    protected abstract byte[] k0();
}
