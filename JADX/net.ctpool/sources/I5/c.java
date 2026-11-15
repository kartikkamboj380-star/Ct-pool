package I5;

import H5.S;
import H5.W;
import H5.u0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1888g;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d implements S {
    private volatile c _immediate;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f1526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f1527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f1528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f1529r;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void f1(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        u0.c(interfaceC1888g, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        W.b().a(interfaceC1888g, runnable);
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        if (this.f1526o.post(runnable)) {
            return;
        }
        f1(interfaceC1888g, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1526o == this.f1526o;
    }

    @Override // H5.F
    public boolean g(InterfaceC1888g interfaceC1888g) {
        return (this.f1528q && k.b(Looper.myLooper(), this.f1526o.getLooper())) ? false : true;
    }

    @Override // H5.B0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public c S0() {
        return this.f1529r;
    }

    public int hashCode() {
        return System.identityHashCode(this.f1526o);
    }

    @Override // H5.F
    public String toString() {
        String strB1 = b1();
        if (strB1 != null) {
            return strB1;
        }
        String string = this.f1527p;
        if (string == null) {
            string = this.f1526o.toString();
        }
        if (!this.f1528q) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    private c(Handler handler, String str, boolean z6) {
        super(null);
        this.f1526o = handler;
        this.f1527p = str;
        this.f1528q = z6;
        this._immediate = z6 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f1529r = cVar;
    }
}
