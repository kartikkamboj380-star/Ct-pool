package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.V;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q() {
        g5.g.i().o(q.c());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(V v6) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        g5.g.i().o(q.b(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String str) {
        g5.g.i().o(q.d(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void u(String str, Exception exc) {
        g5.g.i().o(q.a(str, exc));
    }
}
