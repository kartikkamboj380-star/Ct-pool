package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f17637d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17640c;

    private f0(String str, String str2) {
        this.f17638a = d(str2, str);
        this.f17639b = str;
        this.f17640c = str + "!" + str2;
    }

    static f0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new f0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f17637d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static f0 f(String str) {
        return new f0("S", str);
    }

    public static f0 g(String str) {
        return new f0("U", str);
    }

    public String b() {
        return this.f17639b;
    }

    public String c() {
        return this.f17638a;
    }

    public String e() {
        return this.f17640c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f17638a.equals(f0Var.f17638a) && this.f17639b.equals(f0Var.f17639b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f17639b, this.f17638a);
    }
}
