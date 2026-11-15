package P3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f2600a;

    /* synthetic */ g(f fVar) {
    }

    public final e a() {
        n nVar = this.f2600a;
        if (nVar != null) {
            return new C(nVar, null);
        }
        throw new IllegalStateException(String.valueOf(n.class.getCanonicalName()).concat(" must be set"));
    }

    public final g b(n nVar) {
        this.f2600a = nVar;
        return this;
    }
}
