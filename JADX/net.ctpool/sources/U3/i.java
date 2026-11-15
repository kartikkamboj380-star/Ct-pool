package U3;

/* JADX INFO: loaded from: classes.dex */
final class i extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f3848m;

    i(Object obj) {
        this.f3848m = obj;
    }

    @Override // U3.g
    public Object b() {
        return this.f3848m;
    }

    @Override // U3.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3848m.equals(((i) obj).f3848m);
        }
        return false;
    }

    public int hashCode() {
        return this.f3848m.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f3848m);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
