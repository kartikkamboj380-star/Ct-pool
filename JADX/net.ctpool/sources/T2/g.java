package T2;

import T2.q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3098b;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f3099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f3100b;

        b() {
        }

        @Override // T2.q.a
        public q a() {
            return new g(this.f3099a, this.f3100b);
        }

        @Override // T2.q.a
        public q.a b(byte[] bArr) {
            this.f3099a = bArr;
            return this;
        }

        @Override // T2.q.a
        public q.a c(byte[] bArr) {
            this.f3100b = bArr;
            return this;
        }
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f3097a = bArr;
        this.f3098b = bArr2;
    }

    @Override // T2.q
    public byte[] b() {
        return this.f3097a;
    }

    @Override // T2.q
    public byte[] c() {
        return this.f3098b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z6 = qVar instanceof g;
        if (Arrays.equals(this.f3097a, z6 ? ((g) qVar).f3097a : qVar.b())) {
            if (Arrays.equals(this.f3098b, z6 ? ((g) qVar).f3098b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f3097a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3098b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f3097a) + ", encryptedBlob=" + Arrays.toString(this.f3098b) + "}";
    }
}
