package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152n implements InterfaceC1143m, InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final String f14745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Map f14746n = new HashMap();

    public AbstractC1152n(String str) {
        this.f14745m = str;
    }

    public abstract InterfaceC1196s a(C1093g3 c1093g3, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return this.f14745m;
    }

    public final String d() {
        return this.f14745m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return AbstractC1170p.b(this.f14746n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1152n)) {
            return false;
        }
        AbstractC1152n abstractC1152n = (AbstractC1152n) obj;
        String str = this.f14745m;
        if (str != null) {
            return str.equals(abstractC1152n.f14745m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final InterfaceC1196s f(String str) {
        return this.f14746n.containsKey(str) ? (InterfaceC1196s) this.f14746n.get(str) : InterfaceC1196s.f14815d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final boolean h(String str) {
        return this.f14746n.containsKey(str);
    }

    public int hashCode() {
        String str = this.f14745m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        return "toString".equals(str) ? new C1214u(this.f14745m) : AbstractC1170p.a(this, new C1214u(str), c1093g3, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1143m
    public final void k(String str, InterfaceC1196s interfaceC1196s) {
        if (interfaceC1196s == null) {
            this.f14746n.remove(str);
        } else {
            this.f14746n.put(str, interfaceC1196s);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public InterfaceC1196s zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.TRUE;
    }
}
