package androidx.work.impl;

/* JADX INFO: renamed from: androidx.work.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667g extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0667g f9440c = new C0667g();

    private C0667g() {
        super(12, 13);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.u("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
