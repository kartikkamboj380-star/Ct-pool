package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1289g1 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f15182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f15184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15185d;

    C1289g1(W0 w02, String str, Object[] objArr) {
        this.f15182a = w02;
        this.f15183b = str;
        this.f15184c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15185d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f15185d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final W0 a() {
        return this.f15182a;
    }

    final String b() {
        return this.f15183b;
    }

    final Object[] c() {
        return this.f15184c;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean zzb() {
        return (this.f15185d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final int zzc() {
        int i7 = this.f15185d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
