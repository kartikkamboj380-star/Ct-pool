package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0919a extends A implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f13296b;

    public C0919a(Context context, int i7) {
        this.f13295a = i7;
        this.f13296b = new e(f(context), i7);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.s
    public A b(Context context) {
        this.f13296b = new e(f(context), this.f13295a | 1);
        return this;
    }

    @Override // com.facebook.soloader.A
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.A
    public int d(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return this.f13296b.d(str, i7, threadPolicy);
    }

    @Override // com.facebook.soloader.A
    protected void e(int i7) {
        this.f13296b.e(i7);
    }

    @Override // com.facebook.soloader.A
    public String toString() {
        return c() + "[" + this.f13296b.toString() + "]";
    }
}
