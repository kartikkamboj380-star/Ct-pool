package h6;

import i6.A;
import i6.f;
import i6.i;
import i6.j;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import t5.AbstractC2070a;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i6.f f19818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Deflater f19819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j f19820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f19821p;

    public a(boolean z6) {
        this.f19821p = z6;
        i6.f fVar = new i6.f();
        this.f19818m = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.f19819n = deflater;
        this.f19820o = new j((A) fVar, deflater);
    }

    private final boolean b(i6.f fVar, i iVar) {
        return fVar.j0(fVar.m1() - ((long) iVar.C()), iVar);
    }

    public final void a(i6.f fVar) throws IOException {
        k.f(fVar, "buffer");
        if (!(this.f19818m.m1() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f19821p) {
            this.f19819n.reset();
        }
        this.f19820o.w0(fVar, fVar.m1());
        this.f19820o.flush();
        if (b(this.f19818m, b.f19822a)) {
            long jM1 = this.f19818m.m1() - ((long) 4);
            f.a aVarB1 = i6.f.b1(this.f19818m, null, 1, null);
            try {
                aVarB1.b(jM1);
                AbstractC2070a.a(aVarB1, null);
            } finally {
            }
        } else {
            this.f19818m.P(0);
        }
        i6.f fVar2 = this.f19818m;
        fVar.w0(fVar2, fVar2.m1());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f19820o.close();
    }
}
