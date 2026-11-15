package com.google.firebase.crashlytics;

import E4.e;
import L4.h;
import O4.a;
import O4.b;
import a4.InterfaceC0514a;
import a4.InterfaceC0515b;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.firebase.components.ComponentRegistrar;
import e4.C1629g;
import e4.InterfaceC1623a;
import i4.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0684E f17419a = C0684E.a(InterfaceC0514a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0684E f17420b = C0684E.a(InterfaceC0515b.class, ExecutorService.class);

    static {
        a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(InterfaceC0689d interfaceC0689d) {
        f.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsB = FirebaseCrashlytics.b((Y3.f) interfaceC0689d.a(Y3.f.class), (e) interfaceC0689d.a(e.class), interfaceC0689d.i(InterfaceC1623a.class), interfaceC0689d.i(Z3.a.class), interfaceC0689d.i(M4.a.class), (ExecutorService) interfaceC0689d.e(this.f17419a), (ExecutorService) interfaceC0689d.e(this.f17420b));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            C1629g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsB;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0688c.e(FirebaseCrashlytics.class).h("fire-cls").b(C0702q.l(Y3.f.class)).b(C0702q.l(e.class)).b(C0702q.k(this.f17419a)).b(C0702q.k(this.f17420b)).b(C0702q.a(InterfaceC1623a.class)).b(C0702q.a(Z3.a.class)).b(C0702q.a(M4.a.class)).f(new InterfaceC0692g() { // from class: d4.f
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return this.f18681a.b(interfaceC0689d);
            }
        }).e().d(), h.b("fire-cls", "19.2.1"));
    }
}
