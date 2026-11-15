package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17489b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f17490c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f17491d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H4.a f17492a;

    private i(H4.a aVar) {
        this.f17492a = aVar;
    }

    public static i c() {
        return d(H4.b.a());
    }

    public static i d(H4.a aVar) {
        if (f17491d == null) {
            f17491d = new i(aVar);
        }
        return f17491d;
    }

    static boolean g(String str) {
        return f17490c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f17492a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(F4.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f17489b;
    }
}
