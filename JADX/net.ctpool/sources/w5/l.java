package w5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l implements g, Serializable {
    private final int arity;

    public l(int i7) {
        this.arity = i7;
    }

    @Override // w5.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strG = w.g(this);
        k.e(strG, "renderLambdaToString(...)");
        return strG;
    }
}
