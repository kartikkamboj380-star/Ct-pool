package com.facebook.imagepipeline.platform;

import O0.d;
import O0.l;
import O0.q;
import R0.h;
import R0.j;
import S0.a;
import X0.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f10708c;

    @d
    public GingerbreadPurgeableDecoder() {
        b.i();
    }

    private static MemoryFile h(a aVar, int i7, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        U0.a aVar2;
        j jVar;
        j jVar2 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i7);
        memoryFile.allowPurging(false);
        try {
            jVar = new j((h) aVar.j());
            try {
                aVar2 = new U0.a(jVar, i7);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            aVar2 = null;
        }
        try {
            outputStream2 = memoryFile.getOutputStream();
            O0.a.a(aVar2, outputStream2);
            if (bArr != null) {
                memoryFile.writeBytes(bArr, 0, i7, bArr.length);
            }
            a.g(aVar);
            O0.b.b(jVar);
            O0.b.b(aVar2);
            O0.b.a(outputStream2, true);
            return memoryFile;
        } catch (Throwable th3) {
            th = th3;
            outputStream = outputStream2;
            jVar2 = jVar;
            a.g(aVar);
            O0.b.b(jVar2);
            O0.b.b(aVar2);
            O0.b.a(outputStream, true);
            throw th;
        }
    }

    private Bitmap i(a aVar, int i7, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFileH = null;
        try {
            try {
                memoryFileH = h(aVar, i7, bArr);
                k(memoryFileH);
                throw new IllegalStateException("WebpBitmapFactory is null");
            } catch (IOException e7) {
                throw q.a(e7);
            }
        } catch (Throwable th) {
            if (memoryFileH != null) {
                memoryFileH.close();
            }
            throw th;
        }
    }

    private synchronized Method j() {
        if (f10708c == null) {
            try {
                f10708c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e7) {
                throw q.a(e7);
            }
        }
        return f10708c;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) l.g(j().invoke(memoryFile, null));
        } catch (Exception e7) {
            throw q.a(e7);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.j()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i7, BitmapFactory.Options options) {
        return i(aVar, i7, DalvikPurgeableDecoder.e(aVar, i7) ? null : DalvikPurgeableDecoder.f10697b, options);
    }
}
