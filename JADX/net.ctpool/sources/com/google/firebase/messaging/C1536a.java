package com.google.firebase.messaging;

import x4.InterfaceC2225a;
import x4.InterfaceC2226b;
import z4.C2277a;

/* JADX INFO: renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1536a implements InterfaceC2225a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2225a f17584a = new C1536a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0236a implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0236a f17585a = new C0236a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f17586b = w4.c.a("projectNumber").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f17587c = w4.c.a("messageId").b(C2277a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w4.c f17588d = w4.c.a("instanceId").b(C2277a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final w4.c f17589e = w4.c.a("messageType").b(C2277a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final w4.c f17590f = w4.c.a("sdkPlatform").b(C2277a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final w4.c f17591g = w4.c.a("packageName").b(C2277a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final w4.c f17592h = w4.c.a("collapseKey").b(C2277a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final w4.c f17593i = w4.c.a("priority").b(C2277a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final w4.c f17594j = w4.c.a("ttl").b(C2277a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final w4.c f17595k = w4.c.a("topic").b(C2277a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final w4.c f17596l = w4.c.a("bulkId").b(C2277a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final w4.c f17597m = w4.c.a("event").b(C2277a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final w4.c f17598n = w4.c.a("analyticsLabel").b(C2277a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final w4.c f17599o = w4.c.a("campaignId").b(C2277a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final w4.c f17600p = w4.c.a("composerLabel").b(C2277a.b().c(15).a()).a();

        private C0236a() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(J4.a aVar, w4.e eVar) {
            eVar.d(f17586b, aVar.l());
            eVar.a(f17587c, aVar.h());
            eVar.a(f17588d, aVar.g());
            eVar.a(f17589e, aVar.i());
            eVar.a(f17590f, aVar.m());
            eVar.a(f17591g, aVar.j());
            eVar.a(f17592h, aVar.d());
            eVar.b(f17593i, aVar.k());
            eVar.b(f17594j, aVar.o());
            eVar.a(f17595k, aVar.n());
            eVar.d(f17596l, aVar.b());
            eVar.a(f17597m, aVar.f());
            eVar.a(f17598n, aVar.a());
            eVar.d(f17599o, aVar.c());
            eVar.a(f17600p, aVar.e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f17601a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f17602b = w4.c.a("messagingClientEvent").b(C2277a.b().c(1).a()).a();

        private b() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(J4.b bVar, w4.e eVar) {
            eVar.a(f17602b, bVar.a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f17603a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f17604b = w4.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // w4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            androidx.appcompat.app.y.a(obj);
            b(null, (w4.e) obj2);
        }

        public void b(N n7, w4.e eVar) {
            throw null;
        }
    }

    private C1536a() {
    }

    @Override // x4.InterfaceC2225a
    public void a(InterfaceC2226b interfaceC2226b) {
        interfaceC2226b.a(N.class, c.f17603a);
        interfaceC2226b.a(J4.b.class, b.f17601a);
        interfaceC2226b.a(J4.a.class, C0236a.f17585a);
    }
}
