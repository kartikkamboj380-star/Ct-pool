package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FileOutputStream f13328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FileLock f13329n;

    private l(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f13328m = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f13329n = fileLockLock;
        } catch (Throwable th) {
            this.f13328m.close();
            throw th;
        }
    }

    public static l a(File file) {
        return new l(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f13329n;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f13328m.close();
        }
    }
}
