package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f7302b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7303a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f7304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f7305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f7306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f7307d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f7304a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f7305b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f7306c = declaredField3;
                declaredField3.setAccessible(true);
                f7307d = true;
            } catch (ReflectiveOperationException e7) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
            }
        }

        public static U a(View view) {
            if (f7307d && view.isAttachedToWindow()) {
                try {
                    Object obj = f7304a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f7305b.get(obj);
                        Rect rect2 = (Rect) f7306c.get(obj);
                        if (rect != null && rect2 != null) {
                            U uA = new b().c(androidx.core.graphics.b.c(rect)).d(androidx.core.graphics.b.c(rect2)).a();
                            uA.s(uA);
                            uA.d(view.getRootView());
                            return uA;
                        }
                    }
                } catch (IllegalAccessException e7) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f7308a;

        public b() {
            int i7 = Build.VERSION.SDK_INT;
            this.f7308a = i7 >= 30 ? new e() : i7 >= 29 ? new d() : new c();
        }

        public U a() {
            return this.f7308a.b();
        }

        public b b(int i7, androidx.core.graphics.b bVar) {
            this.f7308a.c(i7, bVar);
            return this;
        }

        public b c(androidx.core.graphics.b bVar) {
            this.f7308a.e(bVar);
            return this;
        }

        public b d(androidx.core.graphics.b bVar) {
            this.f7308a.g(bVar);
            return this;
        }

        public b(U u6) {
            int i7 = Build.VERSION.SDK_INT;
            this.f7308a = i7 >= 30 ? new e(u6) : i7 >= 29 ? new d(u6) : new c(u6);
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f7309e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f7310f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor f7311g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f7312h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f7313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b f7314d;

        c() {
            this.f7313c = i();
        }

        private static WindowInsets i() {
            if (!f7310f) {
                try {
                    f7309e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f7310f = true;
            }
            Field field = f7309e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f7312h) {
                try {
                    f7311g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f7312h = true;
            }
            Constructor constructor = f7311g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.U.f
        U b() {
            a();
            U uV = U.v(this.f7313c);
            uV.q(this.f7317b);
            uV.t(this.f7314d);
            return uV;
        }

        @Override // androidx.core.view.U.f
        void e(androidx.core.graphics.b bVar) {
            this.f7314d = bVar;
        }

        @Override // androidx.core.view.U.f
        void g(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f7313c;
            if (windowInsets != null) {
                this.f7313c = windowInsets.replaceSystemWindowInsets(bVar.f7120a, bVar.f7121b, bVar.f7122c, bVar.f7123d);
            }
        }

        c(U u6) {
            super(u6);
            this.f7313c = u6.u();
        }
    }

    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f7315c;

        d() {
            this.f7315c = c0.a();
        }

        @Override // androidx.core.view.U.f
        U b() {
            a();
            U uV = U.v(this.f7315c.build());
            uV.q(this.f7317b);
            return uV;
        }

        @Override // androidx.core.view.U.f
        void d(androidx.core.graphics.b bVar) {
            this.f7315c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.U.f
        void e(androidx.core.graphics.b bVar) {
            this.f7315c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.U.f
        void f(androidx.core.graphics.b bVar) {
            this.f7315c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.U.f
        void g(androidx.core.graphics.b bVar) {
            this.f7315c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.U.f
        void h(androidx.core.graphics.b bVar) {
            this.f7315c.setTappableElementInsets(bVar.e());
        }

        d(U u6) {
            super(u6);
            WindowInsets windowInsetsU = u6.u();
            this.f7315c = windowInsetsU != null ? b0.a(windowInsetsU) : c0.a();
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.U.f
        void c(int i7, androidx.core.graphics.b bVar) {
            this.f7315c.setInsets(n.a(i7), bVar.e());
        }

        e(U u6) {
            super(u6);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U f7316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.b[] f7317b;

        f() {
            this(new U((U) null));
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f7317b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVarF = bVarArr[m.b(1)];
                androidx.core.graphics.b bVarF2 = this.f7317b[m.b(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f7316a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f7316a.f(1);
                }
                g(androidx.core.graphics.b.a(bVarF, bVarF2));
                androidx.core.graphics.b bVar = this.f7317b[m.b(16)];
                if (bVar != null) {
                    f(bVar);
                }
                androidx.core.graphics.b bVar2 = this.f7317b[m.b(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                androidx.core.graphics.b bVar3 = this.f7317b[m.b(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        abstract U b();

        void c(int i7, androidx.core.graphics.b bVar) {
            if (this.f7317b == null) {
                this.f7317b = new androidx.core.graphics.b[9];
            }
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    this.f7317b[m.b(i8)] = bVar;
                }
            }
        }

        void d(androidx.core.graphics.b bVar) {
        }

        abstract void e(androidx.core.graphics.b bVar);

        void f(androidx.core.graphics.b bVar) {
        }

        abstract void g(androidx.core.graphics.b bVar);

        void h(androidx.core.graphics.b bVar) {
        }

        f(U u6) {
            this.f7316a = u6;
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f7318h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f7319i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class f7320j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f7321k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f7322l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f7323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b[] f7324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.b f7325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private U f7326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.b f7327g;

        g(U u6, WindowInsets windowInsets) {
            super(u6);
            this.f7325e = null;
            this.f7323c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i7, boolean z6) {
            androidx.core.graphics.b bVarA = androidx.core.graphics.b.f7119e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    bVarA = androidx.core.graphics.b.a(bVarA, u(i8, z6));
                }
            }
            return bVarA;
        }

        private androidx.core.graphics.b v() {
            U u6 = this.f7326f;
            return u6 != null ? u6.g() : androidx.core.graphics.b.f7119e;
        }

        private androidx.core.graphics.b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f7318h) {
                x();
            }
            Method method = f7319i;
            if (method != null && f7320j != null && f7321k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f7321k.get(f7322l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f7319i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f7320j = cls;
                f7321k = cls.getDeclaredField("mVisibleInsets");
                f7322l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f7321k.setAccessible(true);
                f7322l.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f7318h = true;
        }

        @Override // androidx.core.view.U.l
        void d(View view) {
            androidx.core.graphics.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = androidx.core.graphics.b.f7119e;
            }
            q(bVarW);
        }

        @Override // androidx.core.view.U.l
        void e(U u6) {
            u6.s(this.f7326f);
            u6.r(this.f7327g);
        }

        @Override // androidx.core.view.U.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f7327g, ((g) obj).f7327g);
            }
            return false;
        }

        @Override // androidx.core.view.U.l
        public androidx.core.graphics.b g(int i7) {
            return t(i7, false);
        }

        @Override // androidx.core.view.U.l
        final androidx.core.graphics.b k() {
            if (this.f7325e == null) {
                this.f7325e = androidx.core.graphics.b.b(this.f7323c.getSystemWindowInsetLeft(), this.f7323c.getSystemWindowInsetTop(), this.f7323c.getSystemWindowInsetRight(), this.f7323c.getSystemWindowInsetBottom());
            }
            return this.f7325e;
        }

        @Override // androidx.core.view.U.l
        U m(int i7, int i8, int i9, int i10) {
            b bVar = new b(U.v(this.f7323c));
            bVar.d(U.n(k(), i7, i8, i9, i10));
            bVar.c(U.n(i(), i7, i8, i9, i10));
            return bVar.a();
        }

        @Override // androidx.core.view.U.l
        boolean o() {
            return this.f7323c.isRound();
        }

        @Override // androidx.core.view.U.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f7324d = bVarArr;
        }

        @Override // androidx.core.view.U.l
        void q(androidx.core.graphics.b bVar) {
            this.f7327g = bVar;
        }

        @Override // androidx.core.view.U.l
        void r(U u6) {
            this.f7326f = u6;
        }

        protected androidx.core.graphics.b u(int i7, boolean z6) {
            androidx.core.graphics.b bVarG;
            int i8;
            if (i7 == 1) {
                return z6 ? androidx.core.graphics.b.b(0, Math.max(v().f7121b, k().f7121b), 0, 0) : androidx.core.graphics.b.b(0, k().f7121b, 0, 0);
            }
            if (i7 == 2) {
                if (z6) {
                    androidx.core.graphics.b bVarV = v();
                    androidx.core.graphics.b bVarI = i();
                    return androidx.core.graphics.b.b(Math.max(bVarV.f7120a, bVarI.f7120a), 0, Math.max(bVarV.f7122c, bVarI.f7122c), Math.max(bVarV.f7123d, bVarI.f7123d));
                }
                androidx.core.graphics.b bVarK = k();
                U u6 = this.f7326f;
                bVarG = u6 != null ? u6.g() : null;
                int iMin = bVarK.f7123d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f7123d);
                }
                return androidx.core.graphics.b.b(bVarK.f7120a, 0, bVarK.f7122c, iMin);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return j();
                }
                if (i7 == 32) {
                    return h();
                }
                if (i7 == 64) {
                    return l();
                }
                if (i7 != 128) {
                    return androidx.core.graphics.b.f7119e;
                }
                U u7 = this.f7326f;
                C0594n c0594nE = u7 != null ? u7.e() : f();
                return c0594nE != null ? androidx.core.graphics.b.b(c0594nE.b(), c0594nE.d(), c0594nE.c(), c0594nE.a()) : androidx.core.graphics.b.f7119e;
            }
            androidx.core.graphics.b[] bVarArr = this.f7324d;
            bVarG = bVarArr != null ? bVarArr[m.b(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            androidx.core.graphics.b bVarK2 = k();
            androidx.core.graphics.b bVarV2 = v();
            int i9 = bVarK2.f7123d;
            if (i9 > bVarV2.f7123d) {
                return androidx.core.graphics.b.b(0, 0, 0, i9);
            }
            androidx.core.graphics.b bVar = this.f7327g;
            return (bVar == null || bVar.equals(androidx.core.graphics.b.f7119e) || (i8 = this.f7327g.f7123d) <= bVarV2.f7123d) ? androidx.core.graphics.b.f7119e : androidx.core.graphics.b.b(0, 0, 0, i8);
        }

        g(U u6, g gVar) {
            this(u6, new WindowInsets(gVar.f7323c));
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.b f7328m;

        h(U u6, WindowInsets windowInsets) {
            super(u6, windowInsets);
            this.f7328m = null;
        }

        @Override // androidx.core.view.U.l
        U b() {
            return U.v(this.f7323c.consumeStableInsets());
        }

        @Override // androidx.core.view.U.l
        U c() {
            return U.v(this.f7323c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.U.l
        final androidx.core.graphics.b i() {
            if (this.f7328m == null) {
                this.f7328m = androidx.core.graphics.b.b(this.f7323c.getStableInsetLeft(), this.f7323c.getStableInsetTop(), this.f7323c.getStableInsetRight(), this.f7323c.getStableInsetBottom());
            }
            return this.f7328m;
        }

        @Override // androidx.core.view.U.l
        boolean n() {
            return this.f7323c.isConsumed();
        }

        @Override // androidx.core.view.U.l
        public void s(androidx.core.graphics.b bVar) {
            this.f7328m = bVar;
        }

        h(U u6, h hVar) {
            super(u6, hVar);
            this.f7328m = null;
            this.f7328m = hVar.f7328m;
        }
    }

    private static class i extends h {
        i(U u6, WindowInsets windowInsets) {
            super(u6, windowInsets);
        }

        @Override // androidx.core.view.U.l
        U a() {
            return U.v(this.f7323c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.U.g, androidx.core.view.U.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f7323c, iVar.f7323c) && Objects.equals(this.f7327g, iVar.f7327g);
        }

        @Override // androidx.core.view.U.l
        C0594n f() {
            return C0594n.e(this.f7323c.getDisplayCutout());
        }

        @Override // androidx.core.view.U.l
        public int hashCode() {
            return this.f7323c.hashCode();
        }

        i(U u6, i iVar) {
            super(u6, iVar);
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.b f7329n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.b f7330o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.b f7331p;

        j(U u6, WindowInsets windowInsets) {
            super(u6, windowInsets);
            this.f7329n = null;
            this.f7330o = null;
            this.f7331p = null;
        }

        @Override // androidx.core.view.U.l
        androidx.core.graphics.b h() {
            if (this.f7330o == null) {
                this.f7330o = androidx.core.graphics.b.d(this.f7323c.getMandatorySystemGestureInsets());
            }
            return this.f7330o;
        }

        @Override // androidx.core.view.U.l
        androidx.core.graphics.b j() {
            if (this.f7329n == null) {
                this.f7329n = androidx.core.graphics.b.d(this.f7323c.getSystemGestureInsets());
            }
            return this.f7329n;
        }

        @Override // androidx.core.view.U.l
        androidx.core.graphics.b l() {
            if (this.f7331p == null) {
                this.f7331p = androidx.core.graphics.b.d(this.f7323c.getTappableElementInsets());
            }
            return this.f7331p;
        }

        @Override // androidx.core.view.U.g, androidx.core.view.U.l
        U m(int i7, int i8, int i9, int i10) {
            return U.v(this.f7323c.inset(i7, i8, i9, i10));
        }

        @Override // androidx.core.view.U.h, androidx.core.view.U.l
        public void s(androidx.core.graphics.b bVar) {
        }

        j(U u6, j jVar) {
            super(u6, jVar);
            this.f7329n = null;
            this.f7330o = null;
            this.f7331p = null;
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final U f7332q = U.v(WindowInsets.CONSUMED);

        k(U u6, WindowInsets windowInsets) {
            super(u6, windowInsets);
        }

        @Override // androidx.core.view.U.g, androidx.core.view.U.l
        final void d(View view) {
        }

        @Override // androidx.core.view.U.g, androidx.core.view.U.l
        public androidx.core.graphics.b g(int i7) {
            return androidx.core.graphics.b.d(this.f7323c.getInsets(n.a(i7)));
        }

        k(U u6, k kVar) {
            super(u6, kVar);
        }
    }

    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final U f7333b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final U f7334a;

        l(U u6) {
            this.f7334a = u6;
        }

        U a() {
            return this.f7334a;
        }

        U b() {
            return this.f7334a;
        }

        U c() {
            return this.f7334a;
        }

        void d(View view) {
        }

        void e(U u6) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.b.a(k(), lVar.k()) && androidx.core.util.b.a(i(), lVar.i()) && androidx.core.util.b.a(f(), lVar.f());
        }

        C0594n f() {
            return null;
        }

        androidx.core.graphics.b g(int i7) {
            return androidx.core.graphics.b.f7119e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f7119e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f7119e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        U m(int i7, int i8, int i9, int i10) {
            return f7333b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(U u6) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 128;
        }

        static int b(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 2;
        }

        public static int e() {
            return 1;
        }

        public static int f() {
            return 7;
        }
    }

    private static final class n {
        static int a(int i7) {
            int iStatusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= iStatusBars;
                }
            }
            return i8;
        }
    }

    static {
        f7302b = Build.VERSION.SDK_INT >= 30 ? k.f7332q : l.f7333b;
    }

    private U(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        this.f7303a = i7 >= 30 ? new k(this, windowInsets) : i7 >= 29 ? new j(this, windowInsets) : i7 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    static androidx.core.graphics.b n(androidx.core.graphics.b bVar, int i7, int i8, int i9, int i10) {
        int iMax = Math.max(0, bVar.f7120a - i7);
        int iMax2 = Math.max(0, bVar.f7121b - i8);
        int iMax3 = Math.max(0, bVar.f7122c - i9);
        int iMax4 = Math.max(0, bVar.f7123d - i10);
        return (iMax == i7 && iMax2 == i8 && iMax3 == i9 && iMax4 == i10) ? bVar : androidx.core.graphics.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static U v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static U w(WindowInsets windowInsets, View view) {
        U u6 = new U((WindowInsets) androidx.core.util.f.f(windowInsets));
        if (view != null && H.S(view)) {
            u6.s(H.I(view));
            u6.d(view.getRootView());
        }
        return u6;
    }

    public U a() {
        return this.f7303a.a();
    }

    public U b() {
        return this.f7303a.b();
    }

    public U c() {
        return this.f7303a.c();
    }

    void d(View view) {
        this.f7303a.d(view);
    }

    public C0594n e() {
        return this.f7303a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U) {
            return androidx.core.util.b.a(this.f7303a, ((U) obj).f7303a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i7) {
        return this.f7303a.g(i7);
    }

    public androidx.core.graphics.b g() {
        return this.f7303a.i();
    }

    public androidx.core.graphics.b h() {
        return this.f7303a.j();
    }

    public int hashCode() {
        l lVar = this.f7303a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f7303a.k().f7123d;
    }

    public int j() {
        return this.f7303a.k().f7120a;
    }

    public int k() {
        return this.f7303a.k().f7122c;
    }

    public int l() {
        return this.f7303a.k().f7121b;
    }

    public U m(int i7, int i8, int i9, int i10) {
        return this.f7303a.m(i7, i8, i9, i10);
    }

    public boolean o() {
        return this.f7303a.n();
    }

    public U p(int i7, int i8, int i9, int i10) {
        return new b(this).d(androidx.core.graphics.b.b(i7, i8, i9, i10)).a();
    }

    void q(androidx.core.graphics.b[] bVarArr) {
        this.f7303a.p(bVarArr);
    }

    void r(androidx.core.graphics.b bVar) {
        this.f7303a.q(bVar);
    }

    void s(U u6) {
        this.f7303a.r(u6);
    }

    void t(androidx.core.graphics.b bVar) {
        this.f7303a.s(bVar);
    }

    public WindowInsets u() {
        l lVar = this.f7303a;
        if (lVar instanceof g) {
            return ((g) lVar).f7323c;
        }
        return null;
    }

    public U(U u6) {
        if (u6 == null) {
            this.f7303a = new l(this);
            return;
        }
        l lVar = u6.f7303a;
        int i7 = Build.VERSION.SDK_INT;
        this.f7303a = (i7 < 30 || !(lVar instanceof k)) ? (i7 < 29 || !(lVar instanceof j)) ? (i7 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }
}
