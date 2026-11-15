package b4;

import D4.a;

/* JADX INFO: renamed from: b4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0682C implements D4.b, D4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0014a f9653c = new a.InterfaceC0014a() { // from class: b4.z
        @Override // D4.a.InterfaceC0014a
        public final void a(D4.b bVar) {
            C0682C.f(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D4.b f9654d = new D4.b() { // from class: b4.A
        @Override // D4.b
        public final Object get() {
            return C0682C.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.InterfaceC0014a f9655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile D4.b f9656b;

    private C0682C(a.InterfaceC0014a interfaceC0014a, D4.b bVar) {
        this.f9655a = interfaceC0014a;
        this.f9656b = bVar;
    }

    static C0682C e() {
        return new C0682C(f9653c, f9654d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0014a interfaceC0014a, a.InterfaceC0014a interfaceC0014a2, D4.b bVar) {
        interfaceC0014a.a(bVar);
        interfaceC0014a2.a(bVar);
    }

    static C0682C i(D4.b bVar) {
        return new C0682C(null, bVar);
    }

    @Override // D4.a
    public void a(final a.InterfaceC0014a interfaceC0014a) {
        D4.b bVar;
        D4.b bVar2;
        D4.b bVar3 = this.f9656b;
        D4.b bVar4 = f9654d;
        if (bVar3 != bVar4) {
            interfaceC0014a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f9656b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0014a interfaceC0014a2 = this.f9655a;
                this.f9655a = new a.InterfaceC0014a() { // from class: b4.B
                    @Override // D4.a.InterfaceC0014a
                    public final void a(D4.b bVar5) {
                        C0682C.h(interfaceC0014a2, interfaceC0014a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0014a.a(bVar);
        }
    }

    @Override // D4.b
    public Object get() {
        return this.f9656b.get();
    }

    void j(D4.b bVar) {
        a.InterfaceC0014a interfaceC0014a;
        if (this.f9656b != f9654d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0014a = this.f9655a;
            this.f9655a = null;
            this.f9656b = bVar;
        }
        interfaceC0014a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(D4.b bVar) {
    }
}
