package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public final class L1 implements K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f13813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f13814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f13815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f13816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f13817e;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f13813a = iA.e("Aang__create_auth_exception_with_pending_intent", false);
        f13814b = iA.e("Aang__enable_add_account_restrictions", false);
        f13815c = iA.e("Aang__log_missing_gaia_id_event", true);
        f13816d = iA.e("Aang__log_obfuscated_gaiaid_status", true);
        f13817e = iA.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.K1
    public final boolean a() {
        return ((Boolean) f13813a.b()).booleanValue();
    }
}
