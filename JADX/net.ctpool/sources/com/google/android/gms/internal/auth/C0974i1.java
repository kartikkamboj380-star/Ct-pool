package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0974i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0974i1 f13976c = new C0974i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f13978b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0986m1 f13977a = new S0();

    private C0974i1() {
    }

    public static C0974i1 a() {
        return f13976c;
    }

    public final InterfaceC0983l1 b(Class cls) {
        G0.c(cls, "messageType");
        InterfaceC0983l1 interfaceC0983l1A = (InterfaceC0983l1) this.f13978b.get(cls);
        if (interfaceC0983l1A == null) {
            interfaceC0983l1A = this.f13977a.a(cls);
            G0.c(cls, "messageType");
            InterfaceC0983l1 interfaceC0983l1 = (InterfaceC0983l1) this.f13978b.putIfAbsent(cls, interfaceC0983l1A);
            if (interfaceC0983l1 != null) {
                return interfaceC0983l1;
            }
        }
        return interfaceC0983l1A;
    }
}
