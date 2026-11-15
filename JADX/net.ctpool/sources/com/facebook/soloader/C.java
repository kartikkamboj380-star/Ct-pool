package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends com.facebook.soloader.e implements InterfaceC0920b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f13271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f13272e;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f13274m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ File f13275n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l f13276o;

        b(boolean z6, File file, l lVar) {
            this.f13274m = z6;
            this.f13275n = file;
            this.f13276o = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f13274m) {
                        SysUtil.f(C.this.f13305a);
                    }
                    C.t(this.f13275n, (byte) 1, this.f13274m);
                    m.f("fb-UnpackingSoSource", "releasing dso store lock for " + C.this.f13305a + " (from syncer thread)");
                    this.f13276o.close();
                } catch (Throwable th) {
                    m.f("fb-UnpackingSoSource", "releasing dso store lock for " + C.this.f13305a + " (from syncer thread)");
                    this.f13276o.close();
                    throw th;
                }
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f13278m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f13279n;

        public c(String str, String str2) {
            this.f13278m = str;
            this.f13279n = str2;
        }
    }

    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f13280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final InputStream f13281n;

        public d(c cVar, InputStream inputStream) {
            this.f13280m = cVar;
            this.f13281n = inputStream;
        }

        public int b() {
            return this.f13281n.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f13281n.close();
        }

        public c d() {
            return this.f13280m;
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void a(d dVar, byte[] bArr, File file) {
            m.d("fb-UnpackingSoSource", "extracting DSO " + dVar.d().f13278m);
            File file2 = new File(file, dVar.d().f13278m);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iB = dVar.b();
                        if (iB > 1) {
                            SysUtil.d(randomAccessFile.getFD(), iB);
                        }
                        SysUtil.a(randomAccessFile, dVar.f13281n, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e7) {
                    m.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e7);
                    SysUtil.c(file2);
                    throw e7;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    m.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        public abstract c[] b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract void d(File file);
    }

    protected C(Context context, String str) {
        super(n(context, str), 1);
        this.f13271d = context;
    }

    private void i() throws IOException {
        File[] fileArrListFiles = this.f13305a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f13305a);
        }
        for (File file : fileArrListFiles) {
            m.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean l(int i7) {
        return (i7 & 2) != 0;
    }

    public static File n(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(l lVar, int i7) throws IOException {
        byte b7;
        RandomAccessFile randomAccessFile;
        File file = new File(this.f13305a, "dso_state");
        byte[] bArrM = m();
        boolean zL = l(i7);
        if (zL || j(bArrM)) {
            b7 = 0;
        } else {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b7 = randomAccessFile.readByte();
                    } catch (IOException e7) {
                        m.f("fb-UnpackingSoSource", "dso store " + this.f13305a + " regeneration interrupted: " + e7.getMessage());
                    }
                    if (b7 == 1) {
                        m.f("fb-UnpackingSoSource", "dso store " + this.f13305a + " regeneration not needed: state file clean");
                    } else {
                        b7 = 0;
                    }
                    randomAccessFile.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b7 == 1) {
            return false;
        }
        boolean z6 = (i7 & 4) == 0;
        m.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        t(file, (byte) 0, z6);
        i();
        e eVarO = o(zL);
        try {
            eVarO.d(this.f13305a);
            eVarO.close();
            randomAccessFile = new RandomAccessFile(new File(this.f13305a, "dso_deps"), "rw");
            try {
                randomAccessFile.write(bArrM);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                b bVar = new b(z6, file, lVar);
                if (r(i7)) {
                    new Thread(bVar, "SoSync:" + this.f13305a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            if (eVarO != null) {
                try {
                    eVarO.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static boolean r(int i7) {
        return (i7 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(File file, byte b7, boolean z6) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b7);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z6) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e7) {
            m.h("fb-UnpackingSoSource", "state file sync failed", e7);
        }
    }

    @Override // com.facebook.soloader.InterfaceC0920b
    public void a() throws Throwable {
        try {
            l lVarI = SysUtil.i(this.f13305a, new File(this.f13305a, "dso_lock"));
            if (lVarI != null) {
                lVarI.close();
            }
        } catch (Exception e7) {
            m.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f13305a + "): ", e7);
        }
    }

    @Override // com.facebook.soloader.A
    protected void e(int i7) throws IOException {
        SysUtil.n(this.f13305a);
        if (!this.f13305a.canWrite() && !this.f13305a.setWritable(true)) {
            throw new IOException("error adding " + this.f13305a.getCanonicalPath() + " write permission");
        }
        l lVar = null;
        try {
            try {
                l lVarI = SysUtil.i(this.f13305a, new File(this.f13305a, "dso_lock"));
                try {
                    m.f("fb-UnpackingSoSource", "locked dso store " + this.f13305a);
                    if (!this.f13305a.canWrite() && !this.f13305a.setWritable(true)) {
                        throw new IOException("error adding " + this.f13305a.getCanonicalPath() + " write permission");
                    }
                    if (!q(lVarI, i7)) {
                        m.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f13305a);
                        lVar = lVarI;
                    }
                    if (lVar != null) {
                        m.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f13305a);
                        lVar.close();
                    } else {
                        m.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f13305a + " (syncer thread started)");
                    }
                    if (!this.f13305a.canWrite() || this.f13305a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f13305a.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    lVar = lVarI;
                    if (lVar != null) {
                        m.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f13305a);
                        lVar.close();
                    } else {
                        m.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f13305a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!this.f13305a.canWrite() || this.f13305a.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + this.f13305a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected boolean j(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f13305a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() == 0) {
                    randomAccessFile.close();
                    return true;
                }
                int length = (int) randomAccessFile.length();
                byte[] bArr2 = new byte[length];
                if (randomAccessFile.read(bArr2) != length) {
                    m.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                    randomAccessFile.close();
                    return true;
                }
                boolean zK = k(bArr2, bArr);
                randomAccessFile.close();
                return zK;
            } finally {
            }
        } catch (IOException e7) {
            m.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e7);
            return true;
        }
    }

    protected boolean k(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] m() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarO = o(false);
        try {
            c[] cVarArrB = eVarO.b();
            parcelObtain.writeInt(cVarArrB.length);
            for (c cVar : cVarArrB) {
                parcelObtain.writeString(cVar.f13278m);
                parcelObtain.writeString(cVar.f13279n);
            }
            eVarO.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            if (eVarO != null) {
                try {
                    eVarO.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected abstract e o(boolean z6);

    public void p() throws IOException {
        e(2);
    }

    public void s(String[] strArr) {
        this.f13272e = strArr;
    }
}
