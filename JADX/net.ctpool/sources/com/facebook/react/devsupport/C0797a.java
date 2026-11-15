package com.facebook.react.devsupport;

import T5.B;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import com.facebook.react.devsupport.T;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.react.devsupport.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0797a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.z f11568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0459e f11569b;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.a$a, reason: collision with other inner class name */
    class C0210a implements InterfaceC0460f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ X1.b f11570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f11571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f11572c;

        C0210a(X1.b bVar, File file, c cVar) {
            this.f11570a = bVar;
            this.f11571b = file;
            this.f11572c = cVar;
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, T5.D d7) {
            try {
                if (C0797a.this.f11569b != null && !C0797a.this.f11569b.n0()) {
                    C0797a.this.f11569b = null;
                    String string = d7.j0().l().toString();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(d7.l("content-type"));
                    if (matcher.find()) {
                        C0797a.this.i(string, d7, matcher.group(1), this.f11571b, this.f11572c, this.f11570a);
                    } else {
                        T5.E eA = d7.a();
                        try {
                            C0797a.this.h(string, d7.f(), d7.w(), d7.a().j(), this.f11571b, this.f11572c, this.f11570a);
                            if (eA != null) {
                                eA.close();
                            }
                        } finally {
                        }
                    }
                    d7.close();
                    return;
                }
                C0797a.this.f11569b = null;
                if (d7 != null) {
                    d7.close();
                }
            } catch (Throwable th) {
                if (d7 != null) {
                    try {
                        d7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            if (C0797a.this.f11569b == null || C0797a.this.f11569b.n0()) {
                C0797a.this.f11569b = null;
                return;
            }
            C0797a.this.f11569b = null;
            String string = interfaceC0459e.o().l().toString();
            this.f11570a.c(S1.c.a(string, "Could not connect to development server.", "URL: " + string, iOException));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.a$b */
    class b implements T.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T5.D f11574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f11576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f11577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ X1.b f11578e;

        b(T5.D d7, String str, File file, c cVar, X1.b bVar) {
            this.f11574a = d7;
            this.f11575b = str;
            this.f11576c = file;
            this.f11577d = cVar;
            this.f11578e = bVar;
        }

        @Override // com.facebook.react.devsupport.T.a
        public void a(Map map, i6.f fVar, boolean z6) throws IOException {
            if (z6) {
                int iF = this.f11574a.f();
                if (map.containsKey("X-Http-Status")) {
                    iF = Integer.parseInt((String) map.get("X-Http-Status"));
                }
                C0797a.this.h(this.f11575b, iF, T5.t.k(map), fVar, this.f11576c, this.f11577d, this.f11578e);
                return;
            }
            if (map.containsKey("Content-Type") && ((String) map.get("Content-Type")).equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(fVar.J0());
                    this.f11578e.d(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e7) {
                    P0.a.j("ReactNative", "Error parsing progress JSON. " + e7.toString());
                }
            }
        }

        @Override // com.facebook.react.devsupport.T.a
        public void b(Map map, long j7, long j8) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f11578e.d("Downloading", Integer.valueOf((int) (j7 / 1024)), Integer.valueOf((int) (j8 / 1024)));
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.a$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11581b;

        public String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ImagesContract.URL, this.f11580a);
                jSONObject.put("filesChangedCount", this.f11581b);
                return jSONObject.toString();
            } catch (JSONException e7) {
                P0.a.k("BundleDownloader", "Can't serialize bundle info: ", e7);
                return null;
            }
        }
    }

    public C0797a(T5.z zVar) {
        this.f11568a = zVar;
    }

    private static void g(String str, T5.t tVar, c cVar) {
        cVar.f11580a = str;
        String strF = tVar.f("X-Metro-Files-Changed-Count");
        if (strF != null) {
            try {
                cVar.f11581b = Integer.parseInt(strF);
            } catch (NumberFormatException unused) {
                cVar.f11581b = -2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, int i7, T5.t tVar, i6.h hVar, File file, c cVar, X1.b bVar) throws IOException {
        if (i7 != 200) {
            String strJ0 = hVar.J0();
            S1.c cVarC = S1.c.c(str, strJ0);
            if (cVarC != null) {
                bVar.c(cVarC);
                return;
            }
            bVar.c(new S1.c("The development server returned response error code: " + i7 + "\n\nURL: " + str + "\n\nBody:\n" + strJ0));
            return;
        }
        if (cVar != null) {
            g(str, tVar, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!j(hVar, file2) || file2.renameTo(file)) {
            bVar.a();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, T5.D d7, String str2, File file, c cVar, X1.b bVar) {
        if (new T(d7.a().j(), str2).d(new b(d7, str, file, cVar, bVar))) {
            return;
        }
        bVar.c(new S1.c("Error while reading multipart response.\n\nResponse code: " + d7.f() + "\n\nURL: " + str.toString() + "\n\n"));
    }

    private static boolean j(i6.h hVar, File file) throws Throwable {
        i6.A aF;
        try {
            aF = i6.q.f(file);
        } catch (Throwable th) {
            th = th;
            aF = null;
        }
        try {
            hVar.d1(aF);
            if (aF == null) {
                return true;
            }
            aF.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            if (aF != null) {
                aF.close();
            }
            throw th;
        }
    }

    public void e(X1.b bVar, File file, String str, c cVar) {
        f(bVar, file, str, cVar, new B.a());
    }

    public void f(X1.b bVar, File file, String str, c cVar, B.a aVar) {
        InterfaceC0459e interfaceC0459e = (InterfaceC0459e) O1.a.c(this.f11568a.a(aVar.m(str).a("Accept", "multipart/mixed").b()));
        this.f11569b = interfaceC0459e;
        interfaceC0459e.S0(new C0210a(bVar, file, cVar));
    }
}
