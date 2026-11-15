package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends FilterOutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f11928m;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f11928m = 0L;
    }

    public long a() {
        return this.f11928m;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i7) throws IOException {
        ((FilterOutputStream) this).out.write(i7);
        this.f11928m++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i7, i8);
        this.f11928m += (long) i8;
    }
}
