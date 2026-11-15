package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f13794a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f13795b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f13796c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f13798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1008u0 f13799f;

    static {
        byte[] bArr = new byte[0];
        f13797d = bArr;
        f13798e = ByteBuffer.wrap(bArr);
        int i7 = AbstractC1008u0.f14035a;
        C1002s0 c1002s0 = new C1002s0(bArr, 0, 0, false, null);
        try {
            c1002s0.c(0);
            f13799f = c1002s0;
        } catch (H0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int a(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    static int b(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f13795b);
    }
}
