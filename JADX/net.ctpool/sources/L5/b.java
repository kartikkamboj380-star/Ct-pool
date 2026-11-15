package L5;

import i5.m;
import i5.u;
import java.util.Arrays;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d[] f1994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1996o;

    protected final d c() {
        d dVarD;
        synchronized (this) {
            try {
                d[] dVarArrE = this.f1994m;
                if (dVarArrE == null) {
                    dVarArrE = e(2);
                    this.f1994m = dVarArrE;
                } else if (this.f1995n >= dVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrE, dVarArrE.length * 2);
                    w5.k.e(objArrCopyOf, "copyOf(this, newSize)");
                    this.f1994m = (d[]) objArrCopyOf;
                    dVarArrE = (d[]) objArrCopyOf;
                }
                int i7 = this.f1996o;
                do {
                    dVarD = dVarArrE[i7];
                    if (dVarD == null) {
                        dVarD = d();
                        dVarArrE[i7] = dVarD;
                    }
                    i7++;
                    if (i7 >= dVarArrE.length) {
                        i7 = 0;
                    }
                    w5.k.d(dVarD, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarD.a(this));
                this.f1996o = i7;
                this.f1995n++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarD;
    }

    protected abstract d d();

    protected abstract d[] e(int i7);

    protected final void f(d dVar) {
        int i7;
        InterfaceC1885d[] interfaceC1885dArrB;
        synchronized (this) {
            try {
                int i8 = this.f1995n - 1;
                this.f1995n = i8;
                if (i8 == 0) {
                    this.f1996o = 0;
                }
                w5.k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1885dArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1885d interfaceC1885d : interfaceC1885dArrB) {
            if (interfaceC1885d != null) {
                m.a aVar = m.f19973m;
                interfaceC1885d.h(m.a(u.f19985a));
            }
        }
    }

    protected final d[] g() {
        return this.f1994m;
    }
}
