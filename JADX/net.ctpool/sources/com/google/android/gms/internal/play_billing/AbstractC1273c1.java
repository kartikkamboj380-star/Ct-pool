package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1273c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1269b1 f15165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1269b1 f15166b;

    static {
        C1269b1 c1269b1 = null;
        try {
            c1269b1 = (C1269b1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15165a = c1269b1;
        f15166b = new C1269b1();
    }

    static C1269b1 a() {
        return f15165a;
    }

    static C1269b1 b() {
        return f15166b;
    }
}
