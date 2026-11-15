package h6;

import i6.f;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19889a = new f();

    private f() {
    }

    public final String a(int i7) {
        StringBuilder sb;
        if (i7 < 1000 || i7 >= 5000) {
            sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i7);
        } else {
            if ((1004 > i7 || 1006 < i7) && (1015 > i7 || 2999 < i7)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("Code ");
            sb.append(i7);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    public final void b(f.a aVar, byte[] bArr) {
        k.f(aVar, "cursor");
        k.f(bArr, "key");
        int length = bArr.length;
        int i7 = 0;
        do {
            byte[] bArr2 = aVar.f20013q;
            int i8 = aVar.f20014r;
            int i9 = aVar.f20015s;
            if (bArr2 != null) {
                while (i8 < i9) {
                    int i10 = i7 % length;
                    bArr2[i8] = (byte) (bArr2[i8] ^ bArr[i10]);
                    i8++;
                    i7 = i10 + 1;
                }
            }
        } while (aVar.a() != -1);
    }

    public final void c(int i7) {
        String strA = a(i7);
        if (strA == null) {
            return;
        }
        k.c(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
