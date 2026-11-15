package j5;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends AbstractC1811p {
    public static int q(Iterable iterable, int i7) {
        w5.k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
