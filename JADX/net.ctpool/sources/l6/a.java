package l6;

/* JADX INFO: loaded from: classes2.dex */
class a implements Runnable, l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f21120m = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f21121n;

    a(c cVar) {
        this.f21121n = cVar;
    }

    @Override // l6.l
    public void a(q qVar, Object obj) {
        this.f21120m.a(j.a(qVar, obj));
        this.f21121n.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarB = this.f21120m.b();
        if (jVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f21121n.g(jVarB);
    }
}
