package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C1234w2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1470q2 extends E5 {
    public C1470q2(H5 h52) {
        super(h52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] z(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean A() {
        s();
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
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

    public final void w(String str, I5 i52, C1234w2 c1234w2, InterfaceC1490t2 interfaceC1490t2) {
        l();
        s();
        try {
            URL url = new URI(i52.b()).toURL();
            m();
            f().x(new RunnableC1497u2(this, str, url, c1234w2.i(), i52.c(), interfaceC1490t2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            d().E().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C1449n2.t(str), i52.b());
        }
    }

    public final void x(String str, URL url, byte[] bArr, Map map, InterfaceC1490t2 interfaceC1490t2) {
        l();
        s();
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        Preconditions.checkNotNull(interfaceC1490t2);
        f().x(new RunnableC1497u2(this, str, url, bArr, map, interfaceC1490t2));
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
