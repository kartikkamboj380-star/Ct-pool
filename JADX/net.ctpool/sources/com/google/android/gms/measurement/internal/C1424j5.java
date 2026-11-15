package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424j5 extends E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f16103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A2 f16104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A2 f16105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A2 f16106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A2 f16107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A2 f16108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A2 f16109j;

    C1424j5(H5 h52) {
        super(h52);
        this.f16103d = new HashMap();
        C1532z2 c1532z2G = g();
        Objects.requireNonNull(c1532z2G);
        this.f16104e = new A2(c1532z2G, "last_delete_stale", 0L);
        C1532z2 c1532z2G2 = g();
        Objects.requireNonNull(c1532z2G2);
        this.f16105f = new A2(c1532z2G2, "last_delete_stale_batch", 0L);
        C1532z2 c1532z2G3 = g();
        Objects.requireNonNull(c1532z2G3);
        this.f16106g = new A2(c1532z2G3, "backoff", 0L);
        C1532z2 c1532z2G4 = g();
        Objects.requireNonNull(c1532z2G4);
        this.f16107h = new A2(c1532z2G4, "last_upload", 0L);
        C1532z2 c1532z2G5 = g();
        Objects.requireNonNull(c1532z2G5);
        this.f16108i = new A2(c1532z2G5, "last_upload_attempt", 0L);
        C1532z2 c1532z2G6 = g();
        Objects.requireNonNull(c1532z2G6);
        this.f16109j = new A2(c1532z2G6, "midnight_offset", 0L);
    }

    private final Pair w(String str) {
        C1417i5 c1417i5;
        AdvertisingIdClient.Info advertisingIdInfo;
        l();
        long jElapsedRealtime = zzb().elapsedRealtime();
        C1417i5 c1417i52 = (C1417i5) this.f16103d.get(str);
        if (c1417i52 != null && jElapsedRealtime < c1417i52.f16083c) {
            return new Pair(c1417i52.f16081a, Boolean.valueOf(c1417i52.f16082b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jA = b().A(str) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(a());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1417i52 != null && jElapsedRealtime < c1417i52.f16083c + b().y(str, G.f15514c)) {
                    return new Pair(c1417i52.f16081a, Boolean.valueOf(c1417i52.f16082b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e7) {
            d().D().b("Unable to get advertising id", e7);
            c1417i5 = new C1417i5("", false, jA);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        c1417i5 = id != null ? new C1417i5(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jA) : new C1417i5("", advertisingIdInfo.isLimitAdTrackingEnabled(), jA);
        this.f16103d.put(str, c1417i5);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c1417i5.f16081a, Boolean.valueOf(c1417i5.f16082b));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1425k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1424j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final Pair x(String str, A3 a32) {
        return a32.y() ? w(str) : new Pair("", Boolean.FALSE);
    }

    final String y(String str, boolean z6) {
        l();
        String str2 = z6 ? (String) w(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestT0 = d6.T0();
        if (messageDigestT0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT0.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
