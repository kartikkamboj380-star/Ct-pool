package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f14139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f14140b;

    static {
        Charset.forName("US-ASCII");
        f14139a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14140b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC1067d4.c(bArr, 0, bArr.length, false);
    }

    static int a(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static boolean g(InterfaceC1095g5 interfaceC1095g5) {
        return false;
    }
}
