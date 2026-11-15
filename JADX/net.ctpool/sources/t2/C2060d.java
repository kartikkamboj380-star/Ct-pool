package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import q2.AbstractC1988a;

/* JADX INFO: renamed from: t2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2060d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22302d = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f22305c;

    public C2060d(Context context) {
        this.f22303a = PreferenceManager.getDefaultSharedPreferences(context);
        this.f22304b = context.getPackageName();
        this.f22305c = context;
    }

    public String a() {
        String string = this.f22303a.getString("debug_http_host", null);
        if (!TextUtils.isEmpty(string)) {
            return (String) O1.a.c(string);
        }
        String strF = AbstractC1988a.f(this.f22305c);
        if (strF.equals("localhost")) {
            P0.a.G(f22302d, "You seem to be running on device. Run '" + AbstractC1988a.a(this.f22305c) + "' to forward the debug server's port to the device.");
        }
        return strF;
    }

    public String b() {
        return this.f22304b;
    }

    public void c(String str) {
        this.f22303a.edit().putString("debug_http_host", str).apply();
    }
}
