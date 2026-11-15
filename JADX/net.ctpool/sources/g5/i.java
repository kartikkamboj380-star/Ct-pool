package g5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f19546b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f19547a;

    private i() {
        try {
            this.f19547a = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static i h() {
        return f19546b;
    }

    public boolean a(String str) {
        JSONObject jSONObject = this.f19547a;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.f19547a.names();
        for (int i7 = 0; i7 < jSONArrayNames.length(); i7++) {
            try {
                String string = jSONArrayNames.getString(i7);
                m.g(string, this.f19547a.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }

    public ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f19547a;
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public boolean d(String str, boolean z6) {
        JSONObject jSONObject = this.f19547a;
        return jSONObject == null ? z6 : jSONObject.optBoolean(str, z6);
    }

    public int e(String str, int i7) {
        JSONObject jSONObject = this.f19547a;
        return jSONObject == null ? i7 : jSONObject.optInt(str, i7);
    }

    public long f(String str, long j7) {
        JSONObject jSONObject = this.f19547a;
        return jSONObject == null ? j7 : jSONObject.optLong(str, j7);
    }

    public String g() {
        return "{}";
    }
}
