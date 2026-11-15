package com.google.firebase.concurrent;

import a4.InterfaceC0514a;
import a4.InterfaceC0515b;
import a4.InterfaceC0516c;
import a4.InterfaceC0517d;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import b4.C0684E;
import b4.C0688c;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import b4.w;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w f17366a = new w(new D4.b() { // from class: c4.b
        @Override // D4.b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f17367b = new w(new D4.b() { // from class: c4.c
        @Override // D4.b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w f17368c = new w(new D4.b() { // from class: c4.d
        @Override // D4.b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w f17369d = new w(new D4.b() { // from class: c4.e
        @Override // D4.b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i7) {
        return new b(str, i7, null);
    }

    private static ThreadFactory k(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i7, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(InterfaceC0689d interfaceC0689d) {
        return (ScheduledExecutorService) f17366a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(InterfaceC0689d interfaceC0689d) {
        return (ScheduledExecutorService) f17368c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(InterfaceC0689d interfaceC0689d) {
        return (ScheduledExecutorService) f17367b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(InterfaceC0689d interfaceC0689d) {
        return c4.l.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f17369d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0688c.d(C0684E.a(InterfaceC0514a.class, ScheduledExecutorService.class), C0684E.a(InterfaceC0514a.class, ExecutorService.class), C0684E.a(InterfaceC0514a.class, Executor.class)).f(new InterfaceC0692g() { // from class: c4.f
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return ExecutorsRegistrar.l(interfaceC0689d);
            }
        }).d(), C0688c.d(C0684E.a(InterfaceC0515b.class, ScheduledExecutorService.class), C0684E.a(InterfaceC0515b.class, ExecutorService.class), C0684E.a(InterfaceC0515b.class, Executor.class)).f(new InterfaceC0692g() { // from class: c4.g
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return ExecutorsRegistrar.m(interfaceC0689d);
            }
        }).d(), C0688c.d(C0684E.a(InterfaceC0516c.class, ScheduledExecutorService.class), C0684E.a(InterfaceC0516c.class, ExecutorService.class), C0684E.a(InterfaceC0516c.class, Executor.class)).f(new InterfaceC0692g() { // from class: c4.h
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return ExecutorsRegistrar.n(interfaceC0689d);
            }
        }).d(), C0688c.c(C0684E.a(InterfaceC0517d.class, Executor.class)).f(new InterfaceC0692g() { // from class: c4.i
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return ExecutorsRegistrar.o(interfaceC0689d);
            }
        }).d());
    }
}
