package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.InterfaceC1063d0;

/* JADX INFO: loaded from: classes.dex */
public final class E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final S2 f15422a;

    E2(H5 h52) {
        this.f15422a = h52.r0();
    }

    final Bundle a(String str, InterfaceC1063d0 interfaceC1063d0) {
        this.f15422a.f().l();
        if (interfaceC1063d0 == null) {
            this.f15422a.d().J().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleB = interfaceC1063d0.b(bundle);
            if (bundleB != null) {
                return bundleB;
            }
            this.f15422a.d().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e7) {
            this.f15422a.d().E().b("Exception occurred while retrieving the Install Referrer", e7.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.f15422a.a());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f15422a.d().I().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            this.f15422a.d().I().b("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }
}
