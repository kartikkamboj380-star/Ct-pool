package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1202s5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1202s5 f14834c = new C1202s5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f14836b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1220u5 f14835a = new T4();

    private C1202s5() {
    }

    public static C1202s5 a() {
        return f14834c;
    }

    public final InterfaceC1229v5 b(Class cls) {
        B4.f(cls, "messageType");
        InterfaceC1229v5 interfaceC1229v5 = (InterfaceC1229v5) this.f14836b.get(cls);
        if (interfaceC1229v5 != null) {
            return interfaceC1229v5;
        }
        InterfaceC1229v5 interfaceC1229v5A = this.f14835a.a(cls);
        B4.f(cls, "messageType");
        B4.f(interfaceC1229v5A, "schema");
        InterfaceC1229v5 interfaceC1229v52 = (InterfaceC1229v5) this.f14836b.putIfAbsent(cls, interfaceC1229v5A);
        return interfaceC1229v52 != null ? interfaceC1229v52 : interfaceC1229v5A;
    }

    public final InterfaceC1229v5 c(Object obj) {
        return b(obj.getClass());
    }
}
