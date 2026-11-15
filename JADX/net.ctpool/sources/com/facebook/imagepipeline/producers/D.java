package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class D extends AbstractC0767d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f10731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V0.b f10732e;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c f10733m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ X.a f10734n;

        a(c cVar, X.a aVar) {
            this.f10733m = cVar;
            this.f10734n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            D.this.j(this.f10733m, this.f10734n);
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f10736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f10737b;

        b(Future future, X.a aVar) {
            this.f10736a = future;
            this.f10737b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (this.f10736a.cancel(false)) {
                this.f10737b.b();
            }
        }
    }

    public static class c extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f10739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f10740g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f10741h;

        public c(InterfaceC0777n interfaceC0777n, e0 e0Var) {
            super(interfaceC0777n, e0Var);
        }
    }

    public D(int i7) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f10728a = i7;
    }

    private HttpURLConnection g(Uri uri, int i7) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        String str = this.f10729b;
        if (str != null) {
            httpURLConnectionO.setRequestProperty("User-Agent", str);
        }
        Map map = this.f10730c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionO.setConnectTimeout(this.f10728a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i7 > 0 && uri2 != null && !O0.j.a(uri2.getScheme(), scheme)) {
            return g(uri2, i7 - 1);
        }
        String string = uri.toString();
        throw new IOException(i7 == 0 ? h("URL %s follows too many redirects", string) : h("URL %s returned %d without a valid redirect", string, Integer.valueOf(responseCode)));
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i7) {
        if (i7 == 307 || i7 == 308) {
            return true;
        }
        switch (i7) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) W0.f.p(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c e(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        return new c(interfaceC0777n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, X.a aVar) {
        cVar.f10739f = this.f10732e.now();
        cVar.b().e(new b(this.f10731d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void j(c cVar, X.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionG;
        InputStream inputStream = null;
        try {
            httpURLConnectionG = g(cVar.g(), 5);
            try {
                try {
                    cVar.f10740g = this.f10732e.now();
                    if (httpURLConnectionG != null) {
                        inputStream = httpURLConnectionG.getInputStream();
                        aVar.c(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                } catch (IOException e7) {
                    e = e7;
                    aVar.a(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionG != null) {
                    throw th;
                }
                httpURLConnectionG.disconnect();
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            httpURLConnectionG = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionG = null;
            if (inputStream != null) {
            }
            if (httpURLConnectionG != null) {
            }
        }
        httpURLConnectionG.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map c(c cVar, int i7) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f10740g - cVar.f10739f));
        map.put("fetch_time", Long.toString(cVar.f10741h - cVar.f10740g));
        map.put("total_time", Long.toString(cVar.f10741h - cVar.f10739f));
        map.put("image_size", Integer.toString(i7));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, int i7) {
        cVar.f10741h = this.f10732e.now();
    }

    D(String str, Map map, V0.b bVar) {
        this.f10731d = Executors.newFixedThreadPool(3);
        this.f10732e = bVar;
        this.f10730c = map;
        this.f10729b = str;
    }
}
