package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.InterfaceC1063d0;
import com.google.android.gms.internal.measurement.Y6;

/* JADX INFO: loaded from: classes.dex */
final class F2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ InterfaceC1063d0 f15425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f15426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ G2 f15427o;

    F2(G2 g22, InterfaceC1063d0 interfaceC1063d0, ServiceConnection serviceConnection) {
        this.f15425m = interfaceC1063d0;
        this.f15426n = serviceConnection;
        this.f15427o = g22;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1463p2 c1463p2E;
        String str;
        long j7;
        G2 g22 = this.f15427o;
        E2 e22 = g22.f15574b;
        String str2 = g22.f15573a;
        InterfaceC1063d0 interfaceC1063d0 = this.f15425m;
        ServiceConnection serviceConnection = this.f15426n;
        Bundle bundleA = e22.a(str2, interfaceC1063d0);
        e22.f15422a.f().l();
        e22.f15422a.O();
        if (bundleA != null) {
            long j8 = bundleA.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                c1463p2E = e22.f15422a.d().J();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundleA.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c1463p2E = e22.f15422a.d().E();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    e22.f15422a.d().I().b("InstallReferrer API result", string);
                    boolean z6 = Y6.a() && e22.f15422a.x().r(G.f15499V0);
                    Bundle bundleA2 = e22.f15422a.J().A(Uri.parse("?" + string), z6);
                    if (bundleA2 == null) {
                        c1463p2E = e22.f15422a.d().E();
                        str = "No campaign params defined in Install Referrer result";
                    } else if (z6) {
                        if (bundleA2.containsKey("gclid") || bundleA2.containsKey("gbraid")) {
                            j7 = bundleA.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j7 > 0) {
                                bundleA2.putLong("click_timestamp", j7);
                            }
                        }
                        if (j8 == e22.f15422a.D().f16375h.a()) {
                            e22.f15422a.d().I().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (e22.f15422a.n()) {
                            e22.f15422a.D().f16375h.b(j8);
                            e22.f15422a.d().I().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleA2.putString("_cis", "referrer API v2");
                            e22.f15422a.F().e0("auto", "_cmp", bundleA2, str2);
                        }
                    } else {
                        String string2 = bundleA2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            j7 = bundleA.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j7 == 0) {
                                c1463p2E = e22.f15422a.d().E();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            }
                            bundleA2.putLong("click_timestamp", j7);
                        }
                        if (j8 == e22.f15422a.D().f16375h.a()) {
                        }
                        if (e22.f15422a.n()) {
                        }
                    }
                }
            }
            c1463p2E.a(str);
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(e22.f15422a.a(), serviceConnection);
        }
    }
}
