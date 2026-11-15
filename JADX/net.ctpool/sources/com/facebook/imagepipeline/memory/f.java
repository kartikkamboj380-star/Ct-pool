package com.facebook.imagepipeline.memory;

import G1.w;
import G1.y;
import R0.k;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f10693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private S0.a f10694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10695o;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public f(e eVar, int i7) {
        w5.k.f(eVar, "pool");
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f10693m = eVar;
        this.f10695o = 0;
        this.f10694n = S0.a.W(eVar.get(i7), eVar);
    }

    private final void b() {
        if (!S0.a.B(this.f10694n)) {
            throw new a();
        }
    }

    @Override // R0.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        S0.a.g(this.f10694n);
        this.f10694n = null;
        this.f10695o = -1;
        super.close();
    }

    public final void d(int i7) throws Throwable {
        b();
        S0.a aVar = this.f10694n;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        w5.k.c(aVar);
        if (i7 <= ((w) aVar.j()).n()) {
            return;
        }
        Object obj = this.f10693m.get(i7);
        w5.k.e(obj, "this.pool[newLength]");
        w wVar = (w) obj;
        S0.a aVar2 = this.f10694n;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        w5.k.c(aVar2);
        ((w) aVar2.j()).w(0, wVar, 0, this.f10695o);
        S0.a aVar3 = this.f10694n;
        w5.k.c(aVar3);
        aVar3.close();
        this.f10694n = S0.a.W(wVar, this.f10693m);
    }

    @Override // R0.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public y a() {
        b();
        S0.a aVar = this.f10694n;
        if (aVar != null) {
            return new y(aVar, this.f10695o);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // R0.k
    public int size() {
        return this.f10695o;
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        write(new byte[]{(byte) i7});
    }

    public /* synthetic */ f(e eVar, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i8 & 2) != 0 ? eVar.B() : i7);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) throws Throwable {
        w5.k.f(bArr, "buffer");
        if (i7 >= 0 && i8 >= 0 && i7 + i8 <= bArr.length) {
            b();
            d(this.f10695o + i8);
            S0.a aVar = this.f10694n;
            if (aVar == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ((w) aVar.j()).z(this.f10695o, bArr, i7, i8);
            this.f10695o += i8;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i7 + "; regionLength=" + i8);
    }
}
