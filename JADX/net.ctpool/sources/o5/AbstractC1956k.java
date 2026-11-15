package o5;

import m5.InterfaceC1885d;
import w5.w;

/* JADX INFO: renamed from: o5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1956k extends AbstractC1949d implements w5.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f21496p;

    public AbstractC1956k(int i7, InterfaceC1885d interfaceC1885d) {
        super(interfaceC1885d);
        this.f21496p = i7;
    }

    @Override // w5.g
    public int getArity() {
        return this.f21496p;
    }

    @Override // o5.AbstractC1946a
    public String toString() {
        if (l() != null) {
            return super.toString();
        }
        String strF = w.f(this);
        w5.k.e(strF, "renderLambdaToString(...)");
        return strF;
    }
}
