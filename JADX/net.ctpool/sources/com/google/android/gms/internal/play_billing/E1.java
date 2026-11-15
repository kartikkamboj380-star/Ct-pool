package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class E1 extends G1 {
    E1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final double a(Object obj, long j7) {
        return Double.longBitsToDouble(this.f15047a.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final float b(Object obj, long j7) {
        return Float.intBitsToFloat(this.f15047a.getInt(obj, j7));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.H1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.H1.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.H1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.H1.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.G1
    public final void c(Object obj, long j7, boolean z6) {
        if (H1.f15059h) {
            H1.n(obj, j7, z6);
        } else {
            H1.o(obj, j7, z6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void d(Object obj, long j7, byte b7) {
        if (H1.f15059h) {
            H1.d(obj, j7, b7);
        } else {
            H1.e(obj, j7, b7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void e(Object obj, long j7, double d7) {
        this.f15047a.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void f(Object obj, long j7, float f7) {
        this.f15047a.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final boolean g(Object obj, long j7) {
        return H1.f15059h ? H1.y(obj, j7) : H1.z(obj, j7);
    }
}
