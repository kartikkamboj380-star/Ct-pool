package J5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1817a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f1818b = new c();

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f1819a;

        public a(Throwable th) {
            this.f1819a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && w5.k.b(this.f1819a, ((a) obj).f1819a);
        }

        public int hashCode() {
            Throwable th = this.f1819a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // J5.f.c
        public String toString() {
            return "Closed(" + this.f1819a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public final Object a(Throwable th) {
            return f.b(new a(th));
        }

        public final Object b() {
            return f.b(f.f1818b);
        }

        public final Object c(Object obj) {
            return f.b(obj);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f1819a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
