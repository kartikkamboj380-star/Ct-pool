package L1;

import java.util.Arrays;
import w5.k;
import w5.y;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1957a;

    public b(int i7) {
        this.f1957a = i7;
    }

    public final int a() {
        return this.f1957a;
    }

    public String toString() {
        y yVar = y.f22743a;
        String str = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f1957a)}, 1));
        k.e(str, "format(locale, format, *args)");
        return str;
    }
}
