package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f17623a;

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f17624d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f17625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f17626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f17627c;

        private a(String str, String str2, long j7) {
            this.f17625a = str;
            this.f17626b = str2;
            this.f17627c = j7;
        }

        static String a(String str, String str2, long j7) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j7);
                return jSONObject.toString();
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f17627c + f17624d || !str.equals(this.f17626b);
        }
    }

    public d0(Context context) {
        this.f17623a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.b.h(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f17623a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String strB = b(str, str2);
        SharedPreferences.Editor editorEdit = this.f17623a.edit();
        editorEdit.remove(strB);
        editorEdit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f17623a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f17623a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f17623a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
