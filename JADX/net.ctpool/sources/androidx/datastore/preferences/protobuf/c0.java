package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f7576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f7578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7579d;

    c0(O o6, String str, Object[] objArr) {
        char cCharAt;
        this.f7576a = o6;
        this.f7577b = str;
        this.f7578c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i7 = iCharAt & 8191;
            int i8 = 13;
            int i9 = 1;
            while (true) {
                int i10 = i9 + 1;
                cCharAt = str.charAt(i9);
                if (cCharAt < 55296) {
                    break;
                }
                i7 |= (cCharAt & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
            iCharAt = i7 | (cCharAt << i8);
        }
        this.f7579d = iCharAt;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public boolean a() {
        return (this.f7579d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public O b() {
        return this.f7576a;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public Z c() {
        return (this.f7579d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    Object[] d() {
        return this.f7578c;
    }

    String e() {
        return this.f7577b;
    }
}
