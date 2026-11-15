package U2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class q implements S2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f3821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f3822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f3823c;

    q(Set set, p pVar, t tVar) {
        this.f3821a = set;
        this.f3822b = pVar;
        this.f3823c = tVar;
    }

    @Override // S2.j
    public S2.i a(String str, Class cls, S2.c cVar, S2.h hVar) {
        if (this.f3821a.contains(cVar)) {
            return new s(this.f3822b, str, cVar, hVar, this.f3823c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f3821a));
    }
}
