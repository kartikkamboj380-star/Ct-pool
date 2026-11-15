package z4;

import z4.d;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2277a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f23313b = d.a.DEFAULT;

    /* JADX INFO: renamed from: z4.a$a, reason: collision with other inner class name */
    private static final class C0333a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f23315b;

        C0333a(int i7, d.a aVar) {
            this.f23314a = i7;
            this.f23315b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f23314a == dVar.tag() && this.f23315b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f23314a) + (this.f23315b.hashCode() ^ 2041407134);
        }

        @Override // z4.d
        public d.a intEncoding() {
            return this.f23315b;
        }

        @Override // z4.d
        public int tag() {
            return this.f23314a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f23314a + "intEncoding=" + this.f23315b + ')';
        }
    }

    public static C2277a b() {
        return new C2277a();
    }

    public d a() {
        return new C0333a(this.f23312a, this.f23313b);
    }

    public C2277a c(int i7) {
        this.f23312a = i7;
        return this;
    }
}
