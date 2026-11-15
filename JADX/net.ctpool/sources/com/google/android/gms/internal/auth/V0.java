package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U0 f13862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U0 f13863b;

    static {
        U0 u02 = null;
        try {
            u02 = (U0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f13862a = u02;
        f13863b = new U0();
    }

    static U0 a() {
        return f13862a;
    }

    static U0 b() {
        return f13863b;
    }
}
