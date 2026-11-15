package g1;

import O0.j;
import O0.l;
import O0.o;
import Y0.g;
import Y0.h;
import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import l1.C1846a;
import m1.InterfaceC1868a;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1687b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final InterfaceC1689d f19497q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f19498r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f19499s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f19502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f19503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f19504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f19505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f19506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f19508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC1689d f19509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19513n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f19514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC1868a f19515p;

    /* JADX INFO: renamed from: g1.b$a */
    class a extends C1688c {
        a() {
        }

        @Override // g1.C1688c, g1.InterfaceC1689d
        public void e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: g1.b$b, reason: collision with other inner class name */
    class C0260b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1868a f19516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f19518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f19519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f19520e;

        C0260b(InterfaceC1868a interfaceC1868a, String str, Object obj, Object obj2, c cVar) {
            this.f19516a = interfaceC1868a;
            this.f19517b = str;
            this.f19518c = obj;
            this.f19519d = obj2;
            this.f19520e = cVar;
        }

        @Override // O0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Y0.c get() {
            return AbstractC1687b.this.g(this.f19516a, this.f19517b, this.f19518c, this.f19519d, this.f19520e);
        }

        public String toString() {
            return j.c(this).b("request", this.f19518c.toString()).toString();
        }
    }

    /* JADX INFO: renamed from: g1.b$c */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected AbstractC1687b(Context context, Set set, Set set2) {
        this.f19500a = context;
        this.f19501b = set;
        this.f19502c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f19499s.getAndIncrement());
    }

    private void q() {
        this.f19503d = null;
        this.f19504e = null;
        this.f19505f = null;
        this.f19506g = null;
        this.f19507h = true;
        this.f19509j = null;
        this.f19510k = false;
        this.f19511l = false;
        this.f19513n = false;
        this.f19515p = null;
        this.f19514o = null;
    }

    public AbstractC1687b A(InterfaceC1689d interfaceC1689d) {
        this.f19509j = interfaceC1689d;
        return p();
    }

    public AbstractC1687b B(Object obj) {
        this.f19504e = obj;
        return p();
    }

    public AbstractC1687b C(Object obj) {
        this.f19505f = obj;
        return p();
    }

    public AbstractC1687b D(InterfaceC1868a interfaceC1868a) {
        this.f19515p = interfaceC1868a;
        return p();
    }

    protected void E() {
        boolean z6 = true;
        l.j(this.f19506g == null || this.f19504e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f19508i != null && (this.f19506g != null || this.f19504e != null || this.f19505f != null)) {
            z6 = false;
        }
        l.j(z6, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public AbstractC1686a a() {
        Object obj;
        E();
        if (this.f19504e == null && this.f19506g == null && (obj = this.f19505f) != null) {
            this.f19504e = obj;
            this.f19505f = null;
        }
        return b();
    }

    protected AbstractC1686a b() {
        if (K1.b.d()) {
            K1.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC1686a abstractC1686aV = v();
        abstractC1686aV.d0(r());
        abstractC1686aV.e0(o());
        abstractC1686aV.Z(e());
        f();
        abstractC1686aV.b0(null);
        u(abstractC1686aV);
        s(abstractC1686aV);
        if (K1.b.d()) {
            K1.b.b();
        }
        return abstractC1686aV;
    }

    public Object d() {
        return this.f19503d;
    }

    public String e() {
        return this.f19514o;
    }

    public InterfaceC1690e f() {
        return null;
    }

    protected abstract Y0.c g(InterfaceC1868a interfaceC1868a, String str, Object obj, Object obj2, c cVar);

    protected o h(InterfaceC1868a interfaceC1868a, String str, Object obj) {
        return i(interfaceC1868a, str, obj, c.FULL_FETCH);
    }

    protected o i(InterfaceC1868a interfaceC1868a, String str, Object obj, c cVar) {
        return new C0260b(interfaceC1868a, str, obj, d(), cVar);
    }

    protected o j(InterfaceC1868a interfaceC1868a, String str, Object[] objArr, boolean z6) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z6) {
            for (Object obj : objArr) {
                arrayList.add(i(interfaceC1868a, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(h(interfaceC1868a, str, obj2));
        }
        return g.b(arrayList);
    }

    public Object[] k() {
        return this.f19506g;
    }

    public Object l() {
        return this.f19504e;
    }

    public Object m() {
        return this.f19505f;
    }

    public InterfaceC1868a n() {
        return this.f19515p;
    }

    public boolean o() {
        return this.f19512m;
    }

    public boolean r() {
        return this.f19513n;
    }

    protected void s(AbstractC1686a abstractC1686a) {
        Set set = this.f19501b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                abstractC1686a.j((InterfaceC1689d) it.next());
            }
        }
        Set set2 = this.f19502c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC1686a.k((p1.b) it2.next());
            }
        }
        InterfaceC1689d interfaceC1689d = this.f19509j;
        if (interfaceC1689d != null) {
            abstractC1686a.j(interfaceC1689d);
        }
        if (this.f19511l) {
            abstractC1686a.j(f19497q);
        }
    }

    protected void t(AbstractC1686a abstractC1686a) {
        if (abstractC1686a.u() == null) {
            abstractC1686a.c0(C1846a.c(this.f19500a));
        }
    }

    protected void u(AbstractC1686a abstractC1686a) {
        if (this.f19510k) {
            abstractC1686a.A().d(this.f19510k);
            t(abstractC1686a);
        }
    }

    protected abstract AbstractC1686a v();

    protected o w(InterfaceC1868a interfaceC1868a, String str) {
        o oVarJ;
        o oVar = this.f19508i;
        if (oVar != null) {
            return oVar;
        }
        Object obj = this.f19504e;
        if (obj != null) {
            oVarJ = h(interfaceC1868a, str, obj);
        } else {
            Object[] objArr = this.f19506g;
            oVarJ = objArr != null ? j(interfaceC1868a, str, objArr, this.f19507h) : null;
        }
        if (oVarJ != null && this.f19505f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(oVarJ);
            arrayList.add(h(interfaceC1868a, str, this.f19505f));
            oVarJ = h.c(arrayList, false);
        }
        return oVarJ == null ? Y0.d.a(f19498r) : oVarJ;
    }

    public AbstractC1687b x() {
        q();
        return p();
    }

    public AbstractC1687b y(boolean z6) {
        this.f19511l = z6;
        return p();
    }

    public AbstractC1687b z(Object obj) {
        this.f19503d = obj;
        return p();
    }

    protected final AbstractC1687b p() {
        return this;
    }
}
