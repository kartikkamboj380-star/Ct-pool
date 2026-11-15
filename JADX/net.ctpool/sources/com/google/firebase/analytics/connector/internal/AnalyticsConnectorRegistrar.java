package com.google.firebase.analytics.connector.internal;

import L4.h;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<C0688c> getComponents() {
        return Arrays.asList(C0688c.e(Z3.a.class).b(C0702q.l(Y3.f.class)).b(C0702q.l(Context.class)).b(C0702q.l(A4.d.class)).f(new InterfaceC0692g() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return Z3.b.d((Y3.f) interfaceC0689d.a(Y3.f.class), (Context) interfaceC0689d.a(Context.class), (A4.d) interfaceC0689d.a(A4.d.class));
            }
        }).e().d(), h.b("fire-analytics", "22.1.2"));
    }
}
