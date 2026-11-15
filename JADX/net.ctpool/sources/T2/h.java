package T2;

import T2.r;

/* JADX INFO: loaded from: classes.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f3101a;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f3102a;

        b() {
        }

        @Override // T2.r.a
        public r a() {
            return new h(this.f3102a);
        }

        @Override // T2.r.a
        public r.a b(Integer num) {
            this.f3102a = num;
            return this;
        }
    }

    private h(Integer num) {
        this.f3101a = num;
    }

    @Override // T2.r
    public Integer b() {
        return this.f3101a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f3101a;
        Integer numB = ((r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f3101a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f3101a + "}";
    }
}
