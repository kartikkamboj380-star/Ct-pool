package M5;

/* JADX INFO: renamed from: M5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0437n {
    public static final void a(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i7).toString());
    }
}
