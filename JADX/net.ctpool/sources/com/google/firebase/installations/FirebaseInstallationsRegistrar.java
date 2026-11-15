package com.google.firebase.installations;

import a4.InterfaceC0514a;
import a4.InterfaceC0515b;
import androidx.annotation.Keep;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import c4.j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ E4.e lambda$getComponents$0(InterfaceC0689d interfaceC0689d) {
        return new c((Y3.f) interfaceC0689d.a(Y3.f.class), interfaceC0689d.b(B4.i.class), (ExecutorService) interfaceC0689d.e(C0684E.a(InterfaceC0514a.class, ExecutorService.class)), j.a((Executor) interfaceC0689d.e(C0684E.a(InterfaceC0515b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        return Arrays.asList(C0688c.e(E4.e.class).h(LIBRARY_NAME).b(C0702q.l(Y3.f.class)).b(C0702q.j(B4.i.class)).b(C0702q.k(C0684E.a(InterfaceC0514a.class, ExecutorService.class))).b(C0702q.k(C0684E.a(InterfaceC0515b.class, Executor.class))).f(new InterfaceC0692g() { // from class: E4.f
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC0689d);
            }
        }).d(), B4.h.a(), L4.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
