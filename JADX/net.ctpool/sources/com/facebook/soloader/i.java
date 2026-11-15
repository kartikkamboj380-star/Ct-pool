package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class i implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f13311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ZipEntry f13312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ZipFile f13313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f13314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f13315q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f13316r = 0;

    public i(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f13313o = zipFile;
        this.f13312n = zipEntry;
        this.f13314p = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f13311m = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    public g a(long j7) throws IOException {
        InputStream inputStream = this.f13311m;
        if (inputStream == null) {
            throw new IOException(this.f13312n.getName() + "'s InputStream is null");
        }
        long j8 = this.f13316r;
        if (j7 == j8) {
            return this;
        }
        long j9 = this.f13314p;
        if (j7 > j9) {
            j7 = j9;
        }
        if (j7 >= j8) {
            inputStream.skip(j7 - j8);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f13313o.getInputStream(this.f13312n);
            this.f13311m = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f13312n.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j7);
        }
        this.f13316r = j7;
        return this;
    }

    @Override // com.facebook.soloader.g
    public int c0(ByteBuffer byteBuffer, long j7) throws IOException {
        if (this.f13311m == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j8 = this.f13314p - j7;
        if (j8 <= 0) {
            return -1;
        }
        int i7 = (int) j8;
        if (iRemaining > i7) {
            iRemaining = i7;
        }
        a(j7);
        if (byteBuffer.hasArray()) {
            this.f13311m.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f13311m.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f13316r += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f13311m;
        if (inputStream != null) {
            inputStream.close();
            this.f13315q = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f13315q;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return c0(byteBuffer, this.f13316r);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
