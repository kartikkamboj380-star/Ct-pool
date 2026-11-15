package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class d extends A implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13302a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13303b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f13304c;

    public d(Context context) {
        this.f13304c = l(context);
    }

    private void f(String str, String str2, String str3) {
        synchronized (this.f13303b) {
            try {
                String str4 = str + str2;
                if (!this.f13303b.containsKey(str4)) {
                    this.f13303b.put(str4, new HashSet());
                }
                ((Set) this.f13303b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(String str, String str2) {
        synchronized (this.f13302a) {
            try {
                if (!this.f13302a.containsKey(str)) {
                    this.f13302a.put(str, new HashSet());
                }
                ((Set) this.f13302a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void h(String str, String str2) throws IOException {
        ZipFile zipFile = new ZipFile(j(str));
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement != null) {
                    if (zipEntryNextElement.getName().endsWith("/" + str2)) {
                        i(str, zipFile, zipEntryNextElement, str2);
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void i(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) throws IOException {
        i iVar = new i(zipFile, zipEntry);
        try {
            for (String str3 : p.b(str2, iVar)) {
                if (!str3.startsWith("/")) {
                    f(str, str2, str3);
                }
            }
            iVar.close();
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String j(String str) {
        return str.substring(0, str.indexOf(33));
    }

    private Set k(String str, String str2) {
        Set set;
        synchronized (this.f13303b) {
            set = (Set) this.f13303b.get(str + str2);
        }
        return set;
    }

    static Set l(Context context) {
        HashSet hashSet = new HashSet();
        String strM = m(context.getApplicationInfo().sourceDir);
        if (strM != null) {
            hashSet.add(strM);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strM2 = m(str);
                if (strM2 != null) {
                    hashSet.add(strM2);
                }
            }
        }
        return hashSet;
    }

    private static String m(String str) {
        String string;
        String[] strArrJ = SysUtil.j();
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot compute fallback path, apk path is ");
            sb.append(str == null ? "null" : "empty");
            string = sb.toString();
        } else {
            if (strArrJ != null && strArrJ.length != 0) {
                return str + "!/lib/" + strArrJ[0];
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot compute fallback path, supportedAbis is ");
            sb2.append(strArrJ == null ? "null" : "empty");
            string = sb2.toString();
        }
        m.g("SoLoader", string);
        return null;
    }

    private void o(String str, String str2, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Set setK = k(str, str2);
        if (setK == null) {
            h(str, str2);
            setK = k(str, str2);
        }
        if (setK != null) {
            Iterator it = setK.iterator();
            while (it.hasNext()) {
                SoLoader.s((String) it.next(), i7, threadPolicy);
            }
        }
    }

    private void p() throws IOException {
        int iIndexOf;
        int i7;
        String strSubstring = null;
        for (String str : this.f13304c) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i7 = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i7);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(j(str));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            g(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.soloader.s
    public A b(Context context) {
        d dVar = new d(context);
        try {
            dVar.p();
            return dVar;
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.facebook.soloader.A
    public String c() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.A
    public int d(String str, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f13283b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.f13304c) {
            Set set = (Set) this.f13302a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                m.f("SoLoader", str + " not found on " + str2);
            } else {
                o(str2, str, i7, threadPolicy);
                try {
                    i7 |= 4;
                    SoLoader.f13283b.a(str2 + File.separator + str, i7);
                    m.a("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e7) {
                    m.h("SoLoader", str + " not found on " + str2 + " flag: " + i7, e7);
                }
            }
        }
        return 0;
    }

    @Override // com.facebook.soloader.A
    protected void e(int i7) throws IOException {
        p();
    }

    public boolean n() {
        return !this.f13304c.isEmpty();
    }

    @Override // com.facebook.soloader.A
    public String toString() {
        return c() + "[root = " + this.f13304c.toString() + ']';
    }
}
