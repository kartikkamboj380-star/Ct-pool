package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E1 f14144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1093g3 f14145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1062d f14146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1044b f14147d;

    public C() {
        this(new E1());
    }

    public final C1062d a() {
        return this.f14146c;
    }

    public final void b(J2 j22) throws C1072e0 {
        AbstractC1152n abstractC1152n;
        try {
            this.f14145b = this.f14144a.f14175b.d();
            if (this.f14144a.a(this.f14145b, (K2[]) j22.G().toArray(new K2[0])) instanceof C1134l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (I2 i22 : j22.E().G()) {
                List listG = i22.G();
                String strF = i22.F();
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    InterfaceC1196s interfaceC1196sA = this.f14144a.a(this.f14145b, (K2) it.next());
                    if (!(interfaceC1196sA instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C1093g3 c1093g3 = this.f14145b;
                    if (c1093g3.g(strF)) {
                        InterfaceC1196s interfaceC1196sC = c1093g3.c(strF);
                        if (!(interfaceC1196sC instanceof AbstractC1152n)) {
                            throw new IllegalStateException("Invalid function name: " + strF);
                        }
                        abstractC1152n = (AbstractC1152n) interfaceC1196sC;
                    } else {
                        abstractC1152n = null;
                    }
                    if (abstractC1152n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strF);
                    }
                    abstractC1152n.a(this.f14145b, Collections.singletonList(interfaceC1196sA));
                }
            }
        } catch (Throwable th) {
            throw new C1072e0(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f14144a.b(str, callable);
    }

    public final boolean d(C1071e c1071e) {
        try {
            this.f14146c.b(c1071e);
            this.f14144a.f14176c.h("runtime.counter", new C1125k(Double.valueOf(0.0d)));
            this.f14147d.b(this.f14145b.d(), this.f14146c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C1072e0(th);
        }
    }

    final /* synthetic */ AbstractC1152n e() {
        return new R7(this.f14147d);
    }

    public final boolean f() {
        return !this.f14146c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f14146c.d().equals(this.f14146c.a());
    }

    private C(E1 e12) {
        this.f14144a = e12;
        this.f14145b = e12.f14175b.d();
        this.f14146c = new C1062d();
        this.f14147d = new C1044b();
        e12.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14497a.e();
            }
        });
        e12.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.F0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new G4(this.f14190a.f14146c);
            }
        });
    }
}
