package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.A3;
import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1404h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f16060a;

    C1404h() {
        this.f16060a = new EnumMap(A3.a.class);
    }

    public static C1404h a(String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        if (str.length() >= A3.a.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                A3.a[] aVarArrValues = A3.a.values();
                int length = aVarArrValues.length;
                int i8 = 1;
                while (i7 < length) {
                    enumMap.put(aVarArrValues[i7], EnumC1418j.h(str.charAt(i8)));
                    i7++;
                    i8++;
                }
                return new C1404h(enumMap);
            }
        }
        return new C1404h();
    }

    public final EnumC1418j b(A3.a aVar) {
        EnumC1418j enumC1418j = (EnumC1418j) this.f16060a.get(aVar);
        return enumC1418j == null ? EnumC1418j.UNSET : enumC1418j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(A3.a aVar, int i7) {
        EnumC1418j enumC1418j = EnumC1418j.UNSET;
        if (i7 == -30) {
            enumC1418j = EnumC1418j.TCF;
        } else if (i7 == -20) {
            enumC1418j = EnumC1418j.API;
        } else if (i7 == -10) {
            enumC1418j = EnumC1418j.MANIFEST;
        } else if (i7 != 0) {
            if (i7 == 30) {
                enumC1418j = EnumC1418j.INITIALIZATION;
            }
        }
        this.f16060a.put(aVar, enumC1418j);
    }

    public final void d(A3.a aVar, EnumC1418j enumC1418j) {
        this.f16060a.put(aVar, enumC1418j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (A3.a aVar : A3.a.values()) {
            EnumC1418j enumC1418j = (EnumC1418j) this.f16060a.get(aVar);
            if (enumC1418j == null) {
                enumC1418j = EnumC1418j.UNSET;
            }
            sb.append(enumC1418j.f16096m);
        }
        return sb.toString();
    }

    private C1404h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f16060a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
