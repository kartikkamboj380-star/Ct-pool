package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1463p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C1449n2 f16229d;

    C1463p2(C1449n2 c1449n2, int i7, boolean z6, boolean z7) {
        this.f16229d = c1449n2;
        this.f16226a = i7;
        this.f16227b = z6;
        this.f16228c = z7;
    }

    public final void a(String str) {
        this.f16229d.x(this.f16226a, this.f16227b, this.f16228c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f16229d.x(this.f16226a, this.f16227b, this.f16228c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f16229d.x(this.f16226a, this.f16227b, this.f16228c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f16229d.x(this.f16226a, this.f16227b, this.f16228c, str, obj, obj2, obj3);
    }
}
