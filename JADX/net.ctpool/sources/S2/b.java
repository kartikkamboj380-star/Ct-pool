package S2;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f2947a;

    b(Integer num) {
        this.f2947a = num;
    }

    @Override // S2.g
    public Integer a() {
        return this.f2947a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f2947a;
        Integer numA = ((g) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f2947a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f2947a + "}";
    }
}
