package U2;

import U2.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S2.f f3796c;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f3798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private S2.f f3799c;

        b() {
        }

        @Override // U2.p.a
        public p a() {
            String str = "";
            if (this.f3797a == null) {
                str = " backendName";
            }
            if (this.f3799c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f3797a, this.f3798b, this.f3799c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // U2.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f3797a = str;
            return this;
        }

        @Override // U2.p.a
        public p.a c(byte[] bArr) {
            this.f3798b = bArr;
            return this;
        }

        @Override // U2.p.a
        public p.a d(S2.f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f3799c = fVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, S2.f fVar) {
        this.f3794a = str;
        this.f3795b = bArr;
        this.f3796c = fVar;
    }

    @Override // U2.p
    public String b() {
        return this.f3794a;
    }

    @Override // U2.p
    public byte[] c() {
        return this.f3795b;
    }

    @Override // U2.p
    public S2.f d() {
        return this.f3796c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f3794a.equals(pVar.b())) {
            if (Arrays.equals(this.f3795b, pVar instanceof d ? ((d) pVar).f3795b : pVar.c()) && this.f3796c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3794a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3795b)) * 1000003) ^ this.f3796c.hashCode();
    }
}
