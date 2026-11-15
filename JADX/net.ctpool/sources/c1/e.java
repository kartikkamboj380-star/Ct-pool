package c1;

import J1.b;
import O0.p;
import android.content.Context;
import g1.AbstractC1687b;
import java.util.Set;
import m1.InterfaceC1868a;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC1687b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final k f9981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g f9982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private O0.f f9983v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9984a;

        static {
            int[] iArr = new int[AbstractC1687b.c.values().length];
            f9984a = iArr;
            try {
                iArr[AbstractC1687b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9984a[AbstractC1687b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9984a[AbstractC1687b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, k kVar, Set set, Set set2) {
        super(context, set, set2);
        this.f9981t = kVar;
        this.f9982u = gVar;
    }

    public static b.c F(AbstractC1687b.c cVar) {
        int i7 = a.f9984a[cVar.ordinal()];
        if (i7 == 1) {
            return b.c.FULL_FETCH;
        }
        if (i7 == 2) {
            return b.c.DISK_CACHE;
        }
        if (i7 == 3) {
            return b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private I0.d G() {
        J1.b bVar = (J1.b) l();
        w1.k kVarN = this.f9981t.n();
        if (kVarN == null || bVar == null) {
            return null;
        }
        return bVar.k() != null ? kVarN.b(bVar, d()) : kVarN.a(bVar, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1687b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Y0.c g(InterfaceC1868a interfaceC1868a, String str, J1.b bVar, Object obj, AbstractC1687b.c cVar) {
        return this.f9981t.i(bVar, obj, F(cVar), I(interfaceC1868a), str);
    }

    protected F1.e I(InterfaceC1868a interfaceC1868a) {
        if (interfaceC1868a instanceof d) {
            return ((d) interfaceC1868a).o0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1687b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public d v() {
        if (K1.b.d()) {
            K1.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            InterfaceC1868a interfaceC1868aN = n();
            String strC = AbstractC1687b.c();
            d dVarC = interfaceC1868aN instanceof d ? (d) interfaceC1868aN : this.f9982u.c();
            dVarC.q0(w(dVarC, strC), strC, G(), d(), this.f9983v);
            dVarC.r0(null, this, p.f2461b);
            if (K1.b.d()) {
                K1.b.b();
            }
            return dVarC;
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    public e K(p1.g gVar) {
        return (e) p();
    }
}
