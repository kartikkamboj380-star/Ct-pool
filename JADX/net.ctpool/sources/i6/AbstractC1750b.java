package i6;

/* JADX INFO: renamed from: i6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1750b {
    public static final byte[] a(String str) {
        w5.k.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(F5.d.f1104b);
        w5.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        w5.k.f(bArr, "$this$toUtf8String");
        return new String(bArr, F5.d.f1104b);
    }
}
