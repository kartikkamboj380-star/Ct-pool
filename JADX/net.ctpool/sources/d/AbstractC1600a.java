package d;

import android.content.Context;
import android.content.Intent;
import w5.k;

/* JADX INFO: renamed from: d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1600a {

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0249a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f18650a;

        public C0249a(Object obj) {
            this.f18650a = obj;
        }

        public final Object a() {
            return this.f18650a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0249a b(Context context, Object obj) {
        k.f(context, "context");
        return null;
    }

    public abstract Object c(int i7, Intent intent);
}
