package L1;

import s1.C2038c;

/* JADX INFO: loaded from: classes.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1969a;

    public h(int i7) {
        this.f1969a = i7;
    }

    @Override // L1.d
    public c createImageTranscoder(C2038c c2038c, boolean z6) {
        return new g(z6, this.f1969a);
    }
}
