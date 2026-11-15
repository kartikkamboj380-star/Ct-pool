package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.q0;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
class n0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17694a;

    interface a {
        AbstractC2272l a(Intent intent);
    }

    n0(a aVar) {
        this.f17694a = aVar;
    }

    void c(final q0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f17694a.a(aVar.f17706a).b(new U.m(), new InterfaceC2266f() { // from class: com.google.firebase.messaging.m0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                aVar.d();
            }
        });
    }
}
