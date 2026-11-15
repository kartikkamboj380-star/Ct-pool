package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class F1 extends G1 {
    F1(Unsafe unsafe) {
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

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void c(Object obj, long j7, boolean z6) {
        if (H1.f15059h) {
            H1.d(obj, j7, z6 ? (byte) 1 : (byte) 0);
        } else {
            H1.e(obj, j7, z6 ? (byte) 1 : (byte) 0);
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
