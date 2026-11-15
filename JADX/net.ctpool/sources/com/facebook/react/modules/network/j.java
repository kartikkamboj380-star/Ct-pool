package com.facebook.react.modules.network;

import T5.C;
import T5.x;
import i6.A;
import i6.q;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class j extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f11936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f11937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11938d = 0;

    class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void b() {
            long jA = a();
            long jA2 = j.this.a();
            j.this.f11937c.a(jA, jA2, jA == jA2);
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i7) throws IOException {
            super.write(i7);
            b();
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) throws IOException {
            super.write(bArr, i7, i8);
            b();
        }
    }

    public j(C c7, i iVar) {
        this.f11936b = c7;
        this.f11937c = iVar;
    }

    private A j(i6.g gVar) {
        return q.h(new a(gVar.Z0()));
    }

    @Override // T5.C
    public long a() {
        if (this.f11938d == 0) {
            this.f11938d = this.f11936b.a();
        }
        return this.f11938d;
    }

    @Override // T5.C
    public x b() {
        return this.f11936b.b();
    }

    @Override // T5.C
    public void h(i6.g gVar) {
        i6.g gVarC = q.c(j(gVar));
        a();
        this.f11936b.h(gVarC);
        gVarC.flush();
    }
}
