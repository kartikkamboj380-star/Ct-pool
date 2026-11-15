package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C {

    private final class a extends C.e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final b[] f13317m;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + "]");
         */
        /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        a(C c7) throws IOException {
            BufferedReader bufferedReader;
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + j.this.f13271d.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] strArrJ = SysUtil.j();
            int length = strArrJ.length;
            int i7 = 0;
            int i8 = 0;
            loop0: while (i8 < length) {
                String str = strArrJ[i8];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            bufferedReader = new BufferedReader(fileReader);
                        } finally {
                        }
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    file = file3;
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        break loop0;
                                    }
                                    String str2 = line.substring(i7, iIndexOf) + ".so";
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i7 >= size) {
                                            file2 = file3;
                                            String strSubstring = line.substring(iIndexOf + 1);
                                            arrayList.add(new b(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file4, strSubstring)));
                                            break;
                                        } else {
                                            file2 = file3;
                                            if (((b) arrayList.get(i7)).f13278m.equals(str2)) {
                                                break;
                                            }
                                            i7++;
                                            file3 = file2;
                                        }
                                    }
                                    file3 = file2;
                                    i7 = 0;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                } else {
                    file = file3;
                }
                i8++;
                file3 = file;
                i7 = 0;
            }
            c7.s((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.f13317m = (b[]) arrayList.toArray(new b[arrayList.size()]);
        }

        @Override // com.facebook.soloader.C.e
        public C.c[] b() {
            return this.f13317m;
        }

        @Override // com.facebook.soloader.C.e
        public void d(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f13317m) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f13319o);
                try {
                    C.d dVar = new C.d(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    private static final class b extends C.c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final File f13319o;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f13319o = file;
        }
    }

    public j(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.A
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.C
    protected C.e o(boolean z6) {
        return new a(this);
    }
}
