package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1211t5 implements InterfaceC1077e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1095g5 f14903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f14905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14906d;

    C1211t5(InterfaceC1095g5 interfaceC1095g5, String str, Object[] objArr) {
        this.f14903a = interfaceC1095g5;
        this.f14904b = str;
        this.f14905c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14906d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f14906d = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1077e5
    public final InterfaceC1095g5 a() {
        return this.f14903a;
    }

    final String b() {
        return this.f14904b;
    }

    final Object[] c() {
        return this.f14905c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1077e5
    public final EnumC1176p5 zzb() {
        int i7 = this.f14906d;
        return (i7 & 1) != 0 ? EnumC1176p5.PROTO2 : (i7 & 4) == 4 ? EnumC1176p5.EDITIONS : EnumC1176p5.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1077e5
    public final boolean zzc() {
        return (this.f14906d & 2) == 2;
    }
}
