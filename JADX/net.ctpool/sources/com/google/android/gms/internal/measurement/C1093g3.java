package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1093g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1093g3 f14585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E f14586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f14587c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f14588d = new HashMap();

    public C1093g3(C1093g3 c1093g3, E e7) {
        this.f14585a = c1093g3;
        this.f14586b = e7;
    }

    public final InterfaceC1196s a(C1089g c1089g) {
        InterfaceC1196s interfaceC1196sA = InterfaceC1196s.f14815d;
        Iterator itV = c1089g.v();
        while (itV.hasNext()) {
            interfaceC1196sA = this.f14586b.a(this, c1089g.n(((Integer) itV.next()).intValue()));
            if (interfaceC1196sA instanceof C1134l) {
                break;
            }
        }
        return interfaceC1196sA;
    }

    public final InterfaceC1196s b(InterfaceC1196s interfaceC1196s) {
        return this.f14586b.a(this, interfaceC1196s);
    }

    public final InterfaceC1196s c(String str) {
        C1093g3 c1093g3 = this;
        while (!c1093g3.f14587c.containsKey(str)) {
            c1093g3 = c1093g3.f14585a;
            if (c1093g3 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC1196s) c1093g3.f14587c.get(str);
    }

    public final C1093g3 d() {
        return new C1093g3(this, this.f14586b);
    }

    public final void e(String str, InterfaceC1196s interfaceC1196s) {
        if (this.f14588d.containsKey(str)) {
            return;
        }
        if (interfaceC1196s == null) {
            this.f14587c.remove(str);
        } else {
            this.f14587c.put(str, interfaceC1196s);
        }
    }

    public final void f(String str, InterfaceC1196s interfaceC1196s) {
        e(str, interfaceC1196s);
        this.f14588d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        C1093g3 c1093g3 = this;
        while (!c1093g3.f14587c.containsKey(str)) {
            c1093g3 = c1093g3.f14585a;
            if (c1093g3 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC1196s interfaceC1196s) {
        C1093g3 c1093g3;
        C1093g3 c1093g32 = this;
        while (!c1093g32.f14587c.containsKey(str) && (c1093g3 = c1093g32.f14585a) != null && c1093g3.g(str)) {
            c1093g32 = c1093g32.f14585a;
        }
        if (c1093g32.f14588d.containsKey(str)) {
            return;
        }
        if (interfaceC1196s == null) {
            c1093g32.f14587c.remove(str);
        } else {
            c1093g32.f14587c.put(str, interfaceC1196s);
        }
    }
}
