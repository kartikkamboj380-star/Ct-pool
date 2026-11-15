package androidx.work.impl;

/* JADX INFO: renamed from: androidx.work.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666f extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0666f f9411c = new C0666f();

    private C0666f() {
        super(11, 12);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
