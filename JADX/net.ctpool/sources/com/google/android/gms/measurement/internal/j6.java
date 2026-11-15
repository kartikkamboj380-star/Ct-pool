package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1182q2;
import com.google.android.gms.internal.measurement.C1190r2;
import com.google.android.gms.internal.measurement.C1258z2;
import com.google.android.gms.internal.measurement.H6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1258z2 f16112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitSet f16113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitSet f16114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f16115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f16116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f16117h;

    private j6(h6 h6Var, String str) {
        this.f16117h = h6Var;
        this.f16110a = str;
        this.f16111b = true;
        this.f16113d = new BitSet();
        this.f16114e = new BitSet();
        this.f16115f = new C1890a();
        this.f16116g = new C1890a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.q2$a, com.google.android.gms.internal.measurement.z4$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.z2$a] */
    final C1182q2 a(int i7) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? H6 = C1182q2.H();
        H6.t(i7);
        H6.x(this.f16111b);
        C1258z2 c1258z2 = this.f16112c;
        if (c1258z2 != null) {
            H6.v(c1258z2);
        }
        ?? B6 = C1258z2.P().x(Z5.M(this.f16113d)).B(Z5.M(this.f16114e));
        if (this.f16115f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f16115f.size());
            for (Integer num : this.f16115f.keySet()) {
                int iIntValue = num.intValue();
                Long l7 = (Long) this.f16115f.get(num);
                if (l7 != null) {
                    arrayList.add((C1190r2) ((AbstractC1260z4) C1190r2.H().t(iIntValue).u(l7.longValue()).p()));
                }
            }
        }
        if (arrayList != null) {
            B6.u(arrayList);
        }
        if (this.f16116g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f16116g.size());
            for (Integer num2 : this.f16116g.keySet()) {
                A2.a aVarT = com.google.android.gms.internal.measurement.A2.I().t(num2.intValue());
                List list = (List) this.f16116g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    aVarT.u(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.A2) ((AbstractC1260z4) aVarT.p()));
            }
        }
        B6.z(arrayList2);
        H6.u(B6);
        return (C1182q2) ((AbstractC1260z4) H6.p());
    }

    final void c(AbstractC1362b abstractC1362b) {
        int iA = abstractC1362b.a();
        Boolean bool = abstractC1362b.f15913c;
        if (bool != null) {
            this.f16114e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = abstractC1362b.f15914d;
        if (bool2 != null) {
            this.f16113d.set(iA, bool2.booleanValue());
        }
        if (abstractC1362b.f15915e != null) {
            Long l7 = (Long) this.f16115f.get(Integer.valueOf(iA));
            long jLongValue = abstractC1362b.f15915e.longValue() / 1000;
            if (l7 == null || jLongValue > l7.longValue()) {
                this.f16115f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (abstractC1362b.f15916f != null) {
            List arrayList = (List) this.f16116g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f16116g.put(Integer.valueOf(iA), arrayList);
            }
            if (abstractC1362b.j()) {
                arrayList.clear();
            }
            if (H6.a() && this.f16117h.b().F(this.f16110a, G.f15554q0) && abstractC1362b.i()) {
                arrayList.clear();
            }
            if (!H6.a() || !this.f16117h.b().F(this.f16110a, G.f15554q0)) {
                arrayList.add(Long.valueOf(abstractC1362b.f15916f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC1362b.f15916f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    private j6(h6 h6Var, String str, C1258z2 c1258z2, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f16117h = h6Var;
        this.f16110a = str;
        this.f16113d = bitSet;
        this.f16114e = bitSet2;
        this.f16115f = map;
        this.f16116g = new C1890a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f16116g.put(num, arrayList);
            }
        }
        this.f16111b = false;
        this.f16112c = c1258z2;
    }
}
