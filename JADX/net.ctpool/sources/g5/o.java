package g5;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static o f19552b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f19553a;

    private SharedPreferences a() {
        if (this.f19553a == null) {
            this.f19553a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f19553a;
    }

    public static o b() {
        return f19552b;
    }

    public String c(String str, String str2) {
        return a().getString(str, str2);
    }

    public SharedPreferences.Editor d(String str) {
        return a().edit().remove(str);
    }

    public void e(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
