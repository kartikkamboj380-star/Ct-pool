package k4;

import java.util.Arrays;
import k4.F;

/* JADX INFO: renamed from: k4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1833g extends F.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20782b;

    /* JADX INFO: renamed from: k4.g$b */
    static final class b extends F.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f20784b;

        b() {
        }

        @Override // k4.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f20783a;
            if (str != null && (bArr = this.f20784b) != null) {
                return new C1833g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20783a == null) {
                sb.append(" filename");
            }
            if (this.f20784b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f20784b = bArr;
            return this;
        }

        @Override // k4.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f20783a = str;
            return this;
        }
    }

    private C1833g(String str, byte[] bArr) {
        this.f20781a = str;
        this.f20782b = bArr;
    }

    @Override // k4.F.d.b
    public byte[] b() {
        return this.f20782b;
    }

    @Override // k4.F.d.b
    public String c() {
        return this.f20781a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f20781a.equals(bVar.c())) {
            if (Arrays.equals(this.f20782b, bVar instanceof C1833g ? ((C1833g) bVar).f20782b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20781a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20782b);
    }

    public String toString() {
        return "File{filename=" + this.f20781a + ", contents=" + Arrays.toString(this.f20782b) + "}";
    }
}
