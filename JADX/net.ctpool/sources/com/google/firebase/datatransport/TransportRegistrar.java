package com.google.firebase.datatransport;

import L4.h;
import S2.j;
import U2.u;
import android.content.Context;
import androidx.annotation.Keep;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import s4.InterfaceC2047a;
import s4.InterfaceC2048b;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$0(InterfaceC0689d interfaceC0689d) {
        u.f((Context) interfaceC0689d.a(Context.class));
        return u.c().g(a.f13456h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$1(InterfaceC0689d interfaceC0689d) {
        u.f((Context) interfaceC0689d.a(Context.class));
        return u.c().g(a.f13456h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$2(InterfaceC0689d interfaceC0689d) {
        u.f((Context) interfaceC0689d.a(Context.class));
        return u.c().g(a.f13455g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        return Arrays.asList(C0688c.e(j.class).h(LIBRARY_NAME).b(C0702q.l(Context.class)).f(new InterfaceC0692g() { // from class: s4.c
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return TransportRegistrar.lambda$getComponents$0(interfaceC0689d);
            }
        }).d(), C0688c.c(C0684E.a(InterfaceC2047a.class, j.class)).b(C0702q.l(Context.class)).f(new InterfaceC0692g() { // from class: s4.d
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return TransportRegistrar.lambda$getComponents$1(interfaceC0689d);
            }
        }).d(), C0688c.c(C0684E.a(InterfaceC2048b.class, j.class)).b(C0702q.l(Context.class)).f(new InterfaceC0692g() { // from class: s4.e
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return TransportRegistrar.lambda$getComponents$2(interfaceC0689d);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
