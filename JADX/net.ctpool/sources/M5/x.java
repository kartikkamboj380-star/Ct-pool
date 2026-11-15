package M5;

import i5.AbstractC1744a;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    static final class a extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ v5.l f2121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f2122n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC1888g f2123o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v5.l lVar, Object obj, InterfaceC1888g interfaceC1888g) {
            super(1);
            this.f2121m = lVar;
            this.f2122n = obj;
            this.f2123o = interfaceC1888g;
        }

        public final void a(Throwable th) {
            x.b(this.f2121m, this.f2122n, this.f2123o);
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return i5.u.f19985a;
        }
    }

    public static final v5.l a(v5.l lVar, Object obj, InterfaceC1888g interfaceC1888g) {
        return new a(lVar, obj, interfaceC1888g);
    }

    public static final void b(v5.l lVar, Object obj, InterfaceC1888g interfaceC1888g) {
        O oC = c(lVar, obj, null);
        if (oC != null) {
            H5.H.a(interfaceC1888g, oC);
        }
    }

    public static final O c(v5.l lVar, Object obj, O o6) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (o6 == null || o6.getCause() == th) {
                return new O("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC1744a.a(o6, th);
        }
        return o6;
    }

    public static /* synthetic */ O d(v5.l lVar, Object obj, O o6, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            o6 = null;
        }
        return c(lVar, obj, o6);
    }
}
