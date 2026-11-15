package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class l extends RuntimeException {
    public l() {
        this(null);
    }

    public l(String str) {
        super(androidx.core.util.b.e(str, "The operation has been canceled."));
    }
}
