package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C1047b2;
import com.google.android.gms.internal.measurement.y7;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G5 extends F5 {
    G5(H5 h52) {
        super(h52);
    }

    private final String u(String str) {
        String strP = p().P(str);
        if (TextUtils.isEmpty(strP)) {
            return (String) G.f15555r.a(null);
        }
        Uri uri = Uri.parse((String) G.f15555r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strP + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
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

    public final I5 s(String str) {
        C1372c2 c1372c2K0;
        if (y7.a() && b().r(G.f15570y0)) {
            h();
            if (d6.F0(str)) {
                d().I().a("sgtm feature flag enabled.");
                C1372c2 c1372c2K02 = o().K0(str);
                if (c1372c2K02 == null) {
                    return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
                }
                String strM = c1372c2K02.m();
                C1047b2 c1047b2J = p().J(str);
                if (c1047b2J == null || (c1372c2K0 = o().K0(str)) == null || ((!c1047b2J.W() || c1047b2J.N().j() != 100) && !h().C0(str, c1372c2K0.v()) && (!b().r(G.f15457A0) ? !(TextUtils.isEmpty(strM) || strM.hashCode() % 100 >= c1047b2J.N().j()) : !(TextUtils.isEmpty(strM) || Math.abs(strM.hashCode() % 100) >= c1047b2J.N().j())))) {
                    return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
                }
                I5 i52 = null;
                if (c1372c2K02.C()) {
                    d().I().a("sgtm upload enabled in manifest.");
                    C1047b2 c1047b2J2 = p().J(c1372c2K02.l());
                    if (c1047b2J2 != null && c1047b2J2.W()) {
                        String strH = c1047b2J2.N().H();
                        if (!TextUtils.isEmpty(strH)) {
                            String strG = c1047b2J2.N().G();
                            d().I().c("sgtm configured with upload_url, server_info", strH, TextUtils.isEmpty(strG) ? "Y" : "N");
                            if (TextUtils.isEmpty(strG)) {
                                i52 = new I5(strH, w3.C.SGTM);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strG);
                                if (!TextUtils.isEmpty(c1372c2K02.v())) {
                                    map.put("x-gtm-server-preview", c1372c2K02.v());
                                }
                                i52 = new I5(strH, map, w3.C.SGTM);
                            }
                        }
                    }
                }
                if (i52 != null) {
                    return i52;
                }
            }
        }
        return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
    }

    public final String t(C1372c2 c1372c2) {
        Uri.Builder builder = new Uri.Builder();
        String strQ = c1372c2.q();
        if (TextUtils.isEmpty(strQ)) {
            strQ = c1372c2.j();
        }
        builder.scheme((String) G.f15523f.a(null)).encodedAuthority((String) G.f15526g.a(null)).path("config/app/" + strQ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
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
