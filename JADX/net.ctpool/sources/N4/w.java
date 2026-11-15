package N4;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f2410a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f2412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f2413d;

    static {
        String strEncodeToString = Base64.encodeToString(F5.g.m(v.f2409a.e()), 10);
        f2411b = strEncodeToString;
        f2412c = "firebase_session_" + strEncodeToString + "_data";
        f2413d = "firebase_session_" + strEncodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f2412c;
    }

    public final String b() {
        return f2413d;
    }
}
