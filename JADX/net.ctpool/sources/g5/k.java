package g5;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f19549b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f19550a;

    private SharedPreferences e() {
        if (this.f19550a == null) {
            this.f19550a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f19550a;
    }

    public static k f() {
        return f19549b;
    }

    public void a() {
        e().edit().clear().apply();
    }

    public boolean b(String str) {
        return e().contains(str);
    }

    public WritableMap c() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : e().getAll().entrySet()) {
            m.g(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public boolean d(String str, boolean z6) {
        return e().getBoolean(str, z6);
    }

    public void g(String str, boolean z6) {
        e().edit().putBoolean(str, z6).apply();
    }

    public void h(String str, String str2) {
        e().edit().putString(str, str2).apply();
    }
}
