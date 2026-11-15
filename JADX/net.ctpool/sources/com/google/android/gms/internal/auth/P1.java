package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class P1 implements N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f13836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f13838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f13839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f13840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f13841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f13842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M f13843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M f13844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M f13845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M f13846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f13847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f13848m;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f13836a = iA.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f13837b = iA.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f13838c = iA.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f13839d = iA.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f13840e = iA.f("getTokenRefactor__blocked_packages", I1.q(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), O1.f13832a);
            f13841f = iA.e("getTokenRefactor__chimera_get_token_evolved", true);
            f13842g = iA.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f13843h = iA.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f13844i = iA.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f13845j = iA.e("getTokenRefactor__gaul_token_api_evolved", false);
            f13846k = iA.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f13847l = iA.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f13848m = iA.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // com.google.android.gms.internal.auth.N1
    public final I1 a() {
        return (I1) f13840e.b();
    }

    @Override // com.google.android.gms.internal.auth.N1
    public final boolean zzc() {
        return ((Boolean) f13845j.b()).booleanValue();
    }
}
