package Z5;

import T5.E;
import T5.x;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends E {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f4658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i6.h f4659p;

    public h(String str, long j7, i6.h hVar) {
        w5.k.f(hVar, "source");
        this.f4657n = str;
        this.f4658o = j7;
        this.f4659p = hVar;
    }

    @Override // T5.E
    public long e() {
        return this.f4658o;
    }

    @Override // T5.E
    public x f() {
        String str = this.f4657n;
        if (str != null) {
            return x.f3645g.b(str);
        }
        return null;
    }

    @Override // T5.E
    public i6.h j() {
        return this.f4659p;
    }
}
