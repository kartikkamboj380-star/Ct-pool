package Z5;

import T5.B;
import T5.D;
import T5.InterfaceC0459e;
import T5.v;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y5.e f4649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y5.c f4652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B f4653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4656i;

    public g(Y5.e eVar, List list, int i7, Y5.c cVar, B b7, int i8, int i9, int i10) {
        w5.k.f(eVar, "call");
        w5.k.f(list, "interceptors");
        w5.k.f(b7, "request");
        this.f4649b = eVar;
        this.f4650c = list;
        this.f4651d = i7;
        this.f4652e = cVar;
        this.f4653f = b7;
        this.f4654g = i8;
        this.f4655h = i9;
        this.f4656i = i10;
    }

    public static /* synthetic */ g c(g gVar, int i7, Y5.c cVar, B b7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = gVar.f4651d;
        }
        if ((i11 & 2) != 0) {
            cVar = gVar.f4652e;
        }
        Y5.c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            b7 = gVar.f4653f;
        }
        B b8 = b7;
        if ((i11 & 8) != 0) {
            i8 = gVar.f4654g;
        }
        int i12 = i8;
        if ((i11 & 16) != 0) {
            i9 = gVar.f4655h;
        }
        int i13 = i9;
        if ((i11 & 32) != 0) {
            i10 = gVar.f4656i;
        }
        return gVar.b(i7, cVar2, b8, i12, i13, i10);
    }

    @Override // T5.v.a
    public D a(B b7) {
        w5.k.f(b7, "request");
        if (!(this.f4651d < this.f4650c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f4648a++;
        Y5.c cVar = this.f4652e;
        if (cVar != null) {
            if (!cVar.j().g(b7.l())) {
                throw new IllegalStateException(("network interceptor " + ((v) this.f4650c.get(this.f4651d - 1)) + " must retain the same host and port").toString());
            }
            if (!(this.f4648a == 1)) {
                throw new IllegalStateException(("network interceptor " + ((v) this.f4650c.get(this.f4651d - 1)) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f4651d + 1, null, b7, 0, 0, 0, 58, null);
        v vVar = (v) this.f4650c.get(this.f4651d);
        D dA = vVar.a(gVarC);
        if (dA == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f4652e != null) {
            if (!(this.f4651d + 1 >= this.f4650c.size() || gVarC.f4648a == 1)) {
                throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
            }
        }
        if (dA.a() != null) {
            return dA;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i7, Y5.c cVar, B b7, int i8, int i9, int i10) {
        w5.k.f(b7, "request");
        return new g(this.f4649b, this.f4650c, i7, cVar, b7, i8, i9, i10);
    }

    @Override // T5.v.a
    public InterfaceC0459e call() {
        return this.f4649b;
    }

    public final Y5.e d() {
        return this.f4649b;
    }

    public final int e() {
        return this.f4654g;
    }

    public final Y5.c f() {
        return this.f4652e;
    }

    public final int g() {
        return this.f4655h;
    }

    public final B h() {
        return this.f4653f;
    }

    public final int i() {
        return this.f4656i;
    }

    public int j() {
        return this.f4655h;
    }

    @Override // T5.v.a
    public B o() {
        return this.f4653f;
    }
}
