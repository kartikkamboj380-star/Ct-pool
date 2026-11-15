package U2;

/* JADX INFO: loaded from: classes.dex */
final class s implements S2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f3824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S2.c f3826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S2.h f3827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f3828e;

    s(p pVar, String str, S2.c cVar, S2.h hVar, t tVar) {
        this.f3824a = pVar;
        this.f3825b = str;
        this.f3826c = cVar;
        this.f3827d = hVar;
        this.f3828e = tVar;
    }

    @Override // S2.i
    public void a(S2.d dVar) {
        b(dVar, new S2.k() { // from class: U2.r
            @Override // S2.k
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    @Override // S2.i
    public void b(S2.d dVar, S2.k kVar) {
        this.f3828e.a(o.a().e(this.f3824a).c(dVar).f(this.f3825b).d(this.f3827d).b(this.f3826c).a(), kVar);
    }

    p d() {
        return this.f3824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
