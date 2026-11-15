package P3;

/* JADX INFO: loaded from: classes.dex */
final class C implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f2577a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q3.f f2578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q3.f f2579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q3.f f2580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q3.f f2581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q3.f f2582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q3.f f2583g;

    /* synthetic */ C(n nVar, B b7) {
        p pVar = new p(nVar);
        this.f2578b = pVar;
        Q3.f fVarB = Q3.d.b(new x(pVar));
        this.f2579c = fVarB;
        Q3.f fVarB2 = Q3.d.b(new v(pVar, fVarB));
        this.f2580d = fVarB2;
        Q3.f fVarB3 = Q3.d.b(new j(pVar));
        this.f2581e = fVarB3;
        Q3.f fVarB4 = Q3.d.b(new m(fVarB2, fVarB3, pVar));
        this.f2582f = fVarB4;
        this.f2583g = Q3.d.b(new o(fVarB4));
    }

    @Override // P3.e
    public final InterfaceC0450b a() {
        return (InterfaceC0450b) this.f2583g.a();
    }
}
