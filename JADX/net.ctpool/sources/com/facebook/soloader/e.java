package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final File f13305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f13306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f13307c;

    public e(File file, int i7) {
        this(file, i7, new String[0]);
    }

    @Override // com.facebook.soloader.A
    public String c() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.A
    public int d(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i7, this.f13305a, threadPolicy);
    }

    protected File f(String str) {
        File file = new File(this.f13305a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    protected int g(String str, int i7, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f13283b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f13307c.contains(str)) {
            m.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File fileF = f(str);
        if (fileF == null) {
            m.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = fileF.getCanonicalPath();
        m.a("SoLoader", str + " file found at " + canonicalPath);
        if ((i7 & 1) != 0 && (this.f13306b & 2) != 0) {
            m.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f13306b & 1) != 0) {
            h hVar = new h(fileF);
            try {
                p.h(str, hVar, i7, threadPolicy);
                hVar.close();
            } catch (Throwable th) {
                try {
                    hVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            m.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f13283b.a(canonicalPath, i7);
            return 1;
        } catch (UnsatisfiedLinkError e7) {
            throw z.b(str, e7);
        }
    }

    @Override // com.facebook.soloader.A
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f13305a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f13305a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f13306b + ']';
    }

    public e(File file, int i7, String[] strArr) {
        this.f13305a = file;
        this.f13306b = i7;
        this.f13307c = Arrays.asList(strArr);
    }
}
