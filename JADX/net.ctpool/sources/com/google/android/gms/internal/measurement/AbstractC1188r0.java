package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1188r0 f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final AbstractC1188r0 f14803b;

    static {
        AbstractC1180q0 abstractC1180q0B = new C1108i0().e("").c(false).b(EnumC1206t0.ALL_CHECKS);
        EnumC1197s0 enumC1197s0 = EnumC1197s0.READ_AND_WRITE;
        f14802a = abstractC1180q0B.a(enumC1197s0).d();
        f14803b = new C1108i0().e("").c(false).b(EnumC1206t0.NO_CHECKS).a(enumC1197s0).d();
        new C1108i0().e("").c(false).b(EnumC1206t0.SKIP_COMPLIANCE_CHECK).a(enumC1197s0).d();
    }

    public abstract InterfaceC1099h0 a();

    public abstract InterfaceC1090g0 b();

    public abstract EnumC1206t0 c();

    public abstract EnumC1197s0 d();

    public abstract String e();

    public abstract boolean f();
}
