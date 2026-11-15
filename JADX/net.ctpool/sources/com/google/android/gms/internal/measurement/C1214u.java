package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1214u implements InterfaceC1196s, Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f14920m;

    public C1214u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f14920m = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        double d7;
        if (this.f14920m.isEmpty()) {
            d7 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f14920m);
            } catch (NumberFormatException unused) {
                d7 = Double.NaN;
            }
        }
        return Double.valueOf(d7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return this.f14920m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return new C1239x(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1214u) {
            return this.f14920m.equals(((C1214u) obj).f14920m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14920m.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[PHI: r6 r7 r14 r15
      0x00cb: PHI (r6v31 java.lang.String) = 
      (r6v4 java.lang.String)
      (r6v5 java.lang.String)
      (r6v6 java.lang.String)
      (r6v7 java.lang.String)
      (r6v32 java.lang.String)
     binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r7v13 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v4 java.lang.String)
      (r7v14 java.lang.String)
     binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r14v10 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v2 java.lang.String)
      (r14v3 java.lang.String)
      (r14v4 java.lang.String)
      (r14v11 java.lang.String)
     binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v3 java.lang.String)
      (r15v4 java.lang.String)
      (r15v8 java.lang.String)
     binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        byte b7;
        int i7;
        int i8;
        int i9;
        C1093g3 c1093g32;
        String strC;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1789698943:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    b7 = str.equals(str7) ? (byte) 0 : (byte) -1;
                    break;
                case -1776922004:
                    str5 = "charAt";
                    str6 = "toString";
                    str8 = "toLocaleLowerCase";
                    str7 = str3;
                    if (str.equals(str6)) {
                        b7 = 1;
                        break;
                    }
                    break;
                case -1464939364:
                    str5 = "charAt";
                    str8 = "toLocaleLowerCase";
                    str6 = "toString";
                    str7 = str3;
                    if (str.equals(str8)) {
                        b7 = 2;
                        break;
                    }
                    break;
                case -1361633751:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    if (str.equals(str5)) {
                        b7 = 3;
                        break;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b7 = 4;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b7 = 5;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b7 = 6;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b7 = 7;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b7 = 8;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b7 = 9;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 3568674:
                    if (str.equals(str4)) {
                        b7 = 10;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b7 = 11;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b7 = 12;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b7 = 13;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b7 = 14;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b7 = 15;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b7 = 16;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
                default:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    break;
            }
            switch (b7) {
                case 0:
                    D2.g(str7, 1, list);
                    String str9 = this.f14920m;
                    InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
                    if ("length".equals(interfaceC1196sB.c())) {
                        return InterfaceC1196s.f14820i;
                    }
                    double dDoubleValue = interfaceC1196sB.b().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i7 = (int) dDoubleValue) < 0 || i7 >= str9.length()) ? InterfaceC1196s.f14821j : InterfaceC1196s.f14820i;
                case 1:
                    D2.g(str6, 0, list);
                    return this;
                case 2:
                    D2.g(str8, 0, list);
                    return new C1214u(this.f14920m.toLowerCase());
                case 3:
                    D2.n(str5, 1, list);
                    int iA = !list.isEmpty() ? (int) D2.a(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) : 0;
                    String str10 = this.f14920m;
                    return (iA < 0 || iA >= str10.length()) ? InterfaceC1196s.f14822k : new C1214u(String.valueOf(str10.charAt(iA)));
                case 4:
                    if (list.isEmpty()) {
                        return this;
                    }
                    StringBuilder sb = new StringBuilder(this.f14920m);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        sb.append(c1093g3.b((InterfaceC1196s) list.get(i10)).c());
                    }
                    return new C1214u(sb.toString());
                case 5:
                    D2.g("toLowerCase", 0, list);
                    return new C1214u(this.f14920m.toLowerCase(Locale.ENGLISH));
                case 6:
                    D2.n("search", 1, list);
                    return Pattern.compile((!list.isEmpty() ? c1093g3.b((InterfaceC1196s) list.get(0)) : InterfaceC1196s.f14815d).c()).matcher(this.f14920m).find() ? new C1125k(Double.valueOf(r0.start())) : new C1125k(Double.valueOf(-1.0d));
                case 7:
                    D2.g(str2, 0, list);
                    return new C1214u(this.f14920m.toUpperCase());
                case 8:
                    D2.n("lastIndexOf", 2, list);
                    String str11 = this.f14920m;
                    String strC2 = (list.size() <= 0 ? InterfaceC1196s.f14815d : c1093g3.b((InterfaceC1196s) list.get(0))).c();
                    return new C1125k(Double.valueOf(str11.lastIndexOf(strC2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) ? Double.POSITIVE_INFINITY : D2.a(r4)))));
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    D2.g("toUpperCase", 0, list);
                    return new C1214u(this.f14920m.toUpperCase(Locale.ENGLISH));
                case 10:
                    D2.g("toUpperCase", 0, list);
                    return new C1214u(this.f14920m.trim());
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    D2.n("match", 1, list);
                    Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : c1093g3.b((InterfaceC1196s) list.get(0)).c()).matcher(this.f14920m);
                    return matcher.find() ? new C1089g(new C1214u(matcher.group())) : InterfaceC1196s.f14816e;
                case 12:
                    D2.n("slice", 2, list);
                    String str12 = this.f14920m;
                    double dA = D2.a(!list.isEmpty() ? c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() : 0.0d);
                    int iMax = (int) (dA < 0.0d ? Math.max(((double) str12.length()) + dA, 0.0d) : Math.min(dA, str12.length()));
                    double dA2 = D2.a(list.size() > 1 ? c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue() : str12.length());
                    return new C1214u(str12.substring(iMax, Math.max(0, ((int) (dA2 < 0.0d ? Math.max(((double) str12.length()) + dA2, 0.0d) : Math.min(dA2, str12.length()))) - iMax) + iMax));
                case 13:
                    D2.n("split", 2, list);
                    String str13 = this.f14920m;
                    if (str13.length() == 0) {
                        return new C1089g(this);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strC3 = c1093g3.b((InterfaceC1196s) list.get(0)).c();
                        long jM = list.size() > 1 ? D2.m(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) : 2147483647L;
                        if (jM == 0) {
                            return new C1089g();
                        }
                        String[] strArrSplit = str13.split(Pattern.quote(strC3), ((int) jM) + 1);
                        int length = strArrSplit.length;
                        if (!strC3.isEmpty() || strArrSplit.length <= 0) {
                            i8 = 0;
                        } else {
                            boolean zIsEmpty = strArrSplit[0].isEmpty();
                            i8 = zIsEmpty;
                            if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                                length = strArrSplit.length - 1;
                                i8 = zIsEmpty;
                            }
                        }
                        if (strArrSplit.length > jM) {
                            length--;
                        }
                        while (i8 < length) {
                            arrayList.add(new C1214u(strArrSplit[i8]));
                            i8++;
                        }
                    }
                    return new C1089g(arrayList);
                case 14:
                    D2.n("substring", 2, list);
                    String str14 = this.f14920m;
                    int iA2 = !list.isEmpty() ? (int) D2.a(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) : 0;
                    int iA3 = list.size() > 1 ? (int) D2.a(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) : str14.length();
                    int iMin = Math.min(Math.max(iA2, 0), str14.length());
                    int iMin2 = Math.min(Math.max(iA3, 0), str14.length());
                    return new C1214u(str14.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 15:
                    D2.n("replace", 2, list);
                    InterfaceC1196s interfaceC1196sA = InterfaceC1196s.f14815d;
                    String strC4 = interfaceC1196sA.c();
                    if (!list.isEmpty()) {
                        strC4 = c1093g3.b((InterfaceC1196s) list.get(0)).c();
                        if (list.size() > 1) {
                            interfaceC1196sA = c1093g3.b((InterfaceC1196s) list.get(1));
                        }
                    }
                    String str15 = this.f14920m;
                    int iIndexOf = str15.indexOf(strC4);
                    if (iIndexOf < 0) {
                        return this;
                    }
                    if (interfaceC1196sA instanceof AbstractC1152n) {
                        i9 = 0;
                        interfaceC1196sA = ((AbstractC1152n) interfaceC1196sA).a(c1093g3, Arrays.asList(new C1214u(strC4), new C1125k(Double.valueOf(iIndexOf)), this));
                    } else {
                        i9 = 0;
                    }
                    return new C1214u(str15.substring(i9, iIndexOf) + interfaceC1196sA.c() + str15.substring(iIndexOf + strC4.length()));
                case 16:
                    D2.n("indexOf", 2, list);
                    String str16 = this.f14920m;
                    if (list.size() <= 0) {
                        strC = InterfaceC1196s.f14815d.c();
                        c1093g32 = c1093g3;
                    } else {
                        c1093g32 = c1093g3;
                        strC = c1093g32.b((InterfaceC1196s) list.get(0)).c();
                    }
                    return new C1125k(Double.valueOf(str16.indexOf(strC, (int) D2.a(list.size() < 2 ? 0.0d : c1093g32.b((InterfaceC1196s) list.get(1)).b().doubleValue()))));
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "hasOwnProperty";
        str4 = "trim";
        str.hashCode();
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        switch (b7) {
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1231w(this);
    }

    public final String toString() {
        return "\"" + this.f14920m + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return new C1214u(this.f14920m);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f14920m.isEmpty());
    }
}
