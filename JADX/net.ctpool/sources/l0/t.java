package l0;

import android.content.Context;
import androidx.work.impl.E;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected t() {
    }

    public static t h(Context context) {
        return E.q(context);
    }

    public static void i(Context context, androidx.work.a aVar) {
        E.i(context, aVar);
    }

    public abstract l a(String str);

    public abstract l b(String str);

    public abstract l c(List list);

    public final l d(u uVar) {
        return c(Collections.singletonList(uVar));
    }

    public abstract l e(String str, EnumC1845c enumC1845c, n nVar);

    public abstract l f(String str, d dVar, List list);

    public l g(String str, d dVar, k kVar) {
        return f(str, dVar, Collections.singletonList(kVar));
    }

    public abstract l j();
}
