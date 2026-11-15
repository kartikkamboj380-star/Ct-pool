package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
final class A4 implements InterfaceC1059c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A4 f14124a = new A4();

    private A4() {
    }

    public static A4 c() {
        return f14124a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1059c5
    public final InterfaceC1077e5 a(Class cls) {
        if (!AbstractC1260z4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC1077e5) AbstractC1260z4.l(cls.asSubclass(AbstractC1260z4.class)).p(AbstractC1260z4.c.f15004c, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1059c5
    public final boolean b(Class cls) {
        return AbstractC1260z4.class.isAssignableFrom(cls);
    }
}
