package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import n3.C1908a;
import n3.C1910c;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC1544i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Queue f17523s = new ArrayDeque(10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1910c f17524r;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f17523s;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (M.t(extras)) {
            M m7 = new M(extras);
            ExecutorService executorServiceE = AbstractC1550o.e();
            try {
                if (new C1541f(this, m7, executorServiceE).a()) {
                    return;
                }
                if (K.E(intent)) {
                    K.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        r(new V(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C1910c o(Context context) {
        if (this.f17524r == null) {
            this.f17524r = new C1910c(context.getApplicationContext());
        }
        return this.f17524r;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new C1908a(intent));
    }

    private void v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                q();
                break;
            case "gcm":
                K.y(intent);
                m(intent);
                break;
            case "send_error":
                u(n(intent), new Z(intent.getStringExtra(LogEvent.LEVEL_ERROR)));
                break;
            case "send_event":
                s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1544i
    protected Intent e(Intent intent) {
        return a0.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1544i
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void q() {
    }

    public void r(V v6) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }
}
