package com.facebook.imagepipeline.nativecode;

import O0.l;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.io.OutputStream;
import s1.C2037b;
import s1.C2038c;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeJpegTranscoder implements L1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10701c;

    public NativeJpegTranscoder(boolean z6, int i7, boolean z7, boolean z8) {
        this.f10699a = z6;
        this.f10700b = i7;
        this.f10701c = z7;
        if (z8) {
            g.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i7, int i8, int i9) {
        g.a();
        l.b(Boolean.valueOf(i8 >= 1));
        l.b(Boolean.valueOf(i8 <= 16));
        l.b(Boolean.valueOf(i9 >= 0));
        l.b(Boolean.valueOf(i9 <= 100));
        l.b(Boolean.valueOf(L1.e.j(i7)));
        l.c((i8 == 8 && i7 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) l.g(inputStream), (OutputStream) l.g(outputStream), i7, i8, i9);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i7, int i8, int i9) {
        g.a();
        l.b(Boolean.valueOf(i8 >= 1));
        l.b(Boolean.valueOf(i8 <= 16));
        l.b(Boolean.valueOf(i9 >= 0));
        l.b(Boolean.valueOf(i9 <= 100));
        l.b(Boolean.valueOf(L1.e.i(i7)));
        l.c((i8 == 8 && i7 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) l.g(inputStream), (OutputStream) l.g(outputStream), i7, i8, i9);
    }

    @O0.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i7, int i8, int i9);

    @O0.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i7, int i8, int i9);

    @Override // L1.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // L1.c
    public L1.b b(D1.g gVar, OutputStream outputStream, C2216g c2216g, C2215f c2215f, C2038c c2038c, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (c2216g == null) {
            c2216g = C2216g.c();
        }
        int iB = L1.a.b(c2216g, c2215f, gVar, this.f10700b);
        try {
            int iF = L1.e.f(c2216g, c2215f, gVar, this.f10699a);
            int iA = L1.e.a(iB);
            if (this.f10701c) {
                iF = iA;
            }
            InputStream inputStreamO = gVar.o();
            if (L1.e.f1959b.contains(Integer.valueOf(gVar.g1()))) {
                f((InputStream) l.h(inputStreamO, "Cannot transcode from null input stream!"), outputStream, L1.e.d(c2216g, gVar), iF, num.intValue());
            } else {
                e((InputStream) l.h(inputStreamO, "Cannot transcode from null input stream!"), outputStream, L1.e.e(c2216g, gVar), iF, num.intValue());
            }
            O0.b.b(inputStreamO);
            return new L1.b(iB != 1 ? 0 : 1);
        } catch (Throwable th) {
            O0.b.b(null);
            throw th;
        }
    }

    @Override // L1.c
    public boolean c(C2038c c2038c) {
        return c2038c == C2037b.f22237b;
    }

    @Override // L1.c
    public boolean d(D1.g gVar, C2216g c2216g, C2215f c2215f) {
        if (c2216g == null) {
            c2216g = C2216g.c();
        }
        return L1.e.f(c2216g, c2215f, gVar, this.f10699a) < 8;
    }
}
