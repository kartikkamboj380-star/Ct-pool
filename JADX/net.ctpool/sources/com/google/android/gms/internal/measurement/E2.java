package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum E2 implements E4 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f14185m;

    E2(int i7) {
        this.f14185m = i7;
    }

    public static E2 e(int i7) {
        if (i7 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i7 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i7 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i7 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i7 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i7 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static D4 h() {
        return C2.f14150a;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final int a() {
        return this.f14185m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + E2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14185m + " name=" + name() + '>';
    }
}
