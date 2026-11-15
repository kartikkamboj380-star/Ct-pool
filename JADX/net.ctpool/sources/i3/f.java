package i3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f19934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f19935b;

    public f() {
        this.f19934a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.f19935b = str;
        return this;
    }

    public f(g gVar) {
        this.f19934a = Boolean.FALSE;
        g.b(gVar);
        this.f19934a = Boolean.valueOf(gVar.f19938n);
        this.f19935b = gVar.f19939o;
    }
}
