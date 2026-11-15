package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class W3 implements X3 {
    W3() {
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
