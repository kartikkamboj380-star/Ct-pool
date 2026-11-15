package h6;

import i6.C;
import i6.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i6.f f19823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Inflater f19824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o f19825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f19826p;

    public c(boolean z6) {
        this.f19826p = z6;
        i6.f fVar = new i6.f();
        this.f19823m = fVar;
        Inflater inflater = new Inflater(true);
        this.f19824n = inflater;
        this.f19825o = new o((C) fVar, inflater);
    }

    public final void a(i6.f fVar) throws IOException {
        k.f(fVar, "buffer");
        if (!(this.f19823m.m1() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f19826p) {
            this.f19824n.reset();
        }
        this.f19823m.x(fVar);
        this.f19823m.G(65535);
        long bytesRead = this.f19824n.getBytesRead() + this.f19823m.m1();
        do {
            this.f19825o.a(fVar, Long.MAX_VALUE);
        } while (this.f19824n.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19825o.close();
    }
}
