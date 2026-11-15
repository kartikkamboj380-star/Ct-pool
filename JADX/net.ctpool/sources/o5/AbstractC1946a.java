package o5;

import i5.m;
import i5.n;
import java.io.Serializable;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;

/* JADX INFO: renamed from: o5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1946a implements InterfaceC1885d, InterfaceC1950e, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1885d f21486m;

    public AbstractC1946a(InterfaceC1885d interfaceC1885d) {
        this.f21486m = interfaceC1885d;
    }

    public InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
        w5.k.f(interfaceC1885d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC1950e g() {
        InterfaceC1885d interfaceC1885d = this.f21486m;
        if (interfaceC1885d instanceof InterfaceC1950e) {
            return (InterfaceC1950e) interfaceC1885d;
        }
        return null;
    }

    @Override // m5.InterfaceC1885d
    public final void h(Object obj) {
        Object objS;
        InterfaceC1885d interfaceC1885d = this;
        while (true) {
            AbstractC1953h.b(interfaceC1885d);
            AbstractC1946a abstractC1946a = (AbstractC1946a) interfaceC1885d;
            InterfaceC1885d interfaceC1885d2 = abstractC1946a.f21486m;
            w5.k.c(interfaceC1885d2);
            try {
                objS = abstractC1946a.s(obj);
            } catch (Throwable th) {
                m.a aVar = m.f19973m;
                obj = m.a(n.a(th));
            }
            if (objS == AbstractC1930b.c()) {
                return;
            }
            obj = m.a(objS);
            abstractC1946a.t();
            if (!(interfaceC1885d2 instanceof AbstractC1946a)) {
                interfaceC1885d2.h(obj);
                return;
            }
            interfaceC1885d = interfaceC1885d2;
        }
    }

    public final InterfaceC1885d l() {
        return this.f21486m;
    }

    public StackTraceElement n() {
        return AbstractC1952g.d(this);
    }

    protected abstract Object s(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb.append(objN);
        return sb.toString();
    }

    protected void t() {
    }
}
