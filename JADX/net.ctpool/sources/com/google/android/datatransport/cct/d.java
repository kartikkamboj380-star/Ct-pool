package com.google.android.datatransport.cct;

import T2.n;
import T2.o;
import T2.p;
import T2.q;
import T2.r;
import T2.s;
import T2.t;
import T2.u;
import T2.v;
import T2.w;
import T2.x;
import U2.h;
import U2.i;
import V2.f;
import V2.g;
import V2.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import e3.InterfaceC1622a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import w4.InterfaceC2196a;

/* JADX INFO: loaded from: classes.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2196a f13460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f13461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f13462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f13463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1622a f13464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1622a f13465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13466g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f13467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n f13468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f13469c;

        a(URL url, n nVar, String str) {
            this.f13467a = url;
            this.f13468b = nVar;
            this.f13469c = str;
        }

        a a(URL url) {
            return new a(url, this.f13468b, this.f13469c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f13471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f13472c;

        b(int i7, URL url, long j7) {
            this.f13470a = i7;
            this.f13471b = url;
            this.f13472c = j7;
        }
    }

    d(Context context, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2) {
        this(context, interfaceC1622a, interfaceC1622a2, 130000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        Y2.a.f("CctTransportBackend", "Making request to: %s", aVar.f13467a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13467a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13466g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13469c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f13460a.a(aVar.f13468b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Y2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    Y2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Y2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamN = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamN))).c());
                            if (inputStreamN != null) {
                                inputStreamN.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e7) {
            e = e7;
            Y2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e8) {
            e = e8;
            Y2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e9) {
            e = e9;
            Y2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (w4.b e10) {
            e = e10;
            Y2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        w.b bVar;
        if (networkInfo == null) {
            bVar = w.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (w.b.e(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = w.b.COMBINED;
        }
        return bVar.h();
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.h() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Y2.a.d("CctTransportBackend", "Unable to find version code for package", e7);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f13465f.a()).h(this.f13464e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(T2.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                S2.c cVarB = hVarE.b();
                if (cVarB.equals(S2.c.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (cVarB.equals(S2.c.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    Y2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.e(iVar3.i("net-type"))).b(w.b.e(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f13471b;
        if (url == null) {
            return null;
        }
        Y2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f13471b);
    }

    private static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Invalid url: " + str, e7);
        }
    }

    @Override // V2.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f13461b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f13462c)).c("application_build", Integer.toString(i(this.f13462c))).d();
    }

    @Override // V2.m
    public g b(f fVar) {
        n nVarJ = j(fVar);
        URL urlO = this.f13463d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlO = o(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) Z2.b.a(5, new a(urlO, nVarJ, strD), new Z2.a() { // from class: com.google.android.datatransport.cct.b
                @Override // Z2.a
                public final Object apply(Object obj) {
                    return this.f13459a.e((d.a) obj);
                }
            }, new Z2.c() { // from class: com.google.android.datatransport.cct.c
                @Override // Z2.c
                public final Object a(Object obj, Object obj2) {
                    return d.m((d.a) obj, (d.b) obj2);
                }
            });
            int i7 = bVar.f13470a;
            if (i7 == 200) {
                return g.e(bVar.f13472c);
            }
            if (i7 < 500 && i7 != 404) {
                return i7 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e7) {
            Y2.a.d("CctTransportBackend", "Could not make request to the backend", e7);
            return g.f();
        }
    }

    d(Context context, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, int i7) {
        this.f13460a = n.b();
        this.f13462c = context;
        this.f13461b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13463d = o(com.google.android.datatransport.cct.a.f13451c);
        this.f13464e = interfaceC1622a2;
        this.f13465f = interfaceC1622a;
        this.f13466g = i7;
    }
}
