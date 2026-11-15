package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final S f15105n = new O(AbstractC1353z0.f15324d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Comparator f15106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Q f15107p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15108m = 0;

    static {
        int i7 = C.f15022a;
        f15107p = new Q(null);
        f15106o = new I();
    }

    S() {
    }

    static int p(int i7, int i8, int i9) {
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

    public static S r(byte[] bArr, int i7, int i8) {
        p(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new O(bArr2);
    }

    public abstract byte c(int i7);

    public abstract boolean equals(Object obj);

    abstract byte f(int i7);

    public abstract int h();

    public final int hashCode() {
        int i7 = this.f15108m;
        if (i7 == 0) {
            int iH = h();
            i7 = i(iH, 0, iH);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f15108m = i7;
        }
        return i7;
    }

    protected abstract int i(int i7, int i8, int i9);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new H(this);
    }

    public abstract S k(int i7, int i8);

    protected abstract String m(Charset charset);

    abstract void n(G g7);

    public abstract boolean o();

    protected final int q() {
        return this.f15108m;
    }

    public final String s(Charset charset) {
        return h() == 0 ? "" : m(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? AbstractC1342v1.a(this) : AbstractC1342v1.a(k(0, 47)).concat("..."));
    }
}
