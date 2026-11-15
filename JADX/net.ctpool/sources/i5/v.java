package i5;

import java.io.Serializable;
import kotlin.Lazy;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Lazy, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC2171a f19986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f19987n;

    public v(InterfaceC2171a interfaceC2171a) {
        w5.k.f(interfaceC2171a, "initializer");
        this.f19986m = interfaceC2171a;
        this.f19987n = r.f19983a;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f19987n != r.f19983a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f19987n == r.f19983a) {
            InterfaceC2171a interfaceC2171a = this.f19986m;
            w5.k.c(interfaceC2171a);
            this.f19987n = interfaceC2171a.invoke();
            this.f19986m = null;
        }
        return this.f19987n;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
