package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f17462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f17463b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f17462a = fileChannel;
        this.f17463b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static b a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
            } catch (IOException | Error | OverlappingFileLockException e7) {
                e = e7;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e8) {
            e = e8;
            channel = null;
            fileLockLock = null;
        }
        try {
            return new b(channel, fileLockLock);
        } catch (IOException e9) {
            e = e9;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                } catch (IOException unused) {
                }
            }
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e10) {
            e = e10;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLockLock != null) {
            }
            if (channel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLockLock != null) {
            }
            if (channel != null) {
            }
            return null;
        }
    }

    void b() {
        try {
            this.f17463b.release();
            this.f17462a.close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }
}
