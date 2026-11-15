package U2;

import U2.i;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f3765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f3766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f3767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f3768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f3769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f3770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f3772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f3773j;

    /* JADX INFO: renamed from: U2.b$b, reason: collision with other inner class name */
    static final class C0085b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f3775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f3776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f3777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f3778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f3779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f3780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f3781h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f3782i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f3783j;

        C0085b() {
        }

        @Override // U2.i.a
        public i d() {
            String str = "";
            if (this.f3774a == null) {
                str = " transportName";
            }
            if (this.f3776c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3777d == null) {
                str = str + " eventMillis";
            }
            if (this.f3778e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3779f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f3774a, this.f3775b, this.f3776c, this.f3777d.longValue(), this.f3778e.longValue(), this.f3779f, this.f3780g, this.f3781h, this.f3782i, this.f3783j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // U2.i.a
        protected Map e() {
            Map map = this.f3779f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // U2.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f3779f = map;
            return this;
        }

        @Override // U2.i.a
        public i.a g(Integer num) {
            this.f3775b = num;
            return this;
        }

        @Override // U2.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f3776c = hVar;
            return this;
        }

        @Override // U2.i.a
        public i.a i(long j7) {
            this.f3777d = Long.valueOf(j7);
            return this;
        }

        @Override // U2.i.a
        public i.a j(byte[] bArr) {
            this.f3782i = bArr;
            return this;
        }

        @Override // U2.i.a
        public i.a k(byte[] bArr) {
            this.f3783j = bArr;
            return this;
        }

        @Override // U2.i.a
        public i.a l(Integer num) {
            this.f3780g = num;
            return this;
        }

        @Override // U2.i.a
        public i.a m(String str) {
            this.f3781h = str;
            return this;
        }

        @Override // U2.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f3774a = str;
            return this;
        }

        @Override // U2.i.a
        public i.a o(long j7) {
            this.f3778e = Long.valueOf(j7);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j7, long j8, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f3764a = str;
        this.f3765b = num;
        this.f3766c = hVar;
        this.f3767d = j7;
        this.f3768e = j8;
        this.f3769f = map;
        this.f3770g = num2;
        this.f3771h = str2;
        this.f3772i = bArr;
        this.f3773j = bArr2;
    }

    @Override // U2.i
    protected Map c() {
        return this.f3769f;
    }

    @Override // U2.i
    public Integer d() {
        return this.f3765b;
    }

    @Override // U2.i
    public h e() {
        return this.f3766c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3764a.equals(iVar.n()) && ((num = this.f3765b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f3766c.equals(iVar.e()) && this.f3767d == iVar.f() && this.f3768e == iVar.o() && this.f3769f.equals(iVar.c()) && ((num2 = this.f3770g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f3771h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z6 = iVar instanceof b;
            if (Arrays.equals(this.f3772i, z6 ? ((b) iVar).f3772i : iVar.g())) {
                if (Arrays.equals(this.f3773j, z6 ? ((b) iVar).f3773j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U2.i
    public long f() {
        return this.f3767d;
    }

    @Override // U2.i
    public byte[] g() {
        return this.f3772i;
    }

    @Override // U2.i
    public byte[] h() {
        return this.f3773j;
    }

    public int hashCode() {
        int iHashCode = (this.f3764a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3765b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3766c.hashCode()) * 1000003;
        long j7 = this.f3767d;
        int i7 = (iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f3768e;
        int iHashCode3 = (((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f3769f.hashCode()) * 1000003;
        Integer num2 = this.f3770g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f3771h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f3772i)) * 1000003) ^ Arrays.hashCode(this.f3773j);
    }

    @Override // U2.i
    public Integer l() {
        return this.f3770g;
    }

    @Override // U2.i
    public String m() {
        return this.f3771h;
    }

    @Override // U2.i
    public String n() {
        return this.f3764a;
    }

    @Override // U2.i
    public long o() {
        return this.f3768e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3764a + ", code=" + this.f3765b + ", encodedPayload=" + this.f3766c + ", eventMillis=" + this.f3767d + ", uptimeMillis=" + this.f3768e + ", autoMetadata=" + this.f3769f + ", productId=" + this.f3770g + ", pseudonymousId=" + this.f3771h + ", experimentIdsClear=" + Arrays.toString(this.f3772i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f3773j) + "}";
    }
}
