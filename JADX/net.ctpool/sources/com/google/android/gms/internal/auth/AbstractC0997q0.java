package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997q0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC0997q0 f14021n = new C0988n0(G0.f13797d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Comparator f14022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C0994p0 f14023p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14024m = 0;

    static {
        int i7 = AbstractC0958d0.f13883a;
        f14023p = new C0994p0(null);
        f14022o = new C0970h0();
    }

    AbstractC0997q0() {
    }

    static int o(int i7, int i8, int i9) {
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

    public static AbstractC0997q0 q(byte[] bArr, int i7, int i8) {
        o(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new C0988n0(bArr2);
    }

    public abstract byte c(int i7);

    public abstract boolean equals(Object obj);

    abstract byte f(int i7);

    public abstract int h();

    public final int hashCode() {
        int i7 = this.f14024m;
        if (i7 == 0) {
            int iH = h();
            i7 = i(iH, 0, iH);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f14024m = i7;
        }
        return i7;
    }

    protected abstract int i(int i7, int i8, int i9);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0967g0(this);
    }

    public abstract AbstractC0997q0 k(int i7, int i8);

    protected abstract String m(Charset charset);

    public abstract boolean n();

    protected final int p() {
        return this.f14024m;
    }

    public final String r(Charset charset) {
        return h() == 0 ? "" : m(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? AbstractC0992o1.a(this) : AbstractC0992o1.a(k(0, 47)).concat("..."));
    }
}
