package i6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f20046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A f20048o;

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            v.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            v vVar = v.this;
            if (vVar.f20047n) {
                return;
            }
            vVar.flush();
        }

        public String toString() {
            return v.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) throws IOException {
            v vVar = v.this;
            if (vVar.f20047n) {
                throw new IOException("closed");
            }
            vVar.f20046m.P((byte) i7);
            v.this.X();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) throws IOException {
            w5.k.f(bArr, "data");
            v vVar = v.this;
            if (vVar.f20047n) {
                throw new IOException("closed");
            }
            vVar.f20046m.r0(bArr, i7, i8);
            v.this.X();
        }
    }

    public v(A a7) {
        w5.k.f(a7, "sink");
        this.f20048o = a7;
        this.f20046m = new f();
    }

    @Override // i6.g
    public g A() {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM1 = this.f20046m.m1();
        if (jM1 > 0) {
            this.f20048o.w0(this.f20046m, jM1);
        }
        return this;
    }

    @Override // i6.g
    public g C(int i7) {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.C(i7);
        return X();
    }

    @Override // i6.g
    public g G(int i7) {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.G(i7);
        return X();
    }

    @Override // i6.g
    public g H(i iVar) {
        w5.k.f(iVar, "byteString");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.H(iVar);
        return X();
    }

    @Override // i6.g
    public g K0(byte[] bArr) {
        w5.k.f(bArr, "source");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.K0(bArr);
        return X();
    }

    @Override // i6.g
    public g P(int i7) {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.P(i7);
        return X();
    }

    @Override // i6.g
    public g X() {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        long jD = this.f20046m.d();
        if (jD > 0) {
            this.f20048o.w0(this.f20046m, jD);
        }
        return this;
    }

    @Override // i6.g
    public g X0(long j7) {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.X0(j7);
        return X();
    }

    @Override // i6.g
    public OutputStream Z0() {
        return new a();
    }

    @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f20047n) {
            return;
        }
        try {
            if (this.f20046m.m1() > 0) {
                A a7 = this.f20048o;
                f fVar = this.f20046m;
                a7.w0(fVar, fVar.m1());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f20048o.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f20047n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // i6.g, i6.A, java.io.Flushable
    public void flush() {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f20046m.m1() > 0) {
            A a7 = this.f20048o;
            f fVar = this.f20046m;
            a7.w0(fVar, fVar.m1());
        }
        this.f20048o.flush();
    }

    @Override // i6.g
    public f h() {
        return this.f20046m;
    }

    @Override // i6.A
    public D i() {
        return this.f20048o.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20047n;
    }

    @Override // i6.g
    public g k0(String str) {
        w5.k.f(str, "string");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.k0(str);
        return X();
    }

    @Override // i6.g
    public g r0(byte[] bArr, int i7, int i8) {
        w5.k.f(bArr, "source");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.r0(bArr, i7, i8);
        return X();
    }

    public String toString() {
        return "buffer(" + this.f20048o + ')';
    }

    @Override // i6.g
    public g v0(long j7) {
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.v0(j7);
        return X();
    }

    @Override // i6.A
    public void w0(f fVar, long j7) {
        w5.k.f(fVar, "source");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20046m.w0(fVar, j7);
        X();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        w5.k.f(byteBuffer, "source");
        if (!(!this.f20047n)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f20046m.write(byteBuffer);
        X();
        return iWrite;
    }

    @Override // i6.g
    public long x(C c7) {
        w5.k.f(c7, "source");
        long j7 = 0;
        while (true) {
            long jL0 = c7.L0(this.f20046m, 8192);
            if (jL0 == -1) {
                return j7;
            }
            j7 += jL0;
            X();
        }
    }
}
