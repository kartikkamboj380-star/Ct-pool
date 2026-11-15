package S;

import H5.P;
import X3.d;
import androidx.concurrent.futures.c;
import i5.u;
import java.util.concurrent.CancellationException;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static final class a extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c.a f2908m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ P f2909n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, P p6) {
            super(1);
            this.f2908m = aVar;
            this.f2909n = p6;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f2908m.b(this.f2909n.e());
            } else if (th instanceof CancellationException) {
                this.f2908m.c();
            } else {
                this.f2908m.e(th);
            }
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u.f19985a;
        }
    }

    public static final d b(final P p6, final Object obj) {
        k.f(p6, "<this>");
        d dVarA = c.a(new c.InterfaceC0127c() { // from class: S.a
            @Override // androidx.concurrent.futures.c.InterfaceC0127c
            public final Object a(c.a aVar) {
                return b.d(p6, obj, aVar);
            }
        });
        k.e(dVarA, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return dVarA;
    }

    public static /* synthetic */ d c(P p6, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(p6, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(P p6, Object obj, c.a aVar) {
        k.f(p6, "$this_asListenableFuture");
        k.f(aVar, "completer");
        p6.D0(new a(aVar, p6));
        return obj;
    }
}
