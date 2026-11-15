package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.firebase.components.ComponentRegistrar;
import e4.C1628f;
import e4.InterfaceC1623a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1623a b(InterfaceC0689d interfaceC0689d) {
        return c.f((Context) interfaceC0689d.a(Context.class), !C1628f.g(r2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0688c.e(InterfaceC1623a.class).h("fire-cls-ndk").b(C0702q.l(Context.class)).f(new InterfaceC0692g() { // from class: r4.a
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return this.f22137a.b(interfaceC0689d);
            }
        }).e().d(), L4.h.b("fire-cls-ndk", "19.2.1"));
    }
}
