package androidx.work.impl;

/* JADX INFO: renamed from: androidx.work.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0671k extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0671k f9444c = new C0671k();

    private C0671k() {
        super(4, 5);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.u("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
