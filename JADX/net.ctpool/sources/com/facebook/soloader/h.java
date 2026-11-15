package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class h implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f13308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FileInputStream f13309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private FileChannel f13310o;

    public h(File file) {
        this.f13308m = file;
        a();
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f13308m);
        this.f13309n = fileInputStream;
        this.f13310o = fileInputStream.getChannel();
    }

    @Override // com.facebook.soloader.g
    public int c0(ByteBuffer byteBuffer, long j7) {
        return this.f13310o.read(byteBuffer, j7);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13309n.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f13310o.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f13310o.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f13310o.write(byteBuffer);
    }
}
