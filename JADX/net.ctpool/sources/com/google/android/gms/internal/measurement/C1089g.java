package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089g implements InterfaceC1143m, InterfaceC1196s, Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SortedMap f14583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f14584n;

    public C1089g() {
        this.f14583m = new TreeMap();
        this.f14584n = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return this.f14583m.size() == 1 ? n(0).b() : this.f14583m.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return new C1080f(this, this.f14583m.keySet().iterator(), this.f14584n.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1089g)) {
            return false;
        }
        C1089g c1089g = (C1089g) obj;
        if (q() != c1089g.q()) {
            return false;
        }
        if (this.f14583m.isEmpty()) {
            return c1089g.f14583m.isEmpty();
        }
        for (int iIntValue = ((Integer) this.f14583m.firstKey()).intValue(); iIntValue <= ((Integer) this.f14583m.lastKey()).intValue(); iIntValue++) {
            if (!n(iIntValue).equals(c1089g.n(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final InterfaceC1196s f(String str) {
        InterfaceC1196s interfaceC1196s;
        return "length".equals(str) ? new C1125k(Double.valueOf(q())) : (!h(str) || (interfaceC1196s = (InterfaceC1196s) this.f14584n.get(str)) == null) ? InterfaceC1196s.f14815d : interfaceC1196s;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final boolean h(String str) {
        return "length".equals(str) || this.f14584n.containsKey(str);
    }

    public final int hashCode() {
        return this.f14583m.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, c1093g3, list) : AbstractC1170p.a(this, new C1214u(str), c1093g3, list);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1107i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final void k(String str, InterfaceC1196s interfaceC1196s) {
        if (interfaceC1196s == null) {
            this.f14584n.remove(str);
        } else {
            this.f14584n.put(str, interfaceC1196s);
        }
    }

    public final int m() {
        return this.f14583m.size();
    }

    public final InterfaceC1196s n(int i7) {
        InterfaceC1196s interfaceC1196s;
        if (i7 < q()) {
            return (!u(i7) || (interfaceC1196s = (InterfaceC1196s) this.f14583m.get(Integer.valueOf(i7))) == null) ? InterfaceC1196s.f14815d : interfaceC1196s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void o(int i7, InterfaceC1196s interfaceC1196s) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i7);
        }
        if (i7 >= q()) {
            t(i7, interfaceC1196s);
            return;
        }
        for (int iIntValue = ((Integer) this.f14583m.lastKey()).intValue(); iIntValue >= i7; iIntValue--) {
            InterfaceC1196s interfaceC1196s2 = (InterfaceC1196s) this.f14583m.get(Integer.valueOf(iIntValue));
            if (interfaceC1196s2 != null) {
                t(iIntValue + 1, interfaceC1196s2);
                this.f14583m.remove(Integer.valueOf(iIntValue));
            }
        }
        t(i7, interfaceC1196s);
    }

    public final void p(InterfaceC1196s interfaceC1196s) {
        t(q(), interfaceC1196s);
    }

    public final int q() {
        if (this.f14583m.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f14583m.lastKey()).intValue() + 1;
    }

    public final String r(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f14583m.isEmpty()) {
            for (int i7 = 0; i7 < q(); i7++) {
                InterfaceC1196s interfaceC1196sN = n(i7);
                sb.append(str);
                if (!(interfaceC1196sN instanceof C1255z) && !(interfaceC1196sN instanceof C1179q)) {
                    sb.append(interfaceC1196sN.c());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void s(int i7) {
        int iIntValue = ((Integer) this.f14583m.lastKey()).intValue();
        if (i7 > iIntValue || i7 < 0) {
            return;
        }
        this.f14583m.remove(Integer.valueOf(i7));
        if (i7 == iIntValue) {
            int i8 = i7 - 1;
            if (this.f14583m.containsKey(Integer.valueOf(i8)) || i8 < 0) {
                return;
            }
            this.f14583m.put(Integer.valueOf(i8), InterfaceC1196s.f14815d);
            return;
        }
        while (true) {
            i7++;
            if (i7 > ((Integer) this.f14583m.lastKey()).intValue()) {
                return;
            }
            InterfaceC1196s interfaceC1196s = (InterfaceC1196s) this.f14583m.get(Integer.valueOf(i7));
            if (interfaceC1196s != null) {
                this.f14583m.put(Integer.valueOf(i7 - 1), interfaceC1196s);
                this.f14583m.remove(Integer.valueOf(i7));
            }
        }
    }

    public final void t(int i7, InterfaceC1196s interfaceC1196s) {
        if (i7 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
        }
        if (interfaceC1196s == null) {
            this.f14583m.remove(Integer.valueOf(i7));
        } else {
            this.f14583m.put(Integer.valueOf(i7), interfaceC1196s);
        }
    }

    public final String toString() {
        return r(",");
    }

    public final boolean u(int i7) {
        if (i7 >= 0 && i7 <= ((Integer) this.f14583m.lastKey()).intValue()) {
            return this.f14583m.containsKey(Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
    }

    public final Iterator v() {
        return this.f14583m.keySet().iterator();
    }

    public final List w() {
        ArrayList arrayList = new ArrayList(q());
        for (int i7 = 0; i7 < q(); i7++) {
            arrayList.add(n(i7));
        }
        return arrayList;
    }

    public final void x() {
        this.f14583m.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        SortedMap sortedMap;
        Integer num;
        InterfaceC1196s interfaceC1196sZzc;
        C1089g c1089g = new C1089g();
        for (Map.Entry entry : this.f14583m.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1143m) {
                sortedMap = c1089g.f14583m;
                num = (Integer) entry.getKey();
                interfaceC1196sZzc = (InterfaceC1196s) entry.getValue();
            } else {
                sortedMap = c1089g.f14583m;
                num = (Integer) entry.getKey();
                interfaceC1196sZzc = ((InterfaceC1196s) entry.getValue()).zzc();
            }
            sortedMap.put(num, interfaceC1196sZzc);
        }
        return c1089g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public C1089g(List list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                t(i7, (InterfaceC1196s) list.get(i7));
            }
        }
    }

    public C1089g(InterfaceC1196s... interfaceC1196sArr) {
        this(Arrays.asList(interfaceC1196sArr));
    }
}
