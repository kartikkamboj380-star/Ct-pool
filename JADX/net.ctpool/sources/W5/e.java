package W5;

import i6.A;
import i6.f;
import i6.k;
import java.io.EOFException;
import java.io.IOException;
import v5.l;

/* JADX INFO: loaded from: classes2.dex */
public class e extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final l f4257o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(A a7, l lVar) {
        super(a7);
        w5.k.f(a7, "delegate");
        w5.k.f(lVar, "onException");
        this.f4257o = lVar;
    }

    @Override // i6.k, i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4256n) {
            return;
        }
        try {
            super.close();
        } catch (IOException e7) {
            this.f4256n = true;
            this.f4257o.i(e7);
        }
    }

    @Override // i6.k, i6.A, java.io.Flushable
    public void flush() {
        if (this.f4256n) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e7) {
            this.f4256n = true;
            this.f4257o.i(e7);
        }
    }

    @Override // i6.k, i6.A
    public void w0(f fVar, long j7) throws EOFException {
        w5.k.f(fVar, "source");
        if (this.f4256n) {
            fVar.y0(j7);
            return;
        }
        try {
            super.w0(fVar, j7);
        } catch (IOException e7) {
            this.f4256n = true;
            this.f4257o.i(e7);
        }
    }
}
