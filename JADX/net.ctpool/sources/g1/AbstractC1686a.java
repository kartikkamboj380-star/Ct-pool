package g1;

import O0.g;
import O0.j;
import O0.l;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import f1.AbstractC1644a;
import f1.C1646c;
import f1.C1647d;
import java.util.Map;
import java.util.concurrent.Executor;
import k1.C1815a;
import l1.C1846a;
import m1.InterfaceC1868a;
import m1.InterfaceC1869b;
import p1.b;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1686a implements InterfaceC1868a, AbstractC1644a.InterfaceC0256a, C1846a.InterfaceC0300a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f19469w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f19470x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f19471y = AbstractC1686a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1644a f19473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f19474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1647d f19475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1846a f19476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected InterfaceC1689d f19477f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m1.c f19479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f19480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f19481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f19482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f19488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Y0.c f19489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f19490s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f19493v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1646c f19472a = C1646c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p1.d f19478g = new p1.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19491t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19492u = false;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    class C0259a extends Y0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19495b;

        C0259a(String str, boolean z6) {
            this.f19494a = str;
            this.f19495b = z6;
        }

        @Override // Y0.b, Y0.e
        public void b(Y0.c cVar) {
            boolean zB = cVar.b();
            AbstractC1686a.this.O(this.f19494a, cVar, cVar.d(), zB);
        }

        @Override // Y0.b
        public void e(Y0.c cVar) {
            AbstractC1686a.this.L(this.f19494a, cVar, cVar.c(), true);
        }

        @Override // Y0.b
        public void f(Y0.c cVar) {
            boolean zB = cVar.b();
            boolean zF = cVar.f();
            float fD = cVar.d();
            Object objG = cVar.g();
            if (objG != null) {
                AbstractC1686a.this.N(this.f19494a, cVar, objG, fD, zB, this.f19495b, zF);
            } else if (zB) {
                AbstractC1686a.this.L(this.f19494a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: renamed from: g1.a$b */
    private static class b extends C1691f {
        private b() {
        }

        public static b f(InterfaceC1689d interfaceC1689d, InterfaceC1689d interfaceC1689d2) {
            if (K1.b.d()) {
                K1.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.b(interfaceC1689d);
            bVar.b(interfaceC1689d2);
            if (K1.b.d()) {
                K1.b.b();
            }
            return bVar;
        }
    }

    public AbstractC1686a(AbstractC1644a abstractC1644a, Executor executor, String str, Object obj) {
        this.f19473b = abstractC1644a;
        this.f19474c = executor;
        C(str, obj);
    }

    private m1.c B() {
        m1.c cVar = this.f19479h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f19482k);
    }

    private synchronized void C(String str, Object obj) {
        AbstractC1644a abstractC1644a;
        try {
            if (K1.b.d()) {
                K1.b.a("AbstractDraweeController#init");
            }
            this.f19472a.b(C1646c.a.ON_INIT_CONTROLLER);
            if (!this.f19491t && (abstractC1644a = this.f19473b) != null) {
                abstractC1644a.a(this);
            }
            this.f19483l = false;
            this.f19485n = false;
            Q();
            this.f19487p = false;
            C1647d c1647d = this.f19475d;
            if (c1647d != null) {
                c1647d.a();
            }
            C1846a c1846a = this.f19476e;
            if (c1846a != null) {
                c1846a.a();
                this.f19476e.f(this);
            }
            InterfaceC1689d interfaceC1689d = this.f19477f;
            if (interfaceC1689d instanceof b) {
                ((b) interfaceC1689d).c();
            } else {
                this.f19477f = null;
            }
            m1.c cVar = this.f19479h;
            if (cVar != null) {
                cVar.a();
                this.f19479h.c(null);
                this.f19479h = null;
            }
            this.f19480i = null;
            if (P0.a.u(2)) {
                P0.a.y(f19471y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f19481j, str);
            }
            this.f19481j = str;
            this.f19482k = obj;
            if (K1.b.d()) {
                K1.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean E(String str, Y0.c cVar) {
        if (cVar == null && this.f19489r == null) {
            return true;
        }
        return str.equals(this.f19481j) && cVar == this.f19489r && this.f19484m;
    }

    private void G(String str, Throwable th) {
        if (P0.a.u(2)) {
            P0.a.z(f19471y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f19481j, str, th);
        }
    }

    private void H(String str, Object obj) {
        if (P0.a.u(2)) {
            P0.a.A(f19471y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f19481j, str, w(obj), Integer.valueOf(x(obj)));
        }
    }

    private b.a I(Y0.c cVar, Object obj, Uri uri) {
        return J(cVar == null ? null : cVar.getExtras(), K(obj), uri);
    }

    private b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFN;
        m1.c cVar = this.f19479h;
        if (cVar instanceof C1815a) {
            C1815a c1815a = (C1815a) cVar;
            String strValueOf = String.valueOf(c1815a.o());
            pointFN = c1815a.n();
            str = strValueOf;
        } else {
            str = null;
            pointFN = null;
        }
        return o1.b.a(f19469w, f19470x, map, null, t(), str, pointFN, map2, o(), F(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, Y0.c cVar, Throwable th, boolean z6) {
        Drawable drawable;
        if (K1.b.d()) {
            K1.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (K1.b.d()) {
                K1.b.b();
                return;
            }
            return;
        }
        this.f19472a.b(z6 ? C1646c.a.ON_DATASOURCE_FAILURE : C1646c.a.ON_DATASOURCE_FAILURE_INT);
        if (z6) {
            G("final_failed @ onFailure", th);
            this.f19489r = null;
            this.f19486o = true;
            m1.c cVar2 = this.f19479h;
            if (cVar2 != null) {
                if (this.f19487p && (drawable = this.f19493v) != null) {
                    cVar2.h(drawable, 1.0f, true);
                } else if (g0()) {
                    cVar2.d(th);
                } else {
                    cVar2.e(th);
                }
            }
            T(th, cVar);
        } else {
            G("intermediate_failed @ onFailure", th);
            U(th);
        }
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N(String str, Y0.c cVar, Object obj, float f7, boolean z6, boolean z7, boolean z8) {
        try {
            if (K1.b.d()) {
                K1.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", obj);
                R(obj);
                cVar.close();
                if (K1.b.d()) {
                    K1.b.b();
                    return;
                }
                return;
            }
            this.f19472a.b(z6 ? C1646c.a.ON_DATASOURCE_RESULT : C1646c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableL = l(obj);
                Object obj2 = this.f19490s;
                Drawable drawable = this.f19493v;
                this.f19490s = obj;
                this.f19493v = drawableL;
                try {
                    if (z6) {
                        H("set_final_result @ onNewResult", obj);
                        this.f19489r = null;
                        B().h(drawableL, 1.0f, z7);
                    } else {
                        if (!z8) {
                            H("set_intermediate_result @ onNewResult", obj);
                            B().h(drawableL, f7, z7);
                            V(str, obj);
                            if (drawable != null && drawable != drawableL) {
                                P(drawable);
                            }
                            if (obj2 != null && obj2 != obj) {
                                H("release_previous_result @ onNewResult", obj2);
                                R(obj2);
                            }
                            if (K1.b.d()) {
                                return;
                            }
                            K1.b.b();
                            return;
                        }
                        H("set_temporary_result @ onNewResult", obj);
                        B().h(drawableL, 1.0f, z7);
                    }
                    Y(str, obj, cVar);
                    if (drawable != null) {
                        P(drawable);
                    }
                    if (obj2 != null) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    if (K1.b.d()) {
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    throw th;
                }
            } catch (Exception e7) {
                H("drawable_failed @ onNewResult", obj);
                R(obj);
                L(str, cVar, e7, z6);
                if (K1.b.d()) {
                    K1.b.b();
                }
            }
        } catch (Throwable th2) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, Y0.c cVar, float f7, boolean z6) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z6) {
                return;
            }
            this.f19479h.f(f7, false);
        }
    }

    private void Q() {
        Map extras;
        boolean z6 = this.f19484m;
        this.f19484m = false;
        this.f19486o = false;
        Y0.c cVar = this.f19489r;
        Map map = null;
        if (cVar != null) {
            extras = cVar.getExtras();
            this.f19489r.close();
            this.f19489r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f19493v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f19488q != null) {
            this.f19488q = null;
        }
        this.f19493v = null;
        Object obj = this.f19490s;
        if (obj != null) {
            Map mapK = K(y(obj));
            H("release", this.f19490s);
            R(this.f19490s);
            this.f19490s = null;
            map = mapK;
        }
        if (z6) {
            W(extras, map);
        }
    }

    private void T(Throwable th, Y0.c cVar) {
        b.a aVarI = I(cVar, null, null);
        p().i(this.f19481j, th);
        q().g(this.f19481j, th, aVarI);
    }

    private void U(Throwable th) {
        p().q(this.f19481j, th);
        q().l(this.f19481j);
    }

    private void V(String str, Object obj) {
        Object objY = y(obj);
        p().a(str, objY);
        q().a(str, objY);
    }

    private void W(Map map, Map map2) {
        p().k(this.f19481j);
        q().f(this.f19481j, J(map, map2, null));
    }

    private void Y(String str, Object obj, Y0.c cVar) {
        Object objY = y(obj);
        p().e(str, objY, m());
        q().j(str, objY, I(cVar, objY, null));
    }

    private boolean g0() {
        C1647d c1647d;
        return this.f19486o && (c1647d = this.f19475d) != null && c1647d.e();
    }

    private Rect t() {
        m1.c cVar = this.f19479h;
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    protected C1647d A() {
        if (this.f19475d == null) {
            this.f19475d = new C1647d();
        }
        return this.f19475d;
    }

    protected void D(String str, Object obj) {
        C(str, obj);
        this.f19491t = false;
        this.f19492u = false;
    }

    protected boolean F() {
        return this.f19492u;
    }

    public abstract Map K(Object obj);

    protected abstract void P(Drawable drawable);

    protected abstract void R(Object obj);

    public void S(p1.b bVar) {
        this.f19478g.o(bVar);
    }

    protected void X(Y0.c cVar, Object obj) {
        p().p(this.f19481j, this.f19482k);
        q().e(this.f19481j, this.f19482k, I(cVar, obj, z()));
    }

    public void Z(String str) {
        this.f19488q = str;
    }

    @Override // m1.InterfaceC1868a
    public void a() {
        if (K1.b.d()) {
            K1.b.a("AbstractDraweeController#onDetach");
        }
        if (P0.a.u(2)) {
            P0.a.x(f19471y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f19481j);
        }
        this.f19472a.b(C1646c.a.ON_DETACH_CONTROLLER);
        this.f19483l = false;
        this.f19473b.d(this);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    protected void a0(Drawable drawable) {
        this.f19480i = drawable;
        m1.c cVar = this.f19479h;
        if (cVar != null) {
            cVar.c(drawable);
        }
    }

    @Override // m1.InterfaceC1868a
    public InterfaceC1869b b() {
        return this.f19479h;
    }

    @Override // m1.InterfaceC1868a
    public boolean c(MotionEvent motionEvent) {
        if (P0.a.u(2)) {
            P0.a.y(f19471y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f19481j, motionEvent);
        }
        C1846a c1846a = this.f19476e;
        if (c1846a == null) {
            return false;
        }
        if (!c1846a.b() && !f0()) {
            return false;
        }
        this.f19476e.d(motionEvent);
        return true;
    }

    protected void c0(C1846a c1846a) {
        this.f19476e = c1846a;
        if (c1846a != null) {
            c1846a.f(this);
        }
    }

    @Override // m1.InterfaceC1868a
    public void d(InterfaceC1869b interfaceC1869b) {
        if (P0.a.u(2)) {
            P0.a.y(f19471y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f19481j, interfaceC1869b);
        }
        this.f19472a.b(interfaceC1869b != null ? C1646c.a.ON_SET_HIERARCHY : C1646c.a.ON_CLEAR_HIERARCHY);
        if (this.f19484m) {
            this.f19473b.a(this);
            release();
        }
        m1.c cVar = this.f19479h;
        if (cVar != null) {
            cVar.c(null);
            this.f19479h = null;
        }
        if (interfaceC1869b != null) {
            l.b(Boolean.valueOf(interfaceC1869b instanceof m1.c));
            m1.c cVar2 = (m1.c) interfaceC1869b;
            this.f19479h = cVar2;
            cVar2.c(this.f19480i);
        }
    }

    protected void d0(boolean z6) {
        this.f19492u = z6;
    }

    @Override // l1.C1846a.InterfaceC0300a
    public boolean e() {
        if (P0.a.u(2)) {
            P0.a.x(f19471y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f19481j);
        }
        if (!g0()) {
            return false;
        }
        this.f19475d.b();
        this.f19479h.a();
        h0();
        return true;
    }

    protected void e0(boolean z6) {
        this.f19487p = z6;
    }

    @Override // m1.InterfaceC1868a
    public void f() {
        if (K1.b.d()) {
            K1.b.a("AbstractDraweeController#onAttach");
        }
        if (P0.a.u(2)) {
            P0.a.y(f19471y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f19481j, this.f19484m ? "request already submitted" : "request needs submit");
        }
        this.f19472a.b(C1646c.a.ON_ATTACH_CONTROLLER);
        l.g(this.f19479h);
        this.f19473b.a(this);
        this.f19483l = true;
        if (!this.f19484m) {
            h0();
        }
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    protected boolean f0() {
        return g0();
    }

    protected void h0() {
        if (K1.b.d()) {
            K1.b.a("AbstractDraweeController#submitRequest");
        }
        Object objN = n();
        if (objN != null) {
            if (K1.b.d()) {
                K1.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f19489r = null;
            this.f19484m = true;
            this.f19486o = false;
            this.f19472a.b(C1646c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f19489r, y(objN));
            M(this.f19481j, objN);
            N(this.f19481j, this.f19489r, objN, 1.0f, true, true, true);
            if (K1.b.d()) {
                K1.b.b();
            }
            if (K1.b.d()) {
                K1.b.b();
                return;
            }
            return;
        }
        this.f19472a.b(C1646c.a.ON_DATASOURCE_SUBMIT);
        this.f19479h.f(0.0f, true);
        this.f19484m = true;
        this.f19486o = false;
        Y0.c cVarS = s();
        this.f19489r = cVarS;
        X(cVarS, null);
        if (P0.a.u(2)) {
            P0.a.y(f19471y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f19481j, Integer.valueOf(System.identityHashCode(this.f19489r)));
        }
        this.f19489r.e(new C0259a(this.f19481j, this.f19489r.a()), this.f19474c);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    public void j(InterfaceC1689d interfaceC1689d) {
        l.g(interfaceC1689d);
        InterfaceC1689d interfaceC1689d2 = this.f19477f;
        if (interfaceC1689d2 instanceof b) {
            ((b) interfaceC1689d2).b(interfaceC1689d);
        } else if (interfaceC1689d2 != null) {
            this.f19477f = b.f(interfaceC1689d2, interfaceC1689d);
        } else {
            this.f19477f = interfaceC1689d;
        }
    }

    public void k(p1.b bVar) {
        this.f19478g.n(bVar);
    }

    protected abstract Drawable l(Object obj);

    public Animatable m() {
        Object obj = this.f19493v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected abstract Object n();

    public Object o() {
        return this.f19482k;
    }

    protected InterfaceC1689d p() {
        InterfaceC1689d interfaceC1689d = this.f19477f;
        return interfaceC1689d == null ? C1688c.b() : interfaceC1689d;
    }

    protected p1.b q() {
        return this.f19478g;
    }

    protected Drawable r() {
        return this.f19480i;
    }

    @Override // f1.AbstractC1644a.InterfaceC0256a
    public void release() {
        this.f19472a.b(C1646c.a.ON_RELEASE_CONTROLLER);
        C1647d c1647d = this.f19475d;
        if (c1647d != null) {
            c1647d.c();
        }
        C1846a c1846a = this.f19476e;
        if (c1846a != null) {
            c1846a.e();
        }
        m1.c cVar = this.f19479h;
        if (cVar != null) {
            cVar.a();
        }
        Q();
    }

    protected abstract Y0.c s();

    public String toString() {
        return j.c(this).c("isAttached", this.f19483l).c("isRequestSubmitted", this.f19484m).c("hasFetchFailed", this.f19486o).a("fetchedImage", x(this.f19490s)).b("events", this.f19472a.toString()).toString();
    }

    protected C1846a u() {
        return this.f19476e;
    }

    public String v() {
        return this.f19481j;
    }

    protected String w(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected abstract int x(Object obj);

    protected abstract Object y(Object obj);

    protected abstract Uri z();

    public void b0(InterfaceC1690e interfaceC1690e) {
    }

    protected void M(String str, Object obj) {
    }
}
