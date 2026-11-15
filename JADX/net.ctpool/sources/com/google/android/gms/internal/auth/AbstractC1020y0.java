package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1020y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1014w0 f14050a = new C1017x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1014w0 f14051b;

    static {
        AbstractC1014w0 abstractC1014w0 = null;
        try {
            abstractC1014w0 = (AbstractC1014w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14051b = abstractC1014w0;
    }

    static AbstractC1014w0 a() {
        AbstractC1014w0 abstractC1014w0 = f14051b;
        if (abstractC1014w0 != null) {
            return abstractC1014w0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1014w0 b() {
        return f14050a;
    }
}
