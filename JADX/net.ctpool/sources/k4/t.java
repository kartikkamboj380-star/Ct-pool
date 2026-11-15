package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class t extends F.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20927d;

    static final class b extends F.e.d.a.c.AbstractC0290a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f20932e;

        b() {
        }

        @Override // k4.F.e.d.a.c.AbstractC0290a
        public F.e.d.a.c a() {
            String str;
            if (this.f20932e == 7 && (str = this.f20928a) != null) {
                return new t(str, this.f20929b, this.f20930c, this.f20931d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20928a == null) {
                sb.append(" processName");
            }
            if ((this.f20932e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f20932e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f20932e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.c.AbstractC0290a
        public F.e.d.a.c.AbstractC0290a b(boolean z6) {
            this.f20931d = z6;
            this.f20932e = (byte) (this.f20932e | 4);
            return this;
        }

        @Override // k4.F.e.d.a.c.AbstractC0290a
        public F.e.d.a.c.AbstractC0290a c(int i7) {
            this.f20930c = i7;
            this.f20932e = (byte) (this.f20932e | 2);
            return this;
        }

        @Override // k4.F.e.d.a.c.AbstractC0290a
        public F.e.d.a.c.AbstractC0290a d(int i7) {
            this.f20929b = i7;
            this.f20932e = (byte) (this.f20932e | 1);
            return this;
        }

        @Override // k4.F.e.d.a.c.AbstractC0290a
        public F.e.d.a.c.AbstractC0290a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f20928a = str;
            return this;
        }
    }

    private t(String str, int i7, int i8, boolean z6) {
        this.f20924a = str;
        this.f20925b = i7;
        this.f20926c = i8;
        this.f20927d = z6;
    }

    @Override // k4.F.e.d.a.c
    public int b() {
        return this.f20926c;
    }

    @Override // k4.F.e.d.a.c
    public int c() {
        return this.f20925b;
    }

    @Override // k4.F.e.d.a.c
    public String d() {
        return this.f20924a;
    }

    @Override // k4.F.e.d.a.c
    public boolean e() {
        return this.f20927d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return this.f20924a.equals(cVar.d()) && this.f20925b == cVar.c() && this.f20926c == cVar.b() && this.f20927d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f20924a.hashCode() ^ 1000003) * 1000003) ^ this.f20925b) * 1000003) ^ this.f20926c) * 1000003) ^ (this.f20927d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f20924a + ", pid=" + this.f20925b + ", importance=" + this.f20926c + ", defaultProcess=" + this.f20927d + "}";
    }
}
