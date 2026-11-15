package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.a;
import i5.s;
import j5.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.l;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class ReadableMapBuffer implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f11407p = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ByteBuffer f11408m;

    @R1.a
    private final HybridData mHybridData;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11410o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11411a;

        public b(int i7) {
            this.f11411a = i7;
        }

        private final void g(a.b bVar) {
            a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            g(a.b.f11434r);
            return ReadableMapBuffer.this.C(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double b() {
            g(a.b.f11431o);
            return ReadableMapBuffer.this.x(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String c() {
            g(a.b.f11432p);
            return ReadableMapBuffer.this.E(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int d() {
            g(a.b.f11430n);
            return ReadableMapBuffer.this.A(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a e() {
            g(a.b.f11433q);
            return ReadableMapBuffer.this.D(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            g(a.b.f11429m);
            return ReadableMapBuffer.this.v(this.f11411a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.F(this.f11411a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return a.b.values()[ReadableMapBuffer.this.F(this.f11411a + 2) & 65535];
        }
    }

    public static final class c implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11413m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f11414n;

        c() {
            this.f11414n = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i7 = this.f11413m;
            this.f11413m = i7 + 1;
            return readableMapBuffer.new b(readableMapBuffer.r(i7));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11413m <= this.f11414n;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static final class d extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f11416m = new d();

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11417a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.f11429m.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.f11430n.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.f11434r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.b.f11431o.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.b.f11432p.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.b.f11433q.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f11417a = iArr;
            }
        }

        d() {
            super(1);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence i(a.c cVar) {
            k.f(cVar, "entry");
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getKey());
            sb.append('=');
            switch (a.f11417a[cVar.getType().ordinal()]) {
                case 1:
                    sb.append(cVar.f());
                    return sb;
                case 2:
                    sb.append(cVar.d());
                    return sb;
                case 3:
                    sb.append(cVar.a());
                    return sb;
                case 4:
                    sb.append(cVar.b());
                    return sb;
                case 5:
                    sb.append('\"');
                    sb.append(cVar.c());
                    sb.append('\"');
                    return sb;
                case 6:
                    sb.append(cVar.e().toString());
                    return sb;
                default:
                    return sb;
            }
        }
    }

    static {
        U1.a.a();
    }

    @R1.a
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.f11408m = importByteBuffer();
        this.f11409n = 0;
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i7) {
        return this.f11408m.getInt(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C(int i7) {
        return this.f11408m.getLong(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer D(int i7) {
        return new ReadableMapBuffer(this.f11408m, t() + this.f11408m.getInt(i7) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(int i7) {
        int iT = t() + this.f11408m.getInt(i7);
        int i8 = this.f11408m.getInt(iT);
        byte[] bArr = new byte[i8];
        this.f11408m.position(iT + 4);
        this.f11408m.get(bArr, 0, i8);
        return new String(bArr, F5.d.f1104b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final short F(int i7) {
        return s.e(this.f11408m.getShort(i7));
    }

    private final native ByteBuffer importByteBuffer();

    private final int q(int i7) {
        C5.c cVarA = com.facebook.react.common.mapbuffer.a.f11426c.a();
        int iF = cVarA.f();
        if (i7 <= cVarA.h() && iF <= i7) {
            short sE = s.e((short) i7);
            int count = getCount() - 1;
            int i8 = 0;
            while (i8 <= count) {
                int i9 = (i8 + count) >>> 1;
                int iF2 = F(r(i9)) & 65535;
                int i10 = 65535 & sE;
                if (k.g(iF2, i10) < 0) {
                    i8 = i9 + 1;
                } else {
                    if (k.g(iF2, i10) <= 0) {
                        return i9;
                    }
                    count = i9 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(int i7) {
        return this.f11409n + 8 + (i7 * 12);
    }

    private final int t() {
        return r(getCount());
    }

    private final int u(int i7, a.b bVar) {
        int iQ = q(i7);
        if (iQ == -1) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        a.b bVarW = w(iQ);
        if (bVarW == bVar) {
            return r(iQ) + 4;
        }
        throw new IllegalStateException(("Expected " + bVar + " for key: " + i7 + ", found " + bVarW + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(int i7) {
        return A(i7) == 1;
    }

    private final a.b w(int i7) {
        return a.b.values()[F(r(i7) + 2) & 65535];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double x(int i7) {
        return this.f11408m.getDouble(i7);
    }

    private final void y() {
        if (this.f11408m.getShort() != 254) {
            this.f11408m.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f11410o = F(this.f11408m.position()) & 65535;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.f11408m;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).f11408m;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return k.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i7) {
        return v(u(i7, a.b.f11429m));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.f11410o;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i7) {
        return x(u(i7, a.b.f11431o));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i7) {
        return A(u(i7, a.b.f11430n));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i7) {
        return E(u(i7, a.b.f11432p));
    }

    public int hashCode() {
        this.f11408m.rewind();
        return this.f11408m.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean j0(int i7) {
        return q(i7) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ReadableMapBuffer D0(int i7) {
        return D(u(i7, a.b.f11433q));
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder("{");
        x.L(this, sb, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : d.f11416m);
        sb.append('}');
        String string = sb.toString();
        k.e(string, "toString(...)");
        return string;
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i7) {
        this.mHybridData = null;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i7);
        k.e(byteBufferDuplicate, "apply(...)");
        this.f11408m = byteBufferDuplicate;
        this.f11409n = i7;
        y();
    }
}
