package S2;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f2943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f2945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f2946d;

    a(Integer num, Object obj, f fVar, g gVar, e eVar) {
        this.f2943a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f2944b = obj;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f2945c = fVar;
        this.f2946d = gVar;
    }

    @Override // S2.d
    public Integer a() {
        return this.f2943a;
    }

    @Override // S2.d
    public e b() {
        return null;
    }

    @Override // S2.d
    public Object c() {
        return this.f2944b;
    }

    @Override // S2.d
    public f d() {
        return this.f2945c;
    }

    @Override // S2.d
    public g e() {
        return this.f2946d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f2943a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f2944b.equals(dVar.c()) && this.f2945c.equals(dVar.d()) && ((gVar = this.f2946d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                dVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f2943a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f2944b.hashCode()) * 1000003) ^ this.f2945c.hashCode()) * 1000003;
        g gVar = this.f2946d;
        return (iHashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f2943a + ", payload=" + this.f2944b + ", priority=" + this.f2945c + ", productData=" + this.f2946d + ", eventContext=" + ((Object) null) + "}";
    }
}
