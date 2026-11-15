package H5;

import M5.C0433j;
import i5.AbstractC1744a;
import i5.m;
import java.util.concurrent.CancellationException;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U extends O5.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1406o;

    public U(int i7) {
        this.f1406o = i7;
    }

    public abstract void d(Object obj, Throwable th);

    public abstract InterfaceC1885d e();

    public Throwable f(Object obj) {
        C0423z c0423z = obj instanceof C0423z ? (C0423z) obj : null;
        if (c0423z != null) {
            return c0423z.f1476a;
        }
        return null;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1744a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        w5.k.c(th);
        H.a(e().a(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        Object objA2;
        Object objA3;
        O5.i iVar = this.f2532n;
        try {
            InterfaceC1885d interfaceC1885dE = e();
            w5.k.d(interfaceC1885dE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0433j c0433j = (C0433j) interfaceC1885dE;
            InterfaceC1885d interfaceC1885d = c0433j.f2090q;
            Object obj = c0433j.f2092s;
            InterfaceC1888g interfaceC1888gA = interfaceC1885d.a();
            Object objC = M5.J.c(interfaceC1888gA, obj);
            N0 n0G = objC != M5.J.f2068a ? E.g(interfaceC1885d, interfaceC1888gA, objC) : null;
            try {
                InterfaceC1888g interfaceC1888gA2 = interfaceC1885d.a();
                Object objL = l();
                Throwable thF = f(objL);
                InterfaceC0415q0 interfaceC0415q0 = (thF == null && V.b(this.f1406o)) ? (InterfaceC0415q0) interfaceC1888gA2.b(InterfaceC0415q0.f1444b) : null;
                if (interfaceC0415q0 != null && !interfaceC0415q0.d()) {
                    CancellationException cancellationExceptionW = interfaceC0415q0.w();
                    d(objL, cancellationExceptionW);
                    m.a aVar = i5.m.f19973m;
                    objA2 = i5.m.a(i5.n.a(cancellationExceptionW));
                } else if (thF != null) {
                    m.a aVar2 = i5.m.f19973m;
                    objA2 = i5.m.a(i5.n.a(thF));
                } else {
                    m.a aVar3 = i5.m.f19973m;
                    objA2 = i5.m.a(i(objL));
                }
                interfaceC1885d.h(objA2);
                i5.u uVar = i5.u.f19985a;
                if (n0G == null || n0G.N0()) {
                    M5.J.a(interfaceC1888gA, objC);
                }
                try {
                    iVar.a();
                    objA3 = i5.m.a(i5.u.f19985a);
                } catch (Throwable th) {
                    m.a aVar4 = i5.m.f19973m;
                    objA3 = i5.m.a(i5.n.a(th));
                }
                j(null, i5.m.b(objA3));
            } catch (Throwable th2) {
                if (n0G == null || n0G.N0()) {
                    M5.J.a(interfaceC1888gA, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m.a aVar5 = i5.m.f19973m;
                iVar.a();
                objA = i5.m.a(i5.u.f19985a);
            } catch (Throwable th4) {
                m.a aVar6 = i5.m.f19973m;
                objA = i5.m.a(i5.n.a(th4));
            }
            j(th3, i5.m.b(objA));
        }
    }

    public Object i(Object obj) {
        return obj;
    }
}
