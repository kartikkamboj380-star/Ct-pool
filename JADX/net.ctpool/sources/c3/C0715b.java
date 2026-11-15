package c3;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0715b extends AbstractC0724k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U2.p f10050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U2.i f10051c;

    C0715b(long j7, U2.p pVar, U2.i iVar) {
        this.f10049a = j7;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f10050b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f10051c = iVar;
    }

    @Override // c3.AbstractC0724k
    public U2.i b() {
        return this.f10051c;
    }

    @Override // c3.AbstractC0724k
    public long c() {
        return this.f10049a;
    }

    @Override // c3.AbstractC0724k
    public U2.p d() {
        return this.f10050b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0724k)) {
            return false;
        }
        AbstractC0724k abstractC0724k = (AbstractC0724k) obj;
        return this.f10049a == abstractC0724k.c() && this.f10050b.equals(abstractC0724k.d()) && this.f10051c.equals(abstractC0724k.b());
    }

    public int hashCode() {
        long j7 = this.f10049a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f10050b.hashCode()) * 1000003) ^ this.f10051c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f10049a + ", transportContext=" + this.f10050b + ", event=" + this.f10051c + "}";
    }
}
