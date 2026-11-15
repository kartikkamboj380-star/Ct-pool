package U2;

import androidx.appcompat.app.y;
import x4.InterfaceC2225a;
import x4.InterfaceC2226b;
import z4.C2277a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC2225a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2225a f3742a = new a();

    /* JADX INFO: renamed from: U2.a$a, reason: collision with other inner class name */
    private static final class C0084a implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0084a f3743a = new C0084a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3744b = w4.c.a("window").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f3745c = w4.c.a("logSourceMetrics").b(C2277a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w4.c f3746d = w4.c.a("globalMetrics").b(C2277a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final w4.c f3747e = w4.c.a("appNamespace").b(C2277a.b().c(4).a()).a();

        private C0084a() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.a aVar, w4.e eVar) {
            eVar.a(f3744b, aVar.d());
            eVar.a(f3745c, aVar.c());
            eVar.a(f3746d, aVar.b());
            eVar.a(f3747e, aVar.a());
        }
    }

    private static final class b implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f3748a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3749b = w4.c.a("storageMetrics").b(C2277a.b().c(1).a()).a();

        private b() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.b bVar, w4.e eVar) {
            eVar.a(f3749b, bVar.a());
        }
    }

    private static final class c implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f3750a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3751b = w4.c.a("eventsDroppedCount").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f3752c = w4.c.a("reason").b(C2277a.b().c(3).a()).a();

        private c() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.c cVar, w4.e eVar) {
            eVar.d(f3751b, cVar.a());
            eVar.a(f3752c, cVar.b());
        }
    }

    private static final class d implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f3753a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3754b = w4.c.a("logSource").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f3755c = w4.c.a("logEventDropped").b(C2277a.b().c(2).a()).a();

        private d() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.d dVar, w4.e eVar) {
            eVar.a(f3754b, dVar.b());
            eVar.a(f3755c, dVar.a());
        }
    }

    private static final class e implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f3756a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3757b = w4.c.d("clientMetrics");

        private e() {
        }

        @Override // w4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            y.a(obj);
            b(null, (w4.e) obj2);
        }

        public void b(m mVar, w4.e eVar) {
            throw null;
        }
    }

    private static final class f implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f3758a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3759b = w4.c.a("currentCacheSizeBytes").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f3760c = w4.c.a("maxCacheSizeBytes").b(C2277a.b().c(2).a()).a();

        private f() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.e eVar, w4.e eVar2) {
            eVar2.d(f3759b, eVar.a());
            eVar2.d(f3760c, eVar.b());
        }
    }

    private static final class g implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f3761a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f3762b = w4.c.a("startMs").b(C2277a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f3763c = w4.c.a("endMs").b(C2277a.b().c(2).a()).a();

        private g() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X2.f fVar, w4.e eVar) {
            eVar.d(f3762b, fVar.b());
            eVar.d(f3763c, fVar.a());
        }
    }

    private a() {
    }

    @Override // x4.InterfaceC2225a
    public void a(InterfaceC2226b interfaceC2226b) {
        interfaceC2226b.a(m.class, e.f3756a);
        interfaceC2226b.a(X2.a.class, C0084a.f3743a);
        interfaceC2226b.a(X2.f.class, g.f3761a);
        interfaceC2226b.a(X2.d.class, d.f3753a);
        interfaceC2226b.a(X2.c.class, c.f3750a);
        interfaceC2226b.a(X2.b.class, b.f3748a);
        interfaceC2226b.a(X2.e.class, f.f3758a);
    }
}
