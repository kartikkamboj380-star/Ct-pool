package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
abstract class J implements L {
    J() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
