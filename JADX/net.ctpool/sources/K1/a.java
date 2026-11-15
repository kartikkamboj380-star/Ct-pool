package K1;

import K1.b;
import android.os.Trace;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b.c {
    @Override // K1.b.c
    public void a(String str) {
        k.f(str, "name");
        if (isTracing()) {
            Trace.beginSection(str);
        }
    }

    @Override // K1.b.c
    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // K1.b.c
    public boolean isTracing() {
        return false;
    }
}
