package com.google.firebase.dynamiclinks.internal;

import L4.h;
import Y3.f;
import Z3.a;
import androidx.annotation.Keep;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import java.util.Arrays;
import java.util.List;
import t4.AbstractC2067b;
import u4.C2141g;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2067b lambda$getComponents$0(InterfaceC0689d interfaceC0689d) {
        return new C2141g((f) interfaceC0689d.a(f.class), interfaceC0689d.b(a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0688c> getComponents() {
        return Arrays.asList(C0688c.e(AbstractC2067b.class).h(LIBRARY_NAME).b(C0702q.l(f.class)).b(C0702q.j(a.class)).f(new InterfaceC0692g() { // from class: u4.f
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(interfaceC0689d);
            }
        }).d(), h.b(LIBRARY_NAME, "22.1.0"));
    }
}
