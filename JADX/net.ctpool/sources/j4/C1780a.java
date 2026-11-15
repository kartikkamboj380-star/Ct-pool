package j4;

import x4.InterfaceC2225a;
import x4.InterfaceC2226b;

/* JADX INFO: renamed from: j4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1780a implements InterfaceC2225a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2225a f20343a = new C1780a();

    /* JADX INFO: renamed from: j4.a$a, reason: collision with other inner class name */
    private static final class C0272a implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0272a f20344a = new C0272a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final w4.c f20345b = w4.c.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final w4.c f20346c = w4.c.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w4.c f20347d = w4.c.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final w4.c f20348e = w4.c.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final w4.c f20349f = w4.c.d("templateVersion");

        private C0272a() {
        }

        @Override // w4.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, w4.e eVar) {
            eVar.a(f20345b, iVar.e());
            eVar.a(f20346c, iVar.c());
            eVar.a(f20347d, iVar.d());
            eVar.a(f20348e, iVar.g());
            eVar.d(f20349f, iVar.f());
        }
    }

    private C1780a() {
    }

    @Override // x4.InterfaceC2225a
    public void a(InterfaceC2226b interfaceC2226b) {
        C0272a c0272a = C0272a.f20344a;
        interfaceC2226b.a(i.class, c0272a);
        interfaceC2226b.a(C1781b.class, c0272a);
    }
}
