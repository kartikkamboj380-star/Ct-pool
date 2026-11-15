package i6;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends A, WritableByteChannel {
    g A();

    g C(int i7);

    g G(int i7);

    g H(i iVar);

    g K0(byte[] bArr);

    g P(int i7);

    g X();

    g X0(long j7);

    OutputStream Z0();

    @Override // i6.A, java.io.Flushable
    void flush();

    f h();

    g k0(String str);

    g r0(byte[] bArr, int i7, int i8);

    g v0(long j7);

    long x(C c7);
}
