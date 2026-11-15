package A5;

import java.util.Random;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends A5.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f654o = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // A5.a
    public Random c() {
        Object obj = this.f654o.get();
        k.e(obj, "get(...)");
        return (Random) obj;
    }
}
