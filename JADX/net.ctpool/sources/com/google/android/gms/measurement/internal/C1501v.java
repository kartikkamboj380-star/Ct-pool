package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.A3;
import com.tenjin.android.config.TenjinConsts;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1501v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1501v f16306f = new C1501v(null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f16309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f16311e;

    C1501v(Boolean bool, int i7) {
        this((Boolean) null, i7, (Boolean) null, (String) null);
    }

    public static C1501v b(Bundle bundle, int i7) {
        if (bundle == null) {
            return new C1501v(null, i7);
        }
        EnumMap enumMap = new EnumMap(A3.a.class);
        for (A3.a aVar : B3.DMA.e()) {
            enumMap.put(aVar, A3.k(bundle.getString(aVar.f15359m)));
        }
        return new C1501v(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C1501v c(String str) {
        if (str == null || str.length() <= 0) {
            return f16306f;
        }
        String[] strArrSplit = str.split(":");
        int i7 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(A3.a.class);
        A3.a[] aVarArrE = B3.DMA.e();
        int length = aVarArrE.length;
        int i8 = 1;
        int i9 = 0;
        while (i9 < length) {
            enumMap.put(aVarArrE[i9], A3.i(strArrSplit[i8].charAt(0)));
            i9++;
            i8++;
        }
        return new C1501v(enumMap, i7, (Boolean) null, (String) null);
    }

    static C1501v d(w3.r rVar, int i7) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        enumMap.put(A3.a.AD_USER_DATA, rVar);
        return new C1501v(enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        w3.r rVarK;
        if (bundle == null || (rVarK = A3.k(bundle.getString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION))) == null) {
            return null;
        }
        int i7 = AbstractC1529z.f16364a[rVarK.ordinal()];
        if (i7 == 3) {
            return Boolean.FALSE;
        }
        if (i7 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16307a);
        for (A3.a aVar : B3.DMA.e()) {
            sb.append(":");
            sb.append(A3.a((w3.r) this.f16311e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f16307a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1501v)) {
            return false;
        }
        C1501v c1501v = (C1501v) obj;
        if (this.f16308b.equalsIgnoreCase(c1501v.f16308b) && Objects.equals(this.f16309c, c1501v.f16309c)) {
            return Objects.equals(this.f16310d, c1501v.f16310d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f16311e.entrySet()) {
            String strR = A3.r((w3.r) entry.getValue());
            if (strR != null) {
                bundle.putString(((A3.a) entry.getKey()).f15359m, strR);
            }
        }
        Boolean bool = this.f16309c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f16310d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final w3.r g() {
        w3.r rVar = (w3.r) this.f16311e.get(A3.a.AD_USER_DATA);
        return rVar == null ? w3.r.UNINITIALIZED : rVar;
    }

    public final Boolean h() {
        return this.f16309c;
    }

    public final int hashCode() {
        Boolean bool = this.f16309c;
        int i7 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f16310d;
        return this.f16308b.hashCode() + (i7 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f16310d;
    }

    public final String j() {
        return this.f16308b;
    }

    public final boolean k() {
        Iterator it = this.f16311e.values().iterator();
        while (it.hasNext()) {
            if (((w3.r) it.next()) != w3.r.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i7;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(A3.g(this.f16307a));
        for (A3.a aVar : B3.DMA.e()) {
            sb.append(",");
            sb.append(aVar.f15359m);
            sb.append("=");
            w3.r rVar = (w3.r) this.f16311e.get(aVar);
            if (rVar == null || (i7 = AbstractC1529z.f16364a[rVar.ordinal()]) == 1) {
                sb.append("uninitialized");
            } else {
                if (i7 == 2) {
                    str = "eu_consent_policy";
                } else if (i7 == 3) {
                    str = "denied";
                } else if (i7 == 4) {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        if (this.f16309c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f16309c);
        }
        if (this.f16310d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f16310d);
        }
        return sb.toString();
    }

    C1501v(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        this.f16311e = enumMap;
        enumMap.put(A3.a.AD_USER_DATA, A3.j(bool));
        this.f16307a = i7;
        this.f16308b = l();
        this.f16309c = bool2;
        this.f16310d = str;
    }

    private C1501v(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f16311e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16307a = i7;
        this.f16308b = l();
        this.f16309c = bool;
        this.f16310d = str;
    }
}
