package f4;

import android.os.Bundle;
import e4.C1629g;
import g4.InterfaceC1694a;
import g4.InterfaceC1695b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: f4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1653d implements InterfaceC1651b, InterfaceC1695b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1694a f19305a;

    private static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // g4.InterfaceC1695b
    public void a(InterfaceC1694a interfaceC1694a) {
        this.f19305a = interfaceC1694a;
        C1629g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // f4.InterfaceC1651b
    public void b(String str, Bundle bundle) {
        InterfaceC1694a interfaceC1694a = this.f19305a;
        if (interfaceC1694a != null) {
            try {
                interfaceC1694a.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                C1629g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
