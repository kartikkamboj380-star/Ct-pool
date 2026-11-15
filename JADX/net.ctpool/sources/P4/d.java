package P4;

import H5.AbstractC0394g;
import H5.I;
import N4.C0440b;
import android.net.Uri;
import i5.n;
import i5.u;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1956k;
import org.json.JSONObject;
import v5.p;
import w5.k;
import w5.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements P4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2658d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0440b f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1888g f2660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2661c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2662q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Map f2664s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p f2665t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p f2666u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, p pVar, p pVar2, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2664s = map;
            this.f2665t = pVar;
            this.f2666u = pVar2;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return d.this.new b(this.f2664s, this.f2665t, this.f2666u, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f2662q;
            try {
                if (i7 == 0) {
                    n.b(obj);
                    URLConnection uRLConnectionOpenConnection = d.this.c().openConnection();
                    k.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f2664s.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        v vVar = new v();
                        while (true) {
                            String line = bufferedReader.readLine();
                            vVar.f22740m = line;
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p pVar = this.f2665t;
                        this.f2662q = 1;
                        if (pVar.m(jSONObject, this) == objC) {
                            return objC;
                        }
                    } else {
                        p pVar2 = this.f2666u;
                        String str = "Bad response code: " + responseCode;
                        this.f2662q = 2;
                        if (pVar2.m(str, this) == objC) {
                            return objC;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
            } catch (Exception e7) {
                p pVar3 = this.f2666u;
                String message = e7.getMessage();
                if (message == null) {
                    message = e7.toString();
                }
                this.f2662q = 3;
                if (pVar3.m(message, this) == objC) {
                    return objC;
                }
            }
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
            return ((b) d(i7, interfaceC1885d)).s(u.f19985a);
        }
    }

    public d(C0440b c0440b, InterfaceC1888g interfaceC1888g, String str) {
        k.f(c0440b, "appInfo");
        k.f(interfaceC1888g, "blockingDispatcher");
        k.f(str, "baseUrl");
        this.f2659a = c0440b;
        this.f2660b = interfaceC1888g;
        this.f2661c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f2661c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f2659a.b()).appendPath("settings").appendQueryParameter("build_version", this.f2659a.a().a()).appendQueryParameter("display_version", this.f2659a.a().f()).build().toString());
    }

    @Override // P4.a
    public Object a(Map map, p pVar, p pVar2, InterfaceC1885d interfaceC1885d) {
        Object objG = AbstractC0394g.g(this.f2660b, new b(map, pVar, pVar2, null), interfaceC1885d);
        return objG == AbstractC1930b.c() ? objG : u.f19985a;
    }

    public /* synthetic */ d(C0440b c0440b, InterfaceC1888g interfaceC1888g, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0440b, interfaceC1888g, (i7 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
