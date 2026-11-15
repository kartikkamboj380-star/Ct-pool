package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f13339a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f13340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13342d;

    public u() {
        Method nativeLoadRuntimeMethod = SysUtil.getNativeLoadRuntimeMethod();
        this.f13340b = nativeLoadRuntimeMethod;
        String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? SysUtil.getClassLoaderLdLoadLibrary() : null;
        this.f13341c = classLoaderLdLoadLibrary;
        this.f13342d = SysUtil.m(classLoaderLdLoadLibrary);
    }

    private String b(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i7 = fileInputStream.read(bArr);
                    if (i7 <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i7);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e7) {
            return e7.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        com.facebook.soloader.m.b("SoFileLoaderImpl", "Error when loading library: " + r2 + ", library hash is " + b(r7) + ", LD_LIBRARY_PATH is " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    @Override // com.facebook.soloader.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, int i7) throws Throwable {
        String str2;
        Throwable th;
        if (this.f13340b == null) {
            System.load(str);
            return;
        }
        String str3 = (i7 & 4) == 4 ? this.f13341c : this.f13342d;
        String str4 = null;
        try {
            try {
                try {
                    synchronized (this.f13339a) {
                        try {
                            String str5 = (String) this.f13340b.invoke(this.f13339a, str, SoLoader.class.getClassLoader(), str3);
                            if (str5 != null) {
                                str4 = "nativeLoad() returned error for " + str + ": " + str5;
                                throw new y(str, str4);
                            }
                        } catch (Throwable th2) {
                            str2 = str4;
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } catch (Throwable th4) {
            str2 = str4;
            th = th4;
        }
        try {
            throw th;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            str4 = str2;
            str4 = "nativeLoad() error during invocation for " + str + ": " + str4;
            throw new RuntimeException(str4);
        } catch (Throwable th5) {
            th = th5;
            if (str2 != null) {
                m.b("SoFileLoaderImpl", "Error when loading library: " + str2 + ", library hash is " + b(str) + ", LD_LIBRARY_PATH is " + str3);
            }
            throw th;
        }
    }
}
