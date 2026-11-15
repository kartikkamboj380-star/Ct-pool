package s1;

import j5.AbstractC1784C;
import j5.AbstractC1803h;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import w5.k;

/* JADX INFO: renamed from: s1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2040e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2040e f22260a = new C2040e();

    private C2040e() {
    }

    public static final byte[] a(String str) {
        k.f(str, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            k.e(charsetForName, "forName(charsetName)");
            byte[] bytes = str.getBytes(charsetForName);
            k.e(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("ASCII not found!", e7);
        }
    }

    public static final boolean b(byte[] bArr, byte[] bArr2, int i7) {
        k.f(bArr, "byteArray");
        k.f(bArr2, "pattern");
        if (bArr2.length + i7 > bArr.length) {
            return false;
        }
        Iterable iterableS = AbstractC1803h.s(bArr2);
        if (!(iterableS instanceof Collection) || !((Collection) iterableS).isEmpty()) {
            Iterator it = iterableS.iterator();
            while (it.hasNext()) {
                int iD = ((AbstractC1784C) it).d();
                if (bArr[i7 + iD] != bArr2[iD]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(byte[] bArr, byte[] bArr2) {
        k.f(bArr, "byteArray");
        k.f(bArr2, "pattern");
        return b(bArr, bArr2, 0);
    }
}
