package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class s2 implements InterfaceC1341v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final InterfaceC1341v0 f15301a = new s2();

    private s2() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1341v0
    public final boolean d(int i7) {
        if (i7 == 17) {
            return true;
        }
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
            case 10:
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }
}
