package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.C;
import com.facebook.soloader.k;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0921c extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13297h;

    /* JADX INFO: renamed from: com.facebook.soloader.c$a */
    protected class a extends k.b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f13298q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final File f13299r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f13300s;

        a(k kVar, boolean z6) {
            super(kVar);
            this.f13298q = z6;
            this.f13299r = new File(C0921c.this.f13271d.getApplicationInfo().nativeLibraryDir);
            this.f13300s = C0921c.this.f13297h;
        }

        @Override // com.facebook.soloader.k.b
        protected k.a[] f() {
            k.a[] aVarArr = this.f13324m;
            if (aVarArr != null) {
                return aVarArr;
            }
            k.a[] aVarArrE = e();
            this.f13324m = aVarArrE;
            if (this.f13298q) {
                m.g("BackupSoSource", "Unconditonally extracting all DSOs from zip");
                return this.f13324m;
            }
            if ((this.f13300s & 1) == 0) {
                m.g("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
                return this.f13324m;
            }
            for (k.a aVar : aVarArrE) {
                if (g(aVar.f13322o, aVar.f13278m)) {
                    return this.f13324m;
                }
            }
            k.a[] aVarArr2 = new k.a[0];
            this.f13324m = aVarArr2;
            return aVarArr2;
        }

        boolean g(ZipEntry zipEntry, String str) {
            String str2;
            String str3;
            String name = zipEntry.getName();
            File file = new File(this.f13299r, str);
            try {
                if (!file.getCanonicalPath().startsWith(this.f13299r.getCanonicalPath())) {
                    m.a("BackupSoSource", "Not allowing consideration of " + name + ": " + str + " not in lib dir.");
                    return false;
                }
                if (file.isFile()) {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str3 = "Allowing consideration of " + file + ": sysdir file length is " + length + ", but the file is " + size + " bytes long in the APK";
                    } else {
                        str2 = "Not allowing consideration of " + name + ": deferring to libdir";
                    }
                } else {
                    str3 = "Allowing consideration of " + name + ": " + str + " not in system lib dir";
                }
                m.g("BackupSoSource", str3);
                return true;
            } catch (IOException e7) {
                str2 = "Not allowing consideration of " + name + ": " + str + ", IOException when constructing path: " + e7.toString();
            }
            m.g("BackupSoSource", str2);
            return false;
        }
    }

    public C0921c(Context context, File file, String str, int i7) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f13297h = i7;
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.A
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C
    protected byte[] m() throws IOException {
        File canonicalFile = this.f13320f.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(SysUtil.g(this.f13271d));
            if ((this.f13297h & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = this.f13271d.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.C
    protected C.e o(boolean z6) {
        return new a(this, z6);
    }

    public boolean v() throws IOException {
        a aVar = new a(this, false);
        try {
            boolean z6 = aVar.e().length != 0;
            aVar.close();
            return z6;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
