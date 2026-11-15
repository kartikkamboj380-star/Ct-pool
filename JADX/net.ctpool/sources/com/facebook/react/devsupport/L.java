package com.facebook.react.devsupport;

import T5.B;
import T5.z;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Inspector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class L implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11531b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11532c;

    class a implements Inspector.RemoteConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11533a;

        a(String str) {
            this.f11533a = str;
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onDisconnect() {
            try {
                L.this.f11531b.remove(this.f11533a);
                L l7 = L.this;
                l7.l("disconnect", l7.k(this.f11533a));
            } catch (JSONException e7) {
                P0.a.H("InspectorPackagerConnection", "Couldn't send event to packager", e7);
            }
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onMessage(String str) {
            try {
                L.this.m(this.f11533a, str);
            } catch (JSONException e7) {
                P0.a.H("InspectorPackagerConnection", "Couldn't send event to packager", e7);
            }
        }
    }

    private class b extends T5.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T5.z f11536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T5.H f11537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f11538d = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11540f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f11539e) {
                    return;
                }
                b.this.k();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.L$b$b, reason: collision with other inner class name */
        class AsyncTaskC0209b extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f11543a;

            AsyncTaskC0209b(JSONObject jSONObject) {
                this.f11543a = jSONObject;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(T5.H... hArr) {
                if (hArr != null && hArr.length != 0) {
                    try {
                        hArr[0].b(this.f11543a.toString());
                    } catch (Exception e7) {
                        P0.a.H("InspectorPackagerConnection", "Couldn't send event to packager", e7);
                    }
                }
                return null;
            }
        }

        public b(String str) {
            this.f11535a = str;
        }

        private void h(String str, Throwable th) {
            P0.a.k("InspectorPackagerConnection", "Error occurred, shutting down websocket connection: " + str, th);
            L.this.e();
            j();
        }

        private void j() {
            T5.H h7 = this.f11537c;
            if (h7 != null) {
                try {
                    h7.f(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f11537c = null;
            }
        }

        private void l() {
            if (this.f11539e) {
                throw new IllegalStateException("Can't reconnect closed client");
            }
            if (!this.f11540f) {
                P0.a.G("InspectorPackagerConnection", "Couldn't connect to packager, will silently retry");
                this.f11540f = true;
            }
            this.f11538d.postDelayed(new a(), 2000L);
        }

        @Override // T5.I
        public void a(T5.H h7, int i7, String str) {
            this.f11537c = null;
            L.this.e();
            if (this.f11539e) {
                return;
            }
            l();
        }

        @Override // T5.I
        public void c(T5.H h7, Throwable th, T5.D d7) {
            if (this.f11537c != null) {
                h("Websocket exception", th);
            }
            if (this.f11539e) {
                return;
            }
            l();
        }

        @Override // T5.I
        public void e(T5.H h7, String str) {
            try {
                L.this.i(new JSONObject(str));
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // T5.I
        public void f(T5.H h7, T5.D d7) {
            this.f11537c = h7;
        }

        public void i() {
            this.f11539e = true;
            T5.H h7 = this.f11537c;
            if (h7 != null) {
                try {
                    h7.f(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f11537c = null;
            }
        }

        public void k() {
            if (this.f11539e) {
                throw new IllegalStateException("Can't connect closed client");
            }
            if (this.f11536b == null) {
                z.a aVar = new z.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f11536b = aVar.e(10L, timeUnit).N(10L, timeUnit).M(0L, TimeUnit.MINUTES).b();
            }
            this.f11536b.C(new B.a().m(this.f11535a).b(), this);
        }

        public void m(JSONObject jSONObject) {
            new AsyncTaskC0209b(jSONObject).execute(this.f11537c);
        }
    }

    public L(String str, String str2) {
        this.f11530a = new b(str);
        this.f11532c = str2;
    }

    private JSONArray f() throws JSONException {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        for (Inspector.Page page : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(page.getId()));
            jSONObject.put("title", page.getTitle());
            jSONObject.put("app", this.f11532c);
            jSONObject.put("vm", page.getVM());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void g(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        if (((Inspector.LocalConnection) this.f11531b.remove(string)) != null) {
            throw new IllegalStateException("Already connected: " + string);
        }
        try {
            this.f11531b.put(string, Inspector.connect(Integer.parseInt(string), new a(string)));
        } catch (Exception e7) {
            P0.a.H("InspectorPackagerConnection", "Failed to open page: " + string, e7);
            l("disconnect", k(string));
        }
    }

    private void h(JSONObject jSONObject) throws JSONException {
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f11531b.remove(jSONObject.getString("pageId"));
        if (localConnection == null) {
            return;
        }
        localConnection.disconnect();
    }

    private void j(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f11531b.get(string);
        if (localConnection != null) {
            localConnection.sendMessage(string2);
            return;
        }
        P0.a.G("InspectorPackagerConnection", "PageID " + string + " is disconnected. Dropping event: " + string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject k(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        this.f11530a.m(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        l("wrappedEvent", jSONObject);
    }

    @Override // com.facebook.react.devsupport.K
    public void closeQuietly() {
        this.f11530a.i();
    }

    @Override // com.facebook.react.devsupport.K
    public void connect() {
        this.f11530a.k();
    }

    void e() {
        Iterator it = this.f11531b.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).disconnect();
        }
        this.f11531b.clear();
    }

    void i(JSONObject jSONObject) throws JSONException {
        String string;
        string = jSONObject.getString("event");
        string.hashCode();
        switch (string) {
            case "disconnect":
                h(jSONObject.getJSONObject("payload"));
                return;
            case "connect":
                g(jSONObject.getJSONObject("payload"));
                return;
            case "wrappedEvent":
                j(jSONObject.getJSONObject("payload"));
                return;
            case "getPages":
                l("getPages", f());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    @Override // com.facebook.react.devsupport.K
    public void sendEventToAllConnections(String str) {
        Iterator it = this.f11531b.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).sendMessage(str);
        }
    }
}
