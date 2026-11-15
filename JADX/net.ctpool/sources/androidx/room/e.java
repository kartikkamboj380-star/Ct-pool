package androidx.room;

import Z.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f8944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0660c f8945b;

    public e(h.c cVar, C0660c c0660c) {
        w5.k.f(cVar, "delegate");
        w5.k.f(c0660c, "autoCloser");
        this.f8944a = cVar;
        this.f8945b = c0660c;
    }

    @Override // Z.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b bVar) {
        w5.k.f(bVar, "configuration");
        return new d(this.f8944a.a(bVar), this.f8945b);
    }
}
