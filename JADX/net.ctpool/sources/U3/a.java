package U3;

/* JADX INFO: loaded from: classes.dex */
final class a extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final a f3839m = new a();

    private a() {
    }

    static g e() {
        return f3839m;
    }

    @Override // U3.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // U3.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
