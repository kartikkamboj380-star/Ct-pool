package b6;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f9779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f9780e = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6.i f9776a = i6.i.f20019q.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f9777b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f9778c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            w5.k.e(binaryString, "Integer.toBinaryString(it)");
            strArr[i7] = F5.g.w(U5.c.q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f9779d = strArr;
        String[] strArr2 = f9778c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = w5.k.m(strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f9778c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + "|" + strArr3[i10];
            strArr3[i12 | 8] = strArr3[i11] + "|" + strArr3[i10] + "|PADDED";
        }
        int length = f9778c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f9778c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f9779d[i13];
            }
        }
    }

    private e() {
    }

    public final String a(int i7, int i8) {
        String str;
        int i9;
        Object obj;
        String str2;
        String str3;
        if (i8 == 0) {
            return "";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4 || i7 == 6) {
                return i8 == 1 ? "ACK" : f9779d[i8];
            }
            if (i7 != 7 && i7 != 8) {
                String[] strArr = f9778c;
                if (i8 < strArr.length) {
                    str = strArr[i8];
                    w5.k.c(str);
                } else {
                    str = f9779d[i8];
                }
                String str4 = str;
                if (i7 == 5 && (i8 & 4) != 0) {
                    i9 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i7 != 0 || (i8 & 32) == 0) {
                        return str4;
                    }
                    i9 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return F5.g.x(str4, str2, str3, false, i9, obj);
            }
        }
        return f9779d[i8];
    }

    public final String b(int i7) {
        String[] strArr = f9777b;
        return i7 < strArr.length ? strArr[i7] : U5.c.q("0x%02x", Integer.valueOf(i7));
    }

    public final String c(boolean z6, int i7, int i8, int i9, int i10) {
        return U5.c.q("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), b(i9), a(i9, i10));
    }
}
