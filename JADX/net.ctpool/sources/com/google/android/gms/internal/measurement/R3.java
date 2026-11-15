package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class R3 implements Serializable, Iterable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final R3 f14328n = new C1058c4(B4.f14140b);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Y3 f14329o = new C1049b4();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14330m = 0;

    static {
        new T3();
    }

    R3() {
    }

    static /* synthetic */ int h(byte b7) {
        return b7 & 255;
    }

    static int i(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static R3 m(String str) {
        return new C1058c4(str.getBytes(B4.f14139a));
    }

    public static R3 n(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    public static R3 o(byte[] bArr, int i7, int i8) {
        i(i7, i7 + i8, bArr.length);
        return new C1058c4(f14329o.a(bArr, i7, i8));
    }

    static C1040a4 t(int i7) {
        return new C1040a4(i7);
    }

    public abstract byte c(int i7);

    public abstract boolean equals(Object obj);

    protected final int f() {
        return this.f14330m;
    }

    public final int hashCode() {
        int iS = this.f14330m;
        if (iS == 0) {
            int iR = r();
            iS = s(iR, 0, iR);
            if (iS == 0) {
                iS = 1;
            }
            this.f14330m = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new U3(this);
    }

    public abstract R3 k(int i7, int i8);

    abstract void p(S3 s32);

    abstract byte q(int i7);

    public abstract int r();

    protected abstract int s(int i7, int i8, int i9);

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(r());
        if (r() <= 50) {
            strA = H5.a(this);
        } else {
            strA = H5.a(k(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strA);
    }
}
