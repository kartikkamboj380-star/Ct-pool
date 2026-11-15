package i5;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
final class p implements Lazy, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC2171a f19980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f19981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f19982o;

    public p(InterfaceC2171a interfaceC2171a, Object obj) {
        w5.k.f(interfaceC2171a, "initializer");
        this.f19980m = interfaceC2171a;
        this.f19981n = r.f19983a;
        this.f19982o = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f19981n != r.f19983a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f19981n;
        r rVar = r.f19983a;
        if (obj != rVar) {
            return obj;
        }
        synchronized (this.f19982o) {
            objInvoke = this.f19981n;
            if (objInvoke == rVar) {
                InterfaceC2171a interfaceC2171a = this.f19980m;
                w5.k.c(interfaceC2171a);
                objInvoke = interfaceC2171a.invoke();
                this.f19981n = objInvoke;
                this.f19980m = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(InterfaceC2171a interfaceC2171a, Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2171a, (i7 & 2) != 0 ? null : obj);
    }
}
