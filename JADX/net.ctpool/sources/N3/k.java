package N3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N3.c f2200m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f2201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f2202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f2203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f2204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    N3.c f2205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    N3.c f2206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    N3.c f2207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    N3.c f2208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f2209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f2210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    f f2211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f2212l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f2213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f2214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f2215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f2216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private N3.c f2217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private N3.c f2218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private N3.c f2219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private N3.c f2220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f f2221i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f2222j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f f2223k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private f f2224l;

        public b() {
            this.f2213a = h.b();
            this.f2214b = h.b();
            this.f2215c = h.b();
            this.f2216d = h.b();
            this.f2217e = new N3.a(0.0f);
            this.f2218f = new N3.a(0.0f);
            this.f2219g = new N3.a(0.0f);
            this.f2220h = new N3.a(0.0f);
            this.f2221i = h.c();
            this.f2222j = h.c();
            this.f2223k = h.c();
            this.f2224l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f2199a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f2147a;
            }
            return -1.0f;
        }

        public b A(float f7) {
            this.f2217e = new N3.a(f7);
            return this;
        }

        public b B(N3.c cVar) {
            this.f2217e = cVar;
            return this;
        }

        public b C(int i7, N3.c cVar) {
            return D(h.a(i7)).F(cVar);
        }

        public b D(d dVar) {
            this.f2214b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f7) {
            this.f2218f = new N3.a(f7);
            return this;
        }

        public b F(N3.c cVar) {
            this.f2218f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f7) {
            return A(f7).E(f7).w(f7).s(f7);
        }

        public b p(N3.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i7, N3.c cVar) {
            return r(h.a(i7)).t(cVar);
        }

        public b r(d dVar) {
            this.f2216d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f7) {
            this.f2220h = new N3.a(f7);
            return this;
        }

        public b t(N3.c cVar) {
            this.f2220h = cVar;
            return this;
        }

        public b u(int i7, N3.c cVar) {
            return v(h.a(i7)).x(cVar);
        }

        public b v(d dVar) {
            this.f2215c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f7) {
            this.f2219g = new N3.a(f7);
            return this;
        }

        public b x(N3.c cVar) {
            this.f2219g = cVar;
            return this;
        }

        public b y(int i7, N3.c cVar) {
            return z(h.a(i7)).B(cVar);
        }

        public b z(d dVar) {
            this.f2213a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(k kVar) {
            this.f2213a = h.b();
            this.f2214b = h.b();
            this.f2215c = h.b();
            this.f2216d = h.b();
            this.f2217e = new N3.a(0.0f);
            this.f2218f = new N3.a(0.0f);
            this.f2219g = new N3.a(0.0f);
            this.f2220h = new N3.a(0.0f);
            this.f2221i = h.c();
            this.f2222j = h.c();
            this.f2223k = h.c();
            this.f2224l = h.c();
            this.f2213a = kVar.f2201a;
            this.f2214b = kVar.f2202b;
            this.f2215c = kVar.f2203c;
            this.f2216d = kVar.f2204d;
            this.f2217e = kVar.f2205e;
            this.f2218f = kVar.f2206f;
            this.f2219g = kVar.f2207g;
            this.f2220h = kVar.f2208h;
            this.f2221i = kVar.f2209i;
            this.f2222j = kVar.f2210j;
            this.f2223k = kVar.f2211k;
            this.f2224l = kVar.f2212l;
        }
    }

    public interface c {
        N3.c a(N3.c cVar);
    }

    public k() {
        this.f2201a = h.b();
        this.f2202b = h.b();
        this.f2203c = h.b();
        this.f2204d = h.b();
        this.f2205e = new N3.a(0.0f);
        this.f2206f = new N3.a(0.0f);
        this.f2207g = new N3.a(0.0f);
        this.f2208h = new N3.a(0.0f);
        this.f2209i = h.c();
        this.f2210j = h.c();
        this.f2211k = h.c();
        this.f2212l = h.c();
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i7, int i8) {
        return c(context, i7, i8, 0);
    }

    private static b c(Context context, int i7, int i8, int i9) {
        return d(context, i7, i8, new N3.a(i9));
    }

    private static b d(Context context, int i7, int i8, N3.c cVar) {
        if (i8 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
            i7 = i8;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, A3.j.f485d4);
        try {
            int i9 = typedArrayObtainStyledAttributes.getInt(A3.j.f493e4, 0);
            int i10 = typedArrayObtainStyledAttributes.getInt(A3.j.f517h4, i9);
            int i11 = typedArrayObtainStyledAttributes.getInt(A3.j.f525i4, i9);
            int i12 = typedArrayObtainStyledAttributes.getInt(A3.j.f509g4, i9);
            int i13 = typedArrayObtainStyledAttributes.getInt(A3.j.f501f4, i9);
            N3.c cVarM = m(typedArrayObtainStyledAttributes, A3.j.f533j4, cVar);
            N3.c cVarM2 = m(typedArrayObtainStyledAttributes, A3.j.f557m4, cVarM);
            N3.c cVarM3 = m(typedArrayObtainStyledAttributes, A3.j.f565n4, cVarM);
            N3.c cVarM4 = m(typedArrayObtainStyledAttributes, A3.j.f549l4, cVarM);
            return new b().y(i10, cVarM2).C(i11, cVarM3).u(i12, cVarM4).q(i13, m(typedArrayObtainStyledAttributes, A3.j.f541k4, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i7, int i8) {
        return f(context, attributeSet, i7, i8, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i7, int i8, int i9) {
        return g(context, attributeSet, i7, i8, new N3.a(i9));
    }

    public static b g(Context context, AttributeSet attributeSet, int i7, int i8, N3.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A3.j.f540k3, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(A3.j.f548l3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(A3.j.f556m3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static N3.c m(TypedArray typedArray, int i7, N3.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i8 = typedValuePeekValue.type;
        return i8 == 5 ? new N3.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i8 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f2211k;
    }

    public d i() {
        return this.f2204d;
    }

    public N3.c j() {
        return this.f2208h;
    }

    public d k() {
        return this.f2203c;
    }

    public N3.c l() {
        return this.f2207g;
    }

    public f n() {
        return this.f2212l;
    }

    public f o() {
        return this.f2210j;
    }

    public f p() {
        return this.f2209i;
    }

    public d q() {
        return this.f2201a;
    }

    public N3.c r() {
        return this.f2205e;
    }

    public d s() {
        return this.f2202b;
    }

    public N3.c t() {
        return this.f2206f;
    }

    public boolean u(RectF rectF) {
        boolean z6 = this.f2212l.getClass().equals(f.class) && this.f2210j.getClass().equals(f.class) && this.f2209i.getClass().equals(f.class) && this.f2211k.getClass().equals(f.class);
        float fA = this.f2205e.a(rectF);
        return z6 && ((this.f2206f.a(rectF) > fA ? 1 : (this.f2206f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2208h.a(rectF) > fA ? 1 : (this.f2208h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2207g.a(rectF) > fA ? 1 : (this.f2207g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2202b instanceof j) && (this.f2201a instanceof j) && (this.f2203c instanceof j) && (this.f2204d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f7) {
        return v().o(f7).m();
    }

    public k x(N3.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f2201a = bVar.f2213a;
        this.f2202b = bVar.f2214b;
        this.f2203c = bVar.f2215c;
        this.f2204d = bVar.f2216d;
        this.f2205e = bVar.f2217e;
        this.f2206f = bVar.f2218f;
        this.f2207g = bVar.f2219g;
        this.f2208h = bVar.f2220h;
        this.f2209i = bVar.f2221i;
        this.f2210j = bVar.f2222j;
        this.f2211k = bVar.f2223k;
        this.f2212l = bVar.f2224l;
    }
}
