package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class y extends F.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20961a;

    static final class b extends F.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f20962a;

        b() {
        }

        @Override // k4.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f20962a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // k4.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f20962a = list;
            return this;
        }
    }

    private y(List list) {
        this.f20961a = list;
    }

    @Override // k4.F.e.d.f
    public List b() {
        return this.f20961a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f20961a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f20961a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f20961a + "}";
    }
}
