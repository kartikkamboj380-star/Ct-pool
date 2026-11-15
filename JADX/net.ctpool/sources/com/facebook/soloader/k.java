package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f13320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f13321g;

    protected static final class a extends C.c implements Comparable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final ZipEntry f13322o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f13323p;

        a(String str, ZipEntry zipEntry, int i7) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f13322o = zipEntry;
            this.f13323p = i7;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f13278m.compareTo(aVar.f13278m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13322o.equals(aVar.f13322o) && this.f13323p == aVar.f13323p;
        }

        public int hashCode() {
            return (this.f13323p * 31) + this.f13322o.hashCode();
        }
    }

    protected class b extends C.e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected a[] f13324m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ZipFile f13325n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final C f13326o;

        b(C c7) {
            this.f13325n = new ZipFile(k.this.f13320f);
            this.f13326o = c7;
        }

        @Override // com.facebook.soloader.C.e
        public final C.c[] b() {
            return f();
        }

        @Override // com.facebook.soloader.C.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f13325n.close();
        }

        @Override // com.facebook.soloader.C.e
        public void d(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : f()) {
                InputStream inputStream = this.f13325n.getInputStream(aVar.f13322o);
                try {
                    C.d dVar = new C.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        a[] e() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(k.this.f13321g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f13325n.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f13323p) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f13326o.s((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        abstract a[] f();
    }

    public k(Context context, String str, File file, String str2) {
        super(context, str);
        this.f13320f = file;
        this.f13321g = str2;
    }
}
