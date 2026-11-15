package com.facebook.soloader;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public class B extends A {
    @Override // com.facebook.soloader.A
    public String c() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.A
    public int d(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e7) {
            m.c("SoLoader", "Error loading library: " + str, e7);
            return 0;
        }
    }

    @Override // com.facebook.soloader.A
    public String toString() {
        return c() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
