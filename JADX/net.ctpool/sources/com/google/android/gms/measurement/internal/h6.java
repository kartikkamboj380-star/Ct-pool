package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1168o6;
import com.google.android.gms.internal.measurement.C1182q2;
import com.google.android.gms.internal.measurement.C1190r2;
import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1258z2;
import com.google.android.gms.internal.measurement.H6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
final class h6 extends E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f16071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f16072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f16073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f16074h;

    h6(H5 h52) {
        super(h52);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A(List list, boolean z6) {
        A a7;
        m6 m6Var;
        Integer num;
        Map map;
        long j7;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        m6 m6Var2 = new m6(this);
        C1890a c1890a = new C1890a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1199s2 c1199s2 = (C1199s2) it.next();
            C1199s2 c1199s2A = m6Var2.a(this.f16070d, c1199s2);
            if (c1199s2A != null) {
                C1425k c1425kO = o();
                String str2 = this.f16070d;
                String strS = c1199s2A.S();
                A aJ0 = c1425kO.J0(str2, c1199s2.S());
                if (aJ0 == null) {
                    c1425kO.d().J().c("Event aggregate wasn't created during raw event logging. appId, event", C1449n2.t(str2), c1425kO.e().c(strS));
                    a7 = new A(str2, c1199s2.S(), 1L, 1L, 1L, c1199s2.P(), 0L, null, null, null, null);
                } else {
                    a7 = new A(aJ0.f15335a, aJ0.f15336b, aJ0.f15337c + 1, aJ0.f15338d + 1, aJ0.f15339e + 1, aJ0.f15340f, aJ0.f15341g, aJ0.f15342h, aJ0.f15343i, aJ0.f15344j, aJ0.f15345k);
                }
                A a8 = a7;
                o().S(a8);
                if (!C1168o6.a() || !b().F(str, G.f15507Z0) || !z6) {
                    long j8 = a8.f15337c;
                    String strS2 = c1199s2A.S();
                    Map mapN0 = (Map) c1890a.get(strS2);
                    if (mapN0 == null) {
                        mapN0 = o().N0(this.f16070d, strS2);
                        c1890a.put(strS2, mapN0);
                    }
                    Map map2 = mapN0;
                    for (Integer num2 : map2.keySet()) {
                        int iIntValue = num2.intValue();
                        if (this.f16071e.contains(num2)) {
                            d().I().b("Skipping failed audience ID", num2);
                        } else {
                            Iterator it2 = ((List) map2.get(num2)).iterator();
                            boolean zK = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    m6Var = m6Var2;
                                    num = num2;
                                    map = map2;
                                    j7 = j8;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.R1 r12 = (com.google.android.gms.internal.measurement.R1) it2.next();
                                l6 l6Var = new l6(this, this.f16070d, iIntValue, r12);
                                m6Var = m6Var2;
                                num = num2;
                                int i7 = iIntValue;
                                map = map2;
                                j7 = j8;
                                zK = l6Var.k(this.f16073g, this.f16074h, c1199s2A, j8, a8, B(iIntValue, r12.H()));
                                if (!zK) {
                                    this.f16071e.add(num);
                                    break;
                                }
                                w(num).c(l6Var);
                                num2 = num;
                                m6Var2 = m6Var;
                                iIntValue = i7;
                                map2 = map;
                                j8 = j7;
                            }
                            if (!zK) {
                                this.f16071e.add(num);
                            }
                            m6Var2 = m6Var;
                            map2 = map;
                            j8 = j7;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final boolean B(int i7, int i8) {
        j6 j6Var = (j6) this.f16072f.get(Integer.valueOf(i7));
        if (j6Var == null) {
            return false;
        }
        return j6Var.f16113d.get(i8);
    }

    private final List C() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.f16072f.keySet();
        setKeySet.removeAll(this.f16071e);
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            j6 j6Var = (j6) this.f16072f.get(num);
            Preconditions.checkNotNull(j6Var);
            C1182q2 c1182q2A = j6Var.a(iIntValue);
            arrayList.add(c1182q2A);
            C1425k c1425kO = o();
            String str = this.f16070d;
            C1258z2 c1258z2K = c1182q2A.K();
            c1425kO.s();
            c1425kO.l();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(c1258z2K);
            byte[] bArrI = c1258z2K.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrI);
            try {
                if (c1425kO.z().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    c1425kO.d().E().b("Failed to insert filter results (got -1). appId", C1449n2.t(str));
                }
            } catch (SQLiteException e7) {
                c1425kO.d().E().c("Error storing filter results. appId", C1449n2.t(str), e7);
            }
        }
        return arrayList;
    }

    private final j6 w(Integer num) {
        if (this.f16072f.containsKey(num)) {
            return (j6) this.f16072f.get(num);
        }
        j6 j6Var = new j6(this, this.f16070d);
        this.f16072f.put(num, j6Var);
        return j6Var;
    }

    private final void z(List list) {
        com.google.android.gms.internal.measurement.U1 u12;
        if (list.isEmpty()) {
            return;
        }
        C1890a c1890a = new C1890a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.B2 b22 = (com.google.android.gms.internal.measurement.B2) it.next();
            String strS = b22.S();
            Map mapP0 = (Map) c1890a.get(strS);
            if (mapP0 == null) {
                mapP0 = o().P0(this.f16070d, strS);
                c1890a.put(strS, mapP0);
            }
            Iterator it2 = mapP0.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer num = (Integer) it2.next();
                    int iIntValue = num.intValue();
                    if (this.f16071e.contains(num)) {
                        d().I().b("Skipping failed audience ID", num);
                        break;
                    }
                    Iterator it3 = ((List) mapP0.get(num)).iterator();
                    boolean zK = true;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        u12 = (com.google.android.gms.internal.measurement.U1) it3.next();
                        if (d().A(2)) {
                            d().I().d("Evaluating filter. audience, filter, property", num, u12.M() ? Integer.valueOf(u12.j()) : null, e().g(u12.I()));
                            d().I().b("Filter definition", m().J(u12));
                        }
                        if (u12.M() && u12.j() <= 256) {
                            n6 n6Var = new n6(this, this.f16070d, iIntValue, u12);
                            zK = n6Var.k(this.f16073g, this.f16074h, b22, B(iIntValue, u12.j()));
                            if (!zK) {
                                this.f16071e.add(num);
                                break;
                            }
                            w(num).c(n6Var);
                        } else {
                            break;
                        }
                    }
                    d().J().c("Invalid property filter ID. appId, id", C1449n2.t(this.f16070d), String.valueOf(u12.M() ? Integer.valueOf(u12.j()) : null));
                    zK = false;
                    if (!zK) {
                        this.f16071e.add(num);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final List x(String str, List list, List list2, Long l7, Long l8) {
        return y(str, list, list2, l7, l8, false);
    }

    final List y(String str, List list, List list2, Long l7, Long l8, boolean z6) {
        boolean z7;
        Map map;
        List<com.google.android.gms.internal.measurement.R1> list3;
        Iterator it;
        Iterator it2;
        Map map2;
        Map map3;
        Iterator it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.f16070d = str;
        this.f16071e = new HashSet();
        this.f16072f = new C1890a();
        this.f16073g = l7;
        this.f16074h = l8;
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z7 = false;
                break;
            }
            if ("_s".equals(((C1199s2) it4.next()).S())) {
                z7 = true;
                break;
            }
        }
        boolean z8 = H6.a() && b().F(this.f16070d, G.f15554q0);
        boolean z9 = H6.a() && b().F(this.f16070d, G.f15552p0);
        if (z7) {
            C1425k c1425kO = o();
            String str2 = this.f16070d;
            c1425kO.s();
            c1425kO.l();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                c1425kO.z().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e7) {
                c1425kO.d().E().c("Error resetting session-scoped event counts. appId", C1449n2.t(str2), e7);
            }
        }
        Map mapEmptyMap = Collections.emptyMap();
        if (z9 && z8) {
            mapEmptyMap = o().Y0(this.f16070d);
        }
        Map mapX0 = o().X0(this.f16070d);
        if (!mapX0.isEmpty()) {
            HashSet hashSet = new HashSet(mapX0.keySet());
            if (z7) {
                String str3 = this.f16070d;
                Map mapZ0 = o().Z0(this.f16070d);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(mapX0);
                C1890a c1890a = new C1890a();
                if (!mapX0.isEmpty()) {
                    Iterator it5 = mapX0.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        C1258z2 c1258z2 = (C1258z2) mapX0.get(num);
                        List list4 = (List) mapZ0.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map3 = mapZ0;
                            it3 = it5;
                            c1890a.put(num, c1258z2);
                        } else {
                            List listN = m().N(c1258z2.T(), list4);
                            if (!listN.isEmpty()) {
                                C1258z2.a aVarX = ((C1258z2.a) c1258z2.w()).v().x(listN);
                                aVarX.A().B(m().N(c1258z2.V(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C1190r2 c1190r2 : c1258z2.S()) {
                                    Map map4 = mapZ0;
                                    Iterator it6 = it5;
                                    if (!list4.contains(Integer.valueOf(c1190r2.j()))) {
                                        arrayList.add(c1190r2);
                                    }
                                    mapZ0 = map4;
                                    it5 = it6;
                                }
                                map3 = mapZ0;
                                it3 = it5;
                                aVarX.t().u(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.A2 a22 : c1258z2.U()) {
                                    if (!list4.contains(Integer.valueOf(a22.H()))) {
                                        arrayList2.add(a22);
                                    }
                                }
                                aVarX.y().z(arrayList2);
                                c1890a.put(num, (C1258z2) ((AbstractC1260z4) aVarX.p()));
                            }
                        }
                        mapZ0 = map3;
                        it5 = it3;
                    }
                }
                map = c1890a;
            } else {
                map = mapX0;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                C1258z2 c1258z22 = (C1258z2) map.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C1890a c1890a2 = new C1890a();
                if (c1258z22 != null && c1258z22.j() != 0) {
                    for (C1190r2 c1190r22 : c1258z22.S()) {
                        if (c1190r22.K()) {
                            c1890a2.put(Integer.valueOf(c1190r22.j()), c1190r22.J() ? Long.valueOf(c1190r22.G()) : null);
                        }
                    }
                }
                C1890a c1890a3 = new C1890a();
                if (c1258z22 != null && c1258z22.J() != 0) {
                    Iterator it8 = c1258z22.U().iterator();
                    while (it8.hasNext()) {
                        com.google.android.gms.internal.measurement.A2 a23 = (com.google.android.gms.internal.measurement.A2) it8.next();
                        if (!a23.L() || a23.j() <= 0) {
                            it2 = it8;
                            map2 = map;
                        } else {
                            it2 = it8;
                            map2 = map;
                            c1890a3.put(Integer.valueOf(a23.H()), Long.valueOf(a23.E(a23.j() - 1)));
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map map5 = map;
                if (c1258z22 != null) {
                    int i7 = 0;
                    while (i7 < (c1258z22.M() << 6)) {
                        if (Z5.c0(c1258z22.V(), i7)) {
                            it = it7;
                            d().I().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i7));
                            bitSet2.set(i7);
                            if (Z5.c0(c1258z22.T(), i7)) {
                                bitSet.set(i7);
                            }
                            i7++;
                            it7 = it;
                        } else {
                            it = it7;
                        }
                        c1890a2.remove(Integer.valueOf(i7));
                        i7++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                C1258z2 c1258z23 = (C1258z2) mapX0.get(num2);
                if (z9 && z8 && (list3 = (List) mapEmptyMap.get(num2)) != null && this.f16074h != null && this.f16073g != null) {
                    for (com.google.android.gms.internal.measurement.R1 r12 : list3) {
                        int iH = r12.H();
                        long jLongValue = this.f16074h.longValue() / 1000;
                        if (r12.O()) {
                            jLongValue = this.f16073g.longValue() / 1000;
                        }
                        if (c1890a2.containsKey(Integer.valueOf(iH))) {
                            c1890a2.put(Integer.valueOf(iH), Long.valueOf(jLongValue));
                        }
                        if (c1890a3.containsKey(Integer.valueOf(iH))) {
                            c1890a3.put(Integer.valueOf(iH), Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f16072f.put(num2, new j6(this, this.f16070d, c1258z23, bitSet, bitSet2, c1890a2, c1890a3));
                it7 = it9;
                mapX0 = mapX0;
                map = map5;
            }
        }
        if (!C1168o6.a() || !b().F(null, G.f15507Z0)) {
            A(list, true);
            z(list2);
            return C();
        }
        A(list, z6);
        if (z6) {
            return new ArrayList();
        }
        z(list2);
        return C();
    }
}
