package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1296i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1288g0 f15197a = new C1292h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1288g0 f15198b;

    static {
        AbstractC1288g0 abstractC1288g0 = null;
        try {
            abstractC1288g0 = (AbstractC1288g0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15198b = abstractC1288g0;
    }

    static AbstractC1288g0 a() {
        AbstractC1288g0 abstractC1288g0 = f15198b;
        if (abstractC1288g0 != null) {
            return abstractC1288g0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1288g0 b() {
        return f15197a;
    }
}
