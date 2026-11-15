package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1499u4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final URL f16297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1478r4 f16298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f16299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f16300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1485s4 f16301q;

    public RunnableC1499u4(C1485s4 c1485s4, String str, URL url, byte[] bArr, Map map, InterfaceC1478r4 interfaceC1478r4) {
        this.f16301q = c1485s4;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(interfaceC1478r4);
        this.f16297m = url;
        this.f16298n = interfaceC1478r4;
        this.f16299o = str;
        this.f16300p = null;
    }

    private final void b(final int i7, final Exception exc, final byte[] bArr, final Map map) {
        this.f16301q.f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final void run() {
                this.f16281m.a(i7, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i7, Exception exc, byte[] bArr, Map map) {
        this.f16298n.a(this.f16299o, i7, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.f16301q.j();
        int responseCode = 0;
        try {
            URLConnection uRLConnectionB = com.google.android.gms.internal.measurement.D0.a().b(this.f16297m, "client-measurement");
            if (!(uRLConnectionB instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionB;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    C1485s4 c1485s4 = this.f16301q;
                    byte[] bArrT = C1485s4.t(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(responseCode, null, bArrT, headerFields);
                } catch (IOException e7) {
                    e = e7;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }
}
