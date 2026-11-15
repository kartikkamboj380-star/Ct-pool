package C5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f955q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final c f956r = new c(1, 0);

    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f956r;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // C5.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (f() != cVar.f() || h() != cVar.h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // C5.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + h();
    }

    @Override // C5.a
    public boolean isEmpty() {
        return f() > h();
    }

    public boolean j0(int i7) {
        return f() <= i7 && i7 <= h();
    }

    public Integer n() {
        return Integer.valueOf(h());
    }

    public Integer o() {
        return Integer.valueOf(f());
    }

    @Override // C5.a
    public String toString() {
        return f() + ".." + h();
    }
}
