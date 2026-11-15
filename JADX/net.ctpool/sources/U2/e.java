package U2;

import U2.v;
import a3.C0508d;
import a3.C0511g;
import a3.C0513i;
import android.content.Context;
import c3.C0720g;
import c3.C0721h;
import c3.C0722i;
import c3.C0723j;
import c3.InterfaceC0717d;
import c3.N;
import c3.X;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    private static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f3800a;

        private b() {
        }

        @Override // U2.v.a
        public v a() {
            W2.d.a(this.f3800a, Context.class);
            return new c(this.f3800a);
        }

        @Override // U2.v.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f3800a = (Context) W2.d.b(context);
            return this;
        }
    }

    private static final class c extends v {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f3801m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Provider f3802n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Provider f3803o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Provider f3804p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Provider f3805q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Provider f3806r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Provider f3807s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Provider f3808t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Provider f3809u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Provider f3810v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Provider f3811w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Provider f3812x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Provider f3813y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Provider f3814z;

        private c(Context context) {
            this.f3801m = this;
            d(context);
        }

        private void d(Context context) {
            this.f3802n = W2.a.a(k.a());
            W2.b bVarA = W2.c.a(context);
            this.f3803o = bVarA;
            V2.j jVarA = V2.j.a(bVarA, e3.c.a(), e3.d.a());
            this.f3804p = jVarA;
            this.f3805q = W2.a.a(V2.l.a(this.f3803o, jVarA));
            this.f3806r = X.a(this.f3803o, C0720g.a(), C0722i.a());
            this.f3807s = W2.a.a(C0721h.a(this.f3803o));
            this.f3808t = W2.a.a(N.a(e3.c.a(), e3.d.a(), C0723j.a(), this.f3806r, this.f3807s));
            C0511g c0511gB = C0511g.b(e3.c.a());
            this.f3809u = c0511gB;
            C0513i c0513iA = C0513i.a(this.f3803o, this.f3808t, c0511gB, e3.d.a());
            this.f3810v = c0513iA;
            Provider provider = this.f3802n;
            Provider provider2 = this.f3805q;
            Provider provider3 = this.f3808t;
            this.f3811w = C0508d.a(provider, provider2, c0513iA, provider3, provider3);
            Provider provider4 = this.f3803o;
            Provider provider5 = this.f3805q;
            Provider provider6 = this.f3808t;
            this.f3812x = b3.s.a(provider4, provider5, provider6, this.f3810v, this.f3802n, provider6, e3.c.a(), e3.d.a(), this.f3808t);
            Provider provider7 = this.f3802n;
            Provider provider8 = this.f3808t;
            this.f3813y = b3.w.a(provider7, provider8, this.f3810v, provider8);
            this.f3814z = W2.a.a(w.a(e3.c.a(), e3.d.a(), this.f3811w, this.f3812x, this.f3813y));
        }

        @Override // U2.v
        InterfaceC0717d a() {
            return (InterfaceC0717d) this.f3808t.get();
        }

        @Override // U2.v
        u b() {
            return (u) this.f3814z.get();
        }
    }

    public static v.a a() {
        return new b();
    }
}
