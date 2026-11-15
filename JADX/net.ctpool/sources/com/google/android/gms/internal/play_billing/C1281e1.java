package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1281e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1281e1 f15171c = new C1281e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f15173b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1297i1 f15172a = new P0();

    private C1281e1() {
    }

    public static C1281e1 a() {
        return f15171c;
    }

    public final InterfaceC1293h1 b(Class cls) {
        AbstractC1353z0.c(cls, "messageType");
        InterfaceC1293h1 interfaceC1293h1A = (InterfaceC1293h1) this.f15173b.get(cls);
        if (interfaceC1293h1A == null) {
            interfaceC1293h1A = this.f15172a.a(cls);
            AbstractC1353z0.c(cls, "messageType");
            InterfaceC1293h1 interfaceC1293h1 = (InterfaceC1293h1) this.f15173b.putIfAbsent(cls, interfaceC1293h1A);
            if (interfaceC1293h1 != null) {
                return interfaceC1293h1;
            }
        }
        return interfaceC1293h1A;
    }
}
