package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1353z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f15321a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f15322b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f15323c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f15324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f15325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W f15326f;

    static {
        byte[] bArr = new byte[0];
        f15324d = bArr;
        f15325e = ByteBuffer.wrap(bArr);
        int i7 = W.f15116a;
        U u6 = new U(bArr, 0, 0, false, null);
        try {
            u6.c(0);
            f15326f = u6;
        } catch (B0 e7) {
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
        return new String(bArr, f15322b);
    }
}
