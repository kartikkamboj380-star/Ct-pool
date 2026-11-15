package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final i zag = new a();
    private static final i zah = new b();
    private static final i zai = new c();
    private static final i zaj = new d();
    private static final i zak = new e();
    private static final i zal = new f();
    private static final i zam = new g();
    private static final i zan = new h();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z6 = false;
        boolean z7 = false;
        loop0: while (true) {
            int i7 = bufferedReader.read(cArr);
            if (i7 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            int i8 = 0;
            while (i8 < i7) {
                char c7 = cArr[i8];
                if (Character.isISOControl(c7) && (cArr2 == null || cArr2[0] != c7)) {
                    break loop0;
                }
                int i9 = i8 + 1;
                if (c7 != '\"') {
                    if (c7 == '\\') {
                        z6 = !z6;
                        z7 = true;
                    }
                    i8 = i9;
                } else if (!z6) {
                    sb.append(cArr, 0, i8);
                    bufferedReader.reset();
                    bufferedReader.skip(i9);
                    String string = sb.toString();
                    return z7 ? JsonUtils.unescapeString(string) : string;
                }
                z6 = false;
                i8 = i9;
            }
            sb.append(cArr, 0, i7);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char zai(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i7;
        int i8;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c7 = cArr[0];
        int i9 = c7 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i10 = c7 == '-' ? 1 : 0;
        if (i10 < iZam) {
            i8 = i10 + 1;
            int iDigit = Character.digit(cArr[i10], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i7 = -iDigit;
        } else {
            i7 = 0;
            i8 = i10;
        }
        while (i8 < iZam) {
            int i11 = i8 + 1;
            int iDigit2 = Character.digit(cArr[i8], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i7 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i12 = i7 * 10;
            if (i12 < i9 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i7 = i12 - iDigit2;
            i8 = i11;
        }
        if (i10 == 0) {
            return -i7;
        }
        if (i8 > 1) {
            return i7;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i7;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i7 = 0;
            boolean z6 = false;
            while (i7 < 1024 && bufferedReader.read(cArr, i7, 1) != -1) {
                char c7 = cArr[i7];
                if (Character.isISOControl(c7)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i8 = i7 + 1;
                if (c7 != '\"') {
                    if (c7 == '\\') {
                        z6 = !z6;
                    }
                    i7 = i8;
                } else if (!z6) {
                    bufferedReader.reset();
                    bufferedReader.skip(i8);
                    return i7;
                }
                z6 = false;
                i7 = i8;
            }
        } else {
            cArr[0] = cZai;
            i7 = 1;
            while (i7 < 1024 && bufferedReader.read(cArr, i7, 1) != -1) {
                char c8 = cArr[i7];
                if (c8 == '}' || c8 == ',' || Character.isWhitespace(c8) || cArr[i7] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i7 - 1);
                    cArr[i7] = 0;
                    return i7;
                }
                i7++;
            }
        }
        if (i7 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j7;
        int i7;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c7 = cArr[0];
        long j8 = c7 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i8 = c7 == '-' ? 1 : 0;
        if (i8 < iZam) {
            i7 = i8 + 1;
            int iDigit = Character.digit(cArr[i8], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j7 = -iDigit;
        } else {
            j7 = 0;
            i7 = i8;
        }
        while (i7 < iZam) {
            int i9 = i7 + 1;
            int iDigit2 = Character.digit(cArr[i7], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j7 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j9 = j7 * 10;
            int i10 = iZam;
            long j10 = iDigit2;
            if (j9 < j8 + j10) {
                throw new ParseException("Number too large");
            }
            j7 = j9 - j10;
            iZam = i10;
            i7 = i9;
        }
        if (i8 == 0) {
            return -j7;
        }
        if (i7 > 1) {
            return j7;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i7 = 1;
        if (cZai == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c7 = this.zao[0];
            boolean z6 = false;
            do {
                if (c7 == '\"') {
                    if (z6) {
                        c7 = '\"';
                        z6 = true;
                    }
                }
                z6 = c7 == '\\' ? !z6 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c7 = this.zao[0];
            } while (!Character.isISOControl(c7));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) != ']') {
                bufferedReader.reset();
                boolean z7 = false;
                boolean z8 = false;
                while (i7 > 0) {
                    char cZai2 = zai(bufferedReader);
                    if (cZai2 == 0) {
                        throw new ParseException("Unexpected EOF while parsing array");
                    }
                    if (Character.isISOControl(cZai2)) {
                        throw new ParseException("Unexpected control character while reading array");
                    }
                    if (cZai2 == '\"') {
                        if (!z8) {
                            z7 = !z7;
                        }
                        cZai2 = '\"';
                    }
                    if (cZai2 == '[') {
                        if (!z7) {
                            i7++;
                        }
                        cZai2 = '[';
                    }
                    if (cZai2 == ']' && !z7) {
                        i7--;
                    }
                    z8 = (cZai2 == '\\' && z7) ? !z8 : false;
                }
            }
            zaw(5);
        } else if (cZai != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char cZai3 = zai(bufferedReader);
            if (cZai3 != '}') {
                if (cZai3 != '\"') {
                    throw new ParseException("Unexpected token " + cZai3);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
            }
            zaw(1);
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, i iVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(iVar.a(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException("Unexpected token: " + cZai);
        }
        Stack stack = this.zat;
        while (true) {
            stack.push(1);
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                stack = this.zat;
            } catch (IllegalAccessException e7) {
                throw new ParseException("Error instantiating inner object", e7);
            } catch (InstantiationException e8) {
                throw new ParseException("Error instantiating inner object", e8);
            }
        }
    }

    private final void zaw(int i7) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException("Expected state " + i7 + " but had empty stack");
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue == i7) {
            return;
        }
        throw new ParseException("Expected state " + i7 + " but had " + iIntValue);
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i7 = 0;
        while (true) {
            int length = cArr.length;
            if (i7 >= length) {
                return;
            }
            int i8 = bufferedReader.read(this.zap, 0, length - i7);
            if (i8 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i9 = 0; i9 < i8; i9++) {
                if (cArr[i9 + i7] != this.zap[i9]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i7 += i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z6) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z6) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z6 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z6 ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025d A[SYNTHETIC] */
    @ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i7;
        HashMap map;
        char cZai;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i8 = field.zaa;
                switch (i8) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case 10:
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZai3 = zai(bufferedReader);
                                if (cZai3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZai3 == '\"') {
                                    String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai4 = zai(bufferedReader);
                                    if (cZai4 != ',') {
                                        if (cZai4 != '}') {
                                            throw new ParseException("Unexpected character while parsing string map: " + cZai4);
                                        }
                                    }
                                } else if (cZai3 != '}') {
                                }
                            }
                            zaw(1);
                        }
                        fastJsonResponse.zaB(field, map);
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        if (!field.zab) {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (IllegalAccessException e7) {
                                    throw new ParseException("Error instantiating inner object", e7);
                                } catch (InstantiationException e8) {
                                    throw new ParseException("Error instantiating inner object", e8);
                                }
                            }
                            break;
                        } else {
                            char cZai6 = zai(bufferedReader);
                            if (cZai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (cZai6 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        }
                        i7 = 4;
                        zaw(i7);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai != ',') {
                        }
                        break;
                    default:
                        throw new ParseException("Invalid field type " + i8);
                }
            }
        }
        zaw(1);
        return true;
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t6) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t6.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t6.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t6);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e7) {
                throw new ParseException(e7);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
