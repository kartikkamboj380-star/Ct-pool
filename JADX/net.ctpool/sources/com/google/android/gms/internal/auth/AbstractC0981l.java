package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0981l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap f13993f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f13998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static boolean f13999l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f13988a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f13989b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13990c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13991d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f13992e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f13994g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap f13995h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f13996i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap f13997j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f14000m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC0981l.class) {
            try {
                String str3 = null;
                if (f13993f == null) {
                    f13992e.set(false);
                    f13993f = new HashMap(16, 1.0f);
                    f13998k = new Object();
                    f13999l = false;
                    contentResolver.registerContentObserver(f13988a, true, new C0978k(null));
                } else if (f13992e.getAndSet(false)) {
                    f13993f.clear();
                    f13994g.clear();
                    f13995h.clear();
                    f13996i.clear();
                    f13997j.clear();
                    f13998k = new Object();
                    f13999l = false;
                }
                Object obj = f13998k;
                if (f13993f.containsKey(str)) {
                    String str4 = (String) f13993f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f14000m.length;
                Cursor cursorQuery = contentResolver.query(f13988a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                    cursorQuery.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC0981l.class) {
            try {
                if (obj == f13998k) {
                    f13993f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
