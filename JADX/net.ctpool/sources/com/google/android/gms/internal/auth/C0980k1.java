package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0980k1 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13985b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f13986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13987d;

    C0980k1(Z0 z02, String str, Object[] objArr) {
        this.f13984a = z02;
        this.f13986c = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f13987d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i8);
            if (cCharAt2 < 55296) {
                this.f13987d = (cCharAt2 << i9) | i7;
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final Z0 a() {
        return this.f13984a;
    }

    final String b() {
        return this.f13985b;
    }

    final Object[] c() {
        return this.f13986c;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final boolean zzb() {
        return (this.f13987d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final int zzc() {
        return (this.f13987d & 1) != 0 ? 1 : 2;
    }
}
