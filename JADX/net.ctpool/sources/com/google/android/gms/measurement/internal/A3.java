package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.tenjin.android.config.TenjinConsts;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A3 f15351c = new A3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f15352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15353b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA),
        AD_PERSONALIZATION(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f15359m;

        a(String str) {
            this.f15359m = str;
        }
    }

    public A3(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f15352a = enumMap;
        enumMap.put(a.AD_STORAGE, j(null));
        enumMap.put(a.ANALYTICS_STORAGE, j(null));
        this.f15353b = i7;
    }

    static char a(w3.r rVar) {
        if (rVar == null) {
            return '-';
        }
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static A3 c(Bundle bundle, int i7) {
        if (bundle == null) {
            return new A3(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : B3.STORAGE.f15382m) {
            enumMap.put(aVar, k(bundle.getString(aVar.f15359m)));
        }
        return new A3(enumMap, i7);
    }

    public static A3 e(String str, int i7) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] aVarArrE = B3.STORAGE.e();
        for (int i8 = 0; i8 < aVarArrE.length; i8++) {
            int i9 = i8 + 2;
            enumMap.put(aVarArrE[i8], i9 < str.length() ? i(str.charAt(i9)) : w3.r.UNINITIALIZED);
        }
        return new A3(enumMap, i7);
    }

    public static A3 f(w3.r rVar, w3.r rVar2, int i7) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put(a.AD_STORAGE, rVar);
        enumMap.put(a.ANALYTICS_STORAGE, rVar2);
        return new A3(enumMap, -10);
    }

    static String g(int i7) {
        return i7 != -30 ? i7 != -20 ? i7 != -10 ? i7 != 0 ? i7 != 30 ? i7 != 90 ? i7 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String h(Bundle bundle) {
        String string;
        a[] aVarArr = B3.STORAGE.f15382m;
        int length = aVarArr.length;
        int i7 = 0;
        while (true) {
            Boolean bool = null;
            if (i7 >= length) {
                return null;
            }
            a aVar = aVarArr[i7];
            if (bundle.containsKey(aVar.f15359m) && (string = bundle.getString(aVar.f15359m)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i7++;
        }
    }

    static w3.r i(char c7) {
        return c7 != '+' ? c7 != '0' ? c7 != '1' ? w3.r.UNINITIALIZED : w3.r.GRANTED : w3.r.DENIED : w3.r.POLICY;
    }

    static w3.r j(Boolean bool) {
        return bool == null ? w3.r.UNINITIALIZED : bool.booleanValue() ? w3.r.GRANTED : w3.r.DENIED;
    }

    static w3.r k(String str) {
        return str == null ? w3.r.UNINITIALIZED : str.equals("granted") ? w3.r.GRANTED : str.equals("denied") ? w3.r.DENIED : w3.r.UNINITIALIZED;
    }

    public static boolean l(int i7, int i8) {
        if (i7 == -20 && i8 == -30) {
            return true;
        }
        return (i7 == -30 && i8 == -20) || i7 == i8 || i7 < i8;
    }

    public static A3 q(String str) {
        return e(str, 100);
    }

    static String r(w3.r rVar) {
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        Iterator it = this.f15352a.values().iterator();
        while (it.hasNext()) {
            if (((w3.r) it.next()) != w3.r.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f15353b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A3 d(A3 a32) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : B3.STORAGE.f15382m) {
            w3.r rVar = (w3.r) this.f15352a.get(aVar);
            w3.r rVar2 = (w3.r) a32.f15352a.get(aVar);
            if (rVar != null) {
                if (rVar2 != null) {
                    w3.r rVar3 = w3.r.UNINITIALIZED;
                    if (rVar != rVar3) {
                        if (rVar2 != rVar3) {
                            w3.r rVar4 = w3.r.POLICY;
                            if (rVar == rVar4) {
                                rVar = rVar2;
                            } else if (rVar2 != rVar4) {
                                w3.r rVar5 = w3.r.DENIED;
                                rVar = (rVar == rVar5 || rVar2 == rVar5) ? rVar5 : w3.r.GRANTED;
                            }
                        }
                    }
                }
            }
            if (rVar != null) {
                enumMap.put(aVar, rVar);
            }
        }
        return new A3(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a32 = (A3) obj;
        for (a aVar : B3.STORAGE.f15382m) {
            if (this.f15352a.get(aVar) != a32.f15352a.get(aVar)) {
                return false;
            }
        }
        return this.f15353b == a32.f15353b;
    }

    public final int hashCode() {
        int iHashCode = this.f15353b * 17;
        Iterator it = this.f15352a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((w3.r) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean m(a aVar) {
        return ((w3.r) this.f15352a.get(aVar)) != w3.r.DENIED;
    }

    public final boolean n(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!a32.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f15352a.entrySet()) {
            String strR = r((w3.r) entry.getValue());
            if (strR != null) {
                bundle.putString(((a) entry.getKey()).f15359m, strR);
            }
        }
        return bundle;
    }

    public final A3 p(A3 a32) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : B3.STORAGE.f15382m) {
            w3.r rVar = (w3.r) this.f15352a.get(aVar);
            if (rVar == w3.r.UNINITIALIZED) {
                rVar = (w3.r) a32.f15352a.get(aVar);
            }
            if (rVar != null) {
                enumMap.put(aVar, rVar);
            }
        }
        return new A3(enumMap, this.f15353b);
    }

    public final boolean s(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            w3.r rVar = (w3.r) this.f15352a.get(aVar);
            w3.r rVar2 = (w3.r) a32.f15352a.get(aVar);
            w3.r rVar3 = w3.r.DENIED;
            if (rVar == rVar3 && rVar2 != rVar3) {
                return true;
            }
        }
        return false;
    }

    public final w3.r t() {
        w3.r rVar = (w3.r) this.f15352a.get(a.AD_STORAGE);
        return rVar == null ? w3.r.UNINITIALIZED : rVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.f15353b));
        for (a aVar : B3.STORAGE.f15382m) {
            sb.append(",");
            sb.append(aVar.f15359m);
            sb.append("=");
            w3.r rVar = (w3.r) this.f15352a.get(aVar);
            if (rVar == null) {
                rVar = w3.r.UNINITIALIZED;
            }
            sb.append(rVar);
        }
        return sb.toString();
    }

    public final boolean u(A3 a32) {
        return s(a32, (a[]) this.f15352a.keySet().toArray(new a[0]));
    }

    public final w3.r v() {
        w3.r rVar = (w3.r) this.f15352a.get(a.ANALYTICS_STORAGE);
        return rVar == null ? w3.r.UNINITIALIZED : rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : B3.STORAGE.e()) {
            w3.r rVar = (w3.r) this.f15352a.get(aVar);
            char c7 = '-';
            if (rVar != null && (iOrdinal = rVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c7 = '1';
                } else if (iOrdinal == 2) {
                    c7 = '0';
                } else if (iOrdinal != 3) {
                }
            }
            sb.append(c7);
        }
        return sb.toString();
    }

    public final String x() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : B3.STORAGE.e()) {
            sb.append(a((w3.r) this.f15352a.get(aVar)));
        }
        return sb.toString();
    }

    public final boolean y() {
        return m(a.AD_STORAGE);
    }

    public final boolean z() {
        return m(a.ANALYTICS_STORAGE);
    }

    private A3(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f15352a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f15353b = i7;
    }
}
