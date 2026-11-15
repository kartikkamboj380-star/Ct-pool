package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17615c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f17617e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f17616d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17618f = false;

    private c0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f17613a = sharedPreferences;
        this.f17614b = str;
        this.f17615c = str2;
        this.f17617e = executor;
    }

    private boolean c(boolean z6) {
        if (z6 && !this.f17618f) {
            j();
        }
        return z6;
    }

    static c0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        c0 c0Var = new c0(sharedPreferences, str, str2, executor);
        c0Var.e();
        return c0Var;
    }

    private void e() {
        synchronized (this.f17616d) {
            try {
                this.f17616d.clear();
                String string = this.f17613a.getString(this.f17614b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f17615c)) {
                    String[] strArrSplit = string.split(this.f17615c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f17616d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f17616d) {
            this.f17613a.edit().putString(this.f17614b, h()).commit();
        }
    }

    private void j() {
        this.f17617e.execute(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17612m.i();
            }
        });
    }

    public boolean b(String str) {
        boolean zC;
        if (TextUtils.isEmpty(str) || str.contains(this.f17615c)) {
            return false;
        }
        synchronized (this.f17616d) {
            zC = c(this.f17616d.add(str));
        }
        return zC;
    }

    public String f() {
        String str;
        synchronized (this.f17616d) {
            str = (String) this.f17616d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f17616d) {
            zC = c(this.f17616d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f17616d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f17615c);
        }
        return sb.toString();
    }
}
