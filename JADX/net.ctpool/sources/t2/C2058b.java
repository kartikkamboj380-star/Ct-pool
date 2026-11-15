package t2;

import android.net.Uri;
import app.notifee.core.event.LogEvent;
import i6.i;
import java.util.Map;
import org.json.JSONObject;
import q2.AbstractC1988a;
import t2.C2061e;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2058b implements C2061e.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22297c = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2061e f22298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f22299b;

    /* JADX INFO: renamed from: t2.b$a */
    private class a implements InterfaceC2064h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f22300a;

        public a(Object obj) {
            this.f22300a = obj;
        }

        @Override // t2.InterfaceC2064h
        public void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f22300a);
                jSONObject.put("result", obj);
                C2058b.this.f22298a.n(jSONObject.toString());
            } catch (Exception e7) {
                P0.a.k(C2058b.f22297c, "Responding failed", e7);
            }
        }

        @Override // t2.InterfaceC2064h
        public void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f22300a);
                jSONObject.put(LogEvent.LEVEL_ERROR, obj);
                C2058b.this.f22298a.n(jSONObject.toString());
            } catch (Exception e7) {
                P0.a.k(C2058b.f22297c, "Responding with error failed", e7);
            }
        }
    }

    public C2058b(String str, C2060d c2060d, Map map, C2061e.b bVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(c2060d.a()).appendPath("message").appendQueryParameter("device", AbstractC1988a.d()).appendQueryParameter("app", c2060d.b()).appendQueryParameter("clientid", str);
        this.f22298a = new C2061e(builder.build().toString(), this, bVar);
        this.f22299b = map;
    }

    private void d(Object obj, String str) {
        if (obj != null) {
            new a(obj).b(str);
        }
        P0.a.j(f22297c, "Handling the message failed with reason: " + str);
    }

    @Override // t2.C2061e.c
    public void a(i iVar) {
        P0.a.G(f22297c, "Websocket received message with payload of unexpected type binary");
    }

    public void e() {
        this.f22298a.i();
    }

    public void f() {
        this.f22298a.k();
    }

    @Override // t2.C2061e.c
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                P0.a.j(f22297c, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                d(objOpt, "No method provided");
                return;
            }
            InterfaceC2062f interfaceC2062f = (InterfaceC2062f) this.f22299b.get(strOptString);
            if (interfaceC2062f == null) {
                d(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                interfaceC2062f.a(objOpt2);
            } else {
                interfaceC2062f.b(objOpt2, new a(objOpt));
            }
        } catch (Exception e7) {
            P0.a.k(f22297c, "Handling the message failed", e7);
        }
    }
}
