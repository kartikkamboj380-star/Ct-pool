package p4;

import h4.F;
import org.json.JSONObject;
import p4.C1973d;

/* JADX INFO: loaded from: classes.dex */
class m implements i {
    m() {
    }

    private static C1973d.a b(JSONObject jSONObject) {
        return new C1973d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static C1973d.b c(JSONObject jSONObject) {
        return new C1973d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(F f7, long j7, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : f7.a() + (j7 * 1000);
    }

    @Override // p4.i
    public C1973d a(F f7, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C1973d(d(f7, iOptInt2, jSONObject), c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
