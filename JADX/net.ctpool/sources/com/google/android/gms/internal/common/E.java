package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class E extends H {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ F f14081t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(F f7, I i7, CharSequence charSequence) {
        super(i7, charSequence);
        this.f14081t = f7;
    }

    @Override // com.google.android.gms.internal.common.H
    final int e(int i7) {
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.common.H
    final int f(int i7) {
        CharSequence charSequence = this.f14085o;
        int length = charSequence.length();
        D.b(i7, length, "index");
        while (i7 < length) {
            F f7 = this.f14081t;
            if (f7.f14082a.a(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}
