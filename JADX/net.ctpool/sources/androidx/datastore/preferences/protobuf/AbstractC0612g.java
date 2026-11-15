package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0612g implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC0612g f7582n = new i(AbstractC0629y.f7832c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final f f7583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Comparator f7584p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7585m = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7586m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7587n;

        a() {
            this.f7587n = AbstractC0612g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.InterfaceC0152g
        public byte b() {
            int i7 = this.f7586m;
            if (i7 >= this.f7587n) {
                throw new NoSuchElementException();
            }
            this.f7586m = i7 + 1;
            return AbstractC0612g.this.o(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7586m < this.f7587n;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0612g abstractC0612g, AbstractC0612g abstractC0612g2) {
            InterfaceC0152g interfaceC0152gQ = abstractC0612g.q();
            InterfaceC0152g interfaceC0152gQ2 = abstractC0612g2.q();
            while (interfaceC0152gQ.hasNext() && interfaceC0152gQ2.hasNext()) {
                int iCompare = Integer.compare(AbstractC0612g.u(interfaceC0152gQ.b()), AbstractC0612g.u(interfaceC0152gQ2.b()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC0612g.size(), abstractC0612g2.size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC0152g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f7589r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f7590s;

        e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC0612g.i(i7, i7 + i8, bArr.length);
            this.f7589r = i7;
            this.f7590s = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.i
        protected int E() {
            return this.f7589r;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.i, androidx.datastore.preferences.protobuf.AbstractC0612g
        public byte f(int i7) {
            AbstractC0612g.h(i7, size());
            return this.f7591q[this.f7589r + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.i, androidx.datastore.preferences.protobuf.AbstractC0612g
        byte o(int i7) {
            return this.f7591q[this.f7589r + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.i, androidx.datastore.preferences.protobuf.AbstractC0612g
        public int size() {
            return this.f7590s;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0152g extends Iterator {
        byte b();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends AbstractC0612g {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.q();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        protected final byte[] f7591q;

        i(byte[] bArr) {
            bArr.getClass();
            this.f7591q = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        final void C(AbstractC0611f abstractC0611f) {
            abstractC0611f.a(this.f7591q, E(), size());
        }

        final boolean D(AbstractC0612g abstractC0612g, int i7, int i8) {
            if (i8 > abstractC0612g.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC0612g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC0612g.size());
            }
            if (!(abstractC0612g instanceof i)) {
                return abstractC0612g.t(i7, i9).equals(t(0, i8));
            }
            i iVar = (i) abstractC0612g;
            byte[] bArr = this.f7591q;
            byte[] bArr2 = iVar.f7591q;
            int iE = E() + i8;
            int iE2 = E();
            int iE3 = iVar.E() + i7;
            while (iE2 < iE) {
                if (bArr[iE2] != bArr2[iE3]) {
                    return false;
                }
                iE2++;
                iE3++;
            }
            return true;
        }

        protected int E() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0612g) || size() != ((AbstractC0612g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iS = s();
            int iS2 = iVar.s();
            if (iS == 0 || iS2 == 0 || iS == iS2) {
                return D(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        public byte f(int i7) {
            return this.f7591q[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        byte o(int i7) {
            return this.f7591q[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        public final boolean p() {
            int iE = E();
            return q0.n(this.f7591q, iE, size() + iE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        protected final int r(int i7, int i8, int i9) {
            return AbstractC0629y.i(i7, this.f7591q, E() + i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        public int size() {
            return this.f7591q.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        public final AbstractC0612g t(int i7, int i8) {
            int i9 = AbstractC0612g.i(i7, i8, size());
            return i9 == 0 ? AbstractC0612g.f7582n : new e(this.f7591q, E() + i7, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g
        protected final String w(Charset charset) {
            return new String(this.f7591q, E(), size(), charset);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0612g.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f7583o = AbstractC0609d.c() ? new j(aVar) : new d(aVar);
        f7584p = new b();
    }

    AbstractC0612g() {
    }

    static AbstractC0612g A(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    static void h(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
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

    public static AbstractC0612g k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC0612g m(byte[] bArr, int i7, int i8) {
        i(i7, i7 + i8, bArr.length);
        return new i(f7583o.a(bArr, i7, i8));
    }

    public static AbstractC0612g n(String str) {
        return new i(str.getBytes(AbstractC0629y.f7830a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(byte b7) {
        return b7 & 255;
    }

    static AbstractC0612g y(byte[] bArr) {
        return new i(bArr);
    }

    abstract void C(AbstractC0611f abstractC0611f);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i7);

    public final int hashCode() {
        int iR = this.f7585m;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f7585m = iR;
        }
        return iR;
    }

    abstract byte o(int i7);

    public abstract boolean p();

    public InterfaceC0152g q() {
        return new a();
    }

    protected abstract int r(int i7, int i8, int i9);

    protected final int s() {
        return this.f7585m;
    }

    public abstract int size();

    public abstract AbstractC0612g t(int i7, int i8);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final String v(Charset charset) {
        return size() == 0 ? "" : w(charset);
    }

    protected abstract String w(Charset charset);

    public final String x() {
        return v(AbstractC0629y.f7830a);
    }
}
