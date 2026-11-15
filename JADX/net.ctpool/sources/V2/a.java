package V2;

import V2.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f4018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f4019b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f4020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f4021b;

        b() {
        }

        @Override // V2.f.a
        public f a() {
            String str = "";
            if (this.f4020a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f4020a, this.f4021b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V2.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f4020a = iterable;
            return this;
        }

        @Override // V2.f.a
        public f.a c(byte[] bArr) {
            this.f4021b = bArr;
            return this;
        }
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f4018a = iterable;
        this.f4019b = bArr;
    }

    @Override // V2.f
    public Iterable b() {
        return this.f4018a;
    }

    @Override // V2.f
    public byte[] c() {
        return this.f4019b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4018a.equals(fVar.b())) {
            if (Arrays.equals(this.f4019b, fVar instanceof a ? ((a) fVar).f4019b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4018a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4019b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f4018a + ", extras=" + Arrays.toString(this.f4019b) + "}";
    }
}
