package i5;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f19973m = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Throwable f19974m;

        public b(Throwable th) {
            w5.k.f(th, "exception");
            this.f19974m = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && w5.k.b(this.f19974m, ((b) obj).f19974m);
        }

        public int hashCode() {
            return this.f19974m.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f19974m + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f19974m;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
