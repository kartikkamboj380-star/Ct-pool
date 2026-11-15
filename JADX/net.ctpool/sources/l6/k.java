package l6;

/* JADX INFO: loaded from: classes2.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f21176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f21177b;

    k() {
    }

    synchronized void a(j jVar) {
        try {
            if (jVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            j jVar2 = this.f21177b;
            if (jVar2 != null) {
                jVar2.f21175c = jVar;
                this.f21177b = jVar;
            } else {
                if (this.f21176a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f21177b = jVar;
                this.f21176a = jVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized j b() {
        j jVar;
        jVar = this.f21176a;
        if (jVar != null) {
            j jVar2 = jVar.f21175c;
            this.f21176a = jVar2;
            if (jVar2 == null) {
                this.f21177b = null;
            }
        }
        return jVar;
    }

    synchronized j c(int i7) {
        try {
            if (this.f21176a == null) {
                wait(i7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
