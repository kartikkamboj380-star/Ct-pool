package z4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class i implements w4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23338a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23339b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w4.c f23340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f23341d;

    i(f fVar) {
        this.f23341d = fVar;
    }

    private void a() {
        if (this.f23338a) {
            throw new w4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f23338a = true;
    }

    void b(w4.c cVar, boolean z6) {
        this.f23338a = false;
        this.f23340c = cVar;
        this.f23339b = z6;
    }

    @Override // w4.g
    public w4.g f(String str) throws IOException {
        a();
        this.f23341d.i(this.f23340c, str, this.f23339b);
        return this;
    }

    @Override // w4.g
    public w4.g g(boolean z6) {
        a();
        this.f23341d.o(this.f23340c, z6, this.f23339b);
        return this;
    }
}
