package H5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 extends F {
    public abstract B0 S0();

    protected final String b1() {
        B0 b0S0;
        B0 b0C = W.c();
        if (this == b0C) {
            return "Dispatchers.Main";
        }
        try {
            b0S0 = b0C.S0();
        } catch (UnsupportedOperationException unused) {
            b0S0 = null;
        }
        if (this == b0S0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
