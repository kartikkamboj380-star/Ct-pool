package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
abstract class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final R0 f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final R0 f15110b;

    static {
        R0 r02 = null;
        try {
            r02 = (R0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15109a = r02;
        f15110b = new R0();
    }

    static R0 a() {
        return f15109a;
    }

    static R0 b() {
        return f15110b;
    }
}
