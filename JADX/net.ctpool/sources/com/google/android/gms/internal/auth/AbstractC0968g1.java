package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0968g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0965f1 f13911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0965f1 f13912b;

    static {
        C0965f1 c0965f1 = null;
        try {
            c0965f1 = (C0965f1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f13911a = c0965f1;
        f13912b = new C0965f1();
    }

    static C0965f1 a() {
        return f13911a;
    }

    static C0965f1 b() {
        return f13912b;
    }
}
