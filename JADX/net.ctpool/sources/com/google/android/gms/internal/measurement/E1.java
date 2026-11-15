package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f14174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C1093g3 f14175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C1093g3 f14176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1068d5 f14177d;

    public E1() {
        E e7 = new E();
        this.f14174a = e7;
        C1093g3 c1093g3 = new C1093g3(null, e7);
        this.f14176c = c1093g3;
        this.f14175b = c1093g3.d();
        C1068d5 c1068d5 = new C1068d5();
        this.f14177d = c1068d5;
        c1093g3.h("require", new U7(c1068d5));
        c1068d5.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.g1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new T7();
            }
        });
        c1093g3.h("runtime.counter", new C1125k(Double.valueOf(0.0d)));
    }

    public final InterfaceC1196s a(C1093g3 c1093g3, K2... k2Arr) {
        InterfaceC1196s interfaceC1196sA = InterfaceC1196s.f14815d;
        for (K2 k22 : k2Arr) {
            interfaceC1196sA = AbstractC1103h4.a(k22);
            D2.b(this.f14176c);
            if ((interfaceC1196sA instanceof C1223v) || (interfaceC1196sA instanceof C1205t)) {
                interfaceC1196sA = this.f14174a.a(c1093g3, interfaceC1196sA);
            }
        }
        return interfaceC1196sA;
    }

    public final void b(String str, Callable callable) {
        this.f14177d.b(str, callable);
    }
}
