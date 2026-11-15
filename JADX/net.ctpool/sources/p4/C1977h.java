package p4;

import e4.C1629g;
import h4.F;
import org.json.JSONObject;

/* JADX INFO: renamed from: p4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1977h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f21647a;

    C1977h(F f7) {
        this.f21647a = f7;
    }

    private static i a(int i7) {
        if (i7 == 3) {
            return new m();
        }
        C1629g.f().d("Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.");
        return new C1971b();
    }

    public C1973d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f21647a, jSONObject);
    }
}
