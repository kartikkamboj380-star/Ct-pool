package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import n.C1890a;
import z3.AbstractC2272l;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f17581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17582b = new C1890a();

    interface a {
        AbstractC2272l start();
    }

    Y(Executor executor) {
        this.f17581a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC2272l c(String str, AbstractC2272l abstractC2272l) {
        synchronized (this) {
            this.f17582b.remove(str);
        }
        return abstractC2272l;
    }

    synchronized AbstractC2272l b(final String str, a aVar) {
        AbstractC2272l abstractC2272l = (AbstractC2272l) this.f17582b.get(str);
        if (abstractC2272l != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC2272l;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC2272l abstractC2272lJ = aVar.start().j(this.f17581a, new InterfaceC2263c() { // from class: com.google.firebase.messaging.X
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l2) {
                return this.f17579a.c(str, abstractC2272l2);
            }
        });
        this.f17582b.put(str, abstractC2272lJ);
        return abstractC2272lJ;
    }
}
