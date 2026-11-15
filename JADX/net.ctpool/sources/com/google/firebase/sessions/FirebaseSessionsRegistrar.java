package com.google.firebase.sessions;

import E4.e;
import H5.F;
import L4.h;
import N4.B;
import N4.C0445g;
import N4.G;
import N4.J;
import N4.x;
import S2.j;
import Y3.f;
import a4.InterfaceC0514a;
import a4.InterfaceC0515b;
import android.content.Context;
import androidx.annotation.Keep;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import j5.AbstractC1809n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1888g;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C0684E backgroundDispatcher;
    private static final C0684E blockingDispatcher;
    private static final C0684E firebaseApp;
    private static final C0684E firebaseInstallationsApi;
    private static final C0684E sessionLifecycleServiceBinder;
    private static final C0684E sessionsSettings;
    private static final C0684E transportFactory;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C0684E c0684eB = C0684E.b(f.class);
        k.e(c0684eB, "unqualified(FirebaseApp::class.java)");
        firebaseApp = c0684eB;
        C0684E c0684eB2 = C0684E.b(e.class);
        k.e(c0684eB2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = c0684eB2;
        C0684E c0684eA = C0684E.a(InterfaceC0514a.class, F.class);
        k.e(c0684eA, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = c0684eA;
        C0684E c0684eA2 = C0684E.a(InterfaceC0515b.class, F.class);
        k.e(c0684eA2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = c0684eA2;
        C0684E c0684eB3 = C0684E.b(j.class);
        k.e(c0684eB3, "unqualified(TransportFactory::class.java)");
        transportFactory = c0684eB3;
        C0684E c0684eB4 = C0684E.b(P4.f.class);
        k.e(c0684eB4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = c0684eB4;
        C0684E c0684eB5 = C0684E.b(N4.F.class);
        k.e(c0684eB5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = c0684eB5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N4.k getComponents$lambda$0(InterfaceC0689d interfaceC0689d) {
        Object objE = interfaceC0689d.e(firebaseApp);
        k.e(objE, "container[firebaseApp]");
        Object objE2 = interfaceC0689d.e(sessionsSettings);
        k.e(objE2, "container[sessionsSettings]");
        Object objE3 = interfaceC0689d.e(backgroundDispatcher);
        k.e(objE3, "container[backgroundDispatcher]");
        Object objE4 = interfaceC0689d.e(sessionLifecycleServiceBinder);
        k.e(objE4, "container[sessionLifecycleServiceBinder]");
        return new N4.k((f) objE, (P4.f) objE2, (InterfaceC1888g) objE3, (N4.F) objE4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(InterfaceC0689d interfaceC0689d) {
        return new c(J.f2317a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(InterfaceC0689d interfaceC0689d) {
        Object objE = interfaceC0689d.e(firebaseApp);
        k.e(objE, "container[firebaseApp]");
        f fVar = (f) objE;
        Object objE2 = interfaceC0689d.e(firebaseInstallationsApi);
        k.e(objE2, "container[firebaseInstallationsApi]");
        e eVar = (e) objE2;
        Object objE3 = interfaceC0689d.e(sessionsSettings);
        k.e(objE3, "container[sessionsSettings]");
        P4.f fVar2 = (P4.f) objE3;
        D4.b bVarF = interfaceC0689d.f(transportFactory);
        k.e(bVarF, "container.getProvider(transportFactory)");
        C0445g c0445g = new C0445g(bVarF);
        Object objE4 = interfaceC0689d.e(backgroundDispatcher);
        k.e(objE4, "container[backgroundDispatcher]");
        return new B(fVar, eVar, fVar2, c0445g, (InterfaceC1888g) objE4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P4.f getComponents$lambda$3(InterfaceC0689d interfaceC0689d) {
        Object objE = interfaceC0689d.e(firebaseApp);
        k.e(objE, "container[firebaseApp]");
        Object objE2 = interfaceC0689d.e(blockingDispatcher);
        k.e(objE2, "container[blockingDispatcher]");
        Object objE3 = interfaceC0689d.e(backgroundDispatcher);
        k.e(objE3, "container[backgroundDispatcher]");
        Object objE4 = interfaceC0689d.e(firebaseInstallationsApi);
        k.e(objE4, "container[firebaseInstallationsApi]");
        return new P4.f((f) objE, (InterfaceC1888g) objE2, (InterfaceC1888g) objE3, (e) objE4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(InterfaceC0689d interfaceC0689d) {
        Context contextM = ((f) interfaceC0689d.e(firebaseApp)).m();
        k.e(contextM, "container[firebaseApp].applicationContext");
        Object objE = interfaceC0689d.e(backgroundDispatcher);
        k.e(objE, "container[backgroundDispatcher]");
        return new x(contextM, (InterfaceC1888g) objE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N4.F getComponents$lambda$5(InterfaceC0689d interfaceC0689d) {
        Object objE = interfaceC0689d.e(firebaseApp);
        k.e(objE, "container[firebaseApp]");
        return new G((f) objE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        C0688c.b bVarH = C0688c.e(N4.k.class).h(LIBRARY_NAME);
        C0684E c0684e = firebaseApp;
        C0688c.b bVarB = bVarH.b(C0702q.k(c0684e));
        C0684E c0684e2 = sessionsSettings;
        C0688c.b bVarB2 = bVarB.b(C0702q.k(c0684e2));
        C0684E c0684e3 = backgroundDispatcher;
        C0688c c0688cD = bVarB2.b(C0702q.k(c0684e3)).b(C0702q.k(sessionLifecycleServiceBinder)).f(new InterfaceC0692g() { // from class: N4.m
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC0689d);
            }
        }).e().d();
        C0688c c0688cD2 = C0688c.e(c.class).h("session-generator").f(new InterfaceC0692g() { // from class: N4.n
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC0689d);
            }
        }).d();
        C0688c.b bVarB3 = C0688c.e(b.class).h("session-publisher").b(C0702q.k(c0684e));
        C0684E c0684e4 = firebaseInstallationsApi;
        return AbstractC1809n.k(c0688cD, c0688cD2, bVarB3.b(C0702q.k(c0684e4)).b(C0702q.k(c0684e2)).b(C0702q.m(transportFactory)).b(C0702q.k(c0684e3)).f(new InterfaceC0692g() { // from class: N4.o
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(interfaceC0689d);
            }
        }).d(), C0688c.e(P4.f.class).h("sessions-settings").b(C0702q.k(c0684e)).b(C0702q.k(blockingDispatcher)).b(C0702q.k(c0684e3)).b(C0702q.k(c0684e4)).f(new InterfaceC0692g() { // from class: N4.p
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(interfaceC0689d);
            }
        }).d(), C0688c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(C0702q.k(c0684e)).b(C0702q.k(c0684e3)).f(new InterfaceC0692g() { // from class: N4.q
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(interfaceC0689d);
            }
        }).d(), C0688c.e(N4.F.class).h("sessions-service-binder").b(C0702q.k(c0684e)).f(new InterfaceC0692g() { // from class: N4.r
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(interfaceC0689d);
            }
        }).d(), h.b(LIBRARY_NAME, "2.0.6"));
    }
}
