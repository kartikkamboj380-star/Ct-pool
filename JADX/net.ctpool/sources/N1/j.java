package N1;

import i5.l;
import i5.s;
import j5.AbstractC1784C;
import j5.AbstractC1803h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f2142a = new j();

    private j() {
    }

    private final boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable iterableS = AbstractC1803h.s(bArr);
        if (!(iterableS instanceof Collection) || !((Collection) iterableS).isEmpty()) {
            Iterator it = iterableS.iterator();
            while (it.hasNext()) {
                int iD = ((AbstractC1784C) it).d();
                if (((byte) str.charAt(iD)) != bArr[iD]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int b(InputStream inputStream) {
        k.f(inputStream, "stream");
        j jVar = f2142a;
        return (jVar.e(inputStream) << 8) | jVar.e(inputStream);
    }

    private final String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            sb.append((char) (s.e(b7) & 65535));
        }
        String string = sb.toString();
        k.e(string, "str.toString()");
        return string;
    }

    private final int d(InputStream inputStream) {
        int iE = e(inputStream);
        int iE2 = e(inputStream);
        return (e(inputStream) << 24) | (e(inputStream) << 16) | (iE2 << 8) | iE;
    }

    private final int e(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public static final l f(InputStream inputStream) {
        j jVar;
        k.f(inputStream, "stream");
        byte[] bArr = new byte[4];
        try {
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        try {
            try {
                inputStream.read(bArr);
                jVar = f2142a;
            } catch (IOException e8) {
                e8.printStackTrace();
                inputStream.close();
            }
            if (!jVar.a(bArr, "RIFF")) {
                return null;
            }
            jVar.d(inputStream);
            inputStream.read(bArr);
            if (!jVar.a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String strC = jVar.c(bArr);
            int iHashCode = strC.hashCode();
            if (iHashCode != 2640674) {
                if (iHashCode != 2640718) {
                    if (iHashCode == 2640730 && strC.equals("VP8X")) {
                        l lVarI = jVar.i(inputStream);
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        return lVarI;
                    }
                } else if (strC.equals("VP8L")) {
                    l lVarH = jVar.h(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    return lVarH;
                }
            } else if (strC.equals("VP8 ")) {
                l lVarG = jVar.g(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return lVarG;
            }
            inputStream.close();
            return null;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        }
    }

    private final l g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int iE = e(inputStream);
        int iE2 = e(inputStream);
        int iE3 = e(inputStream);
        if (iE == 157 && iE2 == 1 && iE3 == 42) {
            return new l(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private final l h(InputStream inputStream) throws IOException {
        d(inputStream);
        if (e(inputStream) != 47) {
            return null;
        }
        int i7 = inputStream.read() & 255;
        int i8 = inputStream.read();
        return new l(Integer.valueOf((i7 | ((i8 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i8 & 192) >> 6)) + 1));
    }

    private final l i(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new l(Integer.valueOf(j(inputStream) + 1), Integer.valueOf(j(inputStream) + 1));
    }

    private final int j(InputStream inputStream) {
        return (e(inputStream) << 16) | (e(inputStream) << 8) | e(inputStream);
    }
}
