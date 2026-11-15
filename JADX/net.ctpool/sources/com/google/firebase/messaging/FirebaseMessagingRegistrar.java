package com.google.firebase.messaging;

import androidx.annotation.Keep;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s4.InterfaceC2048b;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C0684E c0684e, InterfaceC0689d interfaceC0689d) {
        Y3.f fVar = (Y3.f) interfaceC0689d.a(Y3.f.class);
        androidx.appcompat.app.y.a(interfaceC0689d.a(C4.a.class));
        return new FirebaseMessaging(fVar, null, interfaceC0689d.b(L4.i.class), interfaceC0689d.b(B4.j.class), (E4.e) interfaceC0689d.a(E4.e.class), interfaceC0689d.f(c0684e), (A4.d) interfaceC0689d.a(A4.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0688c> getComponents() {
        final C0684E c0684eA = C0684E.a(InterfaceC2048b.class, S2.j.class);
        return Arrays.asList(C0688c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(C0702q.l(Y3.f.class)).b(C0702q.h(C4.a.class)).b(C0702q.j(L4.i.class)).b(C0702q.j(B4.j.class)).b(C0702q.l(E4.e.class)).b(C0702q.i(c0684eA)).b(C0702q.l(A4.d.class)).f(new InterfaceC0692g() { // from class: com.google.firebase.messaging.E
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(c0684eA, interfaceC0689d);
            }
        }).c().d(), L4.h.b(LIBRARY_NAME, "24.0.3"));
    }
}
