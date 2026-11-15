package h4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import e4.C1629g;
import h4.M;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public class L implements M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f19692g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f19693h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f19694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E4.e f19697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G f19698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private M.a f19699f;

    public L(Context context, String str, E4.e eVar, G g7) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f19695b = context;
        this.f19696c = str;
        this.f19697d = eVar;
        this.f19698e = g7;
        this.f19694a = new N();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        C1629g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f19692g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f19693h, "");
    }

    private boolean n() {
        M.a aVar = this.f19699f;
        return aVar == null || (aVar.e() == null && this.f19698e.d());
    }

    @Override // h4.M
    public synchronized M.a a() {
        M.a aVarB;
        if (!n()) {
            return this.f19699f;
        }
        C1629g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = AbstractC1721j.q(this.f19695b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        C1629g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f19698e.d()) {
            K kD = d(false);
            C1629g.f().i("Fetched Firebase Installation ID: " + kD.b());
            if (kD.b() == null) {
                kD = new K(string == null ? c() : string, null);
            }
            aVarB = Objects.equals(kD.b(), string) ? M.a.a(l(sharedPreferencesQ), kD) : M.a.a(b(kD.b(), sharedPreferencesQ), kD);
        } else {
            aVarB = k(string) ? M.a.b(l(sharedPreferencesQ)) : M.a.b(b(c(), sharedPreferencesQ));
        }
        this.f19699f = aVarB;
        C1629g.f().i("Install IDs: " + this.f19699f);
        return this.f19699f;
    }

    public K d(boolean z6) {
        String strB;
        i4.f.e();
        String str = null;
        if (z6) {
            try {
                strB = ((com.google.firebase.installations.g) AbstractC2275o.b(this.f19697d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e7) {
                C1629g.f().l("Error getting Firebase authentication token.", e7);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) AbstractC2275o.b(this.f19697d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e8) {
            C1629g.f().l("Error getting Firebase installation id.", e8);
        }
        return new K(str, strB);
    }

    public String f() {
        return this.f19696c;
    }

    public String g() {
        return this.f19694a.a(this.f19695b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
