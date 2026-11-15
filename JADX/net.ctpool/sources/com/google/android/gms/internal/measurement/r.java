package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r implements InterfaceC1143m, InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f14801m = new HashMap();

    public final List a() {
        return new ArrayList(this.f14801m.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return AbstractC1170p.b(this.f14801m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f14801m.equals(((r) obj).f14801m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final InterfaceC1196s f(String str) {
        return this.f14801m.containsKey(str) ? (InterfaceC1196s) this.f14801m.get(str) : InterfaceC1196s.f14815d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final boolean h(String str) {
        return this.f14801m.containsKey(str);
    }

    public int hashCode() {
        return this.f14801m.hashCode();
    }

    public InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        return "toString".equals(str) ? new C1214u(toString()) : AbstractC1170p.a(this, new C1214u(str), c1093g3, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final void k(String str, InterfaceC1196s interfaceC1196s) {
        if (interfaceC1196s == null) {
            this.f14801m.remove(str);
        } else {
            this.f14801m.put(str, interfaceC1196s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f14801m.isEmpty()) {
            for (String str : this.f14801m.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f14801m.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        Map map;
        String str;
        InterfaceC1196s interfaceC1196sZzc;
        r rVar = new r();
        for (Map.Entry entry : this.f14801m.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1143m) {
                map = rVar.f14801m;
                str = (String) entry.getKey();
                interfaceC1196sZzc = (InterfaceC1196s) entry.getValue();
            } else {
                map = rVar.f14801m;
                str = (String) entry.getKey();
                interfaceC1196sZzc = ((InterfaceC1196s) entry.getValue()).zzc();
            }
            map.put(str, interfaceC1196sZzc);
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.TRUE;
    }
}
